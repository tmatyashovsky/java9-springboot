package com.lohika.morning.java9modules.api.controller;

import com.lohika.morning.java9modules.service.domain.Movie;
import com.lohika.morning.java9modules.service.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> all() {
        return this.movieService.allMovies();
    }

    @GetMapping("/{id}")
    public Movie byId(@PathVariable String id) {
        return this.movieService.movieById(id).orElse(new Movie("Default title", "Default Genre"));
    }

}
