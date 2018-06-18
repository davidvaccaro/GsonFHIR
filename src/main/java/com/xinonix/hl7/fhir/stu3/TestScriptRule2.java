package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptRule2 extends BackboneElement {
	@Expose
	private String ruleId;

	/**
	 * Getter for ruleId
	 * @return The TestScript.rule id value this assert will evaluate.
	 */
	public String getRuleId() { return ruleId; }

	/**
	 * Setter for ruleId
	 * @param value The TestScript.rule id value this assert will evaluate.
	 */
	public void setRuleId(String value) { ruleId = value; }


	@Expose
	private ArrayList<TestScriptParam2> param;

	/**
	 * Getter for param
	 * @return Each rule template can take one or more parameters for rule evaluation.
	 */
	public ArrayList<TestScriptParam2> getParam() { return param; }

	/**
	 * Setter for param
	 * @param value Each rule template can take one or more parameters for rule evaluation.
	 */
	public void setParam(ArrayList<TestScriptParam2> value) { param = value; }


}
