package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 */
public class ProcedureRequestRequester extends BackboneElement {
	@Expose
	private Reference agent;

	/**
	 * Getter for agent
	 * @return The device, practitioner or organization who initiated the request.
	 */
	public Reference getAgent() { return agent; }

	/**
	 * Setter for agent
	 * @param value The device, practitioner or organization who initiated the request.
	 */
	public void setAgent(Reference value) { agent = value; }


	@Expose
	private Reference onBehalfOf;

	/**
	 * Getter for onBehalfOf
	 * @return The organization the device or practitioner was acting on behalf of.
	 */
	public Reference getOnBehalfOf() { return onBehalfOf; }

	/**
	 * Setter for onBehalfOf
	 * @param value The organization the device or practitioner was acting on behalf of.
	 */
	public void setOnBehalfOf(Reference value) { onBehalfOf = value; }


}
