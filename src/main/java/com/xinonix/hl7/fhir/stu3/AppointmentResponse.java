package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
 */
public class AppointmentResponse extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a AppointmentResponse resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a AppointmentResponse resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private Reference appointment;

	/**
	 * Getter for appointment
	 * @return Appointment that this response is replying to.
	 */
	public Reference getAppointment() { return appointment; }

	/**
	 * Setter for appointment
	 * @param value Appointment that this response is replying to.
	 */
	public void setAppointment(Reference value) { appointment = value; }


	@Expose
	private String start;

	/**
	 * Getter for start
	 * @return Date/Time that the appointment is to take place, or requested new start time.
	 */
	public String getStart() { return start; }

	/**
	 * Setter for start
	 * @param value Date/Time that the appointment is to take place, or requested new start time.
	 */
	public void setStart(String value) { start = value; }


	@Expose
	private String end;

	/**
	 * Getter for end
	 * @return This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
	 */
	public String getEnd() { return end; }

	/**
	 * Setter for end
	 * @param value This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
	 */
	public void setEnd(String value) { end = value; }


	@Expose
	private ArrayList<CodeableConcept> participantType;

	/**
	 * Getter for participantType
	 * @return Role of participant in the appointment.
	 */
	public ArrayList<CodeableConcept> getParticipantType() { return participantType; }

	/**
	 * Setter for participantType
	 * @param value Role of participant in the appointment.
	 */
	public void setParticipantType(ArrayList<CodeableConcept> value) { participantType = value; }


	@Expose
	private Reference actor;

	/**
	 * Getter for actor
	 * @return A Person, Location/HealthcareService or Device that is participating in the appointment.
	 */
	public Reference getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value A Person, Location/HealthcareService or Device that is participating in the appointment.
	 */
	public void setActor(Reference value) { actor = value; }


	@Expose
	private String participantStatus;

	/**
	 * Getter for participantStatus
	 * @return Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
	 */
	public String getParticipantStatus() { return participantStatus; }

	/**
	 * Setter for participantStatus
	 * @param value Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
	 */
	public void setParticipantStatus(String value) { participantStatus = value; }


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


}
