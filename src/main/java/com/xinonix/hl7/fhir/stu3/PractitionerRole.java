package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
 */
public class PractitionerRole extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a PractitionerRole resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a PractitionerRole resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Business Identifiers that are specific to a role/location.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Business Identifiers that are specific to a role/location.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Whether this practitioner's record is in active use.
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Whether this practitioner's record is in active use.
	 */
	public void setActive(boolean value) { active = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The period during which the person is authorized to act as a practitioner in these role(s) for the organization.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The period during which the person is authorized to act as a practitioner in these role(s) for the organization.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private Reference practitioner;

	/**
	 * Getter for practitioner
	 * @return Practitioner that is able to provide the defined services for the organation.
	 */
	public Reference getPractitioner() { return practitioner; }

	/**
	 * Setter for practitioner
	 * @param value Practitioner that is able to provide the defined services for the organation.
	 */
	public void setPractitioner(Reference value) { practitioner = value; }


	@Expose
	private Reference organization;

	/**
	 * Getter for organization
	 * @return The organization where the Practitioner performs the roles associated.
	 */
	public Reference getOrganization() { return organization; }

	/**
	 * Setter for organization
	 * @param value The organization where the Practitioner performs the roles associated.
	 */
	public void setOrganization(Reference value) { organization = value; }


	@Expose
	private ArrayList<CodeableConcept> code;

	/**
	 * Getter for code
	 * @return Roles which this practitioner is authorized to perform for the organization.
	 */
	public ArrayList<CodeableConcept> getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Roles which this practitioner is authorized to perform for the organization.
	 */
	public void setCode(ArrayList<CodeableConcept> value) { code = value; }


	@Expose
	private ArrayList<CodeableConcept> specialty;

	/**
	 * Getter for specialty
	 * @return Specific specialty of the practitioner.
	 */
	public ArrayList<CodeableConcept> getSpecialty() { return specialty; }

	/**
	 * Setter for specialty
	 * @param value Specific specialty of the practitioner.
	 */
	public void setSpecialty(ArrayList<CodeableConcept> value) { specialty = value; }


	@Expose
	private ArrayList<Reference> location;

	/**
	 * Getter for location
	 * @return The location(s) at which this practitioner provides care.
	 */
	public ArrayList<Reference> getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value The location(s) at which this practitioner provides care.
	 */
	public void setLocation(ArrayList<Reference> value) { location = value; }


	@Expose
	private ArrayList<Reference> healthcareService;

	/**
	 * Getter for healthcareService
	 * @return The list of healthcare services that this worker provides for this role's Organization/Location(s).
	 */
	public ArrayList<Reference> getHealthcareService() { return healthcareService; }

	/**
	 * Setter for healthcareService
	 * @param value The list of healthcare services that this worker provides for this role's Organization/Location(s).
	 */
	public void setHealthcareService(ArrayList<Reference> value) { healthcareService = value; }


	@Expose
	private ArrayList<ContactPoint> telecom;

	/**
	 * Getter for telecom
	 * @return Contact details that are specific to the role/location/service.
	 */
	public ArrayList<ContactPoint> getTelecom() { return telecom; }

	/**
	 * Setter for telecom
	 * @param value Contact details that are specific to the role/location/service.
	 */
	public void setTelecom(ArrayList<ContactPoint> value) { telecom = value; }


	@Expose
	private ArrayList<PractitionerRoleAvailableTime> availableTime;

	/**
	 * Getter for availableTime
	 * @return A collection of times that the Service Site is available.
	 */
	public ArrayList<PractitionerRoleAvailableTime> getAvailableTime() { return availableTime; }

	/**
	 * Setter for availableTime
	 * @param value A collection of times that the Service Site is available.
	 */
	public void setAvailableTime(ArrayList<PractitionerRoleAvailableTime> value) { availableTime = value; }


	@Expose
	private ArrayList<PractitionerRoleNotAvailable> notAvailable;

	/**
	 * Getter for notAvailable
	 * @return The HealthcareService is not available during this period of time due to the provided reason.
	 */
	public ArrayList<PractitionerRoleNotAvailable> getNotAvailable() { return notAvailable; }

	/**
	 * Setter for notAvailable
	 * @param value The HealthcareService is not available during this period of time due to the provided reason.
	 */
	public void setNotAvailable(ArrayList<PractitionerRoleNotAvailable> value) { notAvailable = value; }


	@Expose
	private String availabilityExceptions;

	/**
	 * Getter for availabilityExceptions
	 * @return A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.
	 */
	public String getAvailabilityExceptions() { return availabilityExceptions; }

	/**
	 * Setter for availabilityExceptions
	 * @param value A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.
	 */
	public void setAvailabilityExceptions(String value) { availabilityExceptions = value; }


	@Expose
	private ArrayList<Reference> endpoint;

	/**
	 * Getter for endpoint
	 * @return Technical endpoints providing access to services operated for the practitioner with this role.
	 */
	public ArrayList<Reference> getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value Technical endpoints providing access to services operated for the practitioner with this role.
	 */
	public void setEndpoint(ArrayList<Reference> value) { endpoint = value; }


}
