import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-po-menu',
  templateUrl: './po-menu.component.html',
  styleUrls: ['./po-menu.component.css']
})
export class PoMenuComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
 
  }

  sair(){
    localStorage.clear();
    this.router.navigate([""]);
  }

}
