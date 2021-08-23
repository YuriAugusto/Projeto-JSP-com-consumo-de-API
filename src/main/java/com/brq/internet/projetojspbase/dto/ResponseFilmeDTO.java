package com.brq.internet.projetojspbase.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseFilmeDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@JsonIgnore//serve para o atributo ser ignorado durante a leitura do JSON
	@JsonProperty("page")
	private int pagina;
	
	@JsonProperty("results")
	private List<FilmeDTO> filmesDTO;
	
	@JsonProperty("total_pages")
	private int totalPaginas;
	
	@JsonProperty("total_results")
	private int totalResultados;

	//retorna a lista de FilmesDTO
	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	
	public List<FilmeDTO> getFilmesDTO() {
		return filmesDTO;
	}

	public void setFilmesDTO(List<FilmeDTO> filmesDTO) {
		this.filmesDTO = filmesDTO;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getTotalResultados() {
		return totalResultados;
	}

	public void setTotalResultados(int totalResultados) {
		this.totalResultados = totalResultados;
	}
	
}
