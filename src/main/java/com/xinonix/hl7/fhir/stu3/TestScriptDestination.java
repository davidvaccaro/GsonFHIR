package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptDestination extends BackboneElement {
	@Expose
	private Integer index;

	/**
	 * Getter for index
	 * @return Abstract name given to a destination server in this test script.  The name is provided as a number starting at 1.
	 */
	public Integer getIndex() { return index; }

	/**
	 * Setter for index
	 * @param value Abstract name given to a destination server in this test script.  The name is provided as a number starting at 1.
	 */
	public void setIndex(Integer value) { index = value; }


	@Expose
	private Coding profile;

	/**
	 * Getter for profile
	 * @return The type of destination profile the test system supports.
	 */
	public Coding getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value The type of destination profile the test system supports.
	 */
	public void setProfile(Coding value) { profile = value; }


}
