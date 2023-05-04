package de.neuefische.woche3_webclient.service;

import de.neuefische.woche3_webclient.model.RMCharacter;
import de.neuefische.woche3_webclient.model.RickAndMortyResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@Service
public class RickAndMortyService {
    
    WebClient webClient = WebClient.create("https://rickandmortyapi.com/");


    public List<RMCharacter> getAllCharacters() {

        RickAndMortyResponse response=
                Objects.requireNonNull(webClient.get())
                .uri("api/character")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(RickAndMortyResponse.class)
                .block()
                .getBody();
        return response.getResults();
    }

    public List<RMCharacter> getAliveCharacters(String status) {

        RickAndMortyResponse response=
                Objects.requireNonNull(webClient.get())
                        .uri("api/character?name=rick&status="+status)
                        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .retrieve()
                        .toEntity(RickAndMortyResponse.class)
                        .block()
                        .getBody();
        return response.getResults();
    }
}
