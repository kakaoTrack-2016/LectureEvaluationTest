package com.kakaotrack.le.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Kim on 2016-01-18.
 */

public class User {

    private int no;
    private String id;
    private String name;

    public int getNo() {
        return no;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
