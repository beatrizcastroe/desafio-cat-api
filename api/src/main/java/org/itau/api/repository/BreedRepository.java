package org.itau.api.repository;

import org.itau.api.model.Breed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BreedRepository extends JpaRepository<Breed, String> {

    List<Breed> findByTemperamentContaining(String temperament);
    List<Breed> findByOriginContaining(String origin);

}
