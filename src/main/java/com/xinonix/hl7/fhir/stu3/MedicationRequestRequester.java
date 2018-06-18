package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 */
public class MedicationRequestRequester extends BackboneElement {
	@Expose
	private Reference agent;

	/**
	 * Getter for agent
	 * @return The healthcare professional responsible for authorizing the initial prescription.
	 */
	public Reference getAgent() { return agent; }

	/**
	 * Setter for agent
	 * @param value The healthcare professional responsible for authorizing the initial prescription.
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
