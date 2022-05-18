package org.itau.cats.service;

import org.itau.api.model.Breed;
import org.itau.api.model.Pictures;
import org.itau.api.repository.BreedRepository;
import org.itau.api.repository.PictureRepository;
import org.itau.cats.feign.CatFeign;
import org.itau.cats.feign.dto.BreedsRespDto;
import org.itau.cats.feign.dto.CatPictureRespDto;
import org.itau.cats.infra.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CatService {

    private CatFeign catFeign;
    private BreedRepository breedRepository;

    private PictureRepository pictureRepository;
    @Autowired
    private BeanConfig mapper;

    @Autowired
    public CatService(CatFeign catFeign, BreedRepository breedRepository, BeanConfig mapper, PictureRepository pictureRepository) {
        this.catFeign = catFeign;
        this.breedRepository = breedRepository;
        this.mapper = mapper;
        this.pictureRepository = pictureRepository;
    }

    public List<BreedsRespDto> getAllBreeds() {
        var breedsRespDto = catFeign.getAllBreeds();
        var breeds = breedsRespDto.stream()
                .map(breedsDto -> mapper.getDozerMapper().map(breedsDto, Breed.class))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        breedRepository.saveAll(breeds);
        return breedsRespDto;
    }

    public List<CatPictureRespDto> getImagesByCategory(Long categoryId) {
        var catPictureRespDto = catFeign.getImagesByCategory(categoryId);
        var pictures = catPictureRespDto.stream()
                .map(catPictureRespDto1 -> mapper.getDozerMapper().map(catPictureRespDto1, Pictures.class))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        pictureRepository.saveAll(pictures);
        return catPictureRespDto;
    }

}
