package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
 */
public class ImmunizationPractitioner extends BackboneElement {
	@Expose
	private CodeableConcept role;

	/**
	 * Getter for role
	 * @return Describes the type of performance (e.g. ordering provider, administering provider, etc.).
	 */
	public CodeableConcept getRole() { return role; }

	/**
	 * Setter for role
	 * @param value Describes the type of performance (e.g. ordering provider, administering provider, etc.).
	 */
	public void setRole(CodeableConcept value) { role = value; }


	@Expose
	private Reference actor;

	/**
	 * Getter for actor
	 * @return The device, practitioner, etc. who performed the action.
	 */
	public Reference getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value The device, practitioner, etc. who performed the action.
	 */
	public void setActor(Reference value) { actor = value; }


}
