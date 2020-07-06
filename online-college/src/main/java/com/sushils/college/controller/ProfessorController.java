package com.sushils.college.controller;

import com.sushils.college.bo.ProfessorBo;
import com.sushils.college.entity.ProfessorRegistration;
import com.sushils.college.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping("/addProfessorDetail")
    public ProfessorRegistration addProfessors(@RequestBody ProfessorRegistration proReg)
    {
        return professorService.saveprofessorDetails(proReg);
    }
    @PostMapping("/addProfessorDetails")
    public List<ProfessorRegistration> addProfessors(@RequestBody List<ProfessorRegistration> proRegis)
    {
        return professorService.saveProfessors(proRegis);
    }

    @GetMapping("/getAllprofessorList")
    public List<ProfessorRegistration> findAllProfessorDetails()
    {
        return professorService.getAllProfessors();
    }
    @GetMapping("/getAllprofessorList/{id}")
    public ProfessorRegistration findProfessorById(@PathVariable int id)
    {
        return professorService.getProfessorById(id);
    }

    //not working
    @PutMapping("/updateProfessorDetails/{id}")
    public ProfessorRegistration updateProfessordetails(@PathVariable int id, @RequestBody ProfessorRegistration profRgstr)
    {
        return professorService.updateProfessor(profRgstr);
    }
    @DeleteMapping("/removeProfessorDetails/{id}")
    public String deleteProfessorDetails(@PathVariable int id)
    {
        return professorService.deleteProfessor(id);
    }
}
