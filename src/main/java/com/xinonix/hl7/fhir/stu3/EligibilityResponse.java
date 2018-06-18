package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 */
public class EligibilityResponse extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a EligibilityResponse resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a EligibilityResponse resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return The Response business identifier.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The Response business identifier.
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
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date created;

	/**
	 * Getter for created
	 * @return The date when the enclosed suite of services were performed or completed.
	 */
	public Date getCreated() { return created; }

	/**
	 * Setter for created
	 * @param value The date when the enclosed suite of services were performed or completed.
	 */
	public void setCreated(Date value) { created = value; }


	@Expose
	private Reference requestProvider;

	/**
	 * Getter for requestProvider
	 * @return The practitioner who is responsible for the services rendered to the patient.
	 */
	public Reference getRequestProvider() { return requestProvider; }

	/**
	 * Setter for requestProvider
	 * @param value The practitioner who is responsible for the services rendered to the patient.
	 */
	public void setRequestProvider(Reference value) { requestProvider = value; }


	@Expose
	private Reference requestOrganization;

	/**
	 * Getter for requestOrganization
	 * @return The organization which is responsible for the services rendered to the patient.
	 */
	public Reference getRequestOrganization() { return requestOrganization; }

	/**
	 * Setter for requestOrganization
	 * @param value The organization which is responsible for the services rendered to the patient.
	 */
	public void setRequestOrganization(Reference value) { requestOrganization = value; }


	@Expose
	private Reference request;

	/**
	 * Getter for request
	 * @return Original request resource reference.
	 */
	public Reference getRequest() { return request; }

	/**
	 * Setter for request
	 * @param value Original request resource reference.
	 */
	public void setRequest(Reference value) { request = value; }


	@Expose
	private CodeableConcept outcome;

	/**
	 * Getter for outcome
	 * @return Transaction status: error, complete.
	 */
	public CodeableConcept getOutcome() { return outcome; }

	/**
	 * Setter for outcome
	 * @param value Transaction status: error, complete.
	 */
	public void setOutcome(CodeableConcept value) { outcome = value; }


	@Expose
	private String disposition;

	/**
	 * Getter for disposition
	 * @return A description of the status of the adjudication.
	 */
	public String getDisposition() { return disposition; }

	/**
	 * Setter for disposition
	 * @param value A description of the status of the adjudication.
	 */
	public void setDisposition(String value) { disposition = value; }


	@Expose
	private Reference insurer;

	/**
	 * Getter for insurer
	 * @return The Insurer who produced this adjudicated response.
	 */
	public Reference getInsurer() { return insurer; }

	/**
	 * Setter for insurer
	 * @param value The Insurer who produced this adjudicated response.
	 */
	public void setInsurer(Reference value) { insurer = value; }


	@Expose
	private boolean inforce;

	/**
	 * Getter for inforce
	 * @return Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates.
	 */
	public boolean getInforce() { return inforce; }

	/**
	 * Setter for inforce
	 * @param value Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates.
	 */
	public void setInforce(boolean value) { inforce = value; }


	@Expose
	private ArrayList<EligibilityResponseInsurance> insurance;

	/**
	 * Getter for insurance
	 * @return The insurer may provide both the details for the requested coverage as well as details for additional coverages known to the insurer.
	 */
	public ArrayList<EligibilityResponseInsurance> getInsurance() { return insurance; }

	/**
	 * Setter for insurance
	 * @param value The insurer may provide both the details for the requested coverage as well as details for additional coverages known to the insurer.
	 */
	public void setInsurance(ArrayList<EligibilityResponseInsurance> value) { insurance = value; }


	@Expose
	private CodeableConcept form;

	/**
	 * Getter for form
	 * @return The form to be used for printing the content.
	 */
	public CodeableConcept getForm() { return form; }

	/**
	 * Setter for form
	 * @param value The form to be used for printing the content.
	 */
	public void setForm(CodeableConcept value) { form = value; }


	@Expose
	private ArrayList<EligibilityResponseError> error;

	/**
	 * Getter for error
	 * @return Mutually exclusive with Services Provided (Item).
	 */
	public ArrayList<EligibilityResponseError> getError() { return error; }

	/**
	 * Setter for error
	 * @param value Mutually exclusive with Services Provided (Item).
	 */
	public void setError(ArrayList<EligibilityResponseError> value) { error = value; }


}
