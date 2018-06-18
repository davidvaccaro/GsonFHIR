package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 */
public class ImmunizationExplanation extends BackboneElement {
	@Expose
	private ArrayList<CodeableConcept> reason;

	/**
	 * Getter for reason
	 * @return Reasons why a vaccine was administered.
	 */
	public ArrayList<CodeableConcept> getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value Reasons why a vaccine was administered.
	 */
	public void setReason(ArrayList<CodeableConcept> value) { reason = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonNotGiven;

	/**
	 * Getter for reasonNotGiven
	 * @return Reason why a vaccine was not administered.
	 */
	public ArrayList<CodeableConcept> getReasonNotGiven() { return reasonNotGiven; }

	/**
	 * Setter for reasonNotGiven
	 * @param value Reason why a vaccine was not administered.
	 */
	public void setReasonNotGiven(ArrayList<CodeableConcept> value) { reasonNotGiven = value; }


}
