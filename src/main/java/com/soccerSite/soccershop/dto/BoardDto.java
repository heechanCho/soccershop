package com.soccerSite.soccershop.dto;

import com.soccerSite.soccershop.entity.Board;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
public class BoardDto {

    private Long id;

    @NotBlank(message = "제목은 필수 입력 값입니다.")
    private String subject;

    @NotBlank(message = "가격은 필수 입력 값입니다.")
    private String content;

    private LocalDateTime createDate;



}
