package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
public class ClaimCareTeam extends BackboneElement {
	@Expose
	private Integer sequence;

	/**
	 * Getter for sequence
	 * @return Sequence of the careTeam which serves to order and provide a link.
	 */
	public Integer getSequence() { return sequence; }

	/**
	 * Setter for sequence
	 * @param value Sequence of the careTeam which serves to order and provide a link.
	 */
	public void setSequence(Integer value) { sequence = value; }


	@Expose
	private Reference provider;

	/**
	 * Getter for provider
	 * @return Member of the team who provided the overall service.
	 */
	public Reference getProvider() { return provider; }

	/**
	 * Setter for provider
	 * @param value Member of the team who provided the overall service.
	 */
	public void setProvider(Reference value) { provider = value; }


	@Expose
	private boolean responsible;

	/**
	 * Getter for responsible
	 * @return The party who is billing and responsible for the claimed good or service rendered to the patient.
	 */
	public boolean getResponsible() { return responsible; }

	/**
	 * Setter for responsible
	 * @param value The party who is billing and responsible for the claimed good or service rendered to the patient.
	 */
	public void setResponsible(boolean value) { responsible = value; }


	@Expose
	private CodeableConcept role;

	/**
	 * Getter for role
	 * @return The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team.
	 */
	public CodeableConcept getRole() { return role; }

	/**
	 * Setter for role
	 * @param value The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team.
	 */
	public void setRole(CodeableConcept value) { role = value; }


	@Expose
	private CodeableConcept qualification;

	/**
	 * Getter for qualification
	 * @return The qualification which is applicable for this service.
	 */
	public CodeableConcept getQualification() { return qualification; }

	/**
	 * Setter for qualification
	 * @param value The qualification which is applicable for this service.
	 */
	public void setQualification(CodeableConcept value) { qualification = value; }


}
