package com.lohika.morning.java9modules.service.repository;

import com.lohika.morning.java9modules.service.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository {

    List<Movie> findAll();

    Optional<Movie> findOne(String id);

    Optional<Movie> findByTitle(String title);

    List<Movie> findByGenre(String genre);

    void deleteAll();

    void save(Movie movie);
}

