package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A compartment definition that defines how resources are accessed on a server.
 */
public class CompartmentDefinitionResource extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return The name of a resource supported by the server.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The name of a resource supported by the server.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private ArrayList<String> param;

	/**
	 * Getter for param
	 * @return The name of a search parameter that represents the link to the compartment. More than one may be listed because a resource may be linked to a compartment in more than one way,.
	 */
	public ArrayList<String> getParam() { return param; }

	/**
	 * Setter for param
	 * @param value The name of a search parameter that represents the link to the compartment. More than one may be listed because a resource may be linked to a compartment in more than one way,.
	 */
	public void setParam(ArrayList<String> value) { param = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Additional documentation about the resource and compartment.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Additional documentation about the resource and compartment.
	 */
	public void setDocumentation(String value) { documentation = value; }


}
