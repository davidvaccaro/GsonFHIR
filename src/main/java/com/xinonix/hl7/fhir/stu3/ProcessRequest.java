package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
 */
public class ProcessRequest extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ProcessRequest resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ProcessRequest resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return The ProcessRequest business identifier.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The ProcessRequest business identifier.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The status of the resource instance.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the resource instance.
	 */
	public void setStatus(String value) { status = value; }


	public enum Action{
		@SerializedName("cancel") CANCEL,
		@SerializedName("poll") POLL,
		@SerializedName("reprocess") REPROCESS,
		@SerializedName("status") STATUS
	}

	@Expose
	private Action action;

	/**
	 * Getter for action
	 * @return The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest.
	 */
	public Action getAction() { return action; }

	/**
	 * Setter for action
	 * @param value The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest.
	 */
	public void setAction(Action value) { action = value; }


	@Expose
	private Reference target;

	/**
	 * Getter for target
	 * @return The organization which is the target of the request.
	 */
	public Reference getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value The organization which is the target of the request.
	 */
	public void setTarget(Reference value) { target = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date created;

	/**
	 * Getter for created
	 * @return The date when this resource was created.
	 */
	public Date getCreated() { return created; }

	/**
	 * Setter for created
	 * @param value The date when this resource was created.
	 */
	public void setCreated(Date value) { created = value; }


	@Expose
	private Reference provider;

	/**
	 * Getter for provider
	 * @return The practitioner who is responsible for the action specified in this request.
	 */
	public Reference getProvider() { return provider; }

	/**
	 * Setter for provider
	 * @param value The practitioner who is responsible for the action specified in this request.
	 */
	public void setProvider(Reference value) { provider = value; }


	@Expose
	private Reference organization;

	/**
	 * Getter for organization
	 * @return The organization which is responsible for the action speccified in this request.
	 */
	public Reference getOrganization() { return organization; }

	/**
	 * Setter for organization
	 * @param value The organization which is responsible for the action speccified in this request.
	 */
	public void setOrganization(Reference value) { organization = value; }


	@Expose
	private Reference request;

	/**
	 * Getter for request
	 * @return Reference of resource which is the target or subject of this action.
	 */
	public Reference getRequest() { return request; }

	/**
	 * Setter for request
	 * @param value Reference of resource which is the target or subject of this action.
	 */
	public void setRequest(Reference value) { request = value; }


	@Expose
	private Reference response;

	/**
	 * Getter for response
	 * @return Reference of a prior response to resource which is the target or subject of this action.
	 */
	public Reference getResponse() { return response; }

	/**
	 * Setter for response
	 * @param value Reference of a prior response to resource which is the target or subject of this action.
	 */
	public void setResponse(Reference value) { response = value; }


	@Expose
	private boolean nullify;

	/**
	 * Getter for nullify
	 * @return If true remove all history excluding audit.
	 */
	public boolean getNullify() { return nullify; }

	/**
	 * Setter for nullify
	 * @param value If true remove all history excluding audit.
	 */
	public void setNullify(boolean value) { nullify = value; }


	@Expose
	private String reference;

	/**
	 * Getter for reference
	 * @return A reference to supply which authenticates the process.
	 */
	public String getReference() { return reference; }

	/**
	 * Setter for reference
	 * @param value A reference to supply which authenticates the process.
	 */
	public void setReference(String value) { reference = value; }


	@Expose
	private ArrayList<ProcessRequestItem> item;

	/**
	 * Getter for item
	 * @return List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
	 */
	public ArrayList<ProcessRequestItem> getItem() { return item; }

	/**
	 * Setter for item
	 * @param value List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated.
	 */
	public void setItem(ArrayList<ProcessRequestItem> value) { item = value; }


	@Expose
	private ArrayList<String> include;

	/**
	 * Getter for include
	 * @return Names of resource types to include.
	 */
	public ArrayList<String> getInclude() { return include; }

	/**
	 * Setter for include
	 * @param value Names of resource types to include.
	 */
	public void setInclude(ArrayList<String> value) { include = value; }


	@Expose
	private ArrayList<String> exclude;

	/**
	 * Getter for exclude
	 * @return Names of resource types to exclude.
	 */
	public ArrayList<String> getExclude() { return exclude; }

	/**
	 * Setter for exclude
	 * @param value Names of resource types to exclude.
	 */
	public void setExclude(ArrayList<String> value) { exclude = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return A period of time during which the fulfilling resources would have been created.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value A period of time during which the fulfilling resources would have been created.
	 */
	public void setPeriod(Period value) { period = value; }


}
