package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptRuleset1 extends BackboneElement {
	@Expose
	private String rulesetId;

	/**
	 * Getter for rulesetId
	 * @return The TestScript.ruleset id value this assert will evaluate.
	 */
	public String getRulesetId() { return rulesetId; }

	/**
	 * Setter for rulesetId
	 * @param value The TestScript.ruleset id value this assert will evaluate.
	 */
	public void setRulesetId(String value) { rulesetId = value; }


	@Expose
	private ArrayList<TestScriptRule3> rule;

	/**
	 * Getter for rule
	 * @return The referenced rule within the external ruleset template.
	 */
	public ArrayList<TestScriptRule3> getRule() { return rule; }

	/**
	 * Setter for rule
	 * @param value The referenced rule within the external ruleset template.
	 */
	public void setRule(ArrayList<TestScriptRule3> value) { rule = value; }


}
