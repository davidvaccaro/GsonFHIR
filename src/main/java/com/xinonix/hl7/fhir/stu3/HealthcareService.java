package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The details of a healthcare service available at a location.
 */
public class HealthcareService extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a HealthcareService resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a HealthcareService resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return External identifiers for this item.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value External identifiers for this item.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Whether this healthcareservice record is in active use.
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Whether this healthcareservice record is in active use.
	 */
	public void setActive(boolean value) { active = value; }


	@Expose
	private Reference providedBy;

	/**
	 * Getter for providedBy
	 * @return The organization that provides this healthcare service.
	 */
	public Reference getProvidedBy() { return providedBy; }

	/**
	 * Setter for providedBy
	 * @param value The organization that provides this healthcare service.
	 */
	public void setProvidedBy(Reference value) { providedBy = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Identifies the broad category of service being performed or delivered.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Identifies the broad category of service being performed or delivered.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private ArrayList<CodeableConcept> type;

	/**
	 * Getter for type
	 * @return The specific type of service that may be delivered or performed.
	 */
	public ArrayList<CodeableConcept> getType() { return type; }

	/**
	 * Setter for type
	 * @param value The specific type of service that may be delivered or performed.
	 */
	public void setType(ArrayList<CodeableConcept> value) { type = value; }


	@Expose
	private ArrayList<CodeableConcept> specialty;

	/**
	 * Getter for specialty
	 * @return Collection of specialties handled by the service site. This is more of a medical term.
	 */
	public ArrayList<CodeableConcept> getSpecialty() { return specialty; }

	/**
	 * Setter for specialty
	 * @param value Collection of specialties handled by the service site. This is more of a medical term.
	 */
	public void setSpecialty(ArrayList<CodeableConcept> value) { specialty = value; }


	@Expose
	private ArrayList<Reference> location;

	/**
	 * Getter for location
	 * @return The location(s) where this healthcare service may be provided.
	 */
	public ArrayList<Reference> getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value The location(s) where this healthcare service may be provided.
	 */
	public void setLocation(ArrayList<Reference> value) { location = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Further description of the service as it would be presented to a consumer while searching.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Further description of the service as it would be presented to a consumer while searching.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.
	 */
	public void setComment(String value) { comment = value; }


	@Expose
	private String extraDetails;

	/**
	 * Getter for extraDetails
	 * @return Extra details about the service that can't be placed in the other fields.
	 */
	public String getExtraDetails() { return extraDetails; }

	/**
	 * Setter for extraDetails
	 * @param value Extra details about the service that can't be placed in the other fields.
	 */
	public void setExtraDetails(String value) { extraDetails = value; }


	@Expose
	private Attachment photo;

	/**
	 * Getter for photo
	 * @return If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.
	 */
	public Attachment getPhoto() { return photo; }

	/**
	 * Setter for photo
	 * @param value If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.
	 */
	public void setPhoto(Attachment value) { photo = value; }


	@Expose
	private ArrayList<ContactPoint> telecom;

	/**
	 * Getter for telecom
	 * @return List of contacts related to this specific healthcare service.
	 */
	public ArrayList<ContactPoint> getTelecom() { return telecom; }

	/**
	 * Setter for telecom
	 * @param value List of contacts related to this specific healthcare service.
	 */
	public void setTelecom(ArrayList<ContactPoint> value) { telecom = value; }


	@Expose
	private ArrayList<Reference> coverageArea;

	/**
	 * Getter for coverageArea
	 * @return The location(s) that this service is available to (not where the service is provided).
	 */
	public ArrayList<Reference> getCoverageArea() { return coverageArea; }

	/**
	 * Setter for coverageArea
	 * @param value The location(s) that this service is available to (not where the service is provided).
	 */
	public void setCoverageArea(ArrayList<Reference> value) { coverageArea = value; }


	@Expose
	private ArrayList<CodeableConcept> serviceProvisionCode;

	/**
	 * Getter for serviceProvisionCode
	 * @return The code(s) that detail the conditions under which the healthcare service is available/offered.
	 */
	public ArrayList<CodeableConcept> getServiceProvisionCode() { return serviceProvisionCode; }

	/**
	 * Setter for serviceProvisionCode
	 * @param value The code(s) that detail the conditions under which the healthcare service is available/offered.
	 */
	public void setServiceProvisionCode(ArrayList<CodeableConcept> value) { serviceProvisionCode = value; }


	@Expose
	private CodeableConcept eligibility;

	/**
	 * Getter for eligibility
	 * @return Does this service have specific eligibility requirements that need to be met in order to use the service?
	 */
	public CodeableConcept getEligibility() { return eligibility; }

	/**
	 * Setter for eligibility
	 * @param value Does this service have specific eligibility requirements that need to be met in order to use the service?
	 */
	public void setEligibility(CodeableConcept value) { eligibility = value; }


	@Expose
	private String eligibilityNote;

	/**
	 * Getter for eligibilityNote
	 * @return Describes the eligibility conditions for the service.
	 */
	public String getEligibilityNote() { return eligibilityNote; }

	/**
	 * Setter for eligibilityNote
	 * @param value Describes the eligibility conditions for the service.
	 */
	public void setEligibilityNote(String value) { eligibilityNote = value; }


	@Expose
	private ArrayList<String> programName;

	/**
	 * Getter for programName
	 * @return Program Names that can be used to categorize the service.
	 */
	public ArrayList<String> getProgramName() { return programName; }

	/**
	 * Setter for programName
	 * @param value Program Names that can be used to categorize the service.
	 */
	public void setProgramName(ArrayList<String> value) { programName = value; }


	@Expose
	private ArrayList<CodeableConcept> characteristic;

	/**
	 * Getter for characteristic
	 * @return Collection of characteristics (attributes).
	 */
	public ArrayList<CodeableConcept> getCharacteristic() { return characteristic; }

	/**
	 * Setter for characteristic
	 * @param value Collection of characteristics (attributes).
	 */
	public void setCharacteristic(ArrayList<CodeableConcept> value) { characteristic = value; }


	@Expose
	private ArrayList<CodeableConcept> referralMethod;

	/**
	 * Getter for referralMethod
	 * @return Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
	 */
	public ArrayList<CodeableConcept> getReferralMethod() { return referralMethod; }

	/**
	 * Setter for referralMethod
	 * @param value Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
	 */
	public void setReferralMethod(ArrayList<CodeableConcept> value) { referralMethod = value; }


	@Expose
	private boolean appointmentRequired;

	/**
	 * Getter for appointmentRequired
	 * @return Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
	 */
	public boolean getAppointmentRequired() { return appointmentRequired; }

	/**
	 * Setter for appointmentRequired
	 * @param value Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
	 */
	public void setAppointmentRequired(boolean value) { appointmentRequired = value; }


	@Expose
	private ArrayList<HealthcareServiceAvailableTime> availableTime;

	/**
	 * Getter for availableTime
	 * @return A collection of times that the Service Site is available.
	 */
	public ArrayList<HealthcareServiceAvailableTime> getAvailableTime() { return availableTime; }

	/**
	 * Setter for availableTime
	 * @param value A collection of times that the Service Site is available.
	 */
	public void setAvailableTime(ArrayList<HealthcareServiceAvailableTime> value) { availableTime = value; }


	@Expose
	private ArrayList<HealthcareServiceNotAvailable> notAvailable;

	/**
	 * Getter for notAvailable
	 * @return The HealthcareService is not available during this period of time due to the provided reason.
	 */
	public ArrayList<HealthcareServiceNotAvailable> getNotAvailable() { return notAvailable; }

	/**
	 * Setter for notAvailable
	 * @param value The HealthcareService is not available during this period of time due to the provided reason.
	 */
	public void setNotAvailable(ArrayList<HealthcareServiceNotAvailable> value) { notAvailable = value; }


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
	 * @return Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.
	 */
	public ArrayList<Reference> getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.
	 */
	public void setEndpoint(ArrayList<Reference> value) { endpoint = value; }


}
