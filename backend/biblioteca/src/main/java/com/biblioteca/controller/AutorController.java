package com.biblioteca.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biblioteca.model.AutorModel;
import com.biblioteca.repository.AutorRepository;


public class AutorController {
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/autor")
	public ArrayList<AutorModel> getAutores() {
		return AutorRepository.charge();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/autor", consumes = MediaType.ALL_VALUE)
	public void postAutor(@RequestBody AutorModel autor) {
		AutorRepository.insert(autor);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/autor" , consumes=MediaType.ALL_VALUE)
	public void putAutor(@RequestBody AutorModel autor) {
		AutorRepository.update(autor);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/autor" , consumes=MediaType.ALL_VALUE)
	public void deleteAutor(@RequestBody AutorModel autor ) {
		AutorRepository.delete(autor);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/autor/prioridades")
	public ArrayList<String> prioridades() {
		return AutorRepository.Prioridades();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/autor/valores")
	public ArrayList<String> valores() {
		return AutorRepository.Valores();
	}


}
