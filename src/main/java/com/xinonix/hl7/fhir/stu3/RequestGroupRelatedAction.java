package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 */
public class RequestGroupRelatedAction extends BackboneElement {
	@Expose
	private String actionId;

	/**
	 * Getter for actionId
	 * @return The element id of the action this is related to.
	 */
	public String getActionId() { return actionId; }

	/**
	 * Setter for actionId
	 * @param value The element id of the action this is related to.
	 */
	public void setActionId(String value) { actionId = value; }


	@Expose
	private String relationship;

	/**
	 * Getter for relationship
	 * @return The relationship of this action to the related action.
	 */
	public String getRelationship() { return relationship; }

	/**
	 * Setter for relationship
	 * @param value The relationship of this action to the related action.
	 */
	public void setRelationship(String value) { relationship = value; }


	@Expose
	private Duration offsetDuration;

	/**
	 * Getter for offsetDuration
	 * @return A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
	 */
	public Duration getOffsetDuration() { return offsetDuration; }

	/**
	 * Setter for offsetDuration
	 * @param value A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
	 */
	public void setOffsetDuration(Duration value) { offsetDuration = value; }


	@Expose
	private Range offsetRange;

	/**
	 * Getter for offsetRange
	 * @return A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
	 */
	public Range getOffsetRange() { return offsetRange; }

	/**
	 * Setter for offsetRange
	 * @param value A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
	 */
	public void setOffsetRange(Range value) { offsetRange = value; }


}
