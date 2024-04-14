package com.example.cinemamanagement.controller;

import com.example.backendcoreservice.BackendCoreServiceApplication;
import com.example.cinemamanagement.CinemaManagementApplication;
import com.example.cinemamanagement.dto.CinemaDto;
import com.example.cinemamanagement.service.CinemaService;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("test")
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.DisplayName.class)
@SpringBootTest(classes = {CinemaManagementApplication.class, BackendCoreServiceApplication.class})
class CinemaControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CinemaService cinemaService;

    @Test
    @DisplayName("Should return OK when all cinemas are found")
    void shouldReturnOkWhenAllCinemasAreFound() throws Exception {
        when(cinemaService.findAll()).thenReturn(List.of(new CinemaDto()));
        mockMvc.perform(get("/api/cinema/all"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    //TODO: CHECK THIS TEST
    @Test
    @Disabled
    @DisplayName("Should return NOT_FOUND when no cinemas are found")
    void shouldReturnNotFoundWhenNoCinemasAreFound() throws Exception {
        when(cinemaService.findAll()).thenReturn(Collections.emptyList());
        mockMvc.perform(get("/api/cinema/all"))
                .andExpect(status().isNotFound());
    }

    @DisplayName("Should return OK when cinema is found by id")
    @Test
    void shouldReturnOkWhenCinemaIsFoundById() throws Exception {
        when(cinemaService.findById(anyLong())).thenReturn(new CinemaDto());
        mockMvc.perform(get("/api/cinema/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @DisplayName("Should return NOT_FOUND when cinema is not found by id")
    @Test
    void shouldReturnNotFoundWhenCinemaIsNotFoundById() throws Exception {
        when(cinemaService.findById(anyLong())).thenThrow(new EntityNotFoundException());

        mockMvc.perform(get("/api/cinema/1"))
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content()
                        .json("{\"appCode\":404,\"response\":null,\"message\":\"failure\",\"success\":false,\"error\":null}"));
    }

    @DisplayName("Should return BAD_REQUEST when id is not a number")
    @Test
    void shouldReturnBadRequestWhenIdIsNotANumber() throws Exception {
        mockMvc.perform(get("/api/cinema/notANumber"))
                .andExpect(status().isBadRequest());
    }


}
