package org.itau.cats.feign.dto;

import lombok.*;
import org.itau.api.model.Breed;
import org.itau.cats.feign.CatFeign;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CatPictureRespDto {

    private String id;
    private List<Breed> breeds;
    private String url;

}
