package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptParam3 extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Descriptive name for this parameter that matches the external assert ruleset rule parameter name.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Descriptive name for this parameter that matches the external assert ruleset rule parameter name.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return The value for the parameter that will be passed on to the external ruleset rule template.
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The value for the parameter that will be passed on to the external ruleset rule template.
	 */
	public void setValue(String value) { value = value; }


}
