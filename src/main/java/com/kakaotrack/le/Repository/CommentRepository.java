package com.kakaotrack.le.repository;

import com.kakaotrack.le.domain.Comment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 김 on 2016-01-25.
 */
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
