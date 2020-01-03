import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GridComponent } from './component/grid/grid.component';
import { PoTableComponent } from './component/po-table/po-table.component';
import { BookCoverComponent } from './component/book-cover/book-cover.component';

import { FormsModule } from '@angular/forms';

import { LivrosService } from './service/allService/allService.service';
import { PoCadastroComponent } from './component/po-cadastro/po-cadastro.component';
import { LivroComponent } from './view/livro/livro.component';
import { PoUpdateComponent } from './component/po-update/po-update.component';
import { PerfilComponent } from './view/perfil/perfil.component';
import { UsuarioComponent } from './view/usuario/usuario.component';
import { PoMenuComponent } from './component/po-menu/po-menu.component';
import { PoInicioComponent } from './component/po-inicio/po-inicio.component';
import { PoTableModelComponent } from './component/po-table-model/po-table-model.component';
import { ViewModelComponent } from './view/view-model/view-model.component';
import { LoginComponent } from './view/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    GridComponent,
    PoTableComponent,
    BookCoverComponent,
    PoCadastroComponent,
    LivroComponent,
    PoUpdateComponent,
    PerfilComponent,
    UsuarioComponent,
    PoMenuComponent,
    PoInicioComponent,
    PoTableModelComponent,
    ViewModelComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [LivrosService],
  bootstrap: [AppComponent]
})
export class AppModule { }
