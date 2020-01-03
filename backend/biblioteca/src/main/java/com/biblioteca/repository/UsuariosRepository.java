package com.biblioteca.repository;

import static com.biblioteca.generatedclasses.tables.Usuario.USUARIO;
import static com.biblioteca.generatedclasses.tables.Token.TOKEN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import com.biblioteca.model.UsuarioModel;

public class UsuariosRepository {
	static Connection conn = null;

	static String userName = "root";
	static String passWord = "";
	static String url = "jdbc:mysql://localhost:3306/bibliotecaPO";

	public static ArrayList<UsuarioModel> charge() {
		try {
			System.out.println("get usuario repository");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(USUARIO).fetch();

			ArrayList<UsuarioModel> allUsuarios = new ArrayList<UsuarioModel>();

			// iterando os resultados
			for (Record r : result) {
				UsuarioModel usuario = new UsuarioModel();
				usuario.setId(r.getValue(USUARIO.ID));
				usuario.setUsuario(r.getValue(USUARIO.USUARIO_));
				usuario.setEmail(r.getValue(USUARIO.EMAIL));
				usuario.setSenha(r.getValue(USUARIO.SENHA));
				usuario.setTelefone(r.getValue(USUARIO.TELEFONE));
		
				// usuario.setStatus_usuario(r.getValue(USUARIO.STATUS_USUARIO) != null);
				usuario.setFk_perfil(r.getValue(USUARIO.FK_PERFIL));

				allUsuarios.add(usuario);

			}
			return allUsuarios;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}
		return null;
	}

	public static String insert(UsuarioModel usuario) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			//Result<Record> result = create.select().from(USUARIO).fetch();
			System.out.println(
							usuario.getEmail() +" : "+
                            usuario.getFk_perfil() +" : "+					
							usuario.getSenha() +" : "+
							usuario.getId() +" : "+
							usuario.getTelefone() +" : "+
							usuario.getUsuario()
					
					);
			usuario.setStatus_usuario(1);
			
			if(usuario.getFk_perfil()==null) {
				usuario.setFk_perfil(1);
			}
			
			create.insertInto(USUARIO, USUARIO.USUARIO_, USUARIO.SENHA, USUARIO.EMAIL, USUARIO.TELEFONE,
					USUARIO.FK_PERFIL , USUARIO.STATUS_USUARIO)
					.values(usuario.getUsuario(), usuario.getSenha(), usuario.getEmail(), usuario.getTelefone(),
							 usuario.getFk_perfil(), usuario.getStatus_usuario())
					.execute();
			return "Inserido com sucesso!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Erro!";
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}

	}
	
	public static ArrayList login(UsuarioModel usuario) {
		ArrayList aux = new ArrayList();
		try {
			System.out.println("get usuario repository");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			
			System.out.println("EMAIL: "+usuario.getEmail() + " Senha:"+ usuario.getSenha());
			//Result<Record> result = create.select().from(USUARIO).fetch();
			Result<Record> result = create.select().from(USUARIO)
					.where(USUARIO.EMAIL.eq(usuario.getEmail()))
					.and(USUARIO.SENHA.eq(usuario.getSenha()))
					.fetch();
			
	
			
			System.out.println(result.size());
			
			if(result.size()==1) {
				aux.add("Login efetuado com sucesso!");
				aux.add(gerarToken());
				for (Record r : result) {	
					aux.add(r.getValue(USUARIO.ID).toString());
				}
				
				return aux;
			}else {
				aux.add("Email ou Senha invalido!");
				aux.add("");
				return aux;
				
			}
	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}
		return null;
	}
	
	
	public static String update(UsuarioModel usuario) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			create.update(USUARIO).set(USUARIO.USUARIO_, usuario.getUsuario()).set(USUARIO.EMAIL, usuario.getEmail())
					.set(USUARIO.SENHA, usuario.getSenha()).set(USUARIO.TELEFONE, usuario.getTelefone())
					// .set(USUARIO.STATUS_USUARIO, usuario.getStatus_usuario())
					.set(USUARIO.FK_PERFIL, usuario.getFk_perfil()).where(USUARIO.ID.eq(usuario.getId())).execute();

			return "Atualizado com sucesso!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Erro!";
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}

	}

	public static String delete(int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			create.delete(USUARIO).where(USUARIO.ID.eq(id)).execute();

			return "Deletado com sucesso!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Erro!";
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}

	}

	public static ArrayList<String> Prioridades() {

		ArrayList<String> prioridades = new ArrayList<>();

		prioridades.add("id");
		prioridades.add("usuario");
		prioridades.add("email");
		prioridades.add("senha");
		prioridades.add("telefone");
		prioridades.add("foto");
		//prioridades.add("status_usuario");
		prioridades.add("fk_perfil");
		return prioridades;

	}

	public static ArrayList<String> Valores() {

		ArrayList<String> valores = new ArrayList<>();

		valores.add("number");
		valores.add("text");
		valores.add("text");
		valores.add("text");
		valores.add("text");
		valores.add("text");
		//valores.add("Boolean ??");
		valores.add("number");
		return valores;

	}
	
	public static String gerarToken() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZabcdefghijklmnopqrstuvywxaz!@#$%&*+123456789";
		 
		Random random = new Random();
		 
		String armazenaChaves = "";
		int index = -1;
		for( int i = 0; i < 25; i++ ) {
		   index = random.nextInt( letras.length() );
		   armazenaChaves += letras.substring( index, index + 1 );
		}
		System.out.println( armazenaChaves );
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		try {	
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);			
			create.insertInto(TOKEN, TOKEN.TOKEN_)
			.values(armazenaChaves)
			.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return armazenaChaves;
		
	}

}
