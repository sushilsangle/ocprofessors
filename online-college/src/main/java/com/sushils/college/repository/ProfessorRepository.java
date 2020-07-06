package com.sushils.college.repository;

import com.sushils.college.entity.ProfessorRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorRegistration,Integer> {



}
