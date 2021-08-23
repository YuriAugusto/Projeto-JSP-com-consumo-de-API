package com.brq.internet.projetojspbase.controller;

import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.brq.internet.projetojspbase.dto.ResponseFilmeDTO;
import com.brq.internet.projetojspbase.service.impl.ListarFilmeServiceImpl;
import com.brq.internet.projetojspbase.viewmodel.FilmeViewModel;
import com.brq.internet.projetojspbase.viewmodel.mapper.FilmeViewModelMapper;

@Controller
public class HomeController {
	
	@Autowired
	private ListarFilmeServiceImpl listarFilmesImp;//injeção da Service
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView imprime(ModelAndView model) throws ParseException {
		
		ResponseFilmeDTO response = listarFilmesImp.retornaResponse();//retorna o JSON
		
		List<FilmeViewModel> listaDeFilmes = FilmeViewModelMapper.from(response);//retorna uma lista de FilmeViewModel
		
		model.addObject("listaDeFilmes", listaDeFilmes);//atribuição da lista para view
		model.setViewName("home");//definição de view
		
		return model;		
	}
	
}