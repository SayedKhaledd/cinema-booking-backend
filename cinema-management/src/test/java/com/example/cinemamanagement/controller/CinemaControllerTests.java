package com.example.cinemamanagement.controller;

import com.example.backendcoreservice.BackendCoreServiceApplication;
import com.example.cinemamanagement.CinemaManagementApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("test")
@AutoConfigureMockMvc
@SpringBootTest(classes = {CinemaManagementApplication.class, BackendCoreServiceApplication.class})
class CinemaControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetAllCinemas() throws Exception {
        mockMvc.perform(get("/api/cinema/all"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}
