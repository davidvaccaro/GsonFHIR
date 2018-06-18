package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
public class ClaimDiagnosis extends BackboneElement {
	@Expose
	private Integer sequence;

	/**
	 * Getter for sequence
	 * @return Sequence of diagnosis which serves to provide a link.
	 */
	public Integer getSequence() { return sequence; }

	/**
	 * Setter for sequence
	 * @param value Sequence of diagnosis which serves to provide a link.
	 */
	public void setSequence(Integer value) { sequence = value; }


	@Expose
	private CodeableConcept diagnosisCodeableConcept;

	/**
	 * Getter for diagnosisCodeableConcept
	 * @return The diagnosis.
	 */
	public CodeableConcept getDiagnosisCodeableConcept() { return diagnosisCodeableConcept; }

	/**
	 * Setter for diagnosisCodeableConcept
	 * @param value The diagnosis.
	 */
	public void setDiagnosisCodeableConcept(CodeableConcept value) { diagnosisCodeableConcept = value; }


	@Expose
	private Reference diagnosisReference;

	/**
	 * Getter for diagnosisReference
	 * @return The diagnosis.
	 */
	public Reference getDiagnosisReference() { return diagnosisReference; }

	/**
	 * Setter for diagnosisReference
	 * @param value The diagnosis.
	 */
	public void setDiagnosisReference(Reference value) { diagnosisReference = value; }


	@Expose
	private ArrayList<CodeableConcept> type;

	/**
	 * Getter for type
	 * @return The type of the Diagnosis, for example: admitting, primary, secondary, discharge.
	 */
	public ArrayList<CodeableConcept> getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of the Diagnosis, for example: admitting, primary, secondary, discharge.
	 */
	public void setType(ArrayList<CodeableConcept> value) { type = value; }


	@Expose
	private CodeableConcept packageCode;

	/**
	 * Getter for packageCode
	 * @return The package billing code, for example DRG, based on the assigned grouping code system.
	 */
	public CodeableConcept getPackageCode() { return packageCode; }

	/**
	 * Setter for packageCode
	 * @param value The package billing code, for example DRG, based on the assigned grouping code system.
	 */
	public void setPackageCode(CodeableConcept value) { packageCode = value; }


}
