package com.biblioteca.model;

public class MultaModel {
	
	
	private Integer id;
	private Double valor;
	private Boolean status_multa;
	private Integer fk_emprestimo;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Boolean getStatus_multa() {
		return status_multa;
	}
	public void setStatus_multa(Boolean status_multa) {
		this.status_multa = status_multa;
	}
	public Integer getFk_emprestimo() {
		return fk_emprestimo;
	}
	public void setFk_emprestimo(Integer fk_emprestimo) {
		this.fk_emprestimo = fk_emprestimo;
	}

	
	
	
	

}
