package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementEndpoint extends BackboneElement {
	@Expose
	private Coding protocol;

	/**
	 * Getter for protocol
	 * @return A list of the messaging transport protocol(s) identifiers, supported by this endpoint.
	 */
	public Coding getProtocol() { return protocol; }

	/**
	 * Setter for protocol
	 * @param value A list of the messaging transport protocol(s) identifiers, supported by this endpoint.
	 */
	public void setProtocol(Coding value) { protocol = value; }


	@Expose
	private String address;

	/**
	 * Getter for address
	 * @return The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.
	 */
	public String getAddress() { return address; }

	/**
	 * Setter for address
	 * @param value The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.
	 */
	public void setAddress(String value) { address = value; }


}
