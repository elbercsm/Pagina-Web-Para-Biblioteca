import { Component, OnInit, Input } from '@angular/core';
import {NgForm} from '@angular/forms';
import { LivrosService } from '../../service/allService/allService.service';
import { Router } from '@angular/router';

import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-po-cadastro',
  templateUrl: './po-cadastro.component.html',
  styleUrls: ['./po-cadastro.component.css']
})
export class PoCadastroComponent implements OnInit {
  //product : Product;
  valores : any;
  prioridades : any;
  nome : any;

  login: any;

  itemRota : any;

  urlCancel : any

  teste: any;

  separar_string : any;

  constructor(
    private livroService: LivrosService,
    private route: ActivatedRoute,
    private router: Router,
    ) { }

  ngOnInit() {
    if((localStorage.usuario===undefined)||(localStorage.usuario === "" )||(localStorage===null)){
      this.router.navigate([""]);
    }
    this.login = localStorage.usuario;

    this.route.queryParams.subscribe(
      (queryParams: any) =>{
        this.prioridades = queryParams['prioridades'];
        this.valores = queryParams['valores'];
        this.nome = queryParams['nome'];
        this.urlCancel = "/"+this.nome +"";
        console.log(this.urlCancel)
      }
    )
  
  

  }

  onSubmit(f: NgForm) {

    console.log(f.value)
    console.log(this.livroService.solicitarToken())
    // console.log("cadastro :"+ this.nome)
    // console.log(f.value)
    this.livroService.inserir(this.nome, f.value).subscribe();
    this.navigate()

  }
  navigate(){
    this.router.navigate([this.urlCancel]);
  }

  separarString(string){
  
    this.separar_string = [];
    this.separar_string = string.split(",");
    console.log(this.separar_string)
  }

}
