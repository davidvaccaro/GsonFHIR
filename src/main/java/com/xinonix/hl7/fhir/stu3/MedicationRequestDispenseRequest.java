package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 */
public class MedicationRequestDispenseRequest extends BackboneElement {
	@Expose
	private Period validityPeriod;

	/**
	 * Getter for validityPeriod
	 * @return This indicates the validity period of a prescription (stale dating the Prescription).
	 */
	public Period getValidityPeriod() { return validityPeriod; }

	/**
	 * Setter for validityPeriod
	 * @param value This indicates the validity period of a prescription (stale dating the Prescription).
	 */
	public void setValidityPeriod(Period value) { validityPeriod = value; }


	@Expose
	private Integer numberOfRepeatsAllowed;

	/**
	 * Getter for numberOfRepeatsAllowed
	 * @return An integer indicating the number of times, in addition to the original dispense, (aka refills or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer does not include the original order dispense. This means that if an order indicates dispense 30 tablets plus "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
	 */
	public Integer getNumberOfRepeatsAllowed() { return numberOfRepeatsAllowed; }

	/**
	 * Setter for numberOfRepeatsAllowed
	 * @param value An integer indicating the number of times, in addition to the original dispense, (aka refills or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer does not include the original order dispense. This means that if an order indicates dispense 30 tablets plus "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
	 */
	public void setNumberOfRepeatsAllowed(Integer value) { numberOfRepeatsAllowed = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The amount that is to be dispensed for one fill.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The amount that is to be dispensed for one fill.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private Duration expectedSupplyDuration;

	/**
	 * Getter for expectedSupplyDuration
	 * @return Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.
	 */
	public Duration getExpectedSupplyDuration() { return expectedSupplyDuration; }

	/**
	 * Setter for expectedSupplyDuration
	 * @param value Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.
	 */
	public void setExpectedSupplyDuration(Duration value) { expectedSupplyDuration = value; }


	@Expose
	private Reference performer;

	/**
	 * Getter for performer
	 * @return Indicates the intended dispensing Organization specified by the prescriber.
	 */
	public Reference getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value Indicates the intended dispensing Organization specified by the prescriber.
	 */
	public void setPerformer(Reference value) { performer = value; }


}
