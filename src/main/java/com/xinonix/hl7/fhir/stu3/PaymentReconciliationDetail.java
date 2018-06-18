package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * This resource provides payment details and claim references supporting a bulk payment.
 */
public class PaymentReconciliationDetail extends BackboneElement {
	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Code to indicate the nature of the payment, adjustment, funds advance, etc.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Code to indicate the nature of the payment, adjustment, funds advance, etc.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private Reference request;

	/**
	 * Getter for request
	 * @return The claim or financial resource.
	 */
	public Reference getRequest() { return request; }

	/**
	 * Setter for request
	 * @param value The claim or financial resource.
	 */
	public void setRequest(Reference value) { request = value; }


	@Expose
	private Reference response;

	/**
	 * Getter for response
	 * @return The claim response resource.
	 */
	public Reference getResponse() { return response; }

	/**
	 * Setter for response
	 * @param value The claim response resource.
	 */
	public void setResponse(Reference value) { response = value; }


	@Expose
	private Reference submitter;

	/**
	 * Getter for submitter
	 * @return The Organization which submitted the claim or financial transaction.
	 */
	public Reference getSubmitter() { return submitter; }

	/**
	 * Setter for submitter
	 * @param value The Organization which submitted the claim or financial transaction.
	 */
	public void setSubmitter(Reference value) { submitter = value; }


	@Expose
	private Reference payee;

	/**
	 * Getter for payee
	 * @return The organization which is receiving the payment.
	 */
	public Reference getPayee() { return payee; }

	/**
	 * Setter for payee
	 * @param value The organization which is receiving the payment.
	 */
	public void setPayee(Reference value) { payee = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date of the invoice or financial resource.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date of the invoice or financial resource.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private Money amount;

	/**
	 * Getter for amount
	 * @return Amount paid for this detail.
	 */
	public Money getAmount() { return amount; }

	/**
	 * Setter for amount
	 * @param value Amount paid for this detail.
	 */
	public void setAmount(Money value) { amount = value; }


}
