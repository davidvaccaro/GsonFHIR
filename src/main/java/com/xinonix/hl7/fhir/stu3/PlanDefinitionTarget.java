package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 */
public class PlanDefinitionTarget extends BackboneElement {
	@Expose
	private CodeableConcept measure;

	/**
	 * Getter for measure
	 * @return The parameter whose value is to be tracked, e.g. body weigth, blood pressure, or hemoglobin A1c level.
	 */
	public CodeableConcept getMeasure() { return measure; }

	/**
	 * Setter for measure
	 * @param value The parameter whose value is to be tracked, e.g. body weigth, blood pressure, or hemoglobin A1c level.
	 */
	public void setMeasure(CodeableConcept value) { measure = value; }


	@Expose
	private Quantity detailQuantity;

	/**
	 * Getter for detailQuantity
	 * @return The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value.
	 */
	public Quantity getDetailQuantity() { return detailQuantity; }

	/**
	 * Setter for detailQuantity
	 * @param value The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value.
	 */
	public void setDetailQuantity(Quantity value) { detailQuantity = value; }


	@Expose
	private Range detailRange;

	/**
	 * Getter for detailRange
	 * @return The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value.
	 */
	public Range getDetailRange() { return detailRange; }

	/**
	 * Setter for detailRange
	 * @param value The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value.
	 */
	public void setDetailRange(Range value) { detailRange = value; }


	@Expose
	private CodeableConcept detailCodeableConcept;

	/**
	 * Getter for detailCodeableConcept
	 * @return The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value.
	 */
	public CodeableConcept getDetailCodeableConcept() { return detailCodeableConcept; }

	/**
	 * Setter for detailCodeableConcept
	 * @param value The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value.
	 */
	public void setDetailCodeableConcept(CodeableConcept value) { detailCodeableConcept = value; }


	@Expose
	private Duration due;

	/**
	 * Getter for due
	 * @return Indicates the timeframe after the start of the goal in which the goal should be met.
	 */
	public Duration getDue() { return due; }

	/**
	 * Setter for due
	 * @param value Indicates the timeframe after the start of the goal in which the goal should be met.
	 */
	public void setDue(Duration value) { due = value; }


}
