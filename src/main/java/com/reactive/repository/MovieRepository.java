package com.reactive.repository;

import com.reactive.model.Movie;

import reactor.core.publisher.Flux;

public interface MovieRepository {

    Flux<Movie> findAll();

}