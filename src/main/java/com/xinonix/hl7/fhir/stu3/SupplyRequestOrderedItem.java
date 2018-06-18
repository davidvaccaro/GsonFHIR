package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A record of a request for a medication, substance or device used in the healthcare setting.
 */
public class SupplyRequestOrderedItem extends BackboneElement {
	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The amount that is being ordered of the indicated item.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The amount that is being ordered of the indicated item.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private CodeableConcept itemCodeableConcept;

	/**
	 * Getter for itemCodeableConcept
	 * @return The item that is requested to be supplied. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
	 */
	public CodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

	/**
	 * Setter for itemCodeableConcept
	 * @param value The item that is requested to be supplied. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
	 */
	public void setItemCodeableConcept(CodeableConcept value) { itemCodeableConcept = value; }


	@Expose
	private Reference itemReference;

	/**
	 * Getter for itemReference
	 * @return The item that is requested to be supplied. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
	 */
	public Reference getItemReference() { return itemReference; }

	/**
	 * Setter for itemReference
	 * @param value The item that is requested to be supplied. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
	 */
	public void setItemReference(Reference value) { itemReference = value; }


}
