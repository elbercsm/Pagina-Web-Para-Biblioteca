import { Component, OnInit , Input} from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { LivrosService } from 'src/app/service/allService/allService.service';
import { Subscribable, Subscription } from 'rxjs';

@Component({
  selector: 'app-po-update',
  templateUrl: './po-update.component.html',
  styleUrls: ['./po-update.component.css']
})
export class PoUpdateComponent implements OnInit {


  valores : any;
  prioridades : any;
  item : any;
  nome : any;

  cadastro = true;
  urlCancel : any

  teste: any;
  login: any;
  inscriacao : Subscription;

  auxItem : any;

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
        this.item = queryParams[0];
        this.prioridades = queryParams[1];
        this.valores = queryParams[2];
        this.nome = queryParams[3];
        this.urlCancel = "/"+this.nome +"";
        
        console.log(this.auxItem)
      }
    )

    console.log(this.item)
    // console.log(this.item)
    // console.log(this.prioridades)
    // console.log(this.valores)

  }

  fechar(){
    console.log(this.item)
  }

  onSubmit(f: NgForm) {
    console.log("cadastro :"+ this.nome)
    console.log(f.value);
    this.livroService.atualizar(this.nome, f.value).subscribe();
    
    this.navigate();
    

  }

  navigate(){
    this.router.navigate([this.urlCancel]);
  }
}
