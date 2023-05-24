package com.soccerSite.soccershop.entity;

import com.soccerSite.soccershop.constant.Role;
import com.soccerSite.soccershop.dto.BoardDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Board {

    // @ID 고유 번호 id속성 적용
    // @GenerateValue 값을 따로 세팅하지 않아도 1씩 자동으로 증가하여 저장
    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column 컬럼 세부 설정을 위해 사용
    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    private Role role;

    public static Board createBoard(BoardDto boardDto) {
        Board board = new Board();
        board.setSubject(boardDto.getSubject());
        board.setContent(boardDto.getContent());
        return board;
    }
}
