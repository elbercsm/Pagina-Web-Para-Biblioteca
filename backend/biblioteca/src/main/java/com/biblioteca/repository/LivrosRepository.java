package com.biblioteca.repository;

import static com.biblioteca.generatedclasses.tables.Livro.LIVRO;
import static com.biblioteca.generatedclasses.tables.Usuario.USUARIO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.UpdatableRecordImpl;

import com.biblioteca.generatedclasses.tables.Usuario;
import com.biblioteca.model.LivroModel;
import com.biblioteca.model.UsuarioModel;

public class LivrosRepository {
	static Connection conn = null;

	static String userName = "root";
	static String passWord = "";
	static String url = "jdbc:mysql://localhost:3306/bibliotecaPO";

	public static ArrayList<LivroModel> charge() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(LIVRO).fetch();

			ArrayList<LivroModel> allLivros = new ArrayList<LivroModel>();

			// iterando os resultados
			for (Record r : result) {
				LivroModel livro = new LivroModel();
				
				livro.setId(r.getValue(LIVRO.ID));
				livro.setIsbn(r.getValue(LIVRO.ISBN));
				livro.setCapa(r.getValue(LIVRO.CAPA));
				livro.setTitulo(r.getValue(LIVRO.TITULO));
				livro.setAutor(r.getValue(LIVRO.AUTOR));
				livro.setDescricao(r.getValue(LIVRO.DESCRICAO));
				livro.setAno_publicacao(r.getValue(LIVRO.ANO_PUBLICACAO));
				livro.setEditora(r.getValue(LIVRO.EDITORA));
				livro.setGenero(r.getValue(LIVRO.GENERO));
				livro.setStatus(r.getValue(LIVRO.STATUS));
				livro.setFk_acesso(r.getValue(LIVRO.FK_ACESSO));
				
				allLivros.add(livro);
			}
			return allLivros;
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

	public static String insert(LivroModel livro) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(LIVRO).fetch();
			
			if((livro.getStatus().equals("Disponivel"))||(livro.getStatus().equals("Emprestado"))){
				
			}else {
				System.out.println(livro.getStatus());
				livro.setStatus("Disponivel");
			}

			create.insertInto(LIVRO, LIVRO.ANO_PUBLICACAO, LIVRO.AUTOR, LIVRO.CAPA, LIVRO.DESCRICAO, LIVRO.EDITORA,
					LIVRO.STATUS, LIVRO.FK_ACESSO, LIVRO.GENERO, LIVRO.ISBN, LIVRO.TITULO)
					.values(livro.getAno_publicacao(), livro.getAutor(), livro.getCapa(), livro.getDescricao(),
							livro.getEditora(), livro.getStatus(), livro.getFk_acesso(), livro.getGenero(),
							livro.getIsbn(), livro.getTitulo())

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

	public static String update(LivroModel livro) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			
			create.update(LIVRO)
		      .set(LIVRO.ISBN, livro.getIsbn())
		      .set(LIVRO.CAPA, livro.getCapa())
		      .set(LIVRO.TITULO, livro.getTitulo())
		      .set(LIVRO.AUTOR,livro.getAutor())
		      .set(LIVRO.DESCRICAO, livro.getDescricao())
		      .set(LIVRO.ANO_PUBLICACAO, livro.getAno_publicacao())
		      .set(LIVRO.EDITORA, livro.getEditora())
		      .set(LIVRO.GENERO, livro.getGenero())
		      .set(LIVRO.STATUS, livro.getStatus())
		      .set(LIVRO.FK_ACESSO, livro.getFk_acesso())
		      .where(LIVRO.ID.eq(livro.getId()))
		      .execute();
			
			
			

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
	
	public static String desativar(LivroModel livro) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			
			System.out.println(livro.getStatus());
			
			if(livro.getStatus().equals("Disponivel")){
				System.out.println("mudou");
				livro.setStatus("Emprestado");
			}else {
				System.out.println("mudou");
				livro.setStatus("Disponivel");
			}
			
			create.update(LIVRO)
		      .set(LIVRO.ISBN, livro.getIsbn())
		      .set(LIVRO.CAPA, livro.getCapa())
		      .set(LIVRO.TITULO, livro.getTitulo())
		      .set(LIVRO.AUTOR,livro.getAutor())
		      .set(LIVRO.DESCRICAO, livro.getDescricao())
		      .set(LIVRO.ANO_PUBLICACAO, livro.getAno_publicacao())
		      .set(LIVRO.EDITORA, livro.getEditora())
		      .set(LIVRO.GENERO, livro.getGenero())
		      .set(LIVRO.STATUS, livro.getStatus())
		      .set(LIVRO.FK_ACESSO, livro.getFk_acesso())
		      .where(LIVRO.ID.eq(livro.getId()))
		      .execute();
			
			
			

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

			
			create.delete(LIVRO)
		      .where(LIVRO.ID.eq(id))
		      .execute();
			
			
			
			
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
		prioridades.add("isbn");
		prioridades.add("capa");
		prioridades.add("titulo");
		prioridades.add("autor");
		prioridades.add("descricao");
		prioridades.add("ano_publicacao");
		prioridades.add("editora");
		prioridades.add("genero");
		prioridades.add("end_fisico");
		prioridades.add("fk_acesso");

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
		valores.add("date");
		valores.add("text");
		valores.add("text");
		valores.add("text");
		valores.add("number");
		
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<UsuarioModel> auxUsuario = new ArrayList <UsuarioModel>();
		auxUsuario = UsuariosRepository.charge();
		
		for(int i = 0 ; i < auxUsuario.size() ; i++ ) {
			array.add(auxUsuario.get(i).getUsuario());
			System.out.println(auxUsuario.get(i).getUsuario());
		}
	
		
		return valores;

	}


}
