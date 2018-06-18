package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 */
public class Appointment extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Appointment resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Appointment resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("proposed") PROPOSED,
		@SerializedName("pending") PENDING,
		@SerializedName("booked") BOOKED,
		@SerializedName("arrived") ARRIVED,
		@SerializedName("fulfilled") FULFILLED,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("noshow") NOSHOW,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
	 */
	public void setStatus(Status value) { status = value; }


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
	private CodeableConcept appointmentType;

	/**
	 * Getter for appointmentType
	 * @return The style of appointment or patient that has been booked in the slot (not service type).
	 */
	public CodeableConcept getAppointmentType() { return appointmentType; }

	/**
	 * Setter for appointmentType
	 * @param value The style of appointment or patient that has been booked in the slot (not service type).
	 */
	public void setAppointmentType(CodeableConcept value) { appointmentType = value; }


	@Expose
	private ArrayList<CodeableConcept> reason;

	/**
	 * Getter for reason
	 * @return The reason that this appointment is being scheduled. This is more clinical than administrative.
	 */
	public ArrayList<CodeableConcept> getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value The reason that this appointment is being scheduled. This is more clinical than administrative.
	 */
	public void setReason(ArrayList<CodeableConcept> value) { reason = value; }


	@Expose
	private ArrayList<Reference> indication;

	/**
	 * Getter for indication
	 * @return Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
	 */
	public ArrayList<Reference> getIndication() { return indication; }

	/**
	 * Setter for indication
	 * @param value Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
	 */
	public void setIndication(ArrayList<Reference> value) { indication = value; }


	@Expose
	private Integer priority;

	/**
	 * Getter for priority
	 * @return The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).
	 */
	public Integer getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).
	 */
	public void setPriority(Integer value) { priority = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<Reference> supportingInformation;

	/**
	 * Getter for supportingInformation
	 * @return Additional information to support the appointment provided when making the appointment.
	 */
	public ArrayList<Reference> getSupportingInformation() { return supportingInformation; }

	/**
	 * Setter for supportingInformation
	 * @param value Additional information to support the appointment provided when making the appointment.
	 */
	public void setSupportingInformation(ArrayList<Reference> value) { supportingInformation = value; }


	@Expose
	private String start;

	/**
	 * Getter for start
	 * @return Date/Time that the appointment is to take place.
	 */
	public String getStart() { return start; }

	/**
	 * Setter for start
	 * @param value Date/Time that the appointment is to take place.
	 */
	public void setStart(String value) { start = value; }


	@Expose
	private String end;

	/**
	 * Getter for end
	 * @return Date/Time that the appointment is to conclude.
	 */
	public String getEnd() { return end; }

	/**
	 * Setter for end
	 * @param value Date/Time that the appointment is to conclude.
	 */
	public void setEnd(String value) { end = value; }


	@Expose
	private Integer minutesDuration;

	/**
	 * Getter for minutesDuration
	 * @return Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request).
	 */
	public Integer getMinutesDuration() { return minutesDuration; }

	/**
	 * Setter for minutesDuration
	 * @param value Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request).
	 */
	public void setMinutesDuration(Integer value) { minutesDuration = value; }


	@Expose
	private ArrayList<Reference> slot;

	/**
	 * Getter for slot
	 * @return The slots from the participants' schedules that will be filled by the appointment.
	 */
	public ArrayList<Reference> getSlot() { return slot; }

	/**
	 * Setter for slot
	 * @param value The slots from the participants' schedules that will be filled by the appointment.
	 */
	public void setSlot(ArrayList<Reference> value) { slot = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date created;

	/**
	 * Getter for created
	 * @return The date that this appointment was initially created. This could be different to the meta.lastModified value on the initial entry, as this could have been before the resource was created on the FHIR server, and should remain unchanged over the lifespan of the appointment.
	 */
	public Date getCreated() { return created; }

	/**
	 * Setter for created
	 * @param value The date that this appointment was initially created. This could be different to the meta.lastModified value on the initial entry, as this could have been before the resource was created on the FHIR server, and should remain unchanged over the lifespan of the appointment.
	 */
	public void setCreated(Date value) { created = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return Additional comments about the appointment.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value Additional comments about the appointment.
	 */
	public void setComment(String value) { comment = value; }


	@Expose
	private ArrayList<Reference> incomingReferral;

	/**
	 * Getter for incomingReferral
	 * @return The referral request this appointment is allocated to assess (incoming referral).
	 */
	public ArrayList<Reference> getIncomingReferral() { return incomingReferral; }

	/**
	 * Setter for incomingReferral
	 * @param value The referral request this appointment is allocated to assess (incoming referral).
	 */
	public void setIncomingReferral(ArrayList<Reference> value) { incomingReferral = value; }


	@Expose
	private ArrayList<AppointmentParticipant> participant;

	/**
	 * Getter for participant
	 * @return List of participants involved in the appointment.
	 */
	public ArrayList<AppointmentParticipant> getParticipant() { return participant; }

	/**
	 * Setter for participant
	 * @param value List of participants involved in the appointment.
	 */
	public void setParticipant(ArrayList<AppointmentParticipant> value) { participant = value; }


	@Expose
	private ArrayList<Period> requestedPeriod;

	/**
	 * Getter for requestedPeriod
	 * @return A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within. When using these values, the minutes duration should be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time.
	 */
	public ArrayList<Period> getRequestedPeriod() { return requestedPeriod; }

	/**
	 * Setter for requestedPeriod
	 * @param value A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within. When using these values, the minutes duration should be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time.
	 */
	public void setRequestedPeriod(ArrayList<Period> value) { requestedPeriod = value; }


}
