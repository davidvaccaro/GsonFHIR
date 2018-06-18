package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 */
public class ConditionStage extends BackboneElement {
	@Expose
	private CodeableConcept summary;

	/**
	 * Getter for summary
	 * @return A simple summary of the stage such as "Stage 3". The determination of the stage is disease-specific.
	 */
	public CodeableConcept getSummary() { return summary; }

	/**
	 * Setter for summary
	 * @param value A simple summary of the stage such as "Stage 3". The determination of the stage is disease-specific.
	 */
	public void setSummary(CodeableConcept value) { summary = value; }


	@Expose
	private ArrayList<Reference> assessment;

	/**
	 * Getter for assessment
	 * @return Reference to a formal record of the evidence on which the staging assessment is based.
	 */
	public ArrayList<Reference> getAssessment() { return assessment; }

	/**
	 * Setter for assessment
	 * @param value Reference to a formal record of the evidence on which the staging assessment is based.
	 */
	public void setAssessment(ArrayList<Reference> value) { assessment = value; }


}
