package com.kakaotrack.le.controller;

import com.kakaotrack.le.object.Comment;
import com.kakaotrack.le.object.Lecture;
import com.kakaotrack.le.object.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kim on 2016-01-18.
 */

@RestController
public class RestServiceController {

    private int count = 1;

    @RequestMapping("/lecture")
    public Lecture lecture(@RequestParam(value = "name", defaultValue = "차세대 통신망") String name) {
        return new Lecture(count++, name);
    }

    @RequestMapping("/comment")
    public Comment comment(){
        return new Comment();
    }

    @RequestMapping("/user")
    public User user(){
        return new User();
    }
}
