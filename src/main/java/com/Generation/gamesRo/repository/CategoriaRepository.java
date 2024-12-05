package com.Generation.gamesRo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.Generation.gamesRo.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	List <Categoria> findAllByCodigo(@Param("codigo") Integer codigo);
	
}
