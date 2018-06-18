package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 */
public class ClinicalImpressionInvestigation extends BackboneElement {
	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return A name/code for the group ("set") of investigations. Typically, this will be something like "signs", "symptoms", "clinical", "diagnostic", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A name/code for the group ("set") of investigations. Typically, this will be something like "signs", "symptoms", "clinical", "diagnostic", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private ArrayList<Reference> item;

	/**
	 * Getter for item
	 * @return A record of a specific investigation that was undertaken.
	 */
	public ArrayList<Reference> getItem() { return item; }

	/**
	 * Setter for item
	 * @param value A record of a specific investigation that was undertaken.
	 */
	public void setItem(ArrayList<Reference> value) { item = value; }


}
