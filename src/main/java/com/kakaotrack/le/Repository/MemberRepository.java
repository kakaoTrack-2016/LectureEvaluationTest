package com.kakaotrack.le.repository;

import com.kakaotrack.le.domain.Member;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 김 on 2016-01-25.
 */
public interface MemberRepository extends CrudRepository<Member, Integer> {

}
