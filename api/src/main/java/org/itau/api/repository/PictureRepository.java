package org.itau.api.repository;

import org.itau.api.model.Pictures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends JpaRepository<Pictures, String> {

}
