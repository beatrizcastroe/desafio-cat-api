package org.itau.api.controller;

import org.itau.api.model.Breed;
import org.itau.api.model.dto.BreedDto;
import org.itau.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/breeds")
public class ApiController {

    private @Autowired ApiService apiService;

    @GetMapping
    public ResponseEntity<List<BreedDto>> findAllBreeds() {
        List<BreedDto> listBreeds = BreedDto.converter(apiService.findAllBreeds());

        return ResponseEntity.ok(listBreeds);
    }

    @GetMapping("/temperament")
    public ResponseEntity<List<BreedDto>> findBreedByTemperament(@RequestParam("temperament") String temperament) {
        List<BreedDto> listBreeds = BreedDto.converter(apiService.findBreedByTemperament(temperament));

        return ResponseEntity.ok(listBreeds);
    }

    @GetMapping("/origin")
    public ResponseEntity<List<BreedDto>> findBreedByOrigin (@RequestParam ("origin") String origin) {
        List<BreedDto> listBreeds = BreedDto.converter(apiService.findBreedByOrigin(origin));

        return ResponseEntity.ok(listBreeds);
    }

}

