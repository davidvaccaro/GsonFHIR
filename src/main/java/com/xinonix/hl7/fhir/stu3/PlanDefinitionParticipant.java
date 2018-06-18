package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 */
public class PlanDefinitionParticipant extends BackboneElement {
	public enum Type{
		@SerializedName("patient") PATIENT,
		@SerializedName("practitioner") PRACTITIONER,
		@SerializedName("related-person") RELATED_PERSON
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of participant in the action.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of participant in the action.
	 */
	public void setType(Type value) { type = value; }


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
