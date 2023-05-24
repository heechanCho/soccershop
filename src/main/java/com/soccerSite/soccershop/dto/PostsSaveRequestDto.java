package com.soccerSite.soccershop.dto;

public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }


}
