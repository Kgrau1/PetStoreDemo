package com.kevingrau.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class SwapiDaoTest {

    @Test
    void getPlanetSuccess() {
        SwapiDao dao = new SwapiDao();
        assertEquals("Tatooine", dao.getPlanet().getName());
    }
}