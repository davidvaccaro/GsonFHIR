package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 */
public class NutritionOrderTexture extends BackboneElement {
	@Expose
	private CodeableConcept modifier;

	/**
	 * Getter for modifier
	 * @return Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed.
	 */
	public CodeableConcept getModifier() { return modifier; }

	/**
	 * Setter for modifier
	 * @param value Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed.
	 */
	public void setModifier(CodeableConcept value) { modifier = value; }


	@Expose
	private CodeableConcept foodType;

	/**
	 * Getter for foodType
	 * @return The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types.
	 */
	public CodeableConcept getFoodType() { return foodType; }

	/**
	 * Setter for foodType
	 * @param value The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types.
	 */
	public void setFoodType(CodeableConcept value) { foodType = value; }


}
