package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A summary of information based on the results of executing a TestScript.
 */
public class TestReportTeardown extends BackboneElement {
	@Expose
	private ArrayList<TestReportAction2> action;

	/**
	 * Getter for action
	 * @return The teardown action will only contain an operation.
	 */
	public ArrayList<TestReportAction2> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value The teardown action will only contain an operation.
	 */
	public void setAction(ArrayList<TestReportAction2> value) { action = value; }


}
