package com.kakaotrack.le.repository;

import com.kakaotrack.le.domain.Rating;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 김 on 2016-01-25.
 */
public interface RatingRepository extends CrudRepository<Rating, Integer> {
}
