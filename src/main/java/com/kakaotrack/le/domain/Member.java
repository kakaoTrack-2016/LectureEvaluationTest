package com.kakaotrack.le.domain;

import javax.persistence.*;

/**
 * Created by 김 on 2016-01-25.
 */

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String user_id;
    private String user_password;
    private String user_nickname;

    public Member(String user_id, String user_password, String user_nickname) {
        this.user_id = user_id;
        this.user_password = user_password;
        this.user_nickname = user_nickname;
    }

    public int getId() {
        return id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_nickname() {
        return user_nickname;
    }
}
