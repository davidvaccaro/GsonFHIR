package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A summary of information based on the results of executing a TestScript.
 */
public class TestReportSetup extends BackboneElement {
	@Expose
	private ArrayList<TestReportAction> action;

	/**
	 * Getter for action
	 * @return Action would contain either an operation or an assertion.
	 */
	public ArrayList<TestReportAction> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Action would contain either an operation or an assertion.
	 */
	public void setAction(ArrayList<TestReportAction> value) { action = value; }


}
