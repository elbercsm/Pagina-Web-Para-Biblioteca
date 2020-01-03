package com.biblioteca.model;

import java.sql.Date;


public class LivroModel {
	private Integer id;
	private String isbn;
	private String capa;
	private String titulo;
	private String autor;
	private String descricao;
	private Date ano_publicacao;
	private String editora;
	private String genero;
	private String status;
	private Integer fk_acesso;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCapa() {
		return capa;
	}
	public void setCapa(String capa) {
		this.capa = capa;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getAno_publicacao() {
		return ano_publicacao;
	}
	public void setAno_publicacao(Date ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getFk_acesso() {
		return fk_acesso;
	}
	public void setFk_acesso(Integer fk_acesso) {
		this.fk_acesso = fk_acesso;
	}
	
	

}
