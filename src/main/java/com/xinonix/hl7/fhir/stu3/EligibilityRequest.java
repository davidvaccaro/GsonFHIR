package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * The EligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an EligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 */
public class EligibilityRequest extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a EligibilityRequest resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a EligibilityRequest resource
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
	private CodeableConcept priority;

	/**
	 * Getter for priority
	 * @return Immediate (STAT), best effort (NORMAL), deferred (DEFER).
	 */
	public CodeableConcept getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Immediate (STAT), best effort (NORMAL), deferred (DEFER).
	 */
	public void setPriority(CodeableConcept value) { priority = value; }


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
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date servicedDate;

	/**
	 * Getter for servicedDate
	 * @return The date or dates when the enclosed suite of services were performed or completed.
	 */
	public Date getServicedDate() { return servicedDate; }

	/**
	 * Setter for servicedDate
	 * @param value The date or dates when the enclosed suite of services were performed or completed.
	 */
	public void setServicedDate(Date value) { servicedDate = value; }


	@Expose
	private Period servicedPeriod;

	/**
	 * Getter for servicedPeriod
	 * @return The date or dates when the enclosed suite of services were performed or completed.
	 */
	public Period getServicedPeriod() { return servicedPeriod; }

	/**
	 * Setter for servicedPeriod
	 * @param value The date or dates when the enclosed suite of services were performed or completed.
	 */
	public void setServicedPeriod(Period value) { servicedPeriod = value; }


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
	private Reference enterer;

	/**
	 * Getter for enterer
	 * @return Person who created the invoice/claim/pre-determination or pre-authorization.
	 */
	public Reference getEnterer() { return enterer; }

	/**
	 * Setter for enterer
	 * @param value Person who created the invoice/claim/pre-determination or pre-authorization.
	 */
	public void setEnterer(Reference value) { enterer = value; }


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
	private Reference insurer;

	/**
	 * Getter for insurer
	 * @return The Insurer who is target  of the request.
	 */
	public Reference getInsurer() { return insurer; }

	/**
	 * Setter for insurer
	 * @param value The Insurer who is target  of the request.
	 */
	public void setInsurer(Reference value) { insurer = value; }


	@Expose
	private Reference facility;

	/**
	 * Getter for facility
	 * @return Facility where the services were provided.
	 */
	public Reference getFacility() { return facility; }

	/**
	 * Setter for facility
	 * @param value Facility where the services were provided.
	 */
	public void setFacility(Reference value) { facility = value; }


	@Expose
	private Reference coverage;

	/**
	 * Getter for coverage
	 * @return Financial instrument by which payment information for health care.
	 */
	public Reference getCoverage() { return coverage; }

	/**
	 * Setter for coverage
	 * @param value Financial instrument by which payment information for health care.
	 */
	public void setCoverage(Reference value) { coverage = value; }


	@Expose
	private String businessArrangement;

	/**
	 * Getter for businessArrangement
	 * @return The contract number of a business agreement which describes the terms and conditions.
	 */
	public String getBusinessArrangement() { return businessArrangement; }

	/**
	 * Setter for businessArrangement
	 * @param value The contract number of a business agreement which describes the terms and conditions.
	 */
	public void setBusinessArrangement(String value) { businessArrangement = value; }


	@Expose
	private CodeableConcept benefitCategory;

	/**
	 * Getter for benefitCategory
	 * @return Dental, Vision, Medical, Pharmacy, Rehab etc.
	 */
	public CodeableConcept getBenefitCategory() { return benefitCategory; }

	/**
	 * Setter for benefitCategory
	 * @param value Dental, Vision, Medical, Pharmacy, Rehab etc.
	 */
	public void setBenefitCategory(CodeableConcept value) { benefitCategory = value; }


	@Expose
	private CodeableConcept benefitSubCategory;

	/**
	 * Getter for benefitSubCategory
	 * @return Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.
	 */
	public CodeableConcept getBenefitSubCategory() { return benefitSubCategory; }

	/**
	 * Setter for benefitSubCategory
	 * @param value Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.
	 */
	public void setBenefitSubCategory(CodeableConcept value) { benefitSubCategory = value; }


}
