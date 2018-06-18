package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 */
public class EpisodeOfCareDiagnosis extends BackboneElement {
	@Expose
	private Reference condition;

	/**
	 * Getter for condition
	 * @return A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.
	 */
	public Reference getCondition() { return condition; }

	/**
	 * Setter for condition
	 * @param value A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.
	 */
	public void setCondition(Reference value) { condition = value; }


	@Expose
	private CodeableConcept role;

	/**
	 * Getter for role
	 * @return Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …).
	 */
	public CodeableConcept getRole() { return role; }

	/**
	 * Setter for role
	 * @param value Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …).
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
