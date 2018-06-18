package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementSearchParam extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return The name of the search parameter used in the interface.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value The name of the search parameter used in the interface.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String definition;

	/**
	 * Getter for definition
	 * @return An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).
	 */
	public String getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).
	 */
	public void setDefinition(String value) { definition = value; }


	public enum Type{
		@SerializedName("number") NUMBER,
		@SerializedName("date") DATE,
		@SerializedName("string") STRING,
		@SerializedName("token") TOKEN,
		@SerializedName("reference") REFERENCE,
		@SerializedName("composite") COMPOSITE,
		@SerializedName("quantity") QUANTITY,
		@SerializedName("uri") URI
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of value a search parameter refers to, and how the content is interpreted.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of value a search parameter refers to, and how the content is interpreted.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
	 */
	public void setDocumentation(String value) { documentation = value; }


}
