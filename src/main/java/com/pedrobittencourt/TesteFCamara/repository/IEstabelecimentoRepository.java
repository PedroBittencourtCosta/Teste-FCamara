package com.pedrobittencourt.TesteFCamara.repository;

import com.pedrobittencourt.TesteFCamara.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IEstabelecimentoRepository extends JpaRepository<Estabelecimento, UUID> {
}
