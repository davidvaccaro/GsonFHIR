package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A summary of information based on the results of executing a TestScript.
 */
public class TestReportAssert extends BackboneElement {
	public enum Result{
		@SerializedName("pass") PASS,
		@SerializedName("skip") SKIP,
		@SerializedName("fail") FAIL,
		@SerializedName("warning") WARNING,
		@SerializedName("error") ERROR
	}

	@Expose
	private Result result;

	/**
	 * Getter for result
	 * @return The result of this assertion.
	 */
	public Result getResult() { return result; }

	/**
	 * Setter for result
	 * @param value The result of this assertion.
	 */
	public void setResult(Result value) { result = value; }


	@Expose
	private String message;

	/**
	 * Getter for message
	 * @return An explanatory message associated with the result.
	 */
	public String getMessage() { return message; }

	/**
	 * Setter for message
	 * @param value An explanatory message associated with the result.
	 */
	public void setMessage(String value) { message = value; }


	@Expose
	private String detail;

	/**
	 * Getter for detail
	 * @return A link to further details on the result.
	 */
	public String getDetail() { return detail; }

	/**
	 * Setter for detail
	 * @param value A link to further details on the result.
	 */
	public void setDetail(String value) { detail = value; }


}
