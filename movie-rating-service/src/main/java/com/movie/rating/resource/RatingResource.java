package com.movie.rating.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.rating.modal.Rating;

@RestController
public class RatingResource {

	@RequestMapping("/rating/{movieId}")
	public Rating getRating(@PathVariable("movieId") int movieId)
	{
		return new Rating(movieId, 4);
	}
}
