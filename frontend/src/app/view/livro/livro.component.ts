import { Component, OnInit } from '@angular/core';
import { LivrosService } from 'src/app/service/allService/allService.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-livro',
  templateUrl: './livro.component.html',
  styleUrls: ['./livro.component.css']
})
export class LivroComponent implements OnInit {

  lista: Array<any>
  chaves : Array<any>
  valores : Array<any>
  nome : any;
  json : any;


  constructor(private livroService: LivrosService,    
               private router: Router,) { }

  ngOnInit() {
    console.log(localStorage)
    if((localStorage.usuario===undefined)||(localStorage.usuario === "" )||(localStorage===null)){
      this.router.navigate([""]);
    }
    
    this.json = {id : "number" , isbn :"number" , capa:"text" , titulo:"text" , autor: "text" , descricao: "text", ano_publicacao: "date" , editora: "text" , genero: "text" , status: "status" , fk_acesso:"login"}
  
    this.chaves = Object.keys(this.json)
    this.valores = Object.values(this.json)
    this.nome = "livro"

    setTimeout(() => {
      this.livroService.listar("livro").subscribe(dados => this.lista=dados);
    }, 150);
  }

  listar(){

  }

}
