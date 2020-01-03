package com.biblioteca.repository;

import static com.biblioteca.generatedclasses.tables.Livro.LIVRO;
import static com.biblioteca.generatedclasses.tables.Perfil.PERFIL;

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

import com.biblioteca.generatedclasses.tables.records.PerfilRecord;
import com.biblioteca.model.PerfilModel;

public class PerfisRepository {
	static Connection conn = null;

	static String userName = "root";
	static String passWord = "";
	static String url = "jdbc:mysql://localhost:3306/bibliotecaPO";

	public static ArrayList<PerfilModel> getUsuarios() {

		ArrayList<PerfilModel> todosPerfis = new ArrayList<PerfilModel>();

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);

			// buscando dados no banco
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(PERFIL).fetch();

			// iterando os resultados
			for (Record r : result) {

				PerfilModel p = new PerfilModel();
				p.setId(r.getValue(PERFIL.ID));
				p.setNome(r.getValue(PERFIL.NOME));
				// System.out.println(p.getId()+" : "+p.getNome());
				todosPerfis.add(p);
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

		return todosPerfis;

	}

	public static String insert(PerfilModel perfil) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			create.insertInto(PERFIL, PERFIL.NOME).values(perfil.getNome()).execute();
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

	public static String update(PerfilModel perfil) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			// System.out.println(column.getHeaderText() + " : "+ column.getKey());
			// Atualizar no banco de dados .
			create.update(PERFIL).set(PERFIL.NOME, perfil.getNome()).where(PERFIL.ID.eq(perfil.getId())).execute();

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
			/* Get a previously inserted book
			Record r = create.fetchOne(PERFIL, PERFIL.ID.eq(id));
			 Delete the book
			((UpdatableRecordImpl<PerfilRecord>) r).delete();
			*/
			if(id == 1) {
				return "Não e possivel deletar o perfil primario!";
			}
			create.delete(PERFIL)
		      .where(PERFIL.ID.eq(id))
		      .execute();
			
			return "Deletado com sucesso!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Erro";
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
