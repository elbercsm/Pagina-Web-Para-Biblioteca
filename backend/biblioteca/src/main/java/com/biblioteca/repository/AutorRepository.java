package com.biblioteca.repository;

import static com.biblioteca.generatedclasses.tables.Autor.AUTOR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.biblioteca.model.AutorModel;


public class AutorRepository {
	
	
	static Connection conn = null;

	static String userName = "root";
	static String passWord = "";
	static String url = "jdbc:mysql://localhost:3306/bibliotecaPO";

	public static ArrayList<AutorModel> charge() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(AUTOR).fetch();

			ArrayList<AutorModel> allAutores = new ArrayList<AutorModel>();

			// iterando os resultados
			for (Record r : result) {
				AutorModel autor = new AutorModel();
				
				autor.setId(r.getValue(AUTOR.ID));
				autor.setNome(r.getValue(AUTOR.NOME));
				
				
				allAutores.add(autor);
			}
			return allAutores;
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

	public static String insert(AutorModel autor) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(AUTOR).fetch();

			create.insertInto(AUTOR, AUTOR.NOME )
					.values(autor.getNome())
					

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

	public static String update(AutorModel autor) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			
			create.update(AUTOR)
		      .set(AUTOR.NOME, autor.getNome())
		      .where(AUTOR.ID.eq(autor.getId()))
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
	
	
	public static String delete(AutorModel autor) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			
			create.delete(AUTOR)
		      .where(AUTOR.ID.eq(autor.getId()))
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
		prioridades.add("nome");
		return prioridades;

	}

	public static ArrayList<String> Valores() {

		ArrayList<String> valores = new ArrayList<>();

		valores.add("number");
		valores.add("text");
		return valores;

	}


}
