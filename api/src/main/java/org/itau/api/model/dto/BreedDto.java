package org.itau.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.itau.api.model.Breed;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BreedDto {

    private String id;
    private String description;
    private String temperament;
    private String origin;

    public static BreedDto converter(Breed breed){
        return new BreedDto(breed.getId(), breed.getDescription(), breed.getTemperament(), breed.getOrigin());
    }

    public static List<BreedDto> converter(List<Breed> breeds){
        return breeds.stream().map(breed -> BreedDto.converter(breed))
                .collect(Collectors.toList());
    }

}
