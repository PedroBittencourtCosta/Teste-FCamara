package com.pedrobittencourt.TesteFCamara.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name = "estabelecimento")
@Table(name = "estabelecimento")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private int cnpj;
    private String endereco;
    private int telefone;
    private int qtdVagasMotos;
    private int qtdVagasCarros;

}
