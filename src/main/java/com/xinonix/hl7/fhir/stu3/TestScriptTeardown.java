package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptTeardown extends BackboneElement {
	@Expose
	private ArrayList<TestScriptAction2> action;

	/**
	 * Getter for action
	 * @return The teardown action will only contain an operation.
	 */
	public ArrayList<TestScriptAction2> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value The teardown action will only contain an operation.
	 */
	public void setAction(ArrayList<TestScriptAction2> value) { action = value; }


}
