package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 */
public class ExpansionProfileDesignation1 extends BackboneElement {
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
	 * @return Which kinds of designation to include in the expansion.
	 */
	public Coding getUse() { return use; }

	/**
	 * Setter for use
	 * @param value Which kinds of designation to include in the expansion.
	 */
	public void setUse(Coding value) { use = value; }


}
