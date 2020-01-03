package com.biblioteca.model;

import java.sql.Date;

public class EmprestimoModel {

	private Integer id;
	private Date data_inicio;
	private Date data_final;
	private  Integer fk_acesso_admin;
	private Integer fk_acesso_usuario;
	private Integer fk_livro;
	private Integer fk_status_emprestimo;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	public Date getData_final() {
		return data_final;
	}
	public void setData_final(Date data_final) {
		this.data_final = data_final;
	}
	public Integer getFk_acesso_admin() {
		return fk_acesso_admin;
	}
	public void setFk_acesso_admin(Integer fk_acesso_admin) {
		this.fk_acesso_admin = fk_acesso_admin;
	}
	public Integer getFk_acesso_usuario() {
		return fk_acesso_usuario;
	}
	public void setFk_acesso_usuario(Integer fk_acesso_usuario) {
		this.fk_acesso_usuario = fk_acesso_usuario;
	}
	public Integer getFk_livro() {
		return fk_livro;
	}
	public void setFk_livro(Integer fk_livro) {
		this.fk_livro = fk_livro;
	}
	public Integer getFk_status_emprestimo() {
		return fk_status_emprestimo;
	}
	public void setFk_status_emprestimo(Integer fk_status_emprestimo) {
		this.fk_status_emprestimo = fk_status_emprestimo;
	}

	
	
	
	
	
}
