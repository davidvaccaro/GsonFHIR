package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 */
public class RiskAssessmentPrediction extends BackboneElement {
	@Expose
	private CodeableConcept outcome;

	/**
	 * Getter for outcome
	 * @return One of the potential outcomes for the patient (e.g. remission, death,  a particular condition).
	 */
	public CodeableConcept getOutcome() { return outcome; }

	/**
	 * Setter for outcome
	 * @param value One of the potential outcomes for the patient (e.g. remission, death,  a particular condition).
	 */
	public void setOutcome(CodeableConcept value) { outcome = value; }


	@Expose
	private Double probabilityDecimal;

	/**
	 * Getter for probabilityDecimal
	 * @return How likely is the outcome (in the specified timeframe).
	 */
	public Double getProbabilityDecimal() { return probabilityDecimal; }

	/**
	 * Setter for probabilityDecimal
	 * @param value How likely is the outcome (in the specified timeframe).
	 */
	public void setProbabilityDecimal(Double value) { probabilityDecimal = value; }


	@Expose
	private Range probabilityRange;

	/**
	 * Getter for probabilityRange
	 * @return How likely is the outcome (in the specified timeframe).
	 */
	public Range getProbabilityRange() { return probabilityRange; }

	/**
	 * Setter for probabilityRange
	 * @param value How likely is the outcome (in the specified timeframe).
	 */
	public void setProbabilityRange(Range value) { probabilityRange = value; }


	@Expose
	private CodeableConcept qualitativeRisk;

	/**
	 * Getter for qualitativeRisk
	 * @return How likely is the outcome (in the specified timeframe), expressed as a qualitative value (e.g. low, medium, high).
	 */
	public CodeableConcept getQualitativeRisk() { return qualitativeRisk; }

	/**
	 * Setter for qualitativeRisk
	 * @param value How likely is the outcome (in the specified timeframe), expressed as a qualitative value (e.g. low, medium, high).
	 */
	public void setQualitativeRisk(CodeableConcept value) { qualitativeRisk = value; }


	@Expose
	private Double relativeRisk;

	/**
	 * Getter for relativeRisk
	 * @return Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).
	 */
	public Double getRelativeRisk() { return relativeRisk; }

	/**
	 * Setter for relativeRisk
	 * @param value Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).
	 */
	public void setRelativeRisk(Double value) { relativeRisk = value; }


	@Expose
	private Period whenPeriod;

	/**
	 * Getter for whenPeriod
	 * @return Indicates the period of time or age range of the subject to which the specified probability applies.
	 */
	public Period getWhenPeriod() { return whenPeriod; }

	/**
	 * Setter for whenPeriod
	 * @param value Indicates the period of time or age range of the subject to which the specified probability applies.
	 */
	public void setWhenPeriod(Period value) { whenPeriod = value; }


	@Expose
	private Range whenRange;

	/**
	 * Getter for whenRange
	 * @return Indicates the period of time or age range of the subject to which the specified probability applies.
	 */
	public Range getWhenRange() { return whenRange; }

	/**
	 * Setter for whenRange
	 * @param value Indicates the period of time or age range of the subject to which the specified probability applies.
	 */
	public void setWhenRange(Range value) { whenRange = value; }


	@Expose
	private String rationale;

	/**
	 * Getter for rationale
	 * @return Additional information explaining the basis for the prediction.
	 */
	public String getRationale() { return rationale; }

	/**
	 * Setter for rationale
	 * @param value Additional information explaining the basis for the prediction.
	 */
	public void setRationale(String value) { rationale = value; }


}
