package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
 */
public class ActivityDefinitionParticipant extends BackboneElement {
	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return The type of participant in the action.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of participant in the action.
	 */
	public void setType(String value) { type = value; }


	@Expose
	private CodeableConcept role;

	/**
	 * Getter for role
	 * @return The role the participant should play in performing the described action.
	 */
	public CodeableConcept getRole() { return role; }

	/**
	 * Setter for role
	 * @param value The role the participant should play in performing the described action.
	 */
	public void setRole(CodeableConcept value) { role = value; }


}
