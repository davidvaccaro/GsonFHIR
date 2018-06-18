package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 */
public class AuditEventDetail extends BackboneElement {
	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return The type of extra detail provided in the value.
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of extra detail provided in the value.
	 */
	public void setType(String value) { type = value; }


	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return The details, base64 encoded. Used to carry bulk information.
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The details, base64 encoded. Used to carry bulk information.
	 */
	public void setValue(String value) { value = value; }


}
