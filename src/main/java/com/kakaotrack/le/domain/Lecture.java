package com.kakaotrack.le.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Kim on 2016-01-18.
 */
@Entity
@Table(name = "t_lecture")
public class Lecture {

    @Id
    private int id;
    private String department;
    private int grade;
    private String type;
    private String professor;
    private String title;
    private int credit;
    private String information;
    private String description;

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public int getGrade() { return grade;}

    public String getType() {
        return type;
    }

    public String getProfessor() {
        return professor;
    }

    public String getTitle() {
        return title;
    }

    public int getCredit() {
        return credit;
    }

    public String getInformation() {
        return information;
    }

    public String getDescription() {
        return description;
    }
}

