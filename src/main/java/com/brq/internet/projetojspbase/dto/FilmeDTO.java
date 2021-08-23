package com.brq.internet.projetojspbase.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//todos os atributos desconhecidos (sem getter e setter) que a Entidade possuir serão ignorados durante a 
//leitura do Json
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//	@JsonProperty("") serve para receber o atributo com o nome descrito no response e permite a modificação 
	//do atributo a ser manipulado
	
	@JsonProperty("adult")
	private boolean adulto;
	
	@JsonProperty("backdrop_path")
	private String imgFundo;
	
	@JsonProperty("genre_ids")
	private List<Integer> generos;
	
	private int id;
	
	@JsonProperty("original_language")
	private String linguagemOriginal;
	
	@JsonProperty("original_title")
	private String tituloOriginal;
	
	@JsonProperty("overview")
	private String visaoGeral;
	
	@JsonProperty("poster_path")
	private String caminhoDoPoster;
	
	@JsonProperty("release_date")
	private String dataDeLancamento;
	
	@JsonProperty("title")
	private String titulo;
	
	private boolean video;
	
	@JsonProperty("vote_average")
	private double mediaDeVotos;
	
	@JsonProperty("vote_count")
	private int contagemDeVotos;
	
	@JsonProperty("popularity")
	private double popularidade;
	
	@JsonProperty("media_type")
	private String tipoDeMidia;//filme, série e etc

//	getters and setters
	public boolean getAdulto() {
		return adulto;
	}
	
	public void setAdulto(boolean adulto) {
		this.adulto = adulto;
	}
	
	public String getImgFundo() {
		return imgFundo;
	}

	public void setImgFundo(String imgFundo) {
		this.imgFundo = imgFundo;
	}

	public List<Integer> getGeneros() {
		return generos;
	}

	public void setGeneros(List<Integer> generos) {
		this.generos = generos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLinguagemOriginal() {
		return linguagemOriginal;
	}

	public void setLinguagemOriginal(String linguagemOriginal) {
		this.linguagemOriginal = linguagemOriginal;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getVisaoGeral() {
		return visaoGeral;
	}

	public void setVisaoGeral(String visaoGeral) {
		this.visaoGeral = visaoGeral;
	}

	public String getCaminhoDoPoster() {
		return caminhoDoPoster;
	}

	public void setCaminhoDoPoster(String caminhoDoPoster) {
		this.caminhoDoPoster = caminhoDoPoster;
	}

	public String getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(String dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean getVideo() {
		return video;
	}

	public void setVideo(boolean video) {
		this.video = video;
	}

	public double getMediaDeVotos() {
		return mediaDeVotos;
	}

	public void setMediaDeVotos(double mediaDeVotos) {
		this.mediaDeVotos = mediaDeVotos;
	}

	public int getContagemDeVotos() {
		return contagemDeVotos;
	}

	public void setContagemDeVotos(int contagemDeVotos) {
		this.contagemDeVotos = contagemDeVotos;
	}

	public double getPopularidade() {
		return popularidade;
	}

	public void setPopularidade(double popularidade) {
		this.popularidade = popularidade;
	}

	public String getTipoDeMidia() {
		return tipoDeMidia;
	}

	public void setTipoDeMidia(String tipoDeMidia) {
		this.tipoDeMidia = tipoDeMidia;
	}
	
}
