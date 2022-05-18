package org.itau.cats.feign;

import org.itau.cats.feign.dto.BreedsRespDto;
import org.itau.cats.feign.dto.CatPictureRespDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "cats", url = "https://api.thecatapi.com/v1")
public interface CatFeign {

    @GetMapping(value = "/breeds", consumes = "application/json")
    public List<BreedsRespDto> getAllBreeds();

    @GetMapping(value = "/images/search?limit=3&categoryId={categoryId}", consumes = "application/json")
    List<CatPictureRespDto> getImagesByCategory(@PathVariable("categoryId") Long categoryId);

    @GetMapping(value = "/images/search?limit=3&breed_ids={breedId}", consumes = "application/json")
    List<CatPictureRespDto> getImagesByBreed(@PathVariable("breedId") String breedId);
}
