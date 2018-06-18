package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitProcedure extends BackboneElement {
	@Expose
	private Integer sequence;

	/**
	 * Getter for sequence
	 * @return Sequence of procedures which serves to order and provide a link.
	 */
	public Integer getSequence() { return sequence; }

	/**
	 * Setter for sequence
	 * @param value Sequence of procedures which serves to order and provide a link.
	 */
	public void setSequence(Integer value) { sequence = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return Date and optionally time the procedure was performed .
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value Date and optionally time the procedure was performed .
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private CodeableConcept procedureCodeableConcept;

	/**
	 * Getter for procedureCodeableConcept
	 * @return The procedure code.
	 */
	public CodeableConcept getProcedureCodeableConcept() { return procedureCodeableConcept; }

	/**
	 * Setter for procedureCodeableConcept
	 * @param value The procedure code.
	 */
	public void setProcedureCodeableConcept(CodeableConcept value) { procedureCodeableConcept = value; }


	@Expose
	private Reference procedureReference;

	/**
	 * Getter for procedureReference
	 * @return The procedure code.
	 */
	public Reference getProcedureReference() { return procedureReference; }

	/**
	 * Setter for procedureReference
	 * @param value The procedure code.
	 */
	public void setProcedureReference(Reference value) { procedureReference = value; }


}
