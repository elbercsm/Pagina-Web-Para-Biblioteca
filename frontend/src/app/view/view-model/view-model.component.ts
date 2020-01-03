import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/model/usuario';
import { LivrosService } from 'src/app/service/allService/allService.service';

@Component({
  selector: 'app-view-model',
  templateUrl: './view-model.component.html',
  styleUrls: ['./view-model.component.css']
})
export class ViewModelComponent implements OnInit {
 
  lista: Array<any>
  objeto = new Usuario();
  nome : any;

  constructor(private livroService: LivrosService) { }

  
  ngOnInit() {
    this.livroService.listar("usuario").subscribe(dados => this.lista=dados);
    this.nome = "usuario"
  
  }

}
