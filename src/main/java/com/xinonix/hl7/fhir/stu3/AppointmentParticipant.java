package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 */
public class AppointmentParticipant extends BackboneElement {
	@Expose
	private ArrayList<CodeableConcept> type;

	/**
	 * Getter for type
	 * @return Role of participant in the appointment.
	 */
	public ArrayList<CodeableConcept> getType() { return type; }

	/**
	 * Setter for type
	 * @param value Role of participant in the appointment.
	 */
	public void setType(ArrayList<CodeableConcept> value) { type = value; }


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


	public enum Required{
		@SerializedName("required") REQUIRED,
		@SerializedName("optional") OPTIONAL,
		@SerializedName("information-only") INFORMATION_ONLY
	}

	@Expose
	private Required required;

	/**
	 * Getter for required
	 * @return Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
	 */
	public Required getRequired() { return required; }

	/**
	 * Setter for required
	 * @param value Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
	 */
	public void setRequired(Required value) { required = value; }


	public enum Status{
		@SerializedName("accepted") ACCEPTED,
		@SerializedName("declined") DECLINED,
		@SerializedName("tentative") TENTATIVE,
		@SerializedName("needs-action") NEEDS_ACTION
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Participation status of the actor.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Participation status of the actor.
	 */
	public void setStatus(Status value) { status = value; }


}
