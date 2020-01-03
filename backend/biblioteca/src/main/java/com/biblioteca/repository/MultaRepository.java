package com.biblioteca.repository;

import static com.biblioteca.generatedclasses.tables.Multa.MULTA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.biblioteca.model.MultaModel;

public class MultaRepository {
	
	static Connection conn = null;

	static String userName = "root";
	static String passWord = "";
	static String url = "jdbc:mysql://localhost:3306/bibliotecaPO";

	public static ArrayList<MultaModel> charge() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(MULTA).fetch();

			ArrayList<MultaModel> allMultas = new ArrayList<MultaModel>();

			// iterando os resultados
			for (Record r : result) {
				MultaModel multa = new MultaModel();
				
				multa.setId(r.getValue(MULTA.ID));
				multa.setValor(r.getValue(MULTA.VALOR));
				//multa.setStatus_multa(r.getValue(MULTA.STATUS_MULTA));
				multa.setFk_emprestimo(r.getValue(MULTA.FK_EMPRESTIMO));
				
				
				allMultas.add(multa);
			}
			return allMultas;
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

	public static String insert(MultaModel multa) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(MULTA).fetch();

			create.insertInto(MULTA, MULTA.VALOR, MULTA.FK_EMPRESTIMO )
					.values(multa.getValor(), multa.getFk_emprestimo())
					

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

	public static String update(MultaModel multa) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			
			create.update(MULTA)
		      .set(MULTA.VALOR, multa.getValor())
		      .set(MULTA.FK_EMPRESTIMO, multa.getFk_emprestimo())
		      .where(MULTA.ID.eq(multa.getId()))
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
	
	public static String delete(MultaModel multa) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			
			create.delete(MULTA)
		      .where(MULTA.ID.eq(multa.getId()))
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
		prioridades.add("valor");
		//prioridades.add("status_multa");
		prioridades.add("fk_emprestimo");
		return prioridades;

	}

	public static ArrayList<String> Valores() {

		ArrayList<String> valores = new ArrayList<>();

		valores.add("number");
		valores.add("number");
		//valores.add("boolean");
		valores.add("number");
		return valores;

	}


}
