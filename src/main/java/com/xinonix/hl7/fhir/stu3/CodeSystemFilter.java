package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A code system resource specifies a set of codes drawn from one or more code systems.
 */
public class CodeSystemFilter extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return The code that identifies this filter when it is used in the instance.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The code that identifies this filter when it is used in the instance.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A description of how or why the filter is used.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A description of how or why the filter is used.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<String> operator;

	/**
	 * Getter for operator
	 * @return A list of operators that can be used with the filter.
	 */
	public ArrayList<String> getOperator() { return operator; }

	/**
	 * Setter for operator
	 * @param value A list of operators that can be used with the filter.
	 */
	public void setOperator(ArrayList<String> value) { operator = value; }


	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return A description of what the value for the filter should be.
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value A description of what the value for the filter should be.
	 */
	public void setValue(String value) { value = value; }


}
