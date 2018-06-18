package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 */
public class MessageHeaderResponse extends BackboneElement {
	@Expose
	private String identifier;

	/**
	 * Getter for identifier
	 * @return The MessageHeader.id of the message to which this message is a response.
	 */
	public String getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The MessageHeader.id of the message to which this message is a response.
	 */
	public void setIdentifier(String value) { identifier = value; }


	public enum Code{
		@SerializedName("ok") OK,
		@SerializedName("transient-error") TRANSIENT_ERROR,
		@SerializedName("fatal-error") FATAL_ERROR
	}

	@Expose
	private Code code;

	/**
	 * Getter for code
	 * @return Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not.
	 */
	public Code getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not.
	 */
	public void setCode(Code value) { code = value; }


	@Expose
	private Reference details;

	/**
	 * Getter for details
	 * @return Full details of any issues found in the message.
	 */
	public Reference getDetails() { return details; }

	/**
	 * Setter for details
	 * @param value Full details of any issues found in the message.
	 */
	public void setDetails(Reference value) { details = value; }


}
