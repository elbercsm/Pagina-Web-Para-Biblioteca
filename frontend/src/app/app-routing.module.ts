import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PoTableComponent } from './component/po-table/po-table.component';
import { PoCadastroComponent } from './component/po-cadastro/po-cadastro.component';
import { LivroComponent } from './view/livro/livro.component';
import { PoUpdateComponent } from './component/po-update/po-update.component';
import { PerfilComponent } from './view/perfil/perfil.component';
import { UsuarioComponent } from './view/usuario/usuario.component';
import { PoInicioComponent } from './component/po-inicio/po-inicio.component';
import { ViewModelComponent } from './view/view-model/view-model.component';
import { LoginComponent } from './view/login/login.component';


const routes: Routes = [{path: "livro", component: LivroComponent},
                        {path: "cadastro", component: PoCadastroComponent},
                        {path: "update", component: PoUpdateComponent},
                        {path: "perfil", component: PerfilComponent},
                        {path: "usuario" , component: UsuarioComponent},
                        {path: "inicio" , component: PoInicioComponent},
                        {path: "teste" , component: ViewModelComponent},
                        {path: "" , component: LoginComponent}
                      ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
