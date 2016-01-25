package com.kakaotrack.le.repository;

import com.kakaotrack.le.domain.Lecture;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by 김 on 2016-01-25.
 */
public interface LectureRepository extends CrudRepository<Lecture, Integer> {
    List<Lecture> findByDepartment(String department);
}
