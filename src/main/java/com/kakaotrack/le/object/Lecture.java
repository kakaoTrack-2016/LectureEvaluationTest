package com.kakaotrack.le.object;

/**
 * Created by Kim on 2016-01-18.
 */
public class Lecture {

    private int no;
    private String name;
    private String professor;
    private int credit;

    public String getName() {
        return name;
    }

    public String getProfessor() {
        return professor;
    }

    public int getCredit() {
        return credit;
    }

    private String info;

    public Lecture(int no, String name){
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getInfo() {
        return info;
    }
}
