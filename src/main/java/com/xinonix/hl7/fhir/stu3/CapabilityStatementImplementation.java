package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementImplementation extends BackboneElement {
	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Information about the specific installation that this capability statement relates to.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Information about the specific installation that this capability statement relates to.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
	 */
	public void setUrl(String value) { url = value; }


}
