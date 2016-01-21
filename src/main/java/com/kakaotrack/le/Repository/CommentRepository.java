package com.kakaotrack.le.Repository;

import com.kakaotrack.le.domain.Comment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kim on 2016-01-21.
 */
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
