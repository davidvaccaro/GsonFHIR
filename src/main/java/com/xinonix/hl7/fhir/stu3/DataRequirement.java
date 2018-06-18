package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
 */
public class DataRequirement extends Element {
	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
	 */
	public void setType(String value) { type = value; }


	@Expose
	private ArrayList<String> profile;

	/**
	 * Getter for profile
	 * @return The profile of the required data, specified as the uri of the profile definition.
	 */
	public ArrayList<String> getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value The profile of the required data, specified as the uri of the profile definition.
	 */
	public void setProfile(ArrayList<String> value) { profile = value; }


	@Expose
	private ArrayList<String> mustSupport;

	/**
	 * Getter for mustSupport
	 * @return Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported.
	 */
	public ArrayList<String> getMustSupport() { return mustSupport; }

	/**
	 * Setter for mustSupport
	 * @param value Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported.
	 */
	public void setMustSupport(ArrayList<String> value) { mustSupport = value; }


	@Expose
	private ArrayList<DataRequirementCodeFilter> codeFilter;

	/**
	 * Getter for codeFilter
	 * @return Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.
	 */
	public ArrayList<DataRequirementCodeFilter> getCodeFilter() { return codeFilter; }

	/**
	 * Setter for codeFilter
	 * @param value Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data.
	 */
	public void setCodeFilter(ArrayList<DataRequirementCodeFilter> value) { codeFilter = value; }


	@Expose
	private ArrayList<DataRequirementDateFilter> dateFilter;

	/**
	 * Getter for dateFilter
	 * @return Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.
	 */
	public ArrayList<DataRequirementDateFilter> getDateFilter() { return dateFilter; }

	/**
	 * Setter for dateFilter
	 * @param value Date filters specify additional constraints on the data in terms of the applicable date range for specific elements.
	 */
	public void setDateFilter(ArrayList<DataRequirementDateFilter> value) { dateFilter = value; }


}
