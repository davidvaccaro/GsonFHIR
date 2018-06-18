package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource provides the adjudication details from the processing of a Claim resource.
 */
public class ClaimResponse extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ClaimResponse resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ClaimResponse resource
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
	private Reference patient;

	/**
	 * Getter for patient
	 * @return Patient Resource.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value Patient Resource.
	 */
	public void setPatient(Reference value) { patient = value; }


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
	 * @return Original request resource referrence.
	 */
	public Reference getRequest() { return request; }

	/**
	 * Setter for request
	 * @param value Original request resource referrence.
	 */
	public void setRequest(Reference value) { request = value; }


	@Expose
	private CodeableConcept outcome;

	/**
	 * Getter for outcome
	 * @return Processing outcome errror, partial or complete processing.
	 */
	public CodeableConcept getOutcome() { return outcome; }

	/**
	 * Setter for outcome
	 * @param value Processing outcome errror, partial or complete processing.
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
	private CodeableConcept payeeType;

	/**
	 * Getter for payeeType
	 * @return Party to be reimbursed: Subscriber, provider, other.
	 */
	public CodeableConcept getPayeeType() { return payeeType; }

	/**
	 * Setter for payeeType
	 * @param value Party to be reimbursed: Subscriber, provider, other.
	 */
	public void setPayeeType(CodeableConcept value) { payeeType = value; }


	@Expose
	private ArrayList<ClaimResponseItem> item;

	/**
	 * Getter for item
	 * @return The first tier service adjudications for submitted services.
	 */
	public ArrayList<ClaimResponseItem> getItem() { return item; }

	/**
	 * Setter for item
	 * @param value The first tier service adjudications for submitted services.
	 */
	public void setItem(ArrayList<ClaimResponseItem> value) { item = value; }


	@Expose
	private ArrayList<ClaimResponseAddItem> addItem;

	/**
	 * Getter for addItem
	 * @return The first tier service adjudications for payor added services.
	 */
	public ArrayList<ClaimResponseAddItem> getAddItem() { return addItem; }

	/**
	 * Setter for addItem
	 * @param value The first tier service adjudications for payor added services.
	 */
	public void setAddItem(ArrayList<ClaimResponseAddItem> value) { addItem = value; }


	@Expose
	private ArrayList<ClaimResponseError> error;

	/**
	 * Getter for error
	 * @return Mutually exclusive with Services Provided (Item).
	 */
	public ArrayList<ClaimResponseError> getError() { return error; }

	/**
	 * Setter for error
	 * @param value Mutually exclusive with Services Provided (Item).
	 */
	public void setError(ArrayList<ClaimResponseError> value) { error = value; }


	@Expose
	private Money totalCost;

	/**
	 * Getter for totalCost
	 * @return The total cost of the services reported.
	 */
	public Money getTotalCost() { return totalCost; }

	/**
	 * Setter for totalCost
	 * @param value The total cost of the services reported.
	 */
	public void setTotalCost(Money value) { totalCost = value; }


	@Expose
	private Money unallocDeductable;

	/**
	 * Getter for unallocDeductable
	 * @return The amount of deductible applied which was not allocated to any particular service line.
	 */
	public Money getUnallocDeductable() { return unallocDeductable; }

	/**
	 * Setter for unallocDeductable
	 * @param value The amount of deductible applied which was not allocated to any particular service line.
	 */
	public void setUnallocDeductable(Money value) { unallocDeductable = value; }


	@Expose
	private Money totalBenefit;

	/**
	 * Getter for totalBenefit
	 * @return Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible).
	 */
	public Money getTotalBenefit() { return totalBenefit; }

	/**
	 * Setter for totalBenefit
	 * @param value Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible).
	 */
	public void setTotalBenefit(Money value) { totalBenefit = value; }


	@Expose
	private ClaimResponsePayment payment;

	/**
	 * Getter for payment
	 * @return Payment details for the claim if the claim has been paid.
	 */
	public ClaimResponsePayment getPayment() { return payment; }

	/**
	 * Setter for payment
	 * @param value Payment details for the claim if the claim has been paid.
	 */
	public void setPayment(ClaimResponsePayment value) { payment = value; }


	@Expose
	private Coding reserved;

	/**
	 * Getter for reserved
	 * @return Status of funds reservation (For provider, for Patient, None).
	 */
	public Coding getReserved() { return reserved; }

	/**
	 * Setter for reserved
	 * @param value Status of funds reservation (For provider, for Patient, None).
	 */
	public void setReserved(Coding value) { reserved = value; }


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
	private ArrayList<ClaimResponseProcessNote> processNote;

	/**
	 * Getter for processNote
	 * @return Note text.
	 */
	public ArrayList<ClaimResponseProcessNote> getProcessNote() { return processNote; }

	/**
	 * Setter for processNote
	 * @param value Note text.
	 */
	public void setProcessNote(ArrayList<ClaimResponseProcessNote> value) { processNote = value; }


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


	@Expose
	private ArrayList<ClaimResponseInsurance> insurance;

	/**
	 * Getter for insurance
	 * @return Financial instrument by which payment information for health care.
	 */
	public ArrayList<ClaimResponseInsurance> getInsurance() { return insurance; }

	/**
	 * Setter for insurance
	 * @param value Financial instrument by which payment information for health care.
	 */
	public void setInsurance(ArrayList<ClaimResponseInsurance> value) { insurance = value; }


}
