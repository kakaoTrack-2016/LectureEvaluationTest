package com.kakaotrack.le;

/**
 * Created by Kim on 2016-01-18.
 */
public class Lecture {

    private int no;
    private String info;

    public Lecture(int no, String info){
        this.no = no;
        this.info = info;
    }

    public int getNo() {
        return no;
    }

    public String getInfo() {
        return info;
    }
}
