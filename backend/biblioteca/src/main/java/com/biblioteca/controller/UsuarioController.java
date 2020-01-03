package com.biblioteca.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.model.UsuarioModel;
import com.biblioteca.repository.LivrosRepository;
import com.biblioteca.repository.UsuariosRepository;
@RestController
public class UsuarioController {

	@RequestMapping(method = RequestMethod.GET, value = "/usuario")
	public ArrayList<UsuarioModel> getUsuarios() {
		return UsuariosRepository.charge();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/usuario", consumes = MediaType.ALL_VALUE)
	public void postUsuario(@RequestBody UsuarioModel usuario) {
		UsuariosRepository.insert(usuario);
	}

	
	@RequestMapping(method = RequestMethod.PUT,value = "/usuario" , consumes=MediaType.ALL_VALUE)
	public void putUsuario(@RequestBody UsuarioModel usuario) {
		UsuariosRepository.update(usuario);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/usuario/{id}" , consumes=MediaType.ALL_VALUE)
	public void deleteLivro(@PathVariable int id) {
		
		UsuariosRepository.delete(id);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/usuario/prioridades")
	public ArrayList<String> prioridades() {
		return UsuariosRepository.Prioridades();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/usuario/valores")
	public ArrayList<String> valores() {
		return UsuariosRepository.Valores();
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/login", consumes=MediaType.ALL_VALUE)
	public ArrayList<String> login(@RequestBody UsuarioModel usuario) {
		System.out.println("/login");
	
	 return UsuariosRepository.login(usuario); 
	
	}
	

	
}
