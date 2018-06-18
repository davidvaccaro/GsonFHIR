package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 */
public class MedicationAdministrationDosage extends BackboneElement {
	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return Free text dosage can be used for cases where the dosage administered is too complex to code. When coded dosage is present, the free text dosage may still be present for display to humans.

The dosage instructions should reflect the dosage of the medication that was administered.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value Free text dosage can be used for cases where the dosage administered is too complex to code. When coded dosage is present, the free text dosage may still be present for display to humans.

The dosage instructions should reflect the dosage of the medication that was administered.
	 */
	public void setText(String value) { text = value; }


	@Expose
	private CodeableConcept site;

	/**
	 * Getter for site
	 * @return A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm".
	 */
	public CodeableConcept getSite() { return site; }

	/**
	 * Setter for site
	 * @param value A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm".
	 */
	public void setSite(CodeableConcept value) { site = value; }


	@Expose
	private CodeableConcept route;

	/**
	 * Getter for route
	 * @return A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.
	 */
	public CodeableConcept getRoute() { return route; }

	/**
	 * Setter for route
	 * @param value A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.
	 */
	public void setRoute(CodeableConcept value) { route = value; }


	@Expose
	private CodeableConcept method;

	/**
	 * Getter for method
	 * @return A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.
	 */
	public CodeableConcept getMethod() { return method; }

	/**
	 * Setter for method
	 * @param value A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.
	 */
	public void setMethod(CodeableConcept value) { method = value; }


	@Expose
	private Quantity dose;

	/**
	 * Getter for dose
	 * @return The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.
	 */
	public Quantity getDose() { return dose; }

	/**
	 * Setter for dose
	 * @param value The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.
	 */
	public void setDose(Quantity value) { dose = value; }


	@Expose
	private Ratio rateRatio;

	/**
	 * Getter for rateRatio
	 * @return Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
	 */
	public Ratio getRateRatio() { return rateRatio; }

	/**
	 * Setter for rateRatio
	 * @param value Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
	 */
	public void setRateRatio(Ratio value) { rateRatio = value; }


	@Expose
	private Quantity rateSimpleQuantity;

	/**
	 * Getter for rateSimpleQuantity
	 * @return Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
	 */
	public Quantity getRateSimpleQuantity() { return rateSimpleQuantity; }

	/**
	 * Setter for rateSimpleQuantity
	 * @param value Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
	 */
	public void setRateSimpleQuantity(Quantity value) { rateSimpleQuantity = value; }


}
