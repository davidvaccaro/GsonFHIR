package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 */
public class NutritionOrderEnteralFormula extends BackboneElement {
	@Expose
	private CodeableConcept baseFormulaType;

	/**
	 * Getter for baseFormulaType
	 * @return The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.
	 */
	public CodeableConcept getBaseFormulaType() { return baseFormulaType; }

	/**
	 * Setter for baseFormulaType
	 * @param value The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.
	 */
	public void setBaseFormulaType(CodeableConcept value) { baseFormulaType = value; }


	@Expose
	private String baseFormulaProductName;

	/**
	 * Getter for baseFormulaProductName
	 * @return The product or brand name of the enteral or infant formula product such as "ACME Adult Standard Formula".
	 */
	public String getBaseFormulaProductName() { return baseFormulaProductName; }

	/**
	 * Setter for baseFormulaProductName
	 * @param value The product or brand name of the enteral or infant formula product such as "ACME Adult Standard Formula".
	 */
	public void setBaseFormulaProductName(String value) { baseFormulaProductName = value; }


	@Expose
	private CodeableConcept additiveType;

	/**
	 * Getter for additiveType
	 * @return Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.
	 */
	public CodeableConcept getAdditiveType() { return additiveType; }

	/**
	 * Setter for additiveType
	 * @param value Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.
	 */
	public void setAdditiveType(CodeableConcept value) { additiveType = value; }


	@Expose
	private String additiveProductName;

	/**
	 * Getter for additiveProductName
	 * @return The product or brand name of the type of modular component to be added to the formula.
	 */
	public String getAdditiveProductName() { return additiveProductName; }

	/**
	 * Setter for additiveProductName
	 * @param value The product or brand name of the type of modular component to be added to the formula.
	 */
	public void setAdditiveProductName(String value) { additiveProductName = value; }


	@Expose
	private Quantity caloricDensity;

	/**
	 * Getter for caloricDensity
	 * @return The amount of energy (calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 calories per fluid ounce or an adult may require an enteral formula that provides 1.5 calorie/mL.
	 */
	public Quantity getCaloricDensity() { return caloricDensity; }

	/**
	 * Setter for caloricDensity
	 * @param value The amount of energy (calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 calories per fluid ounce or an adult may require an enteral formula that provides 1.5 calorie/mL.
	 */
	public void setCaloricDensity(Quantity value) { caloricDensity = value; }


	@Expose
	private CodeableConcept routeofAdministration;

	/**
	 * Getter for routeofAdministration
	 * @return The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.
	 */
	public CodeableConcept getRouteofAdministration() { return routeofAdministration; }

	/**
	 * Setter for routeofAdministration
	 * @param value The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.
	 */
	public void setRouteofAdministration(CodeableConcept value) { routeofAdministration = value; }


	@Expose
	private ArrayList<NutritionOrderAdministration> administration;

	/**
	 * Getter for administration
	 * @return Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
	 */
	public ArrayList<NutritionOrderAdministration> getAdministration() { return administration; }

	/**
	 * Setter for administration
	 * @param value Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
	 */
	public void setAdministration(ArrayList<NutritionOrderAdministration> value) { administration = value; }


	@Expose
	private Quantity maxVolumeToDeliver;

	/**
	 * Getter for maxVolumeToDeliver
	 * @return The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.
	 */
	public Quantity getMaxVolumeToDeliver() { return maxVolumeToDeliver; }

	/**
	 * Setter for maxVolumeToDeliver
	 * @param value The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.
	 */
	public void setMaxVolumeToDeliver(Quantity value) { maxVolumeToDeliver = value; }


	@Expose
	private String administrationInstruction;

	/**
	 * Getter for administrationInstruction
	 * @return Free text formula administration, feeding instructions or additional instructions or information.
	 */
	public String getAdministrationInstruction() { return administrationInstruction; }

	/**
	 * Setter for administrationInstruction
	 * @param value Free text formula administration, feeding instructions or additional instructions or information.
	 */
	public void setAdministrationInstruction(String value) { administrationInstruction = value; }


}
