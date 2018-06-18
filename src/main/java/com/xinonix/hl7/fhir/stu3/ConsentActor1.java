package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 */
public class ConsentActor1 extends BackboneElement {
	@Expose
	private CodeableConcept role;

	/**
	 * Getter for role
	 * @return How the individual is involved in the resources content that is described in the exception.
	 */
	public CodeableConcept getRole() { return role; }

	/**
	 * Setter for role
	 * @param value How the individual is involved in the resources content that is described in the exception.
	 */
	public void setRole(CodeableConcept value) { role = value; }


	@Expose
	private Reference reference;

	/**
	 * Getter for reference
	 * @return The resource that identifies the actor. To identify a actors by type, use group to identify a set of actors by some property they share (e.g. 'admitting officers').
	 */
	public Reference getReference() { return reference; }

	/**
	 * Setter for reference
	 * @param value The resource that identifies the actor. To identify a actors by type, use group to identify a set of actors by some property they share (e.g. 'admitting officers').
	 */
	public void setReference(Reference value) { reference = value; }


}
