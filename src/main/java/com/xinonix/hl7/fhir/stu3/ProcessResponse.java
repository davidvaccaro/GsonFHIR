package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource provides processing status, errors and notes from the processing of a resource.
 */
public class ProcessResponse extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ProcessResponse resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ProcessResponse resource
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
	private Reference organization;

	/**
	 * Getter for organization
	 * @return The organization who produced this adjudicated response.
	 */
	public Reference getOrganization() { return organization; }

	/**
	 * Setter for organization
	 * @param value The organization who produced this adjudicated response.
	 */
	public void setOrganization(Reference value) { organization = value; }


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
	 * @return Transaction status: error, complete, held.
	 */
	public CodeableConcept getOutcome() { return outcome; }

	/**
	 * Setter for outcome
	 * @param value Transaction status: error, complete, held.
	 */
	public void setOutcome(CodeableConcept value) { outcome = value; }


	@Expose
	private String disposition;

	/**
	 * Getter for disposition
	 * @return A description of the status of the adjudication or processing.
	 */
	public String getDisposition() { return disposition; }

	/**
	 * Setter for disposition
	 * @param value A description of the status of the adjudication or processing.
	 */
	public void setDisposition(String value) { disposition = value; }


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
	private ArrayList<ProcessResponseProcessNote> processNote;

	/**
	 * Getter for processNote
	 * @return Suite of processing notes or additional requirements if the processing has been held.
	 */
	public ArrayList<ProcessResponseProcessNote> getProcessNote() { return processNote; }

	/**
	 * Setter for processNote
	 * @param value Suite of processing notes or additional requirements if the processing has been held.
	 */
	public void setProcessNote(ArrayList<ProcessResponseProcessNote> value) { processNote = value; }


	@Expose
	private ArrayList<CodeableConcept> error;

	/**
	 * Getter for error
	 * @return Processing errors.
	 */
	public ArrayList<CodeableConcept> getError() { return error; }

	/**
	 * Setter for error
	 * @param value Processing errors.
	 */
	public void setError(ArrayList<CodeableConcept> value) { error = value; }


	@Expose
	private ArrayList<Reference> communicationRequest;

	/**
	 * Getter for communicationRequest
	 * @return Request for additional supporting or authorizing information, such as: documents, images or resources.
	 */
	public ArrayList<Reference> getCommunicationRequest() { return communicationRequest; }

	/**
	 * Setter for communicationRequest
	 * @param value Request for additional supporting or authorizing information, such as: documents, images or resources.
	 */
	public void setCommunicationRequest(ArrayList<Reference> value) { communicationRequest = value; }


}
