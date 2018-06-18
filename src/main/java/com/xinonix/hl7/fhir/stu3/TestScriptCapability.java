package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptCapability extends BackboneElement {
	@Expose
	private boolean required;

	/**
	 * Getter for required
	 * @return Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
	 */
	public boolean getRequired() { return required; }

	/**
	 * Setter for required
	 * @param value Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
	 */
	public void setRequired(boolean value) { required = value; }


	@Expose
	private boolean validated;

	/**
	 * Getter for validated
	 * @return Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
	 */
	public boolean getValidated() { return validated; }

	/**
	 * Setter for validated
	 * @param value Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
	 */
	public void setValidated(boolean value) { validated = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Description of the capabilities that this test script is requiring the server to support.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Description of the capabilities that this test script is requiring the server to support.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<Integer> origin;

	/**
	 * Getter for origin
	 * @return Which origin server these requirements apply to.
	 */
	public ArrayList<Integer> getOrigin() { return origin; }

	/**
	 * Setter for origin
	 * @param value Which origin server these requirements apply to.
	 */
	public void setOrigin(ArrayList<Integer> value) { origin = value; }


	@Expose
	private Integer destination;

	/**
	 * Getter for destination
	 * @return Which server these requirements apply to.
	 */
	public Integer getDestination() { return destination; }

	/**
	 * Setter for destination
	 * @param value Which server these requirements apply to.
	 */
	public void setDestination(Integer value) { destination = value; }


	@Expose
	private ArrayList<String> link;

	/**
	 * Getter for link
	 * @return Links to the FHIR specification that describes this interaction and the resources involved in more detail.
	 */
	public ArrayList<String> getLink() { return link; }

	/**
	 * Setter for link
	 * @param value Links to the FHIR specification that describes this interaction and the resources involved in more detail.
	 */
	public void setLink(ArrayList<String> value) { link = value; }


	@Expose
	private Reference capabilities;

	/**
	 * Getter for capabilities
	 * @return Minimum capabilities required of server for test script to execute successfully.   If server does not meet at a minimum the referenced capability statement, then all tests in this script are skipped.
	 */
	public Reference getCapabilities() { return capabilities; }

	/**
	 * Setter for capabilities
	 * @param value Minimum capabilities required of server for test script to execute successfully.   If server does not meet at a minimum the referenced capability statement, then all tests in this script are skipped.
	 */
	public void setCapabilities(Reference value) { capabilities = value; }


}
