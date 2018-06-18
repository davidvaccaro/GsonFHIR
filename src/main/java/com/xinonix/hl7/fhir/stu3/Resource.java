package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This is the base resource type for everything.
 */
public class Resource extends Element {
	@Expose
	private Meta meta;

	/**
	 * Getter for meta
	 * @return The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
	 */
	public Meta getMeta() { return meta; }

	/**
	 * Setter for meta
	 * @param value The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
	 */
	public void setMeta(Meta value) { meta = value; }


	@Expose
	private String implicitRules;

	/**
	 * Getter for implicitRules
	 * @return A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content.
	 */
	public String getImplicitRules() { return implicitRules; }

	/**
	 * Setter for implicitRules
	 * @param value A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content.
	 */
	public void setImplicitRules(String value) { implicitRules = value; }


	@Expose
	private String language;

	/**
	 * Getter for language
	 * @return The base language in which the resource is written.
	 */
	public String getLanguage() { return language; }

	/**
	 * Setter for language
	 * @param value The base language in which the resource is written.
	 */
	public void setLanguage(String value) { language = value; }


}
