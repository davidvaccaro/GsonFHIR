package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 */
public class NutritionOrderSupplement extends BackboneElement {
	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private String productName;

	/**
	 * Getter for productName
	 * @return The product or brand name of the nutritional supplement such as "Acme Protein Shake".
	 */
	public String getProductName() { return productName; }

	/**
	 * Setter for productName
	 * @param value The product or brand name of the nutritional supplement such as "Acme Protein Shake".
	 */
	public void setProductName(String value) { productName = value; }


	@Expose
	private ArrayList<Timing> schedule;

	/**
	 * Getter for schedule
	 * @return The time period and frequency at which the supplement(s) should be given.  The supplement should be given for the combination of all schedules if more than one schedule is present.
	 */
	public ArrayList<Timing> getSchedule() { return schedule; }

	/**
	 * Setter for schedule
	 * @param value The time period and frequency at which the supplement(s) should be given.  The supplement should be given for the combination of all schedules if more than one schedule is present.
	 */
	public void setSchedule(ArrayList<Timing> value) { schedule = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The amount of the nutritional supplement to be given.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The amount of the nutritional supplement to be given.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private String instruction;

	/**
	 * Getter for instruction
	 * @return Free text or additional instructions or information pertaining to the oral supplement.
	 */
	public String getInstruction() { return instruction; }

	/**
	 * Setter for instruction
	 * @param value Free text or additional instructions or information pertaining to the oral supplement.
	 */
	public void setInstruction(String value) { instruction = value; }


}
