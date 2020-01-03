package com.biblioteca;

import static com.biblioteca.generatedclasses.tables.Perfil.PERFIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class TestConnection {

	public static void main(String[] args) {
		Connection conn = null;

		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/bibliotecaPO";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);

			//buscando dados no banco
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(PERFIL).fetch();

			//iterando os resultados
			for (Record r : result) {
				Integer code = r.getValue(PERFIL.ID);
				String name = r.getValue(PERFIL.NOME);

				System.out.println("ID: " + code + " Nome: " + name);
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

	}
}