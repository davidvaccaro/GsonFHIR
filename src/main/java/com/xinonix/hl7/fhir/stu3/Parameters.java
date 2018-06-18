package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it.
 */
public class Parameters extends Resource {
	@Expose
	private ArrayList<ParametersParameter> parameter;

	/**
	 * Getter for parameter
	 * @return A parameter passed to or received from the operation.
	 */
	public ArrayList<ParametersParameter> getParameter() { return parameter; }

	/**
	 * Setter for parameter
	 * @param value A parameter passed to or received from the operation.
	 */
	public void setParameter(ArrayList<ParametersParameter> value) { parameter = value; }


}
