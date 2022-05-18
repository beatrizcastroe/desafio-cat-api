package org.itau.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_picture")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pictures {

    @Id
    private String id;
    private String url;
}
