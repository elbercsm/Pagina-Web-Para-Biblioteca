/**
 * This class is generated by jOOQ
 */
package com.biblioteca.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TokenRecord extends org.jooq.impl.UpdatableRecordImpl<com.biblioteca.generatedclasses.tables.records.TokenRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1857603839;

	/**
	 * Setter for <code>bibliotecapo.token.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>bibliotecapo.token.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>bibliotecapo.token.token</code>. 
	 */
	public void setToken(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>bibliotecapo.token.token</code>. 
	 */
	public java.lang.String getToken() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.biblioteca.generatedclasses.tables.Token.TOKEN.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.biblioteca.generatedclasses.tables.Token.TOKEN.TOKEN_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getToken();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TokenRecord
	 */
	public TokenRecord() {
		super(com.biblioteca.generatedclasses.tables.Token.TOKEN);
	}

	/**
	 * Create a detached, initialised TokenRecord
	 */
	public TokenRecord(java.lang.Integer id, java.lang.String token) {
		super(com.biblioteca.generatedclasses.tables.Token.TOKEN);

		setValue(0, id);
		setValue(1, token);
	}
}
