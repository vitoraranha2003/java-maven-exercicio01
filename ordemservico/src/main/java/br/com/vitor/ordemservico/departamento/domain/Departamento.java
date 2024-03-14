package br.com.vitor.ordemservico.departamento.domain;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID_DEPARTAMENTO")
    private Integer idDepartamento;
    @Column(name= "NOME_DEPARTAMENTO")
    private String NomeDepartamento;
}