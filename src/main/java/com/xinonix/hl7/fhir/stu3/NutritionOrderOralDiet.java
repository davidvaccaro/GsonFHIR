package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 */
public class NutritionOrderOralDiet extends BackboneElement {
	@Expose
	private ArrayList<CodeableConcept> type;

	/**
	 * Getter for type
	 * @return The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
	 */
	public ArrayList<CodeableConcept> getType() { return type; }

	/**
	 * Setter for type
	 * @param value The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
	 */
	public void setType(ArrayList<CodeableConcept> value) { type = value; }


	@Expose
	private ArrayList<Timing> schedule;

	/**
	 * Getter for schedule
	 * @return The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present.
	 */
	public ArrayList<Timing> getSchedule() { return schedule; }

	/**
	 * Setter for schedule
	 * @param value The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present.
	 */
	public void setSchedule(ArrayList<Timing> value) { schedule = value; }


	@Expose
	private ArrayList<NutritionOrderNutrient> nutrient;

	/**
	 * Getter for nutrient
	 * @return Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet.
	 */
	public ArrayList<NutritionOrderNutrient> getNutrient() { return nutrient; }

	/**
	 * Setter for nutrient
	 * @param value Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet.
	 */
	public void setNutrient(ArrayList<NutritionOrderNutrient> value) { nutrient = value; }


	@Expose
	private ArrayList<NutritionOrderTexture> texture;

	/**
	 * Getter for texture
	 * @return Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
	 */
	public ArrayList<NutritionOrderTexture> getTexture() { return texture; }

	/**
	 * Setter for texture
	 * @param value Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
	 */
	public void setTexture(ArrayList<NutritionOrderTexture> value) { texture = value; }


	@Expose
	private ArrayList<CodeableConcept> fluidConsistencyType;

	/**
	 * Getter for fluidConsistencyType
	 * @return The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
	 */
	public ArrayList<CodeableConcept> getFluidConsistencyType() { return fluidConsistencyType; }

	/**
	 * Setter for fluidConsistencyType
	 * @param value The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
	 */
	public void setFluidConsistencyType(ArrayList<CodeableConcept> value) { fluidConsistencyType = value; }


	@Expose
	private String instruction;

	/**
	 * Getter for instruction
	 * @return Free text or additional instructions or information pertaining to the oral diet.
	 */
	public String getInstruction() { return instruction; }

	/**
	 * Setter for instruction
	 * @param value Free text or additional instructions or information pertaining to the oral diet.
	 */
	public void setInstruction(String value) { instruction = value; }


}
