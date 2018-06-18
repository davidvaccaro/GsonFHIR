package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementOperation extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return The name of the operation or query. For an operation, this is the name  prefixed with $ and used in the URL. For a query, this is the name used in the _query parameter when the query is called.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value The name of the operation or query. For an operation, this is the name  prefixed with $ and used in the URL. For a query, this is the name used in the _query parameter when the query is called.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private Reference definition;

	/**
	 * Getter for definition
	 * @return Where the formal definition can be found.
	 */
	public Reference getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value Where the formal definition can be found.
	 */
	public void setDefinition(Reference value) { definition = value; }


}
