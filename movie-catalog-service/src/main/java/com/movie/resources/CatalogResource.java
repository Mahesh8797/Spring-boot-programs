package com.movie.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.modal.CatalogItem;

@RestController
public class CatalogResource {

	@RequestMapping(method=RequestMethod.GET, value="/catalog")
	public List<CatalogItem> getCatalog()
	{
		
		return Collections.singletonList(new CatalogItem(" mangatha", "Ajith", 5));
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/cata")
	public String getCata()
	{
		return "hello baby";
	}
}
