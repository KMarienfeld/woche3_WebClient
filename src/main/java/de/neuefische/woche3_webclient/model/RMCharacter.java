package de.neuefische.woche3_webclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RMCharacter {
    private String name;
    private int id;
    private String gender;
    private String status;


}
