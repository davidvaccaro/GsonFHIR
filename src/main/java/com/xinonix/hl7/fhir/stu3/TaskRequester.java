package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A task to be performed.
 */
public class TaskRequester extends BackboneElement {
	@Expose
	private Reference agent;

	/**
	 * Getter for agent
	 * @return The device, practitioner, etc. who initiated the task.
	 */
	public Reference getAgent() { return agent; }

	/**
	 * Setter for agent
	 * @param value The device, practitioner, etc. who initiated the task.
	 */
	public void setAgent(Reference value) { agent = value; }


	@Expose
	private Reference onBehalfOf;

	/**
	 * Getter for onBehalfOf
	 * @return The organization the device or practitioner was acting on behalf of when they initiated the task.
	 */
	public Reference getOnBehalfOf() { return onBehalfOf; }

	/**
	 * Setter for onBehalfOf
	 * @param value The organization the device or practitioner was acting on behalf of when they initiated the task.
	 */
	public void setOnBehalfOf(Reference value) { onBehalfOf = value; }


}
