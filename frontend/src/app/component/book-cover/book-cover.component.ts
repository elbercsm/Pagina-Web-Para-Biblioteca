import { Component, OnInit } from '@angular/core';
import { LivrosService } from 'src/app/service/allService/allService.service';


@Component({
  selector: 'app-book-cover',
  templateUrl: './book-cover.component.html',
  styleUrls: ['./book-cover.component.css']
})

export class BookCoverComponent implements OnInit {
  
  attBook = ["Id" , "Titulo" , "Autor" , "Status"]
  livros 
  dialogBook = { id : 0 , nome : "Empty" , autor: "Empty" ,status:true, descricao : "Empty"};


  constructor(private livroService: LivrosService) { }

 
  ngOnInit() {
    this.livroService.listar("livro").subscribe(dados => this.livros=dados);
  }
  openDialog(item){

  this.dialogBook.nome = item.titulo;
  this.dialogBook.descricao = item.descricao;

  var dialog = document.getElementById('book-details');
  dialog.showModal();
  
  
  
  
  }
  closeDialog(){
    var dialog = document.getElementById('book-details');
    dialog.close();
  }
}
