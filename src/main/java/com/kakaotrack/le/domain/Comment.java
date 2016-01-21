package com.kakaotrack.le.domain;

import javax.persistence.Id;

/**
 * Created by Kim on 2016-01-18.
 */
public class Comment {

    @Id
    private long id;
    private String description;

    public Comment(String description){
        this.description = description;
    }
}
