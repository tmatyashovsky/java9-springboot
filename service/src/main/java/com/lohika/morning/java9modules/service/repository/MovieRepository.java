package com.lohika.morning.java9modules.service.repository;

import com.lohika.morning.java9modules.service.domain.Movie;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, String> {
  Optional<Movie> findByTitle(String title);

  List<Movie> findByGenre(String genre);
}

