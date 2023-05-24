package com.soccerSite.soccershop.repository;

import com.soccerSite.soccershop.entity.Board;
import com.soccerSite.soccershop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email);

    Member findByName(String name);
}
