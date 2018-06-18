package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptRuleset extends BackboneElement {
	@Expose
	private Reference resource;

	/**
	 * Getter for resource
	 * @return Reference to the resource (containing the contents of the ruleset needed for assertions).
	 */
	public Reference getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value Reference to the resource (containing the contents of the ruleset needed for assertions).
	 */
	public void setResource(Reference value) { resource = value; }


	@Expose
	private ArrayList<TestScriptRule1> rule;

	/**
	 * Getter for rule
	 * @return The referenced rule within the external ruleset template.
	 */
	public ArrayList<TestScriptRule1> getRule() { return rule; }

	/**
	 * Setter for rule
	 * @param value The referenced rule within the external ruleset template.
	 */
	public void setRule(ArrayList<TestScriptRule1> value) { rule = value; }


}
