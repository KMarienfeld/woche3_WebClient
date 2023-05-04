package de.neuefische.woche3_webclient.controller;

import de.neuefische.woche3_webclient.model.RMCharacter;
import de.neuefische.woche3_webclient.service.RickAndMortyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor

public class RickAndMortyController {

    private final RickAndMortyService rickAndMortyService;

    @GetMapping("/all-characters")
    public List<RMCharacter> getAllCharacters(){
        return rickAndMortyService.getAllCharacters();
    }

    @GetMapping("/status/{status}")
    public List<RMCharacter> getRandomJoke (@PathVariable String status) {
        return rickAndMortyService.getAliveCharacters(status);
    }
}
