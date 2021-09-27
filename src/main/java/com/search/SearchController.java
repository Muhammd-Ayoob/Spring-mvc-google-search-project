package com.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home()
	{
		
		return "index";
	}
	
	
	@RequestMapping("/search")
	
	public RedirectView search(@RequestParam("field") String field)
	{
		String url="https://www.google.com/search?q=" + field;
	
		RedirectView redirectView=new RedirectView();
		
		redirectView.setUrl(url);
		
		return redirectView;
	}
}
