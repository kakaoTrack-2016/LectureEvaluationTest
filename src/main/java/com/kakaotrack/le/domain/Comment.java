package com.kakaotrack.le.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by 김 on 2016-01-25.
 */
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int lecture_id;
    private int member_id;
    private String description;
    private int like_count;

    public Comment(int lecture_id, int member_id, String description, int like_count) {
        this.lecture_id = lecture_id;
        this.member_id = member_id;
        this.description = description;
        this.like_count = like_count;
    }

    public int getId() {
        return id;
    }

    public int getLecture_id() {
        return lecture_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public String getDescription() {
        return description;
    }

    public int getLike_count() {
        return like_count;
    }
}
