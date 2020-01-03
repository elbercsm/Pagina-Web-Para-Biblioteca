package com.biblioteca.repository;

import static com.biblioteca.generatedclasses.tables.LivroAutor.LIVRO_AUTOR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.biblioteca.model.LivroAutorModel;

public class LivroAutorRepository {

	static Connection conn = null;

	static String userName = "root";
	static String passWord = "";
	static String url = "jdbc:mysql://localhost:3306/bibliotecaPO";

	public static ArrayList<LivroAutorModel> charge() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(LIVRO_AUTOR).fetch();

			ArrayList<LivroAutorModel> allLivroAutor = new ArrayList<LivroAutorModel>();

			// iterando os resultados
			for (Record r : result) {
				LivroAutorModel livroAutor = new LivroAutorModel();

				livroAutor.setId(r.getValue(LIVRO_AUTOR.ID));
				livroAutor.setFk_livro(r.getValue(LIVRO_AUTOR.FK_LIVRO));
				livroAutor.setFk_autor(r.getValue(LIVRO_AUTOR.FK_AUTOR));
				allLivroAutor.add(livroAutor);
			}
			return allLivroAutor;
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

	public static String insert(LivroAutorModel livroAutor) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(LIVRO_AUTOR).fetch();

			create.insertInto(LIVRO_AUTOR, LIVRO_AUTOR.FK_LIVRO, LIVRO_AUTOR.FK_AUTOR)
					.values(livroAutor.getFk_livro(), livroAutor.getFk_autor())

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

	public static String update(LivroAutorModel livroAutor) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			create.update(LIVRO_AUTOR).set(LIVRO_AUTOR.FK_LIVRO, livroAutor.getFk_livro())
					.set(LIVRO_AUTOR.FK_AUTOR, livroAutor.getFk_autor()).where(LIVRO_AUTOR.ID.eq(livroAutor.getId()))
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

	public static String delete(LivroAutorModel livroAutor) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			create.delete(LIVRO_AUTOR).where(LIVRO_AUTOR.ID.eq(livroAutor.getId())).execute();
			
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
		prioridades.add("fk_livro");
		prioridades.add("fk_autor");
		return prioridades;

	}

	public static ArrayList<String> Valores() {

		ArrayList<String> valores = new ArrayList<>();

		valores.add("number");
		valores.add("number");
		valores.add("number");
		return valores;

	}

}
