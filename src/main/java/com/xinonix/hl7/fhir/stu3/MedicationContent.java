package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 */
public class MedicationContent extends BackboneElement {
	@Expose
	private CodeableConcept itemCodeableConcept;

	/**
	 * Getter for itemCodeableConcept
	 * @return Identifies one of the items in the package.
	 */
	public CodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

	/**
	 * Setter for itemCodeableConcept
	 * @param value Identifies one of the items in the package.
	 */
	public void setItemCodeableConcept(CodeableConcept value) { itemCodeableConcept = value; }


	@Expose
	private Reference itemReference;

	/**
	 * Getter for itemReference
	 * @return Identifies one of the items in the package.
	 */
	public Reference getItemReference() { return itemReference; }

	/**
	 * Setter for itemReference
	 * @param value Identifies one of the items in the package.
	 */
	public void setItemReference(Reference value) { itemReference = value; }


	@Expose
	private Quantity amount;

	/**
	 * Getter for amount
	 * @return The amount of the product that is in the package.
	 */
	public Quantity getAmount() { return amount; }

	/**
	 * Setter for amount
	 * @param value The amount of the product that is in the package.
	 */
	public void setAmount(Quantity value) { amount = value; }


}
