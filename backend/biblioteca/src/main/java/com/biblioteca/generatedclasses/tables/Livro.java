/**
 * This class is generated by jOOQ
 */
package com.biblioteca.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Livro extends org.jooq.impl.TableImpl<com.biblioteca.generatedclasses.tables.records.LivroRecord> {

	private static final long serialVersionUID = -737863424;

	/**
	 * The singleton instance of <code>bibliotecapo.livro</code>
	 */
	public static final com.biblioteca.generatedclasses.tables.Livro LIVRO = new com.biblioteca.generatedclasses.tables.Livro();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.biblioteca.generatedclasses.tables.records.LivroRecord> getRecordType() {
		return com.biblioteca.generatedclasses.tables.records.LivroRecord.class;
	}

	/**
	 * The column <code>bibliotecapo.livro.id</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>bibliotecapo.livro.isbn</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.String> ISBN = createField("isbn", org.jooq.impl.SQLDataType.VARCHAR.length(14).nullable(false), this);

	/**
	 * The column <code>bibliotecapo.livro.capa</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.String> CAPA = createField("capa", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this);

	/**
	 * The column <code>bibliotecapo.livro.titulo</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.String> TITULO = createField("titulo", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * The column <code>bibliotecapo.livro.autor</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.String> AUTOR = createField("autor", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * The column <code>bibliotecapo.livro.descricao</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.String> DESCRICAO = createField("descricao", org.jooq.impl.SQLDataType.CLOB.nullable(false), this);

	/**
	 * The column <code>bibliotecapo.livro.ano_publicacao</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.sql.Date> ANO_PUBLICACAO = createField("ano_publicacao", org.jooq.impl.SQLDataType.DATE.nullable(false), this);

	/**
	 * The column <code>bibliotecapo.livro.editora</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.String> EDITORA = createField("editora", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * The column <code>bibliotecapo.livro.genero</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.String> GENERO = createField("genero", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * The column <code>bibliotecapo.livro.status</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * The column <code>bibliotecapo.livro.fk_acesso</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.Integer> FK_ACESSO = createField("fk_acesso", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * Create a <code>bibliotecapo.livro</code> table reference
	 */
	public Livro() {
		super("livro", com.biblioteca.generatedclasses.Bibliotecapo.BIBLIOTECAPO);
	}

	/**
	 * Create an aliased <code>bibliotecapo.livro</code> table reference
	 */
	public Livro(java.lang.String alias) {
		super(alias, com.biblioteca.generatedclasses.Bibliotecapo.BIBLIOTECAPO, com.biblioteca.generatedclasses.tables.Livro.LIVRO);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.LivroRecord, java.lang.Integer> getIdentity() {
		return com.biblioteca.generatedclasses.Keys.IDENTITY_LIVRO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.LivroRecord> getPrimaryKey() {
		return com.biblioteca.generatedclasses.Keys.KEY_LIVRO_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.LivroRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.LivroRecord>>asList(com.biblioteca.generatedclasses.Keys.KEY_LIVRO_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.biblioteca.generatedclasses.tables.records.LivroRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.biblioteca.generatedclasses.tables.records.LivroRecord, ?>>asList(com.biblioteca.generatedclasses.Keys.LIVRO_IBFK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.biblioteca.generatedclasses.tables.Livro as(java.lang.String alias) {
		return new com.biblioteca.generatedclasses.tables.Livro(alias);
	}
}
