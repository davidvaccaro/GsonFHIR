package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 */
public class MedicationRequestSubstitution extends BackboneElement {
	@Expose
	private boolean allowed;

	/**
	 * Getter for allowed
	 * @return True if the prescriber allows a different drug to be dispensed from what was prescribed.
	 */
	public boolean getAllowed() { return allowed; }

	/**
	 * Setter for allowed
	 * @param value True if the prescriber allows a different drug to be dispensed from what was prescribed.
	 */
	public void setAllowed(boolean value) { allowed = value; }


	@Expose
	private CodeableConcept reason;

	/**
	 * Getter for reason
	 * @return Indicates the reason for the substitution, or why substitution must or must not be performed.
	 */
	public CodeableConcept getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value Indicates the reason for the substitution, or why substitution must or must not be performed.
	 */
	public void setReason(CodeableConcept value) { reason = value; }


}
