package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatementMessaging extends BackboneElement {
	@Expose
	private ArrayList<CapabilityStatementEndpoint> endpoint;

	/**
	 * Getter for endpoint
	 * @return An endpoint (network accessible address) to which messages and/or replies are to be sent.
	 */
	public ArrayList<CapabilityStatementEndpoint> getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value An endpoint (network accessible address) to which messages and/or replies are to be sent.
	 */
	public void setEndpoint(ArrayList<CapabilityStatementEndpoint> value) { endpoint = value; }


	@Expose
	private Integer reliableCache;

	/**
	 * Getter for reliableCache
	 * @return Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).
	 */
	public Integer getReliableCache() { return reliableCache; }

	/**
	 * Setter for reliableCache
	 * @param value Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender).
	 */
	public void setReliableCache(Integer value) { reliableCache = value; }


	@Expose
	private String documentation;

	/**
	 * Getter for documentation
	 * @return Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the capability statement.  For example, the process for becoming an authorized messaging exchange partner.
	 */
	public String getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the capability statement.  For example, the process for becoming an authorized messaging exchange partner.
	 */
	public void setDocumentation(String value) { documentation = value; }


	@Expose
	private ArrayList<CapabilityStatementSupportedMessage> supportedMessage;

	/**
	 * Getter for supportedMessage
	 * @return References to message definitions for messages this system can send or receive.
	 */
	public ArrayList<CapabilityStatementSupportedMessage> getSupportedMessage() { return supportedMessage; }

	/**
	 * Setter for supportedMessage
	 * @param value References to message definitions for messages this system can send or receive.
	 */
	public void setSupportedMessage(ArrayList<CapabilityStatementSupportedMessage> value) { supportedMessage = value; }


	@Expose
	private ArrayList<CapabilityStatementEvent> event;

	/**
	 * Getter for event
	 * @return A description of the solution's support for an event at this end-point.
	 */
	public ArrayList<CapabilityStatementEvent> getEvent() { return event; }

	/**
	 * Setter for event
	 * @param value A description of the solution's support for an event at this end-point.
	 */
	public void setEvent(ArrayList<CapabilityStatementEvent> value) { event = value; }


}
