package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
 */
public class CareTeamParticipant extends BackboneElement {
	@Expose
	private CodeableConcept role;

	/**
	 * Getter for role
	 * @return Indicates specific responsibility of an individual within the care team, such as "Primary care physician", "Trained social worker counselor", "Caregiver", etc.
	 */
	public CodeableConcept getRole() { return role; }

	/**
	 * Setter for role
	 * @param value Indicates specific responsibility of an individual within the care team, such as "Primary care physician", "Trained social worker counselor", "Caregiver", etc.
	 */
	public void setRole(CodeableConcept value) { role = value; }


	@Expose
	private Reference member;

	/**
	 * Getter for member
	 * @return The specific person or organization who is participating/expected to participate in the care team.
	 */
	public Reference getMember() { return member; }

	/**
	 * Setter for member
	 * @param value The specific person or organization who is participating/expected to participate in the care team.
	 */
	public void setMember(Reference value) { member = value; }


	@Expose
	private Reference onBehalfOf;

	/**
	 * Getter for onBehalfOf
	 * @return The organization of the practitioner.
	 */
	public Reference getOnBehalfOf() { return onBehalfOf; }

	/**
	 * Setter for onBehalfOf
	 * @param value The organization of the practitioner.
	 */
	public void setOnBehalfOf(Reference value) { onBehalfOf = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Indicates when the specific member or organization did (or is intended to) come into effect and end.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Indicates when the specific member or organization did (or is intended to) come into effect and end.
	 */
	public void setPeriod(Period value) { period = value; }


}
