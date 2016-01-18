package com.kakaotrack.le;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kim on 2016-01-18.
 */

@RestController
public class LectureController {

    public int count = 1;

    @RequestMapping("/lecture")
    public Lecture lecture(@RequestParam(value = "info", defaultValue = "차세대 통신망") String info) {
        return new Lecture(count++, info);
    }
}
