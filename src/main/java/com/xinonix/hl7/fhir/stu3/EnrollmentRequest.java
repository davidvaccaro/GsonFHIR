package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
 */
public class EnrollmentRequest extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a EnrollmentRequest resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a EnrollmentRequest resource
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
	 * @return The date when this resource was created.
	 */
	public Date getCreated() { return created; }

	/**
	 * Setter for created
	 * @param value The date when this resource was created.
	 */
	public void setCreated(Date value) { created = value; }


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
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Patient Resource.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Patient Resource.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference coverage;

	/**
	 * Getter for coverage
	 * @return Reference to the program or plan identification, underwriter or payor.
	 */
	public Reference getCoverage() { return coverage; }

	/**
	 * Setter for coverage
	 * @param value Reference to the program or plan identification, underwriter or payor.
	 */
	public void setCoverage(Reference value) { coverage = value; }


}
