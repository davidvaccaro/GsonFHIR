package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 */
public class MessageHeaderSource extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Human-readable name for the source system.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Human-readable name for the source system.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String software;

	/**
	 * Getter for software
	 * @return May include configuration or other information useful in debugging.
	 */
	public String getSoftware() { return software; }

	/**
	 * Setter for software
	 * @param value May include configuration or other information useful in debugging.
	 */
	public void setSoftware(String value) { software = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return Can convey versions of multiple systems in situations where a message passes through multiple hands.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value Can convey versions of multiple systems in situations where a message passes through multiple hands.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private ContactPoint contact;

	/**
	 * Getter for contact
	 * @return An e-mail, phone, website or other contact point to use to resolve issues with message communications.
	 */
	public ContactPoint getContact() { return contact; }

	/**
	 * Setter for contact
	 * @param value An e-mail, phone, website or other contact point to use to resolve issues with message communications.
	 */
	public void setContact(ContactPoint value) { contact = value; }


	@Expose
	private String endpoint;

	/**
	 * Getter for endpoint
	 * @return Identifies the routing target to send acknowledgements to.
	 */
	public String getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value Identifies the routing target to send acknowledgements to.
	 */
	public void setEndpoint(String value) { endpoint = value; }


}
