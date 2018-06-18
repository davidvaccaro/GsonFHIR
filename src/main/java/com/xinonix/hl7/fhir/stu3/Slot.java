package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A slot of time on a schedule that may be available for booking appointments.
 */
public class Slot extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Slot resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Slot resource
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
	 * @return The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.
	 */
	public ArrayList<CodeableConcept> getServiceType() { return serviceType; }

	/**
	 * Setter for serviceType
	 * @param value The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource.
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
	private CodeableConcept appointmentType;

	/**
	 * Getter for appointmentType
	 * @return The style of appointment or patient that may be booked in the slot (not service type).
	 */
	public CodeableConcept getAppointmentType() { return appointmentType; }

	/**
	 * Setter for appointmentType
	 * @param value The style of appointment or patient that may be booked in the slot (not service type).
	 */
	public void setAppointmentType(CodeableConcept value) { appointmentType = value; }


	@Expose
	private Reference schedule;

	/**
	 * Getter for schedule
	 * @return The schedule resource that this slot defines an interval of status information.
	 */
	public Reference getSchedule() { return schedule; }

	/**
	 * Setter for schedule
	 * @param value The schedule resource that this slot defines an interval of status information.
	 */
	public void setSchedule(Reference value) { schedule = value; }


	public enum Status{
		@SerializedName("busy") BUSY,
		@SerializedName("free") FREE,
		@SerializedName("busy-unavailable") BUSY_UNAVAILABLE,
		@SerializedName("busy-tentative") BUSY_TENTATIVE,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return busy | free | busy-unavailable | busy-tentative | entered-in-error.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value busy | free | busy-unavailable | busy-tentative | entered-in-error.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private String start;

	/**
	 * Getter for start
	 * @return Date/Time that the slot is to begin.
	 */
	public String getStart() { return start; }

	/**
	 * Setter for start
	 * @param value Date/Time that the slot is to begin.
	 */
	public void setStart(String value) { start = value; }


	@Expose
	private String end;

	/**
	 * Getter for end
	 * @return Date/Time that the slot is to conclude.
	 */
	public String getEnd() { return end; }

	/**
	 * Setter for end
	 * @param value Date/Time that the slot is to conclude.
	 */
	public void setEnd(String value) { end = value; }


	@Expose
	private boolean overbooked;

	/**
	 * Getter for overbooked
	 * @return This slot has already been overbooked, appointments are unlikely to be accepted for this time.
	 */
	public boolean getOverbooked() { return overbooked; }

	/**
	 * Setter for overbooked
	 * @param value This slot has already been overbooked, appointments are unlikely to be accepted for this time.
	 */
	public void setOverbooked(boolean value) { overbooked = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return Comments on the slot to describe any extended information. Such as custom constraints on the slot.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value Comments on the slot to describe any extended information. Such as custom constraints on the slot.
	 */
	public void setComment(String value) { comment = value; }


}
