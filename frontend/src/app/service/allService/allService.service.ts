import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LivrosService {
  prioridade : Array<any>
  valor : Array<any>
  url ="/api/";
  static listar: any;
  token:object;

  constructor(private http: HttpClient) { }
  listar(name){
    return this.http.get<any[]>(`${this.url+name}`);
  }
  atualizar(name, objeto:any){
    return this.http.put(this.url+name, objeto);
  }
  inserir(name, objeto:any){
    // alert("Inserido com sucesso!"); 
    return this.http.post(this.url+name, objeto);
  }
  deletar(name, id: number){ 
    console.log(`${this.url+name+'/'+id}`)
    // console.log("deletar service id : "+ objeto + " url : " + this.url+name   )
    return this.http.delete(`${this.url+name+'/'+id}` );
    
  }
  prioridades(name){
    return this.http.get<any[]>(`${this.url+name+"/prioridades"}`);
  }
  valores(name){
    return this.http.get<any[]>(`${this.url+name+"/valores"}`);
  }
  login(objeto:any){
    let aux = this.http.post<any[]>("/api/login", objeto);
    return aux;
  }

  // definirToken(token:object){
  //   this.token = token;
  // }

  // solicitarToken(){
  //   return this.token
  // }



  desativar(name, objeto:any){
    return this.http.put(this.url+name+"/disponivel_emprestado", objeto);
  }

}
