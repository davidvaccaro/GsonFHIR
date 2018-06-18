package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A container for slots of time that may be available for booking appointments.
 */
public class Schedule extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Schedule resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Schedule resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return External Ids for this item.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value External Ids for this item.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Whether this schedule record is in active use, or should not be used (such as was entered in error).
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Whether this schedule record is in active use, or should not be used (such as was entered in error).
	 */
	public void setActive(boolean value) { active = value; }


	@Expose
	private CodeableConcept serviceCategory;

	/**
	 * Getter for serviceCategory
	 * @return A broad categorisation of the service that is to be performed during this appointment.
	 */
	public CodeableConcept getServiceCategory() { return serviceCategory; }

	/**
	 * Setter for serviceCategory
	 * @param value A broad categorisation of the service that is to be performed during this appointment.
	 */
	public void setServiceCategory(CodeableConcept value) { serviceCategory = value; }


	@Expose
	private ArrayList<CodeableConcept> serviceType;

	/**
	 * Getter for serviceType
	 * @return The specific service that is to be performed during this appointment.
	 */
	public ArrayList<CodeableConcept> getServiceType() { return serviceType; }

	/**
	 * Setter for serviceType
	 * @param value The specific service that is to be performed during this appointment.
	 */
	public void setServiceType(ArrayList<CodeableConcept> value) { serviceType = value; }


	@Expose
	private ArrayList<CodeableConcept> specialty;

	/**
	 * Getter for specialty
	 * @return The specialty of a practitioner that would be required to perform the service requested in this appointment.
	 */
	public ArrayList<CodeableConcept> getSpecialty() { return specialty; }

	/**
	 * Setter for specialty
	 * @param value The specialty of a practitioner that would be required to perform the service requested in this appointment.
	 */
	public void setSpecialty(ArrayList<CodeableConcept> value) { specialty = value; }


	@Expose
	private ArrayList<Reference> actor;

	/**
	 * Getter for actor
	 * @return The resource this Schedule resource is providing availability information for. These are expected to usually be one of HealthcareService, Location, Practitioner, PractitionerRole, Device, Patient or RelatedPerson.
	 */
	public ArrayList<Reference> getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value The resource this Schedule resource is providing availability information for. These are expected to usually be one of HealthcareService, Location, Practitioner, PractitionerRole, Device, Patient or RelatedPerson.
	 */
	public void setActor(ArrayList<Reference> value) { actor = value; }


	@Expose
	private Period planningHorizon;

	/**
	 * Getter for planningHorizon
	 * @return The period of time that the slots that are attached to this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a "template" for planning outside these dates.
	 */
	public Period getPlanningHorizon() { return planningHorizon; }

	/**
	 * Setter for planningHorizon
	 * @param value The period of time that the slots that are attached to this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a "template" for planning outside these dates.
	 */
	public void setPlanningHorizon(Period value) { planningHorizon = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return Comments on the availability to describe any extended information. Such as custom constraints on the slots that may be associated.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value Comments on the availability to describe any extended information. Such as custom constraints on the slots that may be associated.
	 */
	public void setComment(String value) { comment = value; }


}
