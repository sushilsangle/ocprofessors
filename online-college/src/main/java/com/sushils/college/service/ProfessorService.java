package com.sushils.college.service;

import com.sushils.college.bo.ProfessorBo;
import com.sushils.college.entity.ProfessorRegistration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessorService {

   // public String professorDetails(ProfessorBo professorBo);

    public ProfessorRegistration saveprofessorDetails(ProfessorRegistration professorRegistration);
    public List<ProfessorRegistration> saveProfessors(List<ProfessorRegistration> ProfessorRegistration);
    public List<ProfessorRegistration> getAllProfessors();
    public ProfessorRegistration getProfessorById(int id);
    public String deleteProfessor(int id);
    public ProfessorRegistration updateProfessor(ProfessorRegistration updateProReg);


}
