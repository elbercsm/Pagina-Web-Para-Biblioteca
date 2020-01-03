import { Component, OnInit, Input } from '@angular/core';
import { LivrosService } from '../../service/allService/allService.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-po-table',
  templateUrl: './po-table.component.html',
  styleUrls: ['./po-table.component.css']
})

export class PoTableComponent implements OnInit {

  @Input()
  prioridades: any;
  @Input()
  valores: any;
  @Input()
  lista: Array<any>
  @Input()
  nome: any;

  cadastro = false;
  item: any;





  constructor(private livroService: LivrosService,
    private router: Router) { }

  ngOnInit() {

    if((localStorage.usuario===undefined)||(localStorage.usuario === "" )||(localStorage===null)){
      this.router.navigate([""]);
    }


  }
  abrirCadastro() {

    if (this.cadastro) {
      this.cadastro = false;
    } else {
      this.cadastro = true;
    }
  }


  excluir(item: any) {

    this.item = item;

    console.log(this.nome + " : " + item)

    var r = confirm("Tem certeza que deseja excluir esse item ?");

    if (r == true) {
      this.livroService.deletar(this.nome, item).subscribe()
    }
    setTimeout(() => {
      this.livroService.listar(this.nome).subscribe(dados => this.lista = dados)
    }, 150);
 

  }

  atualizar(item: any) {
    this.router.navigate(['/update'], { queryParams: [Object.values(item), this.prioridades, this.valores, this.nome] });
  }
  desativar(item: any) {
 
    console.log(item)

    var r = confirm("Tem certeza que deseja Emprestar/Devolver ?");

    if (r == true) {

      this.livroService.desativar(this.nome, item).subscribe()

    }
    setTimeout(() => {
      this.livroService.listar(this.nome).subscribe(dados => this.lista = dados)
    }, 150);


  }


}
