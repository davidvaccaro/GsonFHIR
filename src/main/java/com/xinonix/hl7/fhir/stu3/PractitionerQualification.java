package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 */
public class PractitionerQualification extends BackboneElement {
	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return An identifier that applies to this person's qualification in this role.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value An identifier that applies to this person's qualification in this role.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Coded representation of the qualification.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Coded representation of the qualification.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Period during which the qualification is valid.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Period during which the qualification is valid.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private Reference issuer;

	/**
	 * Getter for issuer
	 * @return Organization that regulates and issues the qualification.
	 */
	public Reference getIssuer() { return issuer; }

	/**
	 * Setter for issuer
	 * @param value Organization that regulates and issues the qualification.
	 */
	public void setIssuer(Reference value) { issuer = value; }


}
