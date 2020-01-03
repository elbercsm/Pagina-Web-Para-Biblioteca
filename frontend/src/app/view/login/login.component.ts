import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { LivrosService } from 'src/app/service/allService/allService.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private livroService: LivrosService) { }


  chaves: any
  valores: Array<any>
  nome: any;
  json: any;

  logar: Array<any>;
  token: object;




  ngOnInit() {
    this.json = { usuario: "text", senha: "password", email: "text", telefone: "text" }
    this.chaves = Object.keys(this.json)
    this.valores = Object.values(this.json)
    this.nome = "usuario"
  }

  onSubmit(f: NgForm) {
    console.log(f.value)
    this.livroService.login(f.value).subscribe(dados => this.logar = dados);

    setTimeout(() => {
      this.validar()
    }, 500);
  }

  validar() {
    console.log(this.logar)
      if (this.logar[0] === "Login efetuado com sucesso!") {
        this.token = {token :this.logar[1] , id:  this.logar[2]} ;

        localStorage.token = this.logar[1];
        localStorage.usuario = this.logar[2];




        console.log(this.token);
        this.router.navigate(['/livro']);
      } else {
        alert(this.logar[0])
      }
  }

}
