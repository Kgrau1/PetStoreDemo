package com.kevingrau.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swapi.Planets;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class SwapiDao {

    Planets getPlanet(){
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://swapi.info/api/planets/1");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Planets planet = null;
        try {
            planet = mapper.readValue(response, Planets.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return planet;

    }
}
