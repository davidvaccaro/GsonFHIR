package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 */
public class ImmunizationVaccinationProtocol extends BackboneElement {
	@Expose
	private Integer doseSequence;

	/**
	 * Getter for doseSequence
	 * @return Nominal position in a series.
	 */
	public Integer getDoseSequence() { return doseSequence; }

	/**
	 * Setter for doseSequence
	 * @param value Nominal position in a series.
	 */
	public void setDoseSequence(Integer value) { doseSequence = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Contains the description about the protocol under which the vaccine was administered.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Contains the description about the protocol under which the vaccine was administered.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private Reference authority;

	/**
	 * Getter for authority
	 * @return Indicates the authority who published the protocol.  E.g. ACIP.
	 */
	public Reference getAuthority() { return authority; }

	/**
	 * Setter for authority
	 * @param value Indicates the authority who published the protocol.  E.g. ACIP.
	 */
	public void setAuthority(Reference value) { authority = value; }


	@Expose
	private String series;

	/**
	 * Getter for series
	 * @return One possible path to achieve presumed immunity against a disease - within the context of an authority.
	 */
	public String getSeries() { return series; }

	/**
	 * Setter for series
	 * @param value One possible path to achieve presumed immunity against a disease - within the context of an authority.
	 */
	public void setSeries(String value) { series = value; }


	@Expose
	private Integer seriesDoses;

	/**
	 * Getter for seriesDoses
	 * @return The recommended number of doses to achieve immunity.
	 */
	public Integer getSeriesDoses() { return seriesDoses; }

	/**
	 * Setter for seriesDoses
	 * @param value The recommended number of doses to achieve immunity.
	 */
	public void setSeriesDoses(Integer value) { seriesDoses = value; }


	@Expose
	private ArrayList<CodeableConcept> targetDisease;

	/**
	 * Getter for targetDisease
	 * @return The targeted disease.
	 */
	public ArrayList<CodeableConcept> getTargetDisease() { return targetDisease; }

	/**
	 * Setter for targetDisease
	 * @param value The targeted disease.
	 */
	public void setTargetDisease(ArrayList<CodeableConcept> value) { targetDisease = value; }


	@Expose
	private CodeableConcept doseStatus;

	/**
	 * Getter for doseStatus
	 * @return Indicates if the immunization event should "count" against  the protocol.
	 */
	public CodeableConcept getDoseStatus() { return doseStatus; }

	/**
	 * Setter for doseStatus
	 * @param value Indicates if the immunization event should "count" against  the protocol.
	 */
	public void setDoseStatus(CodeableConcept value) { doseStatus = value; }


	@Expose
	private CodeableConcept doseStatusReason;

	/**
	 * Getter for doseStatusReason
	 * @return Provides an explanation as to why an immunization event should or should not count against the protocol.
	 */
	public CodeableConcept getDoseStatusReason() { return doseStatusReason; }

	/**
	 * Setter for doseStatusReason
	 * @param value Provides an explanation as to why an immunization event should or should not count against the protocol.
	 */
	public void setDoseStatusReason(CodeableConcept value) { doseStatusReason = value; }


}
