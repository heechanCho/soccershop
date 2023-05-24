package com.soccerSite.soccershop.service;

import com.soccerSite.soccershop.entity.Board;
import com.soccerSite.soccershop.repository.BoardRepository;
import com.soccerSite.soccershop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public Board saveBoard(Board board) {
        return boardRepository.save(board);
    }


}
