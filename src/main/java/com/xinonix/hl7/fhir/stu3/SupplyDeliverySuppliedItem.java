package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Record of delivery of what is supplied.
 */
public class SupplyDeliverySuppliedItem extends BackboneElement {
	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The amount of supply that has been dispensed. Includes unit of measure.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The amount of supply that has been dispensed. Includes unit of measure.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private CodeableConcept itemCodeableConcept;

	/**
	 * Getter for itemCodeableConcept
	 * @return Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
	 */
	public CodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

	/**
	 * Setter for itemCodeableConcept
	 * @param value Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
	 */
	public void setItemCodeableConcept(CodeableConcept value) { itemCodeableConcept = value; }


	@Expose
	private Reference itemReference;

	/**
	 * Getter for itemReference
	 * @return Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
	 */
	public Reference getItemReference() { return itemReference; }

	/**
	 * Setter for itemReference
	 * @param value Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
	 */
	public void setItemReference(Reference value) { itemReference = value; }


}
