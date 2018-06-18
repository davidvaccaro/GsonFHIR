package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A Map of relationships between 2 structures that can be used to transform data.
 */
public class StructureMapParameter extends BackboneElement {
	@Expose
	private String valueId;

	/**
	 * Getter for valueId
	 * @return Parameter value - variable or literal.
	 */
	public String getValueId() { return valueId; }

	/**
	 * Setter for valueId
	 * @param value Parameter value - variable or literal.
	 */
	public void setValueId(String value) { valueId = value; }


	@Expose
	private String valueString;

	/**
	 * Getter for valueString
	 * @return Parameter value - variable or literal.
	 */
	public String getValueString() { return valueString; }

	/**
	 * Setter for valueString
	 * @param value Parameter value - variable or literal.
	 */
	public void setValueString(String value) { valueString = value; }


	@Expose
	private boolean valueBoolean;

	/**
	 * Getter for valueBoolean
	 * @return Parameter value - variable or literal.
	 */
	public boolean getValueBoolean() { return valueBoolean; }

	/**
	 * Setter for valueBoolean
	 * @param value Parameter value - variable or literal.
	 */
	public void setValueBoolean(boolean value) { valueBoolean = value; }


	@Expose
	private Integer valueInteger;

	/**
	 * Getter for valueInteger
	 * @return Parameter value - variable or literal.
	 */
	public Integer getValueInteger() { return valueInteger; }

	/**
	 * Setter for valueInteger
	 * @param value Parameter value - variable or literal.
	 */
	public void setValueInteger(Integer value) { valueInteger = value; }


	@Expose
	private Double valueDecimal;

	/**
	 * Getter for valueDecimal
	 * @return Parameter value - variable or literal.
	 */
	public Double getValueDecimal() { return valueDecimal; }

	/**
	 * Setter for valueDecimal
	 * @param value Parameter value - variable or literal.
	 */
	public void setValueDecimal(Double value) { valueDecimal = value; }


}
