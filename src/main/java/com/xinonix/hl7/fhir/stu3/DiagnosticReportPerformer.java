package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 */
public class DiagnosticReportPerformer extends BackboneElement {
	@Expose
	private CodeableConcept role;

	/**
	 * Getter for role
	 * @return Describes the type of participation (e.g.  a responsible party, author, or verifier).
	 */
	public CodeableConcept getRole() { return role; }

	/**
	 * Setter for role
	 * @param value Describes the type of participation (e.g.  a responsible party, author, or verifier).
	 */
	public void setRole(CodeableConcept value) { role = value; }


	@Expose
	private Reference actor;

	/**
	 * Getter for actor
	 * @return The reference to the  practitioner or organization involved in producing the report. For example, the diagnostic service that is responsible for issuing the report.
	 */
	public Reference getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value The reference to the  practitioner or organization involved in producing the report. For example, the diagnostic service that is responsible for issuing the report.
	 */
	public void setActor(Reference value) { actor = value; }


}
