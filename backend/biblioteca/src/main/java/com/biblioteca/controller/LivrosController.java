package com.biblioteca.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.model.LivroModel;
import com.biblioteca.repository.LivrosRepository;

@RestController
public class LivrosController {
	
	@RequestMapping(method = RequestMethod.GET,value = "/livro")
	public ArrayList<LivroModel> getLivros() {
		return LivrosRepository.charge();
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/livro" , consumes=MediaType.ALL_VALUE)
	public void postLivro(@RequestBody LivroModel livro) {
		LivrosRepository.insert(livro);
	}

	@RequestMapping(method = RequestMethod.PUT,value = "/livro" , consumes=MediaType.ALL_VALUE)
	public void putLivro(@RequestBody LivroModel livro) {
		LivrosRepository.update(livro);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/livro/disponivel_emprestado" , consumes=MediaType.ALL_VALUE)
	public void desativar(@RequestBody LivroModel livro) {
		System.out.println("disponivel_emprestado");
		LivrosRepository.desativar(livro);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/livro/{id}" , consumes=MediaType.ALL_VALUE)
	public void deleteLivro(@PathVariable int id) {
		
		System.out.println("Delete");
		LivrosRepository.delete(id);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/livro/prioridades")
	public ArrayList<String> prioridades() {
		return LivrosRepository.Prioridades();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/livro/valores")
	public ArrayList<String> valores() {
		return LivrosRepository.Valores();
	}
	
}
