package org.itau.cats.feign.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.itau.api.model.Breed;

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
