import { Component, OnInit, Input } from '@angular/core';
import { LivrosService } from 'src/app/service/allService/allService.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-po-table-model',
  templateUrl: './po-table-model.component.html',
  styleUrls: ['./po-table-model.component.css']
})
export class PoTableModelComponent implements OnInit {

  @Input()
  lista: Array<any>

  @Input()
  nome: any;

  @Input()
  objeto : Object;

  perfis : any
  propriedades :  any
  valores : any

  constructor(private livroService: LivrosService ,
              private router: Router) { }

  ngOnInit() {
    // this.propriedades = this.objeto.propriedades()
    // this.valores = this.objeto.valores()
        this.perfis=this.livroService.listar('perfil')

       let json = [{'id': 'number' , 
                    'usuario': 'text',
                    'email' : 'text' ,
                    'senha' : 'text' ,
                    'telefone' : 'text',
                    'foto' : 'text',
                    'fk_perfil' : this.perfis}]
                    console.log(json)
                      console.log(this.perfis)
                    for(let i = 0 ;i<this.perfis.length() ; i++){
                          console.log(this.perfis[i])
                    }
    // console.log(this.objeto.valores())
    // console.log(this.objeto.propriedades())

  }


}
