package com.microservices.dto;

public class FilmDto {

    private String title;
    
    public FilmDto(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
