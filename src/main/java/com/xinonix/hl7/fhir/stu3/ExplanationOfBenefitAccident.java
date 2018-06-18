package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitAccident extends BackboneElement {
	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date date;

	/**
	 * Getter for date
	 * @return Date of an accident which these services are addressing.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value Date of an accident which these services are addressing.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Type of accident: work, auto, etc.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Type of accident: work, auto, etc.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private Address locationAddress;

	/**
	 * Getter for locationAddress
	 * @return Where the accident occurred.
	 */
	public Address getLocationAddress() { return locationAddress; }

	/**
	 * Setter for locationAddress
	 * @param value Where the accident occurred.
	 */
	public void setLocationAddress(Address value) { locationAddress = value; }


	@Expose
	private Reference locationReference;

	/**
	 * Getter for locationReference
	 * @return Where the accident occurred.
	 */
	public Reference getLocationReference() { return locationReference; }

	/**
	 * Setter for locationReference
	 * @param value Where the accident occurred.
	 */
	public void setLocationReference(Reference value) { locationReference = value; }


}
