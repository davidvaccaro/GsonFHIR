package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
 */
public class MedicationDispensePerformer extends BackboneElement {
	@Expose
	private Reference actor;

	/**
	 * Getter for actor
	 * @return The device, practitioner, etc. who performed the action.  It should be assumed that the actor is the dispenser of the medication.
	 */
	public Reference getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value The device, practitioner, etc. who performed the action.  It should be assumed that the actor is the dispenser of the medication.
	 */
	public void setActor(Reference value) { actor = value; }


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
