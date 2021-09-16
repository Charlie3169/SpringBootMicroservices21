package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class plantPlacesController 
{
	
	
	/**
	 * Handle the /start endpoint
	 * @return
	 *
	 */
	@RequestMapping(value="/start",method=RequestMethod.GET)
	public String read() 
	{
		return "start";
	}
	
	@PostMapping("/start")
	public String create() 
	{
		return "start";
	}
	
	/**
	 * Handle the /index endpoint
	 * @return
	 *
	 */
	@RequestMapping("/index")
	public String index() 
	{
		return "index";
	}


}
