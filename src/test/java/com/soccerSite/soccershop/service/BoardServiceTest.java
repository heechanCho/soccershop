package com.soccerSite.soccershop.service;

import com.soccerSite.soccershop.dto.BoardDto;
import com.soccerSite.soccershop.entity.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class BoardServiceTest {

    @Autowired
    BoardService boardService;

    public Board createBoard() {
        BoardDto boardDto = new BoardDto();
        boardDto.setSubject("title");
        boardDto.setContent("content");
        return Board.createBoard(boardDto);
    }

    @Test
    @DisplayName("게시글작성 테스트")
    public void saveBoardTest() {
        Board board = createBoard();
        Board saveBoard = boardService.saveBoard(board);

        assertEquals(board.getSubject(), saveBoard.getSubject());
        assertEquals(board.getContent(), saveBoard.getContent());
    }
}
