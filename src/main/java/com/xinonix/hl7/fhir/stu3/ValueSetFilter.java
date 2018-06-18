package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 */
public class ValueSetFilter extends BackboneElement {
	@Expose
	private String property;

	/**
	 * Getter for property
	 * @return A code that identifies a property defined in the code system.
	 */
	public String getProperty() { return property; }

	/**
	 * Setter for property
	 * @param value A code that identifies a property defined in the code system.
	 */
	public void setProperty(String value) { property = value; }


	public enum Op{
		@SerializedName("=") EQ,
		@SerializedName("is-a") IS_A,
		@SerializedName("descendent-of") DESCENDENT_OF,
		@SerializedName("is-not-a") IS_NOT_A,
		@SerializedName("regex") REGEX,
		@SerializedName("in") IN,
		@SerializedName("not-in") NOT_IN,
		@SerializedName("generalizes") GENERALIZES,
		@SerializedName("exists") EXISTS
	}

	@Expose
	private Op op;

	/**
	 * Getter for op
	 * @return The kind of operation to perform as a part of the filter criteria.
	 */
	public Op getOp() { return op; }

	/**
	 * Setter for op
	 * @param value The kind of operation to perform as a part of the filter criteria.
	 */
	public void setOp(Op value) { op = value; }


	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value when the operation is 'regex', or one of the values (true and false), when the operation is 'exists'.
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value when the operation is 'regex', or one of the values (true and false), when the operation is 'exists'.
	 */
	public void setValue(String value) { value = value; }


}
