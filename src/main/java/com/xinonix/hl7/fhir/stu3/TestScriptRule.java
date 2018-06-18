package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptRule extends BackboneElement {
	@Expose
	private Reference resource;

	/**
	 * Getter for resource
	 * @return Reference to the resource (containing the contents of the rule needed for assertions).
	 */
	public Reference getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value Reference to the resource (containing the contents of the rule needed for assertions).
	 */
	public void setResource(Reference value) { resource = value; }


	@Expose
	private ArrayList<TestScriptParam> param;

	/**
	 * Getter for param
	 * @return Each rule template can take one or more parameters for rule evaluation.
	 */
	public ArrayList<TestScriptParam> getParam() { return param; }

	/**
	 * Setter for param
	 * @param value Each rule template can take one or more parameters for rule evaluation.
	 */
	public void setParam(ArrayList<TestScriptParam> value) { param = value; }


}
