package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
public class ContractAgent extends BackboneElement {
	@Expose
	private Reference actor;

	/**
	 * Getter for actor
	 * @return Who or what parties are assigned roles in this Contract.
	 */
	public Reference getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value Who or what parties are assigned roles in this Contract.
	 */
	public void setActor(Reference value) { actor = value; }


	@Expose
	private ArrayList<CodeableConcept> role;

	/**
	 * Getter for role
	 * @return Role type of agent assigned roles in this Contract.
	 */
	public ArrayList<CodeableConcept> getRole() { return role; }

	/**
	 * Setter for role
	 * @param value Role type of agent assigned roles in this Contract.
	 */
	public void setRole(ArrayList<CodeableConcept> value) { role = value; }


}
