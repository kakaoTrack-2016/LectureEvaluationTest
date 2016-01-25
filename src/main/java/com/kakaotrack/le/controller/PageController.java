package com.kakaotrack.le.controller;

import com.kakaotrack.le.domain.Lecture;
import com.kakaotrack.le.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
        List departmentList = lectureRepository.getDepartmentList();
        model.addAttribute("department_list", departmentList);
        return "home";
    }

    @RequestMapping(value = "/department", method = RequestMethod.POST)
    public String department(String name, Model model) {
        List lectureList = lectureRepository.findByDepartment(name);
        model.addAttribute("department", name);
        model.addAttribute("lecture_list", lectureList);
        return "department";
    }

    @RequestMapping("/lecture")
    public String lecture(@RequestParam(name = "id") int id, Model model) {
        Lecture lecture = lectureRepository.findOne(id);
        model.addAttribute("lecture", lecture);
        return "lecture";
    }

}
