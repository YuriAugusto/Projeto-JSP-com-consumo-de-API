package com.brq.internet.projetojspbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView retornarPrimeiraJsp(ModelAndView model) {
		model.addObject("titulo", "Hello View");
		model.setViewName("helloWorld");
		return model;
	}
}
