package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
public class ContractAgent1 extends BackboneElement {
	@Expose
	private Reference actor;

	/**
	 * Getter for actor
	 * @return The agent assigned a role in this Contract Provision.
	 */
	public Reference getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value The agent assigned a role in this Contract Provision.
	 */
	public void setActor(Reference value) { actor = value; }


	@Expose
	private ArrayList<CodeableConcept> role;

	/**
	 * Getter for role
	 * @return Role played by the agent assigned this role in the execution of this Contract Provision.
	 */
	public ArrayList<CodeableConcept> getRole() { return role; }

	/**
	 * Setter for role
	 * @param value Role played by the agent assigned this role in the execution of this Contract Provision.
	 */
	public void setRole(ArrayList<CodeableConcept> value) { role = value; }


}
