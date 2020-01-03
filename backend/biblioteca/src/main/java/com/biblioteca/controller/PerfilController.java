package com.biblioteca.controller;



import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.model.PerfilModel;
import com.biblioteca.repository.LivrosRepository;
import com.biblioteca.repository.PerfisRepository;

@RestController
public class PerfilController {
	
	@RequestMapping(method = RequestMethod.GET,value = "/perfil")
	public ArrayList<PerfilModel> getUsuarios() {
		return PerfisRepository.getUsuarios();
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/perfil" , consumes=MediaType.ALL_VALUE)
	public String postPerfil(@RequestBody PerfilModel perfil) {
		 return PerfisRepository.insert(perfil);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/perfil" , consumes=MediaType.ALL_VALUE)
	public void putPerfil(@RequestBody PerfilModel perfil) {
		PerfisRepository.update(perfil);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/perfil/{id}" , consumes=MediaType.ALL_VALUE)
	public void deleteLivro(@PathVariable int id) {
		System.out.println("Delete");
		PerfisRepository.delete(id);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/perfil/prioridades")
	public ArrayList<String> getPropriedades() {
		return PerfisRepository.Prioridades();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/perfil/valores")
	public ArrayList<String> getValores() {
		return PerfisRepository.Valores();
	}
}
