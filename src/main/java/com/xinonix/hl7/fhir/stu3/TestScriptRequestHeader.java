package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptRequestHeader extends BackboneElement {
	@Expose
	private String field;

	/**
	 * Getter for field
	 * @return The HTTP header field e.g. "Accept".
	 */
	public String getField() { return field; }

	/**
	 * Setter for field
	 * @param value The HTTP header field e.g. "Accept".
	 */
	public void setField(String value) { field = value; }


	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return The value of the header e.g. "application/fhir+xml".
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The value of the header e.g. "application/fhir+xml".
	 */
	public void setValue(String value) { value = value; }


}
