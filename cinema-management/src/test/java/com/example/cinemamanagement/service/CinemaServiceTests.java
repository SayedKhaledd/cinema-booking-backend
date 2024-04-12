package com.example.cinemamanagement.service;

import com.example.backendcoreservice.BackendCoreServiceApplication;
import com.example.cinemamanagement.CinemaManagementApplication;
import com.example.cinemamanagement.dto.CinemaDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ActiveProfiles("test")
@SpringBootTest(classes = {CinemaManagementApplication.class, BackendCoreServiceApplication.class})
class CinemaServiceTests {
    @Autowired
    private CinemaService cinemaService;

    @Transactional
    @Test
    void testFindAll() {
        List<CinemaDto> expectedCinemaDtos = CinemaServiceSetup.addRandomCinemas(cinemaService);
        List<CinemaDto> actualCinemaDtos = cinemaService.findAll();
        assertNotNull(actualCinemaDtos);
        assertEquals(expectedCinemaDtos.size(), actualCinemaDtos.size());
        expectedCinemaDtos.forEach(expectedCinemaDto -> {
            CinemaDto actualCinemaDto = actualCinemaDtos.stream()
                    .filter(dto -> dto.getId().equals(expectedCinemaDto.getId()))
                    .findFirst()
                    .orElse(null);
            assertNotNull(actualCinemaDto);
            assertEquals(expectedCinemaDto.getId(), actualCinemaDto.getId());
            assertEquals(expectedCinemaDto.getName(), actualCinemaDto.getName());
            assertEquals(expectedCinemaDto.getLocation(), actualCinemaDto.getLocation());
        });
    }
}
