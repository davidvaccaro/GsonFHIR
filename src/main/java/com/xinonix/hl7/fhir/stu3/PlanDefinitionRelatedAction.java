package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 */
public class PlanDefinitionRelatedAction extends BackboneElement {
	@Expose
	private String actionId;

	/**
	 * Getter for actionId
	 * @return The element id of the related action.
	 */
	public String getActionId() { return actionId; }

	/**
	 * Setter for actionId
	 * @param value The element id of the related action.
	 */
	public void setActionId(String value) { actionId = value; }


	public enum Relationship{
		@SerializedName("before-start") BEFORE_START,
		@SerializedName("before") BEFORE,
		@SerializedName("before-end") BEFORE_END,
		@SerializedName("concurrent-with-start") CONCURRENT_WITH_START,
		@SerializedName("concurrent") CONCURRENT,
		@SerializedName("concurrent-with-end") CONCURRENT_WITH_END,
		@SerializedName("after-start") AFTER_START,
		@SerializedName("after") AFTER,
		@SerializedName("after-end") AFTER_END
	}

	@Expose
	private Relationship relationship;

	/**
	 * Getter for relationship
	 * @return The relationship of this action to the related action.
	 */
	public Relationship getRelationship() { return relationship; }

	/**
	 * Setter for relationship
	 * @param value The relationship of this action to the related action.
	 */
	public void setRelationship(Relationship value) { relationship = value; }


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
