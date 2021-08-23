package com.brq.internet.projetojspbase.viewmodel;

import java.io.Serializable;

public class FilmeViewModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String titulo;
	
	private String tituloOriginal;
	
	private String dataDeLancamento;
	
	private double mediaDeVotos;
	
	private String visaoGeral;
	
	private String caminhoDoPoster;
	
//	getter and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(String dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	public double getMediaDeVotos() {
		return mediaDeVotos;
	}

	public void setMediaDeVotos(double mediaDeVotos) {
		this.mediaDeVotos = mediaDeVotos;
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
	
}
