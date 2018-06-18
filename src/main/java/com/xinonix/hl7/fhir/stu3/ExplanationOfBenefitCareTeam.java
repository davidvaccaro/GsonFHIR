package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitCareTeam extends BackboneElement {
	@Expose
	private Integer sequence;

	/**
	 * Getter for sequence
	 * @return Sequence of careteam which serves to order and provide a link.
	 */
	public Integer getSequence() { return sequence; }

	/**
	 * Setter for sequence
	 * @param value Sequence of careteam which serves to order and provide a link.
	 */
	public void setSequence(Integer value) { sequence = value; }


	@Expose
	private Reference provider;

	/**
	 * Getter for provider
	 * @return The members of the team who provided the overall service.
	 */
	public Reference getProvider() { return provider; }

	/**
	 * Setter for provider
	 * @param value The members of the team who provided the overall service.
	 */
	public void setProvider(Reference value) { provider = value; }


	@Expose
	private boolean responsible;

	/**
	 * Getter for responsible
	 * @return The practitioner who is billing and responsible for the claimed services rendered to the patient.
	 */
	public boolean getResponsible() { return responsible; }

	/**
	 * Setter for responsible
	 * @param value The practitioner who is billing and responsible for the claimed services rendered to the patient.
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
