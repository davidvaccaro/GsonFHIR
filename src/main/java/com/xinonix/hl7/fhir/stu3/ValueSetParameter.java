package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 */
public class ValueSetParameter extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return The name of the parameter.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value The name of the parameter.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String valueString;

	/**
	 * Getter for valueString
	 * @return The value of the parameter.
	 */
	public String getValueString() { return valueString; }

	/**
	 * Setter for valueString
	 * @param value The value of the parameter.
	 */
	public void setValueString(String value) { valueString = value; }


	@Expose
	private boolean valueBoolean;

	/**
	 * Getter for valueBoolean
	 * @return The value of the parameter.
	 */
	public boolean getValueBoolean() { return valueBoolean; }

	/**
	 * Setter for valueBoolean
	 * @param value The value of the parameter.
	 */
	public void setValueBoolean(boolean value) { valueBoolean = value; }


	@Expose
	private Integer valueInteger;

	/**
	 * Getter for valueInteger
	 * @return The value of the parameter.
	 */
	public Integer getValueInteger() { return valueInteger; }

	/**
	 * Setter for valueInteger
	 * @param value The value of the parameter.
	 */
	public void setValueInteger(Integer value) { valueInteger = value; }


	@Expose
	private Double valueDecimal;

	/**
	 * Getter for valueDecimal
	 * @return The value of the parameter.
	 */
	public Double getValueDecimal() { return valueDecimal; }

	/**
	 * Setter for valueDecimal
	 * @param value The value of the parameter.
	 */
	public void setValueDecimal(Double value) { valueDecimal = value; }


	@Expose
	private String valueUri;

	/**
	 * Getter for valueUri
	 * @return The value of the parameter.
	 */
	public String getValueUri() { return valueUri; }

	/**
	 * Setter for valueUri
	 * @param value The value of the parameter.
	 */
	public void setValueUri(String value) { valueUri = value; }


	@Expose
	private String valueCode;

	/**
	 * Getter for valueCode
	 * @return The value of the parameter.
	 */
	public String getValueCode() { return valueCode; }

	/**
	 * Setter for valueCode
	 * @param value The value of the parameter.
	 */
	public void setValueCode(String value) { valueCode = value; }


}
