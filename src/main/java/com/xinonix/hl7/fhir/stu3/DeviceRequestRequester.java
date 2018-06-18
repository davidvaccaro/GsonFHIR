package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
 */
public class DeviceRequestRequester extends BackboneElement {
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
