package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 */
public class ImmunizationReaction extends BackboneElement {
	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return Date of reaction to the immunization.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value Date of reaction to the immunization.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private Reference detail;

	/**
	 * Getter for detail
	 * @return Details of the reaction.
	 */
	public Reference getDetail() { return detail; }

	/**
	 * Setter for detail
	 * @param value Details of the reaction.
	 */
	public void setDetail(Reference value) { detail = value; }


	@Expose
	private boolean reported;

	/**
	 * Getter for reported
	 * @return Self-reported indicator.
	 */
	public boolean getReported() { return reported; }

	/**
	 * Setter for reported
	 * @param value Self-reported indicator.
	 */
	public void setReported(boolean value) { reported = value; }


}
