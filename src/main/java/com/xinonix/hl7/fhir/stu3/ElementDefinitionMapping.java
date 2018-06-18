package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Captures constraints on each element within the resource, profile, or extension.
 */
public class ElementDefinitionMapping extends BackboneElement {
	@Expose
	private String identity;

	/**
	 * Getter for identity
	 * @return An internal reference to the definition of a mapping.
	 */
	public String getIdentity() { return identity; }

	/**
	 * Setter for identity
	 * @param value An internal reference to the definition of a mapping.
	 */
	public void setIdentity(String value) { identity = value; }


	@Expose
	private String language;

	/**
	 * Getter for language
	 * @return Identifies the computable language in which mapping.map is expressed.
	 */
	public String getLanguage() { return language; }

	/**
	 * Setter for language
	 * @param value Identifies the computable language in which mapping.map is expressed.
	 */
	public void setLanguage(String value) { language = value; }


	@Expose
	private String map;

	/**
	 * Getter for map
	 * @return Expresses what part of the target specification corresponds to this element.
	 */
	public String getMap() { return map; }

	/**
	 * Setter for map
	 * @param value Expresses what part of the target specification corresponds to this element.
	 */
	public void setMap(String value) { map = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return Comments that provide information about the mapping or its use.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value Comments that provide information about the mapping or its use.
	 */
	public void setComment(String value) { comment = value; }


}
