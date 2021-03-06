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
public class Autor extends org.jooq.impl.TableImpl<com.biblioteca.generatedclasses.tables.records.AutorRecord> {

	private static final long serialVersionUID = 2846701;

	/**
	 * The singleton instance of <code>bibliotecapo.autor</code>
	 */
	public static final com.biblioteca.generatedclasses.tables.Autor AUTOR = new com.biblioteca.generatedclasses.tables.Autor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.biblioteca.generatedclasses.tables.records.AutorRecord> getRecordType() {
		return com.biblioteca.generatedclasses.tables.records.AutorRecord.class;
	}

	/**
	 * The column <code>bibliotecapo.autor.id</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.AutorRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>bibliotecapo.autor.nome</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.AutorRecord, java.lang.String> NOME = createField("nome", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * Create a <code>bibliotecapo.autor</code> table reference
	 */
	public Autor() {
		super("autor", com.biblioteca.generatedclasses.Bibliotecapo.BIBLIOTECAPO);
	}

	/**
	 * Create an aliased <code>bibliotecapo.autor</code> table reference
	 */
	public Autor(java.lang.String alias) {
		super(alias, com.biblioteca.generatedclasses.Bibliotecapo.BIBLIOTECAPO, com.biblioteca.generatedclasses.tables.Autor.AUTOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.AutorRecord> getPrimaryKey() {
		return com.biblioteca.generatedclasses.Keys.KEY_AUTOR_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.AutorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.AutorRecord>>asList(com.biblioteca.generatedclasses.Keys.KEY_AUTOR_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.biblioteca.generatedclasses.tables.Autor as(java.lang.String alias) {
		return new com.biblioteca.generatedclasses.tables.Autor(alias);
	}
}
