package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementSecurity extends BackboneElement {
	@Expose
	private boolean cors;

	/**
	 * Getter for cors
	 * @return Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
	 */
	public boolean getCors() { return cors; }

	/**
	 * Setter for cors
	 * @param value Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
	 */
	public void setCors(boolean value) { cors = value; }


	@Expose
	private ArrayList<CodeableConcept> service;

	/**
	 * Getter for service
	 * @return Types of security services that are supported/required by the system.
	 */
	public ArrayList<CodeableConcept> getService() { return service; }

	/**
	 * Setter for service
	 * @param value Types of security services that are supported/required by the system.
	 */
	public void setService(ArrayList<CodeableConcept> value) { service = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return General description of how security works.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value General description of how security works.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<CapabilityStatementCertificate> certificate;

	/**
	 * Getter for certificate
	 * @return Certificates associated with security profiles.
	 */
	public ArrayList<CapabilityStatementCertificate> getCertificate() { return certificate; }

	/**
	 * Setter for certificate
	 * @param value Certificates associated with security profiles.
	 */
	public void setCertificate(ArrayList<CapabilityStatementCertificate> value) { certificate = value; }


}
