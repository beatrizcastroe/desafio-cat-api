package org.itau.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_breed")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Breed {

    @Id
    private String id;
    @Column(name = "description", length = 1000)
    private String description;
    private String temperament;
    private String origin;

}
