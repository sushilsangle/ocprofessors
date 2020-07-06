package com.sushils.college.bo;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class ProfessorBo {

    private int id;

    private String profName;

    private String proSubject;

    private String proAddress;

    private Date proJoinDate;

    private String proEmail;

    private String password;

    private double proSalary;

    private long proPresentDay;

    private long proAbsentDay;
}
