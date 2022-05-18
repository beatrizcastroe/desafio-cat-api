package org.itau.cats.controller;

import feign.Response;
import lombok.AllArgsConstructor;
import org.itau.cats.feign.dto.BreedsRespDto;
import org.itau.cats.feign.dto.CatPictureRespDto;
import org.itau.cats.feign.CatFeign;
import org.itau.cats.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cat")
public class CatController {

    private @Autowired CatService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<BreedsRespDto>> findAllBreeds() {
        List<BreedsRespDto> listBreeds = service.getAllBreeds();

        return ResponseEntity.ok(listBreeds);
    }

    @GetMapping("/pictures/{categoryId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<CatPictureRespDto>> findPictureByCategory (@PathVariable("categoryId") Long categoryId) {
        List<CatPictureRespDto> listPictures = service.getImagesByCategory(categoryId);

        return ResponseEntity.ok(listPictures);
    }
//
//    @GetMapping("/breeds/pictures/{breedId}")
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseEntity<List<CatPictureRespDto>> findPictureByBreed (@PathVariable String breedId) {
//        List<CatPictureRespDto> listPictures = service.getImagesByBreed(breedId);
//
//        return ResponseEntity.ok(listPictures);
//    }
}
