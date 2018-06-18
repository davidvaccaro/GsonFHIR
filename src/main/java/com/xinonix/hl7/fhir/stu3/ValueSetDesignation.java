package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 */
public class ValueSetDesignation extends BackboneElement {
	@Expose
	private String language;

	/**
	 * Getter for language
	 * @return The language this designation is defined for.
	 */
	public String getLanguage() { return language; }

	/**
	 * Setter for language
	 * @param value The language this designation is defined for.
	 */
	public void setLanguage(String value) { language = value; }


	@Expose
	private Coding use;

	/**
	 * Getter for use
	 * @return A code that details how this designation would be used.
	 */
	public Coding getUse() { return use; }

	/**
	 * Setter for use
	 * @param value A code that details how this designation would be used.
	 */
	public void setUse(Coding value) { use = value; }


	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return The text value for this designation.
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The text value for this designation.
	 */
	public void setValue(String value) { value = value; }


}
