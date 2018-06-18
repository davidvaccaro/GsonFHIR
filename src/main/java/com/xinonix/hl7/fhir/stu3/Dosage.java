package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Indicates how the medication is/was taken or should be taken by the patient.
 */
public class Dosage extends Element {
	@Expose
	private Integer sequence;

	/**
	 * Getter for sequence
	 * @return Indicates the order in which the dosage instructions should be applied or interpreted.
	 */
	public Integer getSequence() { return sequence; }

	/**
	 * Setter for sequence
	 * @param value Indicates the order in which the dosage instructions should be applied or interpreted.
	 */
	public void setSequence(Integer value) { sequence = value; }


	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return Free text dosage instructions e.g. SIG.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value Free text dosage instructions e.g. SIG.
	 */
	public void setText(String value) { text = value; }


	@Expose
	private ArrayList<CodeableConcept> additionalInstruction;

	/**
	 * Getter for additionalInstruction
	 * @return Supplemental instruction - e.g. "with meals".
	 */
	public ArrayList<CodeableConcept> getAdditionalInstruction() { return additionalInstruction; }

	/**
	 * Setter for additionalInstruction
	 * @param value Supplemental instruction - e.g. "with meals".
	 */
	public void setAdditionalInstruction(ArrayList<CodeableConcept> value) { additionalInstruction = value; }


	@Expose
	private String patientInstruction;

	/**
	 * Getter for patientInstruction
	 * @return Instructions in terms that are understood by the patient or consumer.
	 */
	public String getPatientInstruction() { return patientInstruction; }

	/**
	 * Setter for patientInstruction
	 * @param value Instructions in terms that are understood by the patient or consumer.
	 */
	public void setPatientInstruction(String value) { patientInstruction = value; }


	@Expose
	private Timing timing;

	/**
	 * Getter for timing
	 * @return When medication should be administered.
	 */
	public Timing getTiming() { return timing; }

	/**
	 * Setter for timing
	 * @param value When medication should be administered.
	 */
	public void setTiming(Timing value) { timing = value; }


	@Expose
	private boolean asNeededBoolean;

	/**
	 * Getter for asNeededBoolean
	 * @return Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
	 */
	public boolean getAsNeededBoolean() { return asNeededBoolean; }

	/**
	 * Setter for asNeededBoolean
	 * @param value Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
	 */
	public void setAsNeededBoolean(boolean value) { asNeededBoolean = value; }


	@Expose
	private CodeableConcept asNeededCodeableConcept;

	/**
	 * Getter for asNeededCodeableConcept
	 * @return Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
	 */
	public CodeableConcept getAsNeededCodeableConcept() { return asNeededCodeableConcept; }

	/**
	 * Setter for asNeededCodeableConcept
	 * @param value Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).
	 */
	public void setAsNeededCodeableConcept(CodeableConcept value) { asNeededCodeableConcept = value; }


	@Expose
	private CodeableConcept site;

	/**
	 * Getter for site
	 * @return Body site to administer to.
	 */
	public CodeableConcept getSite() { return site; }

	/**
	 * Setter for site
	 * @param value Body site to administer to.
	 */
	public void setSite(CodeableConcept value) { site = value; }


	@Expose
	private CodeableConcept route;

	/**
	 * Getter for route
	 * @return How drug should enter body.
	 */
	public CodeableConcept getRoute() { return route; }

	/**
	 * Setter for route
	 * @param value How drug should enter body.
	 */
	public void setRoute(CodeableConcept value) { route = value; }


	@Expose
	private CodeableConcept method;

	/**
	 * Getter for method
	 * @return Technique for administering medication.
	 */
	public CodeableConcept getMethod() { return method; }

	/**
	 * Setter for method
	 * @param value Technique for administering medication.
	 */
	public void setMethod(CodeableConcept value) { method = value; }


	@Expose
	private Range doseRange;

	/**
	 * Getter for doseRange
	 * @return Amount of medication per dose.
	 */
	public Range getDoseRange() { return doseRange; }

	/**
	 * Setter for doseRange
	 * @param value Amount of medication per dose.
	 */
	public void setDoseRange(Range value) { doseRange = value; }


	@Expose
	private Quantity doseSimpleQuantity;

	/**
	 * Getter for doseSimpleQuantity
	 * @return Amount of medication per dose.
	 */
	public Quantity getDoseSimpleQuantity() { return doseSimpleQuantity; }

	/**
	 * Setter for doseSimpleQuantity
	 * @param value Amount of medication per dose.
	 */
	public void setDoseSimpleQuantity(Quantity value) { doseSimpleQuantity = value; }


	@Expose
	private Ratio maxDosePerPeriod;

	/**
	 * Getter for maxDosePerPeriod
	 * @return Upper limit on medication per unit of time.
	 */
	public Ratio getMaxDosePerPeriod() { return maxDosePerPeriod; }

	/**
	 * Setter for maxDosePerPeriod
	 * @param value Upper limit on medication per unit of time.
	 */
	public void setMaxDosePerPeriod(Ratio value) { maxDosePerPeriod = value; }


	@Expose
	private Quantity maxDosePerAdministration;

	/**
	 * Getter for maxDosePerAdministration
	 * @return Upper limit on medication per administration.
	 */
	public Quantity getMaxDosePerAdministration() { return maxDosePerAdministration; }

	/**
	 * Setter for maxDosePerAdministration
	 * @param value Upper limit on medication per administration.
	 */
	public void setMaxDosePerAdministration(Quantity value) { maxDosePerAdministration = value; }


	@Expose
	private Quantity maxDosePerLifetime;

	/**
	 * Getter for maxDosePerLifetime
	 * @return Upper limit on medication per lifetime of the patient.
	 */
	public Quantity getMaxDosePerLifetime() { return maxDosePerLifetime; }

	/**
	 * Setter for maxDosePerLifetime
	 * @param value Upper limit on medication per lifetime of the patient.
	 */
	public void setMaxDosePerLifetime(Quantity value) { maxDosePerLifetime = value; }


	@Expose
	private Ratio rateRatio;

	/**
	 * Getter for rateRatio
	 * @return Amount of medication per unit of time.
	 */
	public Ratio getRateRatio() { return rateRatio; }

	/**
	 * Setter for rateRatio
	 * @param value Amount of medication per unit of time.
	 */
	public void setRateRatio(Ratio value) { rateRatio = value; }


	@Expose
	private Range rateRange;

	/**
	 * Getter for rateRange
	 * @return Amount of medication per unit of time.
	 */
	public Range getRateRange() { return rateRange; }

	/**
	 * Setter for rateRange
	 * @param value Amount of medication per unit of time.
	 */
	public void setRateRange(Range value) { rateRange = value; }


	@Expose
	private Quantity rateSimpleQuantity;

	/**
	 * Getter for rateSimpleQuantity
	 * @return Amount of medication per unit of time.
	 */
	public Quantity getRateSimpleQuantity() { return rateSimpleQuantity; }

	/**
	 * Setter for rateSimpleQuantity
	 * @param value Amount of medication per unit of time.
	 */
	public void setRateSimpleQuantity(Quantity value) { rateSimpleQuantity = value; }


}
