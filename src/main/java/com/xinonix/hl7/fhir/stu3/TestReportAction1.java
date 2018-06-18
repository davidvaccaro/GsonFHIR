package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A summary of information based on the results of executing a TestScript.
 */
public class TestReportAction1 extends BackboneElement {
	@Expose
	private TestReportOperation operation;

	/**
	 * Getter for operation
	 * @return An operation would involve a REST request to a server.
	 */
	public TestReportOperation getOperation() { return operation; }

	/**
	 * Setter for operation
	 * @param value An operation would involve a REST request to a server.
	 */
	public void setOperation(TestReportOperation value) { operation = value; }


	@Expose
	@SerializedName("assert")
	private TestReportAssert assertValue;

	/**
	 * Getter for assertValue
	 * @return The results of the assertion performed on the previous operations.
	 */
	public TestReportAssert getAssert() { return assertValue; }

	/**
	 * Setter for assertValue
	 * @param value The results of the assertion performed on the previous operations.
	 */
	public void setAssert(TestReportAssert value) { assertValue = value; }


}
