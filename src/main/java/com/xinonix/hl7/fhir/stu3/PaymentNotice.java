package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
 */
public class PaymentNotice extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a PaymentNotice resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a PaymentNotice resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return The notice business identifier.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The notice business identifier.
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


	@Expose
	private Reference request;

	/**
	 * Getter for request
	 * @return Reference of resource for which payment is being made.
	 */
	public Reference getRequest() { return request; }

	/**
	 * Setter for request
	 * @param value Reference of resource for which payment is being made.
	 */
	public void setRequest(Reference value) { request = value; }


	@Expose
	private Reference response;

	/**
	 * Getter for response
	 * @return Reference of response to resource for which payment is being made.
	 */
	public Reference getResponse() { return response; }

	/**
	 * Setter for response
	 * @param value Reference of response to resource for which payment is being made.
	 */
	public void setResponse(Reference value) { response = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date statusDate;

	/**
	 * Getter for statusDate
	 * @return The date when the above payment action occurrred.
	 */
	public Date getStatusDate() { return statusDate; }

	/**
	 * Setter for statusDate
	 * @param value The date when the above payment action occurrred.
	 */
	public void setStatusDate(Date value) { statusDate = value; }


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
	private Reference target;

	/**
	 * Getter for target
	 * @return The Insurer who is target  of the request.
	 */
	public Reference getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value The Insurer who is target  of the request.
	 */
	public void setTarget(Reference value) { target = value; }


	@Expose
	private Reference provider;

	/**
	 * Getter for provider
	 * @return The practitioner who is responsible for the services rendered to the patient.
	 */
	public Reference getProvider() { return provider; }

	/**
	 * Setter for provider
	 * @param value The practitioner who is responsible for the services rendered to the patient.
	 */
	public void setProvider(Reference value) { provider = value; }


	@Expose
	private Reference organization;

	/**
	 * Getter for organization
	 * @return The organization which is responsible for the services rendered to the patient.
	 */
	public Reference getOrganization() { return organization; }

	/**
	 * Setter for organization
	 * @param value The organization which is responsible for the services rendered to the patient.
	 */
	public void setOrganization(Reference value) { organization = value; }


	@Expose
	private CodeableConcept paymentStatus;

	/**
	 * Getter for paymentStatus
	 * @return The payment status, typically paid: payment sent, cleared: payment received.
	 */
	public CodeableConcept getPaymentStatus() { return paymentStatus; }

	/**
	 * Setter for paymentStatus
	 * @param value The payment status, typically paid: payment sent, cleared: payment received.
	 */
	public void setPaymentStatus(CodeableConcept value) { paymentStatus = value; }


}
