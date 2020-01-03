/**
 * This class is generated by jOOQ
 */
package com.biblioteca.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>bibliotecapo</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.EmprestimoRecord, java.lang.Integer> IDENTITY_EMPRESTIMO = Identities0.IDENTITY_EMPRESTIMO;
	public static final org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.Integer> IDENTITY_LIVRO = Identities0.IDENTITY_LIVRO;
	public static final org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord, java.lang.Integer> IDENTITY_LIVRO_AUTOR = Identities0.IDENTITY_LIVRO_AUTOR;
	public static final org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.MultaRecord, java.lang.Integer> IDENTITY_MULTA = Identities0.IDENTITY_MULTA;
	public static final org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.PerfilRecord, java.lang.Integer> IDENTITY_PERFIL = Identities0.IDENTITY_PERFIL;
	public static final org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.StatusEmprestimoRecord, java.lang.Integer> IDENTITY_STATUS_EMPRESTIMO = Identities0.IDENTITY_STATUS_EMPRESTIMO;
	public static final org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.TokenRecord, java.lang.Integer> IDENTITY_TOKEN = Identities0.IDENTITY_TOKEN;
	public static final org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.UsuarioRecord, java.lang.Integer> IDENTITY_USUARIO = Identities0.IDENTITY_USUARIO;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.AutorRecord> KEY_AUTOR_PRIMARY = UniqueKeys0.KEY_AUTOR_PRIMARY;
	public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.EmprestimoRecord> KEY_EMPRESTIMO_PRIMARY = UniqueKeys0.KEY_EMPRESTIMO_PRIMARY;
	public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.LivroRecord> KEY_LIVRO_PRIMARY = UniqueKeys0.KEY_LIVRO_PRIMARY;
	public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord> KEY_LIVRO_AUTOR_PRIMARY = UniqueKeys0.KEY_LIVRO_AUTOR_PRIMARY;
	public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.MultaRecord> KEY_MULTA_PRIMARY = UniqueKeys0.KEY_MULTA_PRIMARY;
	public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.PerfilRecord> KEY_PERFIL_PRIMARY = UniqueKeys0.KEY_PERFIL_PRIMARY;
	public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.StatusEmprestimoRecord> KEY_STATUS_EMPRESTIMO_PRIMARY = UniqueKeys0.KEY_STATUS_EMPRESTIMO_PRIMARY;
	public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.TokenRecord> KEY_TOKEN_PRIMARY = UniqueKeys0.KEY_TOKEN_PRIMARY;
	public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.UsuarioRecord> KEY_USUARIO_PRIMARY = UniqueKeys0.KEY_USUARIO_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<com.biblioteca.generatedclasses.tables.records.LivroRecord, com.biblioteca.generatedclasses.tables.records.UsuarioRecord> LIVRO_IBFK_1 = ForeignKeys0.LIVRO_IBFK_1;
	public static final org.jooq.ForeignKey<com.biblioteca.generatedclasses.tables.records.UsuarioRecord, com.biblioteca.generatedclasses.tables.records.PerfilRecord> USUARIO_IBFK_1 = ForeignKeys0.USUARIO_IBFK_1;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.EmprestimoRecord, java.lang.Integer> IDENTITY_EMPRESTIMO = createIdentity(com.biblioteca.generatedclasses.tables.Emprestimo.EMPRESTIMO, com.biblioteca.generatedclasses.tables.Emprestimo.EMPRESTIMO.ID);
		public static org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.Integer> IDENTITY_LIVRO = createIdentity(com.biblioteca.generatedclasses.tables.Livro.LIVRO, com.biblioteca.generatedclasses.tables.Livro.LIVRO.ID);
		public static org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord, java.lang.Integer> IDENTITY_LIVRO_AUTOR = createIdentity(com.biblioteca.generatedclasses.tables.LivroAutor.LIVRO_AUTOR, com.biblioteca.generatedclasses.tables.LivroAutor.LIVRO_AUTOR.ID);
		public static org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.MultaRecord, java.lang.Integer> IDENTITY_MULTA = createIdentity(com.biblioteca.generatedclasses.tables.Multa.MULTA, com.biblioteca.generatedclasses.tables.Multa.MULTA.ID);
		public static org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.PerfilRecord, java.lang.Integer> IDENTITY_PERFIL = createIdentity(com.biblioteca.generatedclasses.tables.Perfil.PERFIL, com.biblioteca.generatedclasses.tables.Perfil.PERFIL.ID);
		public static org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.StatusEmprestimoRecord, java.lang.Integer> IDENTITY_STATUS_EMPRESTIMO = createIdentity(com.biblioteca.generatedclasses.tables.StatusEmprestimo.STATUS_EMPRESTIMO, com.biblioteca.generatedclasses.tables.StatusEmprestimo.STATUS_EMPRESTIMO.ID);
		public static org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.TokenRecord, java.lang.Integer> IDENTITY_TOKEN = createIdentity(com.biblioteca.generatedclasses.tables.Token.TOKEN, com.biblioteca.generatedclasses.tables.Token.TOKEN.ID);
		public static org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.UsuarioRecord, java.lang.Integer> IDENTITY_USUARIO = createIdentity(com.biblioteca.generatedclasses.tables.Usuario.USUARIO, com.biblioteca.generatedclasses.tables.Usuario.USUARIO.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.AutorRecord> KEY_AUTOR_PRIMARY = createUniqueKey(com.biblioteca.generatedclasses.tables.Autor.AUTOR, com.biblioteca.generatedclasses.tables.Autor.AUTOR.ID);
		public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.EmprestimoRecord> KEY_EMPRESTIMO_PRIMARY = createUniqueKey(com.biblioteca.generatedclasses.tables.Emprestimo.EMPRESTIMO, com.biblioteca.generatedclasses.tables.Emprestimo.EMPRESTIMO.ID);
		public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.LivroRecord> KEY_LIVRO_PRIMARY = createUniqueKey(com.biblioteca.generatedclasses.tables.Livro.LIVRO, com.biblioteca.generatedclasses.tables.Livro.LIVRO.ID);
		public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.LivroAutorRecord> KEY_LIVRO_AUTOR_PRIMARY = createUniqueKey(com.biblioteca.generatedclasses.tables.LivroAutor.LIVRO_AUTOR, com.biblioteca.generatedclasses.tables.LivroAutor.LIVRO_AUTOR.ID);
		public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.MultaRecord> KEY_MULTA_PRIMARY = createUniqueKey(com.biblioteca.generatedclasses.tables.Multa.MULTA, com.biblioteca.generatedclasses.tables.Multa.MULTA.ID);
		public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.PerfilRecord> KEY_PERFIL_PRIMARY = createUniqueKey(com.biblioteca.generatedclasses.tables.Perfil.PERFIL, com.biblioteca.generatedclasses.tables.Perfil.PERFIL.ID);
		public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.StatusEmprestimoRecord> KEY_STATUS_EMPRESTIMO_PRIMARY = createUniqueKey(com.biblioteca.generatedclasses.tables.StatusEmprestimo.STATUS_EMPRESTIMO, com.biblioteca.generatedclasses.tables.StatusEmprestimo.STATUS_EMPRESTIMO.ID);
		public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.TokenRecord> KEY_TOKEN_PRIMARY = createUniqueKey(com.biblioteca.generatedclasses.tables.Token.TOKEN, com.biblioteca.generatedclasses.tables.Token.TOKEN.ID);
		public static final org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.UsuarioRecord> KEY_USUARIO_PRIMARY = createUniqueKey(com.biblioteca.generatedclasses.tables.Usuario.USUARIO, com.biblioteca.generatedclasses.tables.Usuario.USUARIO.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<com.biblioteca.generatedclasses.tables.records.LivroRecord, com.biblioteca.generatedclasses.tables.records.UsuarioRecord> LIVRO_IBFK_1 = createForeignKey(com.biblioteca.generatedclasses.Keys.KEY_USUARIO_PRIMARY, com.biblioteca.generatedclasses.tables.Livro.LIVRO, com.biblioteca.generatedclasses.tables.Livro.LIVRO.FK_ACESSO);
		public static final org.jooq.ForeignKey<com.biblioteca.generatedclasses.tables.records.UsuarioRecord, com.biblioteca.generatedclasses.tables.records.PerfilRecord> USUARIO_IBFK_1 = createForeignKey(com.biblioteca.generatedclasses.Keys.KEY_PERFIL_PRIMARY, com.biblioteca.generatedclasses.tables.Usuario.USUARIO, com.biblioteca.generatedclasses.tables.Usuario.USUARIO.FK_PERFIL);
	}
}
