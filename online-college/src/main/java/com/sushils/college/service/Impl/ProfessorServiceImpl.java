package com.sushils.college.service.Impl;

import com.sushils.college.bo.ProfessorBo;
import com.sushils.college.entity.ProfessorRegistration;
import com.sushils.college.repository.ProfessorRepository;
import com.sushils.college.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    //POST Method
    //To save single professor details.
    public ProfessorRegistration saveprofessorDetails(ProfessorRegistration professorRegistration)
    {
        ProfessorBo professorBo = new ProfessorBo();


        return professorRepository.save(professorRegistration);
    }

    //POST Method
    //To save List of professors.
    public List<ProfessorRegistration> saveProfessors(List<ProfessorRegistration> ProfessorRegistration)
    {
        return professorRepository.saveAll(ProfessorRegistration);
    }

    //GET Method
    //Get the all professors.
    public List<ProfessorRegistration> getAllProfessors()
    {
        return professorRepository.findAll();
    }
    public ProfessorRegistration getProfessorById(int id)
    {
        return professorRepository.findById(id).orElse(null);
    }

    //Delete method

    public String deleteProfessor(int id)
    {
        professorRepository.deleteById(id);
        return "Record removed.!!!"+id;
    }
    //To Update details...

    public ProfessorRegistration updateProfessor(ProfessorRegistration updateProReg)
    {
        ProfessorRegistration existingProf = professorRepository.findById(updateProReg.getId()).orElse(null);
        existingProf.setProfName(updateProReg.getProfName());
        existingProf.setProSubject(updateProReg.getProSubject());
        existingProf.setProEmail(updateProReg.getProEmail());
        existingProf.setProAddress(updateProReg.getProAddress());
        existingProf.setProJoinDate(updateProReg.getProJoinDate());
        return professorRepository.save(existingProf);
    }

}
