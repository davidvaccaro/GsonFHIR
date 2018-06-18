package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
public class ClaimAccident extends BackboneElement {
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
	 * @return Accident Place.
	 */
	public Address getLocationAddress() { return locationAddress; }

	/**
	 * Setter for locationAddress
	 * @param value Accident Place.
	 */
	public void setLocationAddress(Address value) { locationAddress = value; }


	@Expose
	private Reference locationReference;

	/**
	 * Getter for locationReference
	 * @return Accident Place.
	 */
	public Reference getLocationReference() { return locationReference; }

	/**
	 * Setter for locationReference
	 * @param value Accident Place.
	 */
	public void setLocationReference(Reference value) { locationReference = value; }


}
