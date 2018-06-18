package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A homogeneous material with a definite composition.
 */
public class SubstanceIngredient extends BackboneElement {
	@Expose
	private Ratio quantity;

	/**
	 * Getter for quantity
	 * @return The amount of the ingredient in the substance - a concentration ratio.
	 */
	public Ratio getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The amount of the ingredient in the substance - a concentration ratio.
	 */
	public void setQuantity(Ratio value) { quantity = value; }


	@Expose
	private CodeableConcept substanceCodeableConcept;

	/**
	 * Getter for substanceCodeableConcept
	 * @return Another substance that is a component of this substance.
	 */
	public CodeableConcept getSubstanceCodeableConcept() { return substanceCodeableConcept; }

	/**
	 * Setter for substanceCodeableConcept
	 * @param value Another substance that is a component of this substance.
	 */
	public void setSubstanceCodeableConcept(CodeableConcept value) { substanceCodeableConcept = value; }


	@Expose
	private Reference substanceReference;

	/**
	 * Getter for substanceReference
	 * @return Another substance that is a component of this substance.
	 */
	public Reference getSubstanceReference() { return substanceReference; }

	/**
	 * Setter for substanceReference
	 * @param value Another substance that is a component of this substance.
	 */
	public void setSubstanceReference(Reference value) { substanceReference = value; }


}
