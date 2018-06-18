package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
public class EncounterDiagnosis extends BackboneElement {
	@Expose
	private Reference condition;

	/**
	 * Getter for condition
	 * @return Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
	 */
	public Reference getCondition() { return condition; }

	/**
	 * Setter for condition
	 * @param value Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
	 */
	public void setCondition(Reference value) { condition = value; }


	@Expose
	private CodeableConcept role;

	/**
	 * Getter for role
	 * @return Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …).
	 */
	public CodeableConcept getRole() { return role; }

	/**
	 * Setter for role
	 * @param value Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …).
	 */
	public void setRole(CodeableConcept value) { role = value; }


	@Expose
	private Integer rank;

	/**
	 * Getter for rank
	 * @return Ranking of the diagnosis (for each role type).
	 */
	public Integer getRank() { return rank; }

	/**
	 * Setter for rank
	 * @param value Ranking of the diagnosis (for each role type).
	 */
	public void setRank(Integer value) { rank = value; }


}
