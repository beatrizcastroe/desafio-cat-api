package org.itau.api.controller;

import org.itau.api.model.dto.BreedDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
//public class ApiController {
//    private @Autowired CatFeign service;
//
//    @GetMapping()
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseEntity<List<BreedDto>> findAllBreeds() {
//        List<BreedDto> listBreeds = service.getAllBreeds();
//
//        return ResponseEntity.ok(listBreeds);
//    }
//
//    @GetMapping("/pictures/{categoryId}")
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseEntity<List<CatPictureRespDto>> findPictureByCategory (@PathVariable String categoryId) {
//        List<CatPictureRespDto> listPictures = service.getImagesByCategory(categoryId);
//
//        return ResponseEntity.ok(listPictures);
//    }
//
//    @GetMapping("/breeds/pictures/{breedId}")
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseEntity<List<CatPictureRespDto>> findPictureByBreed (@PathVariable String breedId) {
//        List<CatPictureRespDto> listPictures = service.getImagesByBreed(breedId);
//
//        return ResponseEntity.ok(listPictures);
//    }
//}
