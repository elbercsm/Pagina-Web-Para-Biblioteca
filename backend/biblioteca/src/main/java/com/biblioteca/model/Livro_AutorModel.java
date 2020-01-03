package com.biblioteca.model;

public class Livro_AutorModel {
	
	
	
	private Integer id;
	private Integer fk_livro;
	private Integer fk_autor;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFk_livro() {
		return fk_livro;
	}
	public void setFk_livro(Integer fk_livro) {
		this.fk_livro = fk_livro;
	}
	public Integer getFk_autor() {
		return fk_autor;
	}
	public void setFk_autor(Integer fk_autor) {
		this.fk_autor = fk_autor;
	}
	
	
	
	

}
