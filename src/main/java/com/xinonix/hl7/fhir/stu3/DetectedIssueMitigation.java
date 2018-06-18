package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
 */
public class DetectedIssueMitigation extends BackboneElement {
	@Expose
	private CodeableConcept action;

	/**
	 * Getter for action
	 * @return Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with the identified issue.
	 */
	public CodeableConcept getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with the identified issue.
	 */
	public void setAction(CodeableConcept value) { action = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return Indicates when the mitigating action was documented.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value Indicates when the mitigating action was documented.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private Reference author;

	/**
	 * Getter for author
	 * @return Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.
	 */
	public Reference getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.
	 */
	public void setAuthor(Reference value) { author = value; }


}
