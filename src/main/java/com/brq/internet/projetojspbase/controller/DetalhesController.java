package com.brq.internet.projetojspbase.controller;

import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.brq.internet.projetojspbase.dto.ResponseFilmeDTO;
import com.brq.internet.projetojspbase.service.impl.ListarFilmeServiceImpl;
import com.brq.internet.projetojspbase.viewmodel.FilmeViewModel;
import com.brq.internet.projetojspbase.viewmodel.mapper.FilmeViewModelMapper;

@Controller
public class DetalhesController {
	
	@Autowired
	private ListarFilmeServiceImpl listarFilmesImp;
	
	@RequestMapping(value = "/detalharfilme/{id}", method = RequestMethod.GET)
	public ModelAndView exibirDetalhesFilme(@PathVariable int id, ModelAndView model) throws ParseException {
		FilmeViewModel filmeDetalhado = new FilmeViewModel();
		
		ResponseFilmeDTO response = listarFilmesImp.retornaResponse();//retorna o objeto com a lista de filmes
		
		List<FilmeViewModel> listaDeFilmes = FilmeViewModelMapper.from(response);
		
		for (FilmeViewModel filme : listaDeFilmes) {
			if (filme.getId() == id) {				
				filmeDetalhado.setTitulo(filme.getTitulo());
				filmeDetalhado.setTituloOriginal(filme.getTituloOriginal());
				filmeDetalhado.setVisaoGeral(filme.getVisaoGeral());
				filmeDetalhado.setDataDeLancamento(filme.getDataDeLancamento());
				filmeDetalhado.setMediaDeVotos(filme.getMediaDeVotos());
				filmeDetalhado.setCaminhoDoPoster(filme.getCaminhoDoPoster());
			
				model.addObject("filmeDetalhado", filmeDetalhado);
				model.setViewName("detalharfilme");
				return model;
			}
		}
		return model;		
	}

}
