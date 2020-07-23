package com.movie.MovieIntegrateTesting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.MovieIntegrateTesting.Model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
  