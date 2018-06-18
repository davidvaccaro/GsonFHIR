package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptLink extends BackboneElement {
	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return URL to a particular requirement or feature within the FHIR specification.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value URL to a particular requirement or feature within the FHIR specification.
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Short description of the link.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Short description of the link.
	 */
	public void setDescription(String value) { description = value; }


}
