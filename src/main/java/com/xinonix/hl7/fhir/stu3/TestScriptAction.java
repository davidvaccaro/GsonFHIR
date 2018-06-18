package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptAction extends BackboneElement {
	@Expose
	private TestScriptOperation operation;

	/**
	 * Getter for operation
	 * @return The operation to perform.
	 */
	public TestScriptOperation getOperation() { return operation; }

	/**
	 * Setter for operation
	 * @param value The operation to perform.
	 */
	public void setOperation(TestScriptOperation value) { operation = value; }


	@Expose
	@SerializedName("assert")
	private TestScriptAssert assertValue;

	/**
	 * Getter for assertValue
	 * @return Evaluates the results of previous operations to determine if the server under test behaves appropriately.
	 */
	public TestScriptAssert getAssert() { return assertValue; }

	/**
	 * Setter for assertValue
	 * @param value Evaluates the results of previous operations to determine if the server under test behaves appropriately.
	 */
	public void setAssert(TestScriptAssert value) { assertValue = value; }


}
