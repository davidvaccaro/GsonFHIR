package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A container for a collection of resources.
 */
public class BundleLink extends BackboneElement {
	@Expose
	private String relation;

	/**
	 * Getter for relation
	 * @return A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1).
	 */
	public String getRelation() { return relation; }

	/**
	 * Setter for relation
	 * @param value A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1).
	 */
	public void setRelation(String value) { relation = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return The reference details for the link.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value The reference details for the link.
	 */
	public void setUrl(String value) { url = value; }


}
