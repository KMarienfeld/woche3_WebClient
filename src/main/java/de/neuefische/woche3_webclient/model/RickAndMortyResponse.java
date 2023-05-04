package de.neuefische.woche3_webclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RickAndMortyResponse {

    private List<RMCharacter> results;

}
