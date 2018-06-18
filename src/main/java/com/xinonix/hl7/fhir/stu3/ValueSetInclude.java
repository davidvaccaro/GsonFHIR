package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 */
public class ValueSetInclude extends BackboneElement {
	@Expose
	private String system;

	/**
	 * Getter for system
	 * @return An absolute URI which is the code system from which the selected codes come from.
	 */
	public String getSystem() { return system; }

	/**
	 * Setter for system
	 * @param value An absolute URI which is the code system from which the selected codes come from.
	 */
	public void setSystem(String value) { system = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The version of the code system that the codes are selected from.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The version of the code system that the codes are selected from.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private ArrayList<ValueSetConcept> concept;

	/**
	 * Getter for concept
	 * @return Specifies a concept to be included or excluded.
	 */
	public ArrayList<ValueSetConcept> getConcept() { return concept; }

	/**
	 * Setter for concept
	 * @param value Specifies a concept to be included or excluded.
	 */
	public void setConcept(ArrayList<ValueSetConcept> value) { concept = value; }


	@Expose
	private ArrayList<ValueSetFilter> filter;

	/**
	 * Getter for filter
	 * @return Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
	 */
	public ArrayList<ValueSetFilter> getFilter() { return filter; }

	/**
	 * Setter for filter
	 * @param value Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
	 */
	public void setFilter(ArrayList<ValueSetFilter> value) { filter = value; }


	@Expose
	private ArrayList<String> valueSet;

	/**
	 * Getter for valueSet
	 * @return Selects concepts found in this value set. This is an absolute URI that is a reference to ValueSet.url.
	 */
	public ArrayList<String> getValueSet() { return valueSet; }

	/**
	 * Setter for valueSet
	 * @param value Selects concepts found in this value set. This is an absolute URI that is a reference to ValueSet.url.
	 */
	public void setValueSet(ArrayList<String> value) { valueSet = value; }


}
