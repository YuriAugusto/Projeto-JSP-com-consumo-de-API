package com.brq.internet.projetojspbase.viewmodel.mapper;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.brq.internet.projetojspbase.dto.FilmeDTO;
import com.brq.internet.projetojspbase.dto.ResponseFilmeDTO;
import com.brq.internet.projetojspbase.viewmodel.FilmeViewModel;

public class FilmeViewModelMapper {// from() tudo que vem do response, to() tudo que vem da controller para a service

	public static List<FilmeViewModel> from(ResponseFilmeDTO dto) throws ParseException {
		List<FilmeViewModel> listaDeFilmes = new ArrayList<>();

		// item FilmeDTO filmesDTO : dto.getFilmesDTO() lista de filmes
		for (FilmeDTO filmeDTO : dto.getFilmesDTO()) {

			FilmeViewModel filmeViewModel = new FilmeViewModel();
			filmeViewModel.setId(filmeDTO.getId());
			filmeViewModel.setTitulo(filmeDTO.getTitulo());
			filmeViewModel.setTituloOriginal(filmeDTO.getTituloOriginal());
			filmeViewModel.setVisaoGeral(filmeDTO.getVisaoGeral());
			
			//converte data para o formato Br
			String dataFormatada = converteFormatoDataBr(filmeDTO);
			filmeViewModel.setDataDeLancamento(dataFormatada);
			filmeViewModel.setMediaDeVotos(filmeDTO.getMediaDeVotos());
			filmeViewModel.setCaminhoDoPoster("https://image.tmdb.org/t/p/original" + filmeDTO.getCaminhoDoPoster());
			listaDeFilmes.add(filmeViewModel);
		}

		return listaDeFilmes;
	}

	private static String converteFormatoDataBr(FilmeDTO filmeDTO) {
		DateTimeFormatter padraoDataDto = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate dataNoFormatoDto = LocalDate.parse(filmeDTO.getDataDeLancamento().replaceAll("-", "/"),
				padraoDataDto);
		DateTimeFormatter novoFormato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String dataFormatada = novoFormato.format(dataNoFormatoDto);
		return dataFormatada;
	}

}
