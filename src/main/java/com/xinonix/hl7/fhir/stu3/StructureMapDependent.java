package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A Map of relationships between 2 structures that can be used to transform data.
 */
public class StructureMapDependent extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Name of a rule or group to apply.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Name of a rule or group to apply.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private ArrayList<String> variable;

	/**
	 * Getter for variable
	 * @return Variable to pass to the rule or group.
	 */
	public ArrayList<String> getVariable() { return variable; }

	/**
	 * Setter for variable
	 * @param value Variable to pass to the rule or group.
	 */
	public void setVariable(ArrayList<String> value) { variable = value; }


}
