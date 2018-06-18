package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 */
public class MessageHeaderDestination extends BackboneElement {
	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Human-readable name for the target system.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Human-readable name for the target system.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private Reference target;

	/**
	 * Getter for target
	 * @return Identifies the target end system in situations where the initial message transmission is to an intermediary system.
	 */
	public Reference getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value Identifies the target end system in situations where the initial message transmission is to an intermediary system.
	 */
	public void setTarget(Reference value) { target = value; }


	@Expose
	private String endpoint;

	/**
	 * Getter for endpoint
	 * @return Indicates where the message should be routed to.
	 */
	public String getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value Indicates where the message should be routed to.
	 */
	public void setEndpoint(String value) { endpoint = value; }


}
