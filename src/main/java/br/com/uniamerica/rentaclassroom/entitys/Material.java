package br.com.uniamerica.rentaclassroom.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_material", schema = "rentaclassroom")
public class Material extends AbstractEntity{
    @Getter @Setter
    @Column(name = "nome", nullable = false, unique = true, length = 50)
    private String nome;
    @Getter @Setter
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
}
