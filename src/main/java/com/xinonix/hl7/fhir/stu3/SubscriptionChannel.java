package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
 */
public class SubscriptionChannel extends BackboneElement {
	public enum Type{
		@SerializedName("rest-hook") REST_HOOK,
		@SerializedName("websocket") WEBSOCKET,
		@SerializedName("email") EMAIL,
		@SerializedName("sms") SMS,
		@SerializedName("message") MESSAGE
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of channel to send notifications on.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of channel to send notifications on.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String endpoint;

	/**
	 * Getter for endpoint
	 * @return The uri that describes the actual end-point to send messages to.
	 */
	public String getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value The uri that describes the actual end-point to send messages to.
	 */
	public void setEndpoint(String value) { endpoint = value; }


	@Expose
	private String payload;

	/**
	 * Getter for payload
	 * @return The mime type to send the payload in - either application/fhir+xml, or application/fhir+json. If the payload is not present, then there is no payload in the notification, just a notification.
	 */
	public String getPayload() { return payload; }

	/**
	 * Setter for payload
	 * @param value The mime type to send the payload in - either application/fhir+xml, or application/fhir+json. If the payload is not present, then there is no payload in the notification, just a notification.
	 */
	public void setPayload(String value) { payload = value; }


	@Expose
	private ArrayList<String> header;

	/**
	 * Getter for header
	 * @return Additional headers / information to send as part of the notification.
	 */
	public ArrayList<String> getHeader() { return header; }

	/**
	 * Setter for header
	 * @param value Additional headers / information to send as part of the notification.
	 */
	public void setHeader(ArrayList<String> value) { header = value; }


}
