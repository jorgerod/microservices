package com.microservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.dto.FilmDto;

@RestController
public class FilmController {

    private List<FilmDto> films = new ArrayList<FilmDto>() {
        private static final long serialVersionUID = 1L;
        {
            add(new FilmDto("Batman"));
            add(new FilmDto("Torrente"));
        }
    };

    @RequestMapping(method = RequestMethod.GET)
    public List<FilmDto> get() {
        return films;
    }
}
