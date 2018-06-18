package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
 */
public class Subscription extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Subscription resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Subscription resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	public enum Status{
		@SerializedName("requested") REQUESTED,
		@SerializedName("active") ACTIVE,
		@SerializedName("error") ERROR,
		@SerializedName("off") OFF
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The status of the subscription, which marks the server state for managing the subscription.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the subscription, which marks the server state for managing the subscription.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private ArrayList<ContactPoint> contact;

	/**
	 * Getter for contact
	 * @return Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
	 */
	public ArrayList<ContactPoint> getContact() { return contact; }

	/**
	 * Setter for contact
	 * @param value Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.
	 */
	public void setContact(ArrayList<ContactPoint> value) { contact = value; }


	@Expose
	private String end;

	/**
	 * Getter for end
	 * @return The time for the server to turn the subscription off.
	 */
	public String getEnd() { return end; }

	/**
	 * Setter for end
	 * @param value The time for the server to turn the subscription off.
	 */
	public void setEnd(String value) { end = value; }


	@Expose
	private String reason;

	/**
	 * Getter for reason
	 * @return A description of why this subscription is defined.
	 */
	public String getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value A description of why this subscription is defined.
	 */
	public void setReason(String value) { reason = value; }


	@Expose
	private String criteria;

	/**
	 * Getter for criteria
	 * @return The rules that the server should use to determine when to generate notifications for this subscription.
	 */
	public String getCriteria() { return criteria; }

	/**
	 * Setter for criteria
	 * @param value The rules that the server should use to determine when to generate notifications for this subscription.
	 */
	public void setCriteria(String value) { criteria = value; }


	@Expose
	private String error;

	/**
	 * Getter for error
	 * @return A record of the last error that occurred when the server processed a notification.
	 */
	public String getError() { return error; }

	/**
	 * Setter for error
	 * @param value A record of the last error that occurred when the server processed a notification.
	 */
	public void setError(String value) { error = value; }


	@Expose
	private SubscriptionChannel channel;

	/**
	 * Getter for channel
	 * @return Details where to send notifications when resources are received that meet the criteria.
	 */
	public SubscriptionChannel getChannel() { return channel; }

	/**
	 * Setter for channel
	 * @param value Details where to send notifications when resources are received that meet the criteria.
	 */
	public void setChannel(SubscriptionChannel value) { channel = value; }


	@Expose
	private ArrayList<Coding> tag;

	/**
	 * Getter for tag
	 * @return A tag to add to any resource that matches the criteria, after the subscription is processed.
	 */
	public ArrayList<Coding> getTag() { return tag; }

	/**
	 * Setter for tag
	 * @param value A tag to add to any resource that matches the criteria, after the subscription is processed.
	 */
	public void setTag(ArrayList<Coding> value) { tag = value; }


}
