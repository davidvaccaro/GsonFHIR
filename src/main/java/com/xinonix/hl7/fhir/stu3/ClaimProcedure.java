package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
public class ClaimProcedure extends BackboneElement {
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
