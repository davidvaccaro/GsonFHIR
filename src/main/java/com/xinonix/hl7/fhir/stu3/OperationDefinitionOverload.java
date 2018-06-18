package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 */
public class OperationDefinitionOverload extends BackboneElement {
	@Expose
	private ArrayList<String> parameterName;

	/**
	 * Getter for parameterName
	 * @return Name of parameter to include in overload.
	 */
	public ArrayList<String> getParameterName() { return parameterName; }

	/**
	 * Setter for parameterName
	 * @param value Name of parameter to include in overload.
	 */
	public void setParameterName(ArrayList<String> value) { parameterName = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return Comments to go on overload.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value Comments to go on overload.
	 */
	public void setComment(String value) { comment = value; }


}
