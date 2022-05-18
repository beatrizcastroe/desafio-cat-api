package org.itau.cats.feign.dto;

import lombok.*;

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
