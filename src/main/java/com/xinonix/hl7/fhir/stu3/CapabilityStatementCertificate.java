package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementCertificate extends BackboneElement {
	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return Mime type for a certificate.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value Mime type for a certificate.
	 */
	public void setType(String value) { type = value; }


	@Expose
	private String blob;

	/**
	 * Getter for blob
	 * @return Actual certificate.
	 */
	public String getBlob() { return blob; }

	/**
	 * Setter for blob
	 * @param value Actual certificate.
	 */
	public void setBlob(String value) { blob = value; }


}
