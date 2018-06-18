package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 */
public class CarePlanActivity extends BackboneElement {
	@Expose
	private ArrayList<CodeableConcept> outcomeCodeableConcept;

	/**
	 * Getter for outcomeCodeableConcept
	 * @return Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not).
	 */
	public ArrayList<CodeableConcept> getOutcomeCodeableConcept() { return outcomeCodeableConcept; }

	/**
	 * Setter for outcomeCodeableConcept
	 * @param value Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not).
	 */
	public void setOutcomeCodeableConcept(ArrayList<CodeableConcept> value) { outcomeCodeableConcept = value; }


	@Expose
	private ArrayList<Reference> outcomeReference;

	/**
	 * Getter for outcomeReference
	 * @return Details of the outcome or action resulting from the activity.  The reference to an "event" resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a “request” resource).
	 */
	public ArrayList<Reference> getOutcomeReference() { return outcomeReference; }

	/**
	 * Setter for outcomeReference
	 * @param value Details of the outcome or action resulting from the activity.  The reference to an "event" resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a “request” resource).
	 */
	public void setOutcomeReference(ArrayList<Reference> value) { outcomeReference = value; }


	@Expose
	private ArrayList<Annotation> progress;

	/**
	 * Getter for progress
	 * @return Notes about the adherence/status/progress of the activity.
	 */
	public ArrayList<Annotation> getProgress() { return progress; }

	/**
	 * Setter for progress
	 * @param value Notes about the adherence/status/progress of the activity.
	 */
	public void setProgress(ArrayList<Annotation> value) { progress = value; }


	@Expose
	private Reference reference;

	/**
	 * Getter for reference
	 * @return The details of the proposed activity represented in a specific resource.
	 */
	public Reference getReference() { return reference; }

	/**
	 * Setter for reference
	 * @param value The details of the proposed activity represented in a specific resource.
	 */
	public void setReference(Reference value) { reference = value; }


	@Expose
	private CarePlanDetail detail;

	/**
	 * Getter for detail
	 * @return A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
	 */
	public CarePlanDetail getDetail() { return detail; }

	/**
	 * Setter for detail
	 * @param value A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
	 */
	public void setDetail(CarePlanDetail value) { detail = value; }


}
