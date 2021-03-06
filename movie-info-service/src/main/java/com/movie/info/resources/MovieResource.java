package com.movie.info.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movie.info.model.CatalogItem;
import com.movie.info.model.Movie;


@RestController
public class MovieResource {

	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	
	  @RequestMapping("/{movieId}") 
	  public List<Movie> getMovie(@PathVariable("movieId")int movieId)
	  {
		  return
	  Collections.singletonList(new Movie("chekka chivantha vanam", movieId)); 
		  }
	 
	
	@RequestMapping("/catal") 
	public List<CatalogItem> getCatalogList()
	{
		ResponseEntity<CatalogItem[]> li= restTemplate.getForEntity("http://localhost:8083/catalog", CatalogItem[].class);
		System.out.println(li);
		return Arrays.asList(li.getBody());	
	}
	
	@RequestMapping("/consume")
	public String consumeData()
	{
		String res=restTemplate.getForObject("http://localhost:8083/cata", String.class);
				System.out.println("The result is "+res);
				return "hello" +res;
	}
}
