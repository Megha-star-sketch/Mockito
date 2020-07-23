package com.movie.MovieIntegrateTesting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.MovieIntegrateTesting.Model.Movie;
import com.movie.MovieIntegrateTesting.Service.MovieService;

@RestController
@RequestMapping("/Movie")
public class MovieController 
{	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public List<Movie> retrievedAllMovies()
	{
		return movieService.retrieveAllMovies();
	}
	
	@GetMapping("/movies/{id}")
	public Movie retrieveMovie(@PathVariable Long id)
	{
		return movieService.retrieveMovies(id);
	}
	
	@PostMapping("/movies")
	public Long createMovie(@RequestBody Movie movie)
	{
		return movieService.createMovie(movie);
	}
}
