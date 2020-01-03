import { Component, OnInit } from '@angular/core';
import { LivrosService } from 'src/app/service/allService/allService.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {

  lista: Array<any>
  nome : any;
  json : any
  valores: any;
  chaves: any;
  perfil: Array<any>
  


  constructor(private livroService: LivrosService,
              private router : Router) { }

  ngOnInit() {
    if((localStorage.usuario===undefined)||(localStorage.usuario === "" )||(localStorage===null)){
      this.router.navigate([""]);
    }
    var fk_perfil = [];
    this.livroService.listar("usuario").subscribe(dados => this.lista=dados);

    this.livroService.listar("perfil").subscribe(dados => this.perfil=dados);


    setTimeout(() => {
      

      // console.log(this.perfil)
      this.perfil.forEach(element => {
        // fk_perfil.push(element.id + " : " + element.nome)
        fk_perfil.push(element.id )
      }); 
      console.log(fk_perfil)
    }, 500);

    this.json = {id:"number", usuario: "text" , senha: "password" , email : "text", telefone: "number" , fk_perfil : fk_perfil}
    this.chaves = Object.keys(this.json)
    this.valores = Object.values(this.json)
    this.nome = "usuario"



  
  }

  

}
