package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptMetadata extends BackboneElement {
	@Expose
	private ArrayList<TestScriptLink> link;

	/**
	 * Getter for link
	 * @return A link to the FHIR specification that this test is covering.
	 */
	public ArrayList<TestScriptLink> getLink() { return link; }

	/**
	 * Setter for link
	 * @param value A link to the FHIR specification that this test is covering.
	 */
	public void setLink(ArrayList<TestScriptLink> value) { link = value; }


	@Expose
	private ArrayList<TestScriptCapability> capability;

	/**
	 * Getter for capability
	 * @return Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
	 */
	public ArrayList<TestScriptCapability> getCapability() { return capability; }

	/**
	 * Setter for capability
	 * @param value Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
	 */
	public void setCapability(ArrayList<TestScriptCapability> value) { capability = value; }


}
