package com.soccerSite.soccershop.dto;

import com.soccerSite.soccershop.entity.Board;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
public class BoardDto {

    private Integer id;

    @NotBlank(message = "제목을 입력해주세요")
    private String subject;

    @NotBlank(message = "내용을 입력해주세요")
    private String content;

    private LocalDateTime createDate;



}
