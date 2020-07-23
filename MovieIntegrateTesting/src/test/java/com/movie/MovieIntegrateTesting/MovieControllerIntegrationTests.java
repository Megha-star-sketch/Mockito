package com.movie.MovieIntegrateTesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;


import org.springframework.boot.test.context.SpringBootTest;

import com.movie.MovieIntegrateTesting.Controller.MovieController;
import com.movie.MovieIntegrateTesting.Model.Movie;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieControllerIntegrationTests {
	 @Autowired
	    private MovieController movieController;
	 
	    @Test
	    public void givenMovieControllerWhenQueriedWithAnIdThenGetExpectedMovie() {
	        Movie movie = new Movie(200L, "Bahubali");
	        movieController.createMovie(movie);
	 
	        Movie result = movieController.retrieveMovie(200L);
	 
	        Assert.assertEquals(movie.getTitle().toLowerCase(), result.getTitle());
	    }
}
