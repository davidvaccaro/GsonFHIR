package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptAction2 extends BackboneElement {
	@Expose
	private TestScriptOperation operation;

	/**
	 * Getter for operation
	 * @return An operation would involve a REST request to a server.
	 */
	public TestScriptOperation getOperation() { return operation; }

	/**
	 * Setter for operation
	 * @param value An operation would involve a REST request to a server.
	 */
	public void setOperation(TestScriptOperation value) { operation = value; }


}
