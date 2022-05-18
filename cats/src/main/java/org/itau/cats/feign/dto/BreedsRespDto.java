package org.itau.cats.feign.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BreedsRespDto {

    private String id;
    private String description;
    private String temperament;
    private String origin;

}
