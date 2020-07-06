package com.sushils.college.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="SCollege")
public class ProfessorRegistration implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "Professor_Name")
    private String profName;

    @Column(name = "Professor_Subject")
    private String proSubject;

    @Column(name = "Professor_Address")
    private String proAddress;

    @Column(name = "Professor_Join_Date")
    private Date proJoinDate;

    @Column(name = "Professor_Email")
    private String proEmail;

    @Column(name = "Password")
    private String password;

    @Column(name = "Professor_Salary")
    private double proSalary;

    @Column(name ="Professor_Present_Day")
    private long proPresentDay;

    @Column(name ="Professor_absent_Day")
    private long proAbsentDay;



}
