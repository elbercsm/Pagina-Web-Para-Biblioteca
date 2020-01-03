import { LivrosService } from '../service/allService/allService.service';

export class Usuario {

    private id : number;
    private usuario : string;
    private email : string;
    private senha : string;
    private telefone : string;
    private foto : string;
    private fk_perfil : Array<any>;



    valores(){
        let valores =  ["number" , "text" , "text" , "text" , "text", "text" , "text"]
        return valores;
    }
    propriedades(){
        let propriedades = ["id", "usuario" , "email" , "senha" , "telefone" , "foto" , "fk_perfil"]
        return propriedades;
    }

  
}
