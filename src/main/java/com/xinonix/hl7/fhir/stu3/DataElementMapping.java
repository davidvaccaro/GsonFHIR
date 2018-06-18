package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The formal description of a single piece of information that can be gathered and reported.
 */
public class DataElementMapping extends BackboneElement {
	@Expose
	private String identity;

	/**
	 * Getter for identity
	 * @return An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis.
	 */
	public String getIdentity() { return identity; }

	/**
	 * Setter for identity
	 * @param value An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis.
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
