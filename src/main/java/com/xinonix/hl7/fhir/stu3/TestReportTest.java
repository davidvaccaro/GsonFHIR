package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A summary of information based on the results of executing a TestScript.
 */
public class TestReportTest extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return The name of this test used for tracking/logging purposes by test engines.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value The name of this test used for tracking/logging purposes by test engines.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A short description of the test used by test engines for tracking and reporting purposes.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A short description of the test used by test engines for tracking and reporting purposes.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<TestReportAction1> action;

	/**
	 * Getter for action
	 * @return Action would contain either an operation or an assertion.
	 */
	public ArrayList<TestReportAction1> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Action would contain either an operation or an assertion.
	 */
	public void setAction(ArrayList<TestReportAction1> value) { action = value; }


}
