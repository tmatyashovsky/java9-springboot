package com.lohika.morning.java9modules.service.service;

import com.lohika.morning.java9modules.service.domain.Movie;
import com.lohika.morning.java9modules.service.repository.MovieRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

@Service
public class MovieService {

    @Resource
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return this.movieRepository.findAll();
    }

    public Optional<Movie> movieById(String id) {
        return this.movieRepository.findOne(id);
    }

    public Optional<Movie> movieByTitle(String title) {
        return this.movieRepository.findByTitle(title);
    }

    public List<Movie> moviesByGenre(String genre) {
        return this.movieRepository.findByGenre(genre);
    }

    @PostConstruct
    public void setUpMovies() {
        movieRepository.deleteAll();
        Stream.of("Terminator", "Matrix", "Titanic")
                .map(title -> new Movie(title, randomGenre()))
                .forEach(movie -> movieRepository.save(movie));
    }

    private String randomGenre() {
        String[] genres = "Comedy, Drama, Documentary, Horror, Family".split(", ");
        return genres[new Random().nextInt(genres.length)];
    }

}
