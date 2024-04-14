package com.example.cinemamanagement.service;

import com.example.backendcoreservice.BackendCoreServiceApplication;
import com.example.cinemamanagement.CinemaManagementApplication;
import com.example.cinemamanagement.dto.CinemaDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
@Testcontainers
@ActiveProfiles("test")
@SpringBootTest(classes = {CinemaManagementApplication.class, BackendCoreServiceApplication.class})
class CinemaServiceTests {
    @Autowired
    private CinemaService cinemaService;
    private List<CinemaDto> expectedCinemaDtos;

    @Container
    static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:15.2");


    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl);
        registry.add("spring.datasource.username", postgreSQLContainer::getUsername);
        registry.add("spring.datasource.password", postgreSQLContainer::getPassword);
    }

    @Transactional
    @Test
    void testFindAll() {
        expectedCinemaDtos = CinemaServiceSetup.addRandomCinemas(cinemaService);
        List<CinemaDto> actualCinemaDtos = cinemaService.findAll();
        assertNotNull(actualCinemaDtos);
        assertEquals(expectedCinemaDtos.size(), actualCinemaDtos.size());
        expectedCinemaDtos.forEach(expectedCinemaDto -> {
            CinemaDto actualCinemaDto = actualCinemaDtos.stream()
                    .filter(dto -> dto.getId().equals(expectedCinemaDto.getId()))
                    .findFirst()
                    .orElse(null);
            assertNotNull(actualCinemaDto);
            expectedCinemaDto.setCreatedDate(actualCinemaDto.getCreatedDate());
            expectedCinemaDto.setModifiedDate(actualCinemaDto.getModifiedDate());
            log.info("Actual createdDate{} modifiedDate: {} markedAsDeleted: {}", actualCinemaDto.getCreatedDate(), actualCinemaDto.getModifiedDate(), actualCinemaDto.getMarkedAsDeleted());
            log.info("Expected createdDate{} modifiedDate: {} markedAsDeleted: {}", expectedCinemaDto.getCreatedDate(), expectedCinemaDto.getModifiedDate(), expectedCinemaDto.getMarkedAsDeleted());
            assertEquals(expectedCinemaDto, actualCinemaDto);
        });
    }


    @AfterEach
    void tearDown() {
        expectedCinemaDtos.forEach(expectedCinemaDto -> cinemaService.getDao().getRepo().deleteById(expectedCinemaDto.getId()));
    }
}
