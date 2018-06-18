package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementEvent extends BackboneElement {
	@Expose
	private Coding code;

	/**
	 * Getter for code
	 * @return A coded identifier of a supported messaging event.
	 */
	public Coding getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A coded identifier of a supported messaging event.
	 */
	public void setCode(Coding value) { code = value; }


	public enum Category{
		@SerializedName("Consequence") CONSEQUENCE,
		@SerializedName("Currency") CURRENCY,
		@SerializedName("Notification") NOTIFICATION
	}

	@Expose
	private Category category;

	/**
	 * Getter for category
	 * @return The impact of the content of the message.
	 */
	public Category getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value The impact of the content of the message.
	 */
	public void setCategory(Category value) { category = value; }


	public enum Mode{
		@SerializedName("sender") SENDER,
		@SerializedName("receiver") RECEIVER
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return The mode of this event declaration - whether an application is a sender or receiver.
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value The mode of this event declaration - whether an application is a sender or receiver.
	 */
	public void setMode(Mode value) { mode = value; }


	@Expose
	private String focus;

	/**
	 * Getter for focus
	 * @return A resource associated with the event.  This is the resource that defines the event.
	 */
	public String getFocus() { return focus; }

	/**
	 * Setter for focus
	 * @param value A resource associated with the event.  This is the resource that defines the event.
	 */
	public void setFocus(String value) { focus = value; }


	@Expose
	private Reference request;

	/**
	 * Getter for request
	 * @return Information about the request for this event.
	 */
	public Reference getRequest() { return request; }

	/**
	 * Setter for request
	 * @param value Information about the request for this event.
	 */
	public void setRequest(Reference value) { request = value; }


	@Expose
	private Reference response;

	/**
	 * Getter for response
	 * @return Information about the response for this event.
	 */
	public Reference getResponse() { return response; }

	/**
	 * Setter for response
	 * @param value Information about the response for this event.
	 */
	public void setResponse(Reference value) { response = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
	 */
	public void setDocumentation(String value) { documentation = value; }


}
