package com.biblioteca.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biblioteca.model.LivroAutorModel;
import com.biblioteca.repository.LivroAutorRepository;



public class LivroAutorController {

	@RequestMapping(method = RequestMethod.GET, value = "/livroAutor")
	public ArrayList<LivroAutorModel> getEmpresimos() {
		return LivroAutorRepository.charge();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/livroAutor", consumes = MediaType.ALL_VALUE)
	public void postLivroAutor(@RequestBody LivroAutorModel livroAutor) {
		LivroAutorRepository.insert(livroAutor);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/livroAutor" , consumes=MediaType.ALL_VALUE)
	public void putLivroAutor(@RequestBody LivroAutorModel livroAutor) {
		LivroAutorRepository.update(livroAutor);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/livroAutor" , consumes=MediaType.ALL_VALUE)
	public void deleteLivroAutor(@RequestBody LivroAutorModel livroAutor ) {
		LivroAutorRepository.delete(livroAutor);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/livroAutor/prioridades")
	public ArrayList<String> prioridades() {
		return LivroAutorRepository.Prioridades();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/livroAutor/valores")
	public ArrayList<String> valores() {
		return LivroAutorRepository.Valores();
	}
	
	
}
