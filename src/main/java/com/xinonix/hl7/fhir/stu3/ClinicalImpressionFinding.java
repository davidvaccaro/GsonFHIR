package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 */
public class ClinicalImpressionFinding extends BackboneElement {
	@Expose
	private CodeableConcept itemCodeableConcept;

	/**
	 * Getter for itemCodeableConcept
	 * @return Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions.
	 */
	public CodeableConcept getItemCodeableConcept() { return itemCodeableConcept; }

	/**
	 * Setter for itemCodeableConcept
	 * @param value Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions.
	 */
	public void setItemCodeableConcept(CodeableConcept value) { itemCodeableConcept = value; }


	@Expose
	private Reference itemReference;

	/**
	 * Getter for itemReference
	 * @return Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions.
	 */
	public Reference getItemReference() { return itemReference; }

	/**
	 * Setter for itemReference
	 * @param value Specific text, code or reference for finding or diagnosis, which may include ruled-out or resolved conditions.
	 */
	public void setItemReference(Reference value) { itemReference = value; }


	@Expose
	private String basis;

	/**
	 * Getter for basis
	 * @return Which investigations support finding or diagnosis.
	 */
	public String getBasis() { return basis; }

	/**
	 * Setter for basis
	 * @param value Which investigations support finding or diagnosis.
	 */
	public void setBasis(String value) { basis = value; }


}
