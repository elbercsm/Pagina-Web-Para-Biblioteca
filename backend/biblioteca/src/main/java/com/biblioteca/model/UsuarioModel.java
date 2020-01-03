package com.biblioteca.model;

public class UsuarioModel {
	
	private Integer id;
	private String usuario;
	private String email;
	private String senha;
	private String telefone;
	
	private Integer status_usuario;
	private Integer fk_perfil;
	
	
	

	public Integer getStatus_usuario() {
		return status_usuario;
	}
	public void setStatus_usuario(Integer status_usuario) {
		this.status_usuario = status_usuario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getFk_perfil() {
		return fk_perfil;
	}
	public void setFk_perfil(Integer fk_perfil) {
		this.fk_perfil = fk_perfil;
	}
	
	/*
	public Boolean getStatus_usuario() {
		return status_usuario;
	}
	public void setStatus_usuario(Boolean status_usuario) {
		this.status_usuario = status_usuario;
	}
	*/

	
	
	
	

}
