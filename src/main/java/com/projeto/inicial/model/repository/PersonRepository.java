package com.projeto.inicial.model.repository;

import com.projeto.inicial.model.domain.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Personagem,Long> {
}
