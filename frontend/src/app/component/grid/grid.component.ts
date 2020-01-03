import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grid',
  templateUrl: './grid.component.html',
  styleUrls: ['./grid.component.css']
})
export class GridComponent implements OnInit {
  attBook = ["Id" , "Nome" , "Autor" , "Status"]
  livros = [
    { id : 1 , nome : "Harry Potter e a Pedra Filosofal " , autor: "J. K. Rowling" ,status:true, descricao : "Harry Potter e a Pedra Filosofal. ... Ela descreve como Harry descobre que é um bruxo, a ida até a Escola de Magia e Bruxaria de Hogwarts, e o combate contra o temível bruxo das trevas, Lorde Voldemort."},
    { id : 2 , nome : "Harry Potter e a Camera Secreta" , autor: "J. K. Rowling" ,status:false, descricao : "Harry Potter e a Pedra Filosofal. ... Ela descreve como Harry descobre que é um bruxo, a ida até a Escola de Magia e Bruxaria de Hogwarts, e o combate contra o temível bruxo das trevas, Lorde Voldemort."},
    { id : 3 , nome : "Harry Potter e o Prisioneiro de Azkaban" , autor: "J. K. Rowling" ,status:false, descricao : "Harry Potter e a Pedra Filosofal. ... Ela descreve como Harry descobre que é um bruxo, a ida até a Escola de Magia e Bruxaria de Hogwarts, e o combate contra o temível bruxo das trevas, Lorde Voldemort."},
    { id : 4 , nome : "Senhor dos Aneis a Sociedade do Anel" , autor: "J. R. R. Tolkien" ,status:true, descricao : "O Um Anel é o elemento central da saga. No anel, em inscrições no alfabeto Tengwar com versos na língua proibida de Mordor, pode ler-se: Um Anel para todos governar, Um Anel para encontrá-los, Um Anel para a todos trazer e na escuridão aprisioná-los. Palavras em contínuo tanto na parte de dentro do anel, como na parte externa do anel. Isso se apresenta no início do livro, na apresentação da trilogia, no original em primeira edição em Inglês. Na saga, os vilões se autodestroem pelo próprio porte do anel."}
  ]
  constructor() { }

  ngOnInit() {
  }
  teste(){
 console.log("TESTE");
  
  }
}
