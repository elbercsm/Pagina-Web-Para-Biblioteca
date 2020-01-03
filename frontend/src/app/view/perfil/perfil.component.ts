import { Component, OnInit } from '@angular/core';
import { LivrosService } from 'src/app/service/allService/allService.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})
export class PerfilComponent implements OnInit {

 
  lista: Array<any>
  prioridades : Array<any>
  valores : Array<any>
  nome : any;

  constructor(private livroService: LivrosService,
              private router: Router) { }

  ngOnInit() {
    if((localStorage.usuario===undefined)||(localStorage.usuario === "" )||(localStorage===null)){
      this.router.navigate([""]);
    }
    this.livroService.listar("perfil").subscribe(dados => this.lista=dados);
    this.livroService.prioridades("perfil").subscribe(dados => this.prioridades=dados);
    this.livroService.valores("perfil").subscribe(dados => this.valores=dados);
    this.nome = "perfil"
  }
}
