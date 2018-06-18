package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
 */
public class ProcessRequestItem extends BackboneElement {
	@Expose
	private Integer sequenceLinkId;

	/**
	 * Getter for sequenceLinkId
	 * @return A service line number.
	 */
	public Integer getSequenceLinkId() { return sequenceLinkId; }

	/**
	 * Setter for sequenceLinkId
	 * @param value A service line number.
	 */
	public void setSequenceLinkId(Integer value) { sequenceLinkId = value; }


}
