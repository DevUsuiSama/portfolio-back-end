package com.devusuisama.portfoliobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devusuisama.portfoliobackend.model.Educacion;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer> {
    
}
