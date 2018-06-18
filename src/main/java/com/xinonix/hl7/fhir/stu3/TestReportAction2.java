package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A summary of information based on the results of executing a TestScript.
 */
public class TestReportAction2 extends BackboneElement {
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


}
