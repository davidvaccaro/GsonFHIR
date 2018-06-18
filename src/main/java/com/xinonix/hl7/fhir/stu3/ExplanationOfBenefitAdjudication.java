package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitAdjudication extends BackboneElement {
	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Code indicating: Co-Pay, deductable, elegible, benefit, tax, etc.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Code indicating: Co-Pay, deductable, elegible, benefit, tax, etc.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept reason;

	/**
	 * Getter for reason
	 * @return Adjudication reason such as limit reached.
	 */
	public CodeableConcept getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value Adjudication reason such as limit reached.
	 */
	public void setReason(CodeableConcept value) { reason = value; }


	@Expose
	private Money amount;

	/**
	 * Getter for amount
	 * @return Monitory amount associated with the code.
	 */
	public Money getAmount() { return amount; }

	/**
	 * Setter for amount
	 * @param value Monitory amount associated with the code.
	 */
	public void setAmount(Money value) { amount = value; }


	@Expose
	private Double value;

	/**
	 * Getter for value
	 * @return A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
	 */
	public Double getValue() { return value; }

	/**
	 * Setter for value
	 * @param value A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
	 */
	public void setValue(Double value) { value = value; }


}
