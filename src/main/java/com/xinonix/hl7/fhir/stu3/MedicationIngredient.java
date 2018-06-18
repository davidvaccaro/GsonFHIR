package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 */
public class MedicationIngredient extends BackboneElement {
	@Expose
	private CodeableConcept itemCodeableConcept;

	/**
	 * Getter for itemCodeableConcept
	 * @return The actual ingredient - either a substance (simple ingredient) or another medication.
	 */
	public CodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

	/**
	 * Setter for itemCodeableConcept
	 * @param value The actual ingredient - either a substance (simple ingredient) or another medication.
	 */
	public void setItemCodeableConcept(CodeableConcept value) { itemCodeableConcept = value; }


	@Expose
	private Reference itemReference;

	/**
	 * Getter for itemReference
	 * @return The actual ingredient - either a substance (simple ingredient) or another medication.
	 */
	public Reference getItemReference() { return itemReference; }

	/**
	 * Setter for itemReference
	 * @param value The actual ingredient - either a substance (simple ingredient) or another medication.
	 */
	public void setItemReference(Reference value) { itemReference = value; }


	@Expose
	private boolean isActive;

	/**
	 * Getter for isActive
	 * @return Indication of whether this ingredient affects the therapeutic action of the drug.
	 */
	public boolean getIsActive() { return isActive; }

	/**
	 * Setter for isActive
	 * @param value Indication of whether this ingredient affects the therapeutic action of the drug.
	 */
	public void setIsActive(boolean value) { isActive = value; }


	@Expose
	private Ratio amount;

	/**
	 * Getter for amount
	 * @return Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet.
	 */
	public Ratio getAmount() { return amount; }

	/**
	 * Setter for amount
	 * @param value Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet.
	 */
	public void setAmount(Ratio value) { amount = value; }


}
