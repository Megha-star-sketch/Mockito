package com.movie.MovieIntegrateTesting;

import java.util.Optional;
import org.junit.Before;
//import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.movie.MovieIntegrateTesting.Model.Movie;
import com.movie.MovieIntegrateTesting.Repository.MovieRepository;
import com.movie.MovieIntegrateTesting.Service.MovieService;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class MovieServiceUnitTests {
	 @InjectMocks
	    private MovieService movieService;
	 
	    @Mock
	    private MovieRepository movieRepository;
	 
	    @Before
	    public void setUp() throws Exception {
	        MockitoAnnotations.initMocks(this);
	    }
	 
	    @Test
	    public void givenMovieServiceWhenQueriedWithAnIdThenGetExpectedMovie() {
	        Movie movie = new Movie(200L, "Shivaji");
	        Mockito.when(movieRepository.findById(200L))
	          .thenReturn(Optional.ofNullable(movie));
	        Movie result = movieService.retrieveMovies(200L);
	        Assert.assertEquals(movie.getTitle().toLowerCase(), result.getTitle());
	    }
}
