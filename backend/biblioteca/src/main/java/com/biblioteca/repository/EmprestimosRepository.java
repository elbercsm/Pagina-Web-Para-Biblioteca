package com.biblioteca.repository;

import static com.biblioteca.generatedclasses.tables.Emprestimo.EMPRESTIMO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import com.biblioteca.model.EmprestimoModel;



public class EmprestimosRepository {
	static Connection conn = null;

	static String userName = "root";
	static String passWord = "";
	static String url = "jdbc:mysql://localhost:3306/bibliotecaPO";

	public static ArrayList<EmprestimoModel> charge() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(EMPRESTIMO).fetch();

			ArrayList<EmprestimoModel> allEmprestimo = new ArrayList<EmprestimoModel>();

			for (Record r : result) {

				EmprestimoModel emprestimo = new EmprestimoModel();

				emprestimo.setId(r.getValue(EMPRESTIMO.ID));
				emprestimo.setData_inicio(r.getValue(EMPRESTIMO.DATA_INICIO));
				emprestimo.setData_final(r.getValue(EMPRESTIMO.DATA_FINAL));
				emprestimo.setFk_acesso_admin(r.getValue(EMPRESTIMO.FK_ACESSO_ADMIN));
				emprestimo.setFk_acesso_usuario(r.getValue(EMPRESTIMO.FK_ACESSO_USUARIO));
				emprestimo.setFk_livro(r.getValue(EMPRESTIMO.FK_LIVRO));
				emprestimo.setFk_status_emprestimo(r.getValue(EMPRESTIMO.FK_STATUS_EMPRESTIMO));
				allEmprestimo.add(emprestimo);

			}
			return allEmprestimo;

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
	
	
	
	public static String insert(EmprestimoModel emprestimo) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			Result<Record> result = create.select().from(EMPRESTIMO).fetch();

			create.insertInto(EMPRESTIMO, EMPRESTIMO.DATA_INICIO,EMPRESTIMO.DATA_FINAL,EMPRESTIMO.FK_ACESSO_ADMIN,EMPRESTIMO.FK_ACESSO_USUARIO,EMPRESTIMO.FK_LIVRO,
					EMPRESTIMO.FK_STATUS_EMPRESTIMO)
					.values(emprestimo.getData_inicio(),emprestimo.getData_final(),emprestimo.getFk_acesso_admin(),emprestimo.getFk_acesso_usuario(),emprestimo.getFk_livro(),
							emprestimo.getFk_status_emprestimo())
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
	
	public static String update(EmprestimoModel emprestimo) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			
			create.update(EMPRESTIMO)
		      
		      .set(EMPRESTIMO.DATA_INICIO, emprestimo.getData_inicio())
		      .set(EMPRESTIMO.DATA_FINAL, emprestimo.getData_final())
		      .set(EMPRESTIMO.FK_ACESSO_ADMIN, emprestimo.getFk_acesso_admin())
		      .set(EMPRESTIMO.FK_ACESSO_USUARIO, emprestimo.getFk_acesso_usuario())
		      .set(EMPRESTIMO.FK_LIVRO, emprestimo.getFk_livro())
		      .set(EMPRESTIMO.FK_STATUS_EMPRESTIMO, emprestimo.getFk_status_emprestimo())
		      .where(EMPRESTIMO.ID.eq(emprestimo.getId()))
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
	
	public static String delete(EmprestimoModel emprestimo) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, passWord);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

			
			create.delete(EMPRESTIMO)
		      .where(EMPRESTIMO.ID.eq(emprestimo.getId()))
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
		prioridades.add("data_inicio");
		prioridades.add("data_final");
		prioridades.add("fk_acesso_admin");
		prioridades.add("fk_acesso_usuario");
		prioridades.add("fk_livro");
		prioridades.add("fk_status_emprestimo");
		return prioridades;

	}

	public static ArrayList<String> Valores() {

		ArrayList<String> valores = new ArrayList<>();

		valores.add("number");
		valores.add("date");
		valores.add("date");
		valores.add("number");
		valores.add("number");
		valores.add("number");
		valores.add("number");
		return valores;

	}


}
