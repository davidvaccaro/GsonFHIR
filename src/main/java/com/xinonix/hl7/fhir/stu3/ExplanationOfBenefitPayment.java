package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitPayment extends BackboneElement {
	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Whether this represents partial or complete payment of the claim.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Whether this represents partial or complete payment of the claim.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private Money adjustment;

	/**
	 * Getter for adjustment
	 * @return Adjustment to the payment of this transaction which is not related to adjudication of this transaction.
	 */
	public Money getAdjustment() { return adjustment; }

	/**
	 * Setter for adjustment
	 * @param value Adjustment to the payment of this transaction which is not related to adjudication of this transaction.
	 */
	public void setAdjustment(Money value) { adjustment = value; }


	@Expose
	private CodeableConcept adjustmentReason;

	/**
	 * Getter for adjustmentReason
	 * @return Reason for the payment adjustment.
	 */
	public CodeableConcept getAdjustmentReason() { return adjustmentReason; }

	/**
	 * Setter for adjustmentReason
	 * @param value Reason for the payment adjustment.
	 */
	public void setAdjustmentReason(CodeableConcept value) { adjustmentReason = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date date;

	/**
	 * Getter for date
	 * @return Estimated payment date.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value Estimated payment date.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private Money amount;

	/**
	 * Getter for amount
	 * @return Payable less any payment adjustment.
	 */
	public Money getAmount() { return amount; }

	/**
	 * Setter for amount
	 * @param value Payable less any payment adjustment.
	 */
	public void setAmount(Money value) { amount = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Payment identifer.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Payment identifer.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


}
