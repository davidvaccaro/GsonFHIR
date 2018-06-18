package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 */
public class CommunicationRequestRequester extends BackboneElement {
	@Expose
	private Reference agent;

	/**
	 * Getter for agent
	 * @return The device, practitioner, etc. who initiated the request.
	 */
	public Reference getAgent() { return agent; }

	/**
	 * Setter for agent
	 * @param value The device, practitioner, etc. who initiated the request.
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
