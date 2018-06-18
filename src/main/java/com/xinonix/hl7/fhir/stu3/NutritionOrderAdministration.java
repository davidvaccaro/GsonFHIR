package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 */
public class NutritionOrderAdministration extends BackboneElement {
	@Expose
	private Timing schedule;

	/**
	 * Getter for schedule
	 * @return The time period and frequency at which the enteral formula should be delivered to the patient.
	 */
	public Timing getSchedule() { return schedule; }

	/**
	 * Setter for schedule
	 * @param value The time period and frequency at which the enteral formula should be delivered to the patient.
	 */
	public void setSchedule(Timing value) { schedule = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The volume of formula to provide to the patient per the specified administration schedule.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The volume of formula to provide to the patient per the specified administration schedule.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private Quantity rateSimpleQuantity;

	/**
	 * Getter for rateSimpleQuantity
	 * @return The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.
	 */
	public Quantity getRateSimpleQuantity() { return rateSimpleQuantity; }

	/**
	 * Setter for rateSimpleQuantity
	 * @param value The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.
	 */
	public void setRateSimpleQuantity(Quantity value) { rateSimpleQuantity = value; }


	@Expose
	private Ratio rateRatio;

	/**
	 * Getter for rateRatio
	 * @return The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.
	 */
	public Ratio getRateRatio() { return rateRatio; }

	/**
	 * Setter for rateRatio
	 * @param value The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.
	 */
	public void setRateRatio(Ratio value) { rateRatio = value; }


}
