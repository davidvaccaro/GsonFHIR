package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
public class Encounter extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Encounter resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Encounter resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifier(s) by which this encounter is known.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier(s) by which this encounter is known.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("planned") PLANNED,
		@SerializedName("arrived") ARRIVED,
		@SerializedName("triaged") TRIAGED,
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("onleave") ONLEAVE,
		@SerializedName("finished") FINISHED,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private ArrayList<EncounterStatusHistory> statusHistory;

	/**
	 * Getter for statusHistory
	 * @return The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.
	 */
	public ArrayList<EncounterStatusHistory> getStatusHistory() { return statusHistory; }

	/**
	 * Setter for statusHistory
	 * @param value The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.
	 */
	public void setStatusHistory(ArrayList<EncounterStatusHistory> value) { statusHistory = value; }


	@Expose
	@SerializedName("class")
	private Coding classCode;

	/**
	 * Getter for classCode
	 * @return inpatient | outpatient | ambulatory | emergency +.
	 */
	public Coding getClassCode() { return classCode; }

	/**
	 * Setter for classCode
	 * @param value inpatient | outpatient | ambulatory | emergency +.
	 */
	public void setClassCode(Coding value) { classCode = value; }


	@Expose
	private ArrayList<EncounterClassHistory> classHistory;

	/**
	 * Getter for classHistory
	 * @return The class history permits the tracking of the encounters transitions without needing to go  through the resource history.

This would be used for a case where an admission starts of as an emergency encounter, then transisions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kindof discharge from emergency to inpatient.
	 */
	public ArrayList<EncounterClassHistory> getClassHistory() { return classHistory; }

	/**
	 * Setter for classHistory
	 * @param value The class history permits the tracking of the encounters transitions without needing to go  through the resource history.

This would be used for a case where an admission starts of as an emergency encounter, then transisions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kindof discharge from emergency to inpatient.
	 */
	public void setClassHistory(ArrayList<EncounterClassHistory> value) { classHistory = value; }


	@Expose
	private ArrayList<CodeableConcept> type;

	/**
	 * Getter for type
	 * @return Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
	 */
	public ArrayList<CodeableConcept> getType() { return type; }

	/**
	 * Setter for type
	 * @param value Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
	 */
	public void setType(ArrayList<CodeableConcept> value) { type = value; }


	@Expose
	private CodeableConcept priority;

	/**
	 * Getter for priority
	 * @return Indicates the urgency of the encounter.
	 */
	public CodeableConcept getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Indicates the urgency of the encounter.
	 */
	public void setPriority(CodeableConcept value) { priority = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The patient ro group present at the encounter.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The patient ro group present at the encounter.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private ArrayList<Reference> episodeOfCare;

	/**
	 * Getter for episodeOfCare
	 * @return Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
	 */
	public ArrayList<Reference> getEpisodeOfCare() { return episodeOfCare; }

	/**
	 * Setter for episodeOfCare
	 * @param value Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
	 */
	public void setEpisodeOfCare(ArrayList<Reference> value) { episodeOfCare = value; }


	@Expose
	private ArrayList<Reference> incomingReferral;

	/**
	 * Getter for incomingReferral
	 * @return The referral request this encounter satisfies (incoming referral).
	 */
	public ArrayList<Reference> getIncomingReferral() { return incomingReferral; }

	/**
	 * Setter for incomingReferral
	 * @param value The referral request this encounter satisfies (incoming referral).
	 */
	public void setIncomingReferral(ArrayList<Reference> value) { incomingReferral = value; }


	@Expose
	private ArrayList<EncounterParticipant> participant;

	/**
	 * Getter for participant
	 * @return The list of people responsible for providing the service.
	 */
	public ArrayList<EncounterParticipant> getParticipant() { return participant; }

	/**
	 * Setter for participant
	 * @param value The list of people responsible for providing the service.
	 */
	public void setParticipant(ArrayList<EncounterParticipant> value) { participant = value; }


	@Expose
	private Reference appointment;

	/**
	 * Getter for appointment
	 * @return The appointment that scheduled this encounter.
	 */
	public Reference getAppointment() { return appointment; }

	/**
	 * Setter for appointment
	 * @param value The appointment that scheduled this encounter.
	 */
	public void setAppointment(Reference value) { appointment = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The start and end time of the encounter.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The start and end time of the encounter.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private Duration length;

	/**
	 * Getter for length
	 * @return Quantity of time the encounter lasted. This excludes the time during leaves of absence.
	 */
	public Duration getLength() { return length; }

	/**
	 * Setter for length
	 * @param value Quantity of time the encounter lasted. This excludes the time during leaves of absence.
	 */
	public void setLength(Duration value) { length = value; }


	@Expose
	private ArrayList<CodeableConcept> reason;

	/**
	 * Getter for reason
	 * @return Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
	 */
	public ArrayList<CodeableConcept> getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
	 */
	public void setReason(ArrayList<CodeableConcept> value) { reason = value; }


	@Expose
	private ArrayList<EncounterDiagnosis> diagnosis;

	/**
	 * Getter for diagnosis
	 * @return The list of diagnosis relevant to this encounter.
	 */
	public ArrayList<EncounterDiagnosis> getDiagnosis() { return diagnosis; }

	/**
	 * Setter for diagnosis
	 * @param value The list of diagnosis relevant to this encounter.
	 */
	public void setDiagnosis(ArrayList<EncounterDiagnosis> value) { diagnosis = value; }


	@Expose
	private ArrayList<Reference> account;

	/**
	 * Getter for account
	 * @return The set of accounts that may be used for billing for this Encounter.
	 */
	public ArrayList<Reference> getAccount() { return account; }

	/**
	 * Setter for account
	 * @param value The set of accounts that may be used for billing for this Encounter.
	 */
	public void setAccount(ArrayList<Reference> value) { account = value; }


	@Expose
	private EncounterHospitalization hospitalization;

	/**
	 * Getter for hospitalization
	 * @return Details about the admission to a healthcare service.
	 */
	public EncounterHospitalization getHospitalization() { return hospitalization; }

	/**
	 * Setter for hospitalization
	 * @param value Details about the admission to a healthcare service.
	 */
	public void setHospitalization(EncounterHospitalization value) { hospitalization = value; }


	@Expose
	private ArrayList<EncounterLocation> location;

	/**
	 * Getter for location
	 * @return List of locations where  the patient has been during this encounter.
	 */
	public ArrayList<EncounterLocation> getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value List of locations where  the patient has been during this encounter.
	 */
	public void setLocation(ArrayList<EncounterLocation> value) { location = value; }


	@Expose
	private Reference serviceProvider;

	/**
	 * Getter for serviceProvider
	 * @return An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.
	 */
	public Reference getServiceProvider() { return serviceProvider; }

	/**
	 * Setter for serviceProvider
	 * @param value An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.
	 */
	public void setServiceProvider(Reference value) { serviceProvider = value; }


	@Expose
	private Reference partOf;

	/**
	 * Getter for partOf
	 * @return Another Encounter of which this encounter is a part of (administratively or in time).
	 */
	public Reference getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value Another Encounter of which this encounter is a part of (administratively or in time).
	 */
	public void setPartOf(Reference value) { partOf = value; }


}
