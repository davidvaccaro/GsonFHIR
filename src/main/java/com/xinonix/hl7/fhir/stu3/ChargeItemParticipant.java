package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
 */
public class ChargeItemParticipant extends BackboneElement {
	@Expose
	private CodeableConcept role;

	/**
	 * Getter for role
	 * @return Describes the type of performance or participation(e.g. primary surgeon, anaesthesiologiest, etc.).
	 */
	public CodeableConcept getRole() { return role; }

	/**
	 * Setter for role
	 * @param value Describes the type of performance or participation(e.g. primary surgeon, anaesthesiologiest, etc.).
	 */
	public void setRole(CodeableConcept value) { role = value; }


	@Expose
	private Reference actor;

	/**
	 * Getter for actor
	 * @return The device, practitioner, etc. who performed or participated in the service.
	 */
	public Reference getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value The device, practitioner, etc. who performed or participated in the service.
	 */
	public void setActor(Reference value) { actor = value; }


}
