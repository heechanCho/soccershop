package com.soccerSite.soccershop.repository;

import com.soccerSite.soccershop.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findBySubject(String subject);
    Board findBySubjectAndContent(String subject, String content);
    List<Board> findBySubjectLike(String subject);



}
