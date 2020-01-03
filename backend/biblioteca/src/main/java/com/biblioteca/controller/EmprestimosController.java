package com.biblioteca.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biblioteca.model.EmprestimoModel;
import com.biblioteca.repository.EmprestimosRepository;


public class EmprestimosController {
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/emprestimo")
	public ArrayList<EmprestimoModel> getEmpresimos() {
		return EmprestimosRepository.charge();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/emprestimo", consumes = MediaType.ALL_VALUE)
	public void postEmprestimo(@RequestBody EmprestimoModel emprestimo) {
		EmprestimosRepository.insert(emprestimo);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/emprestimo" , consumes=MediaType.ALL_VALUE)
	public void putEmprestimo(@RequestBody EmprestimoModel emprestimo) {
		EmprestimosRepository.update(emprestimo);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/emprestimo" , consumes=MediaType.ALL_VALUE)
	public void deleteEmprestimo(@RequestBody EmprestimoModel emprestimo ) {
		EmprestimosRepository.delete(emprestimo);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/emprestimo/prioridades")
	public ArrayList<String> prioridades() {
		return EmprestimosRepository.Prioridades();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/emprestimo/valores")
	public ArrayList<String> valores() {
		return EmprestimosRepository.Valores();
	}

}
