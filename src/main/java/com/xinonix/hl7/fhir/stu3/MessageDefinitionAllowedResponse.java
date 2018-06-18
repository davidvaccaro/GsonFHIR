package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
 */
public class MessageDefinitionAllowedResponse extends BackboneElement {
	@Expose
	private Reference message;

	/**
	 * Getter for message
	 * @return A reference to the message definition that must be adhered to by this supported response.
	 */
	public Reference getMessage() { return message; }

	/**
	 * Setter for message
	 * @param value A reference to the message definition that must be adhered to by this supported response.
	 */
	public void setMessage(Reference value) { message = value; }


	@Expose
	private String situation;

	/**
	 * Getter for situation
	 * @return Provides a description of the circumstances in which this response should be used (as opposed to one of the alternative responses).
	 */
	public String getSituation() { return situation; }

	/**
	 * Setter for situation
	 * @param value Provides a description of the circumstances in which this response should be used (as opposed to one of the alternative responses).
	 */
	public void setSituation(String value) { situation = value; }


}
