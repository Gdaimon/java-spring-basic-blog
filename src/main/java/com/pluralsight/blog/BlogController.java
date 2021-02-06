package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BlogController {
	
	@RequestMapping ( "/" )
	public String listPost ( ) {
		Map < String, String > map = new HashMap <> ( );
		map.put ( "title", "Blog Post 1" );
		return "home";
	}
	
}
