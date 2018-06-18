package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptSetup extends BackboneElement {
	@Expose
	private ArrayList<TestScriptAction> action;

	/**
	 * Getter for action
	 * @return Action would contain either an operation or an assertion.
	 */
	public ArrayList<TestScriptAction> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Action would contain either an operation or an assertion.
	 */
	public void setAction(ArrayList<TestScriptAction> value) { action = value; }


}
