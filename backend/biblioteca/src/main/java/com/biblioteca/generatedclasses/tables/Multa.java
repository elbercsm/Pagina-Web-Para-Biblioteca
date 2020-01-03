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
public class Multa extends org.jooq.impl.TableImpl<com.biblioteca.generatedclasses.tables.records.MultaRecord> {

	private static final long serialVersionUID = 1040623521;

	/**
	 * The singleton instance of <code>bibliotecapo.multa</code>
	 */
	public static final com.biblioteca.generatedclasses.tables.Multa MULTA = new com.biblioteca.generatedclasses.tables.Multa();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.biblioteca.generatedclasses.tables.records.MultaRecord> getRecordType() {
		return com.biblioteca.generatedclasses.tables.records.MultaRecord.class;
	}

	/**
	 * The column <code>bibliotecapo.multa.id</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.MultaRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>bibliotecapo.multa.status_multa</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.MultaRecord, java.lang.Byte> STATUS_MULTA = createField("status_multa", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this);

	/**
	 * The column <code>bibliotecapo.multa.valor</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.MultaRecord, java.lang.Double> VALOR = createField("valor", org.jooq.impl.SQLDataType.FLOAT.nullable(false), this);

	/**
	 * The column <code>bibliotecapo.multa.fk_emprestimo</code>. 
	 */
	public final org.jooq.TableField<com.biblioteca.generatedclasses.tables.records.MultaRecord, java.lang.Integer> FK_EMPRESTIMO = createField("fk_emprestimo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * Create a <code>bibliotecapo.multa</code> table reference
	 */
	public Multa() {
		super("multa", com.biblioteca.generatedclasses.Bibliotecapo.BIBLIOTECAPO);
	}

	/**
	 * Create an aliased <code>bibliotecapo.multa</code> table reference
	 */
	public Multa(java.lang.String alias) {
		super(alias, com.biblioteca.generatedclasses.Bibliotecapo.BIBLIOTECAPO, com.biblioteca.generatedclasses.tables.Multa.MULTA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.biblioteca.generatedclasses.tables.records.MultaRecord, java.lang.Integer> getIdentity() {
		return com.biblioteca.generatedclasses.Keys.IDENTITY_MULTA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.MultaRecord> getPrimaryKey() {
		return com.biblioteca.generatedclasses.Keys.KEY_MULTA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.MultaRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.biblioteca.generatedclasses.tables.records.MultaRecord>>asList(com.biblioteca.generatedclasses.Keys.KEY_MULTA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.biblioteca.generatedclasses.tables.Multa as(java.lang.String alias) {
		return new com.biblioteca.generatedclasses.tables.Multa(alias);
	}
}
