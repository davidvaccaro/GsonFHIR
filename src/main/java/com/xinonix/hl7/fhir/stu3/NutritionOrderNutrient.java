package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 */
public class NutritionOrderNutrient extends BackboneElement {
	@Expose
	private CodeableConcept modifier;

	/**
	 * Getter for modifier
	 * @return The nutrient that is being modified such as carbohydrate or sodium.
	 */
	public CodeableConcept getModifier() { return modifier; }

	/**
	 * Setter for modifier
	 * @param value The nutrient that is being modified such as carbohydrate or sodium.
	 */
	public void setModifier(CodeableConcept value) { modifier = value; }


	@Expose
	private Quantity amount;

	/**
	 * Getter for amount
	 * @return The quantity of the specified nutrient to include in diet.
	 */
	public Quantity getAmount() { return amount; }

	/**
	 * Setter for amount
	 * @param value The quantity of the specified nutrient to include in diet.
	 */
	public void setAmount(Quantity value) { amount = value; }


}
