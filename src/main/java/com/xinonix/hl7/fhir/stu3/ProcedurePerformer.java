package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.
 */
public class ProcedurePerformer extends BackboneElement {
	@Expose
	private CodeableConcept role;

	/**
	 * Getter for role
	 * @return For example: surgeon, anaethetist, endoscopist.
	 */
	public CodeableConcept getRole() { return role; }

	/**
	 * Setter for role
	 * @param value For example: surgeon, anaethetist, endoscopist.
	 */
	public void setRole(CodeableConcept value) { role = value; }


	@Expose
	private Reference actor;

	/**
	 * Getter for actor
	 * @return The practitioner who was involved in the procedure.
	 */
	public Reference getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value The practitioner who was involved in the procedure.
	 */
	public void setActor(Reference value) { actor = value; }


	@Expose
	private Reference onBehalfOf;

	/**
	 * Getter for onBehalfOf
	 * @return The organization the device or practitioner was acting on behalf of.
	 */
	public Reference getOnBehalfOf() { return onBehalfOf; }

	/**
	 * Setter for onBehalfOf
	 * @param value The organization the device or practitioner was acting on behalf of.
	 */
	public void setOnBehalfOf(Reference value) { onBehalfOf = value; }


}
