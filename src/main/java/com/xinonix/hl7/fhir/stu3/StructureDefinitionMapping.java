package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
 */
public class StructureDefinitionMapping extends BackboneElement {
	@Expose
	private String identity;

	/**
	 * Getter for identity
	 * @return An Internal id that is used to identify this mapping set when specific mappings are made.
	 */
	public String getIdentity() { return identity; }

	/**
	 * Setter for identity
	 * @param value An Internal id that is used to identify this mapping set when specific mappings are made.
	 */
	public void setIdentity(String value) { identity = value; }


	@Expose
	private String uri;

	/**
	 * Getter for uri
	 * @return An absolute URI that identifies the specification that this mapping is expressed to.
	 */
	public String getUri() { return uri; }

	/**
	 * Setter for uri
	 * @param value An absolute URI that identifies the specification that this mapping is expressed to.
	 */
	public void setUri(String value) { uri = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A name for the specification that is being mapped to.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A name for the specification that is being mapped to.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage.
	 */
	public void setComment(String value) { comment = value; }


}
