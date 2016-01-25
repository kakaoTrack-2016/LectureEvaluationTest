package com.kakaotrack.le.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by 김 on 2016-01-25.
 */
@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int lecture_id;
    private int user_id;
    private int honey_point;
    private int learning_point;

    public Rating(int lecture_id, int user_id, int honey_point, int learning_point) {
        this.lecture_id = lecture_id;
        this.user_id = user_id;
        this.honey_point = honey_point;
        this.learning_point = learning_point;
    }

    public int getId() {
        return id;
    }

    public int getLecture_id() {
        return lecture_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getHoney_point() {
        return honey_point;
    }

    public int getLearning_point() {
        return learning_point;
    }
}
