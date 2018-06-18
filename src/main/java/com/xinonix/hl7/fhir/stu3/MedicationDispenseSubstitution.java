package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
 */
public class MedicationDispenseSubstitution extends BackboneElement {
	@Expose
	private boolean wasSubstituted;

	/**
	 * Getter for wasSubstituted
	 * @return True if the dispenser dispensed a different drug or product from what was prescribed.
	 */
	public boolean getWasSubstituted() { return wasSubstituted; }

	/**
	 * Setter for wasSubstituted
	 * @param value True if the dispenser dispensed a different drug or product from what was prescribed.
	 */
	public void setWasSubstituted(boolean value) { wasSubstituted = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return A code signifying whether a different drug was dispensed from what was prescribed.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value A code signifying whether a different drug was dispensed from what was prescribed.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private ArrayList<CodeableConcept> reason;

	/**
	 * Getter for reason
	 * @return Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.
	 */
	public ArrayList<CodeableConcept> getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value Indicates the reason for the substitution of (or lack of substitution) from what was prescribed.
	 */
	public void setReason(ArrayList<CodeableConcept> value) { reason = value; }


	@Expose
	private ArrayList<Reference> responsibleParty;

	/**
	 * Getter for responsibleParty
	 * @return The person or organization that has primary responsibility for the substitution.
	 */
	public ArrayList<Reference> getResponsibleParty() { return responsibleParty; }

	/**
	 * Setter for responsibleParty
	 * @param value The person or organization that has primary responsibility for the substitution.
	 */
	public void setResponsibleParty(ArrayList<Reference> value) { responsibleParty = value; }


}
