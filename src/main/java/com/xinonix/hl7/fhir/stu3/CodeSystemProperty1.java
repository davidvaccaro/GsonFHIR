package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A code system resource specifies a set of codes drawn from one or more code systems.
 */
public class CodeSystemProperty1 extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return A code that is a reference to CodeSystem.property.code.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code that is a reference to CodeSystem.property.code.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String valueCode;

	/**
	 * Getter for valueCode
	 * @return The value of this property.
	 */
	public String getValueCode() { return valueCode; }

	/**
	 * Setter for valueCode
	 * @param value The value of this property.
	 */
	public void setValueCode(String value) { valueCode = value; }


	@Expose
	private Coding valueCoding;

	/**
	 * Getter for valueCoding
	 * @return The value of this property.
	 */
	public Coding getValueCoding() { return valueCoding; }

	/**
	 * Setter for valueCoding
	 * @param value The value of this property.
	 */
	public void setValueCoding(Coding value) { valueCoding = value; }


	@Expose
	private String valueString;

	/**
	 * Getter for valueString
	 * @return The value of this property.
	 */
	public String getValueString() { return valueString; }

	/**
	 * Setter for valueString
	 * @param value The value of this property.
	 */
	public void setValueString(String value) { valueString = value; }


	@Expose
	private Integer valueInteger;

	/**
	 * Getter for valueInteger
	 * @return The value of this property.
	 */
	public Integer getValueInteger() { return valueInteger; }

	/**
	 * Setter for valueInteger
	 * @param value The value of this property.
	 */
	public void setValueInteger(Integer value) { valueInteger = value; }


	@Expose
	private boolean valueBoolean;

	/**
	 * Getter for valueBoolean
	 * @return The value of this property.
	 */
	public boolean getValueBoolean() { return valueBoolean; }

	/**
	 * Setter for valueBoolean
	 * @param value The value of this property.
	 */
	public void setValueBoolean(boolean value) { valueBoolean = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date valueDateTime;

	/**
	 * Getter for valueDateTime
	 * @return The value of this property.
	 */
	public Date getValueDateTime() { return valueDateTime; }

	/**
	 * Setter for valueDateTime
	 * @param value The value of this property.
	 */
	public void setValueDateTime(Date value) { valueDateTime = value; }


}
