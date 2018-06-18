package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 */
public class GoalTarget extends BackboneElement {
	@Expose
	private CodeableConcept measure;

	/**
	 * Getter for measure
	 * @return The parameter whose value is being tracked, e.g. body weight, blood pressure, or hemoglobin A1c level.
	 */
	public CodeableConcept getMeasure() { return measure; }

	/**
	 * Setter for measure
	 * @param value The parameter whose value is being tracked, e.g. body weight, blood pressure, or hemoglobin A1c level.
	 */
	public void setMeasure(CodeableConcept value) { measure = value; }


	@Expose
	private Quantity detailQuantity;

	/**
	 * Getter for detailQuantity
	 * @return The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
	 */
	public Quantity getDetailQuantity() { return detailQuantity; }

	/**
	 * Setter for detailQuantity
	 * @param value The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
	 */
	public void setDetailQuantity(Quantity value) { detailQuantity = value; }


	@Expose
	private Range detailRange;

	/**
	 * Getter for detailRange
	 * @return The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
	 */
	public Range getDetailRange() { return detailRange; }

	/**
	 * Setter for detailRange
	 * @param value The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
	 */
	public void setDetailRange(Range value) { detailRange = value; }


	@Expose
	private CodeableConcept detailCodeableConcept;

	/**
	 * Getter for detailCodeableConcept
	 * @return The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
	 */
	public CodeableConcept getDetailCodeableConcept() { return detailCodeableConcept; }

	/**
	 * Setter for detailCodeableConcept
	 * @param value The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value.
	 */
	public void setDetailCodeableConcept(CodeableConcept value) { detailCodeableConcept = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date dueDate;

	/**
	 * Getter for dueDate
	 * @return Indicates either the date or the duration after start by which the goal should be met.
	 */
	public Date getDueDate() { return dueDate; }

	/**
	 * Setter for dueDate
	 * @param value Indicates either the date or the duration after start by which the goal should be met.
	 */
	public void setDueDate(Date value) { dueDate = value; }


	@Expose
	private Duration dueDuration;

	/**
	 * Getter for dueDuration
	 * @return Indicates either the date or the duration after start by which the goal should be met.
	 */
	public Duration getDueDuration() { return dueDuration; }

	/**
	 * Setter for dueDuration
	 * @param value Indicates either the date or the duration after start by which the goal should be met.
	 */
	public void setDueDuration(Duration value) { dueDuration = value; }


}
