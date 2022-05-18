package org.itau.api.service;

import org.itau.api.model.Breed;
import org.itau.api.model.dto.BreedDto;
import org.itau.api.repository.BreedRepository;
import org.itau.api.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ApiService {

    private @Autowired BreedRepository breedRepository;
    private @Autowired PictureRepository pictureRepository;

    public List<Breed> findAllBreeds(){
        return breedRepository.findAll();
    }

    public List<Breed> findBreedByTemperament(String temperament){
        return breedRepository.findByTemperamentContaining(temperament);
    }

    public List<Breed> findBreedByOrigin(String origin){
        return breedRepository.findByOriginContaining(origin);
    }
}
