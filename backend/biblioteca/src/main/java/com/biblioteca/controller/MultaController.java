package com.biblioteca.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.biblioteca.model.MultaModel;
import com.biblioteca.repository.MultaRepository;

public class MultaController {

	
	@RequestMapping(method = RequestMethod.GET, value = "/multa")
	public ArrayList<MultaModel> getMultas() {
		return MultaRepository.charge();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/multa", consumes = MediaType.ALL_VALUE)
	public void postMulta(@RequestBody MultaModel multa) {
		MultaRepository.insert(multa);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/multa" , consumes=MediaType.ALL_VALUE)
	public void putMulta(@RequestBody MultaModel multa) {
		MultaRepository.update(multa);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/multa" , consumes=MediaType.ALL_VALUE)
	public void deleteMulta(@RequestBody MultaModel multa ) {
		MultaRepository.delete(multa);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/multa/prioridades")
	public ArrayList<String> prioridades() {
		return MultaRepository.Prioridades();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/multa/valores")
	public ArrayList<String> valores() {
		return MultaRepository.Valores();
	}

	
}
