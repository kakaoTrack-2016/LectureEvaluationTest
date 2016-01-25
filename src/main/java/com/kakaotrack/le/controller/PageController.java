package com.kakaotrack.le.controller;

import com.kakaotrack.le.domain.Lecture;
import com.kakaotrack.le.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Kim on 2016-01-18.
 */
@Controller
public class PageController {

    @Autowired
    LectureRepository lectureRepository;

    @RequestMapping("/")
    public String home(Model model) {
        List lectureList = lectureRepository.findByDepartment("공과대학 컴퓨터공학과");
        model.addAttribute("lecture_list", lectureList);
        return "home";
    }

}
