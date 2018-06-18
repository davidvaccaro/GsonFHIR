package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 */
public class ConditionEvidence extends BackboneElement {
	@Expose
	private ArrayList<CodeableConcept> code;

	/**
	 * Getter for code
	 * @return A manifestation or symptom that led to the recording of this condition.
	 */
	public ArrayList<CodeableConcept> getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A manifestation or symptom that led to the recording of this condition.
	 */
	public void setCode(ArrayList<CodeableConcept> value) { code = value; }


	@Expose
	private ArrayList<Reference> detail;

	/**
	 * Getter for detail
	 * @return Links to other relevant information, including pathology reports.
	 */
	public ArrayList<Reference> getDetail() { return detail; }

	/**
	 * Setter for detail
	 * @param value Links to other relevant information, including pathology reports.
	 */
	public void setDetail(ArrayList<Reference> value) { detail = value; }


}
