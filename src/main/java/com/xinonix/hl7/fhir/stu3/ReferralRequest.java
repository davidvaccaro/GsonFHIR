package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization.
 */
public class ReferralRequest extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ReferralRequest resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ReferralRequest resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Business identifier that uniquely identifies the referral/care transfer request instance.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Business identifier that uniquely identifies the referral/care transfer request instance.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> definition;

	/**
	 * Getter for definition
	 * @return A protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
	 */
	public ArrayList<Reference> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value A protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request.
	 */
	public void setDefinition(ArrayList<Reference> value) { definition = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return Indicates any plans, proposals or orders that this request is intended to satisfy - in whole or in part.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value Indicates any plans, proposals or orders that this request is intended to satisfy - in whole or in part.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private ArrayList<Reference> replaces;

	/**
	 * Getter for replaces
	 * @return Completed or terminated request(s) whose function is taken by this new request.
	 */
	public ArrayList<Reference> getReplaces() { return replaces; }

	/**
	 * Setter for replaces
	 * @param value Completed or terminated request(s) whose function is taken by this new request.
	 */
	public void setReplaces(ArrayList<Reference> value) { replaces = value; }


	@Expose
	private Identifier groupIdentifier;

	/**
	 * Getter for groupIdentifier
	 * @return The business identifier of the logical "grouping" request/order that this referral is a part of.
	 */
	public Identifier getGroupIdentifier() { return groupIdentifier; }

	/**
	 * Setter for groupIdentifier
	 * @param value The business identifier of the logical "grouping" request/order that this referral is a part of.
	 */
	public void setGroupIdentifier(Identifier value) { groupIdentifier = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The status of the authorization/intention reflected by the referral request record.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the authorization/intention reflected by the referral request record.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private String intent;

	/**
	 * Getter for intent
	 * @return Distinguishes the "level" of authorization/demand implicit in this request.
	 */
	public String getIntent() { return intent; }

	/**
	 * Setter for intent
	 * @param value Distinguishes the "level" of authorization/demand implicit in this request.
	 */
	public void setIntent(String value) { intent = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return An indication of the type of referral (or where applicable the type of transfer of care) request.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value An indication of the type of referral (or where applicable the type of transfer of care) request.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private String priority;

	/**
	 * Getter for priority
	 * @return An indication of the urgency of referral (or where applicable the type of transfer of care) request.
	 */
	public String getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value An indication of the urgency of referral (or where applicable the type of transfer of care) request.
	 */
	public void setPriority(String value) { priority = value; }


	@Expose
	private ArrayList<CodeableConcept> serviceRequested;

	/**
	 * Getter for serviceRequested
	 * @return The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion.
	 */
	public ArrayList<CodeableConcept> getServiceRequested() { return serviceRequested; }

	/**
	 * Setter for serviceRequested
	 * @param value The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion.
	 */
	public void setServiceRequested(ArrayList<CodeableConcept> value) { serviceRequested = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The patient who is the subject of a referral or transfer of care request.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The patient who is the subject of a referral or transfer of care request.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter at which the request for referral or transfer of care is initiated.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter at which the request for referral or transfer of care is initiated.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date occurrenceDateTime;

	/**
	 * Getter for occurrenceDateTime
	 * @return The period of time within which the services identified in the referral/transfer of care is specified or required to occur.
	 */
	public Date getOccurrenceDateTime() { return occurrenceDateTime; }

	/**
	 * Setter for occurrenceDateTime
	 * @param value The period of time within which the services identified in the referral/transfer of care is specified or required to occur.
	 */
	public void setOccurrenceDateTime(Date value) { occurrenceDateTime = value; }


	@Expose
	private Period occurrencePeriod;

	/**
	 * Getter for occurrencePeriod
	 * @return The period of time within which the services identified in the referral/transfer of care is specified or required to occur.
	 */
	public Period getOccurrencePeriod() { return occurrencePeriod; }

	/**
	 * Setter for occurrencePeriod
	 * @param value The period of time within which the services identified in the referral/transfer of care is specified or required to occur.
	 */
	public void setOccurrencePeriod(Period value) { occurrencePeriod = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date authoredOn;

	/**
	 * Getter for authoredOn
	 * @return Date/DateTime of creation for draft requests and date of activation for active requests.
	 */
	public Date getAuthoredOn() { return authoredOn; }

	/**
	 * Setter for authoredOn
	 * @param value Date/DateTime of creation for draft requests and date of activation for active requests.
	 */
	public void setAuthoredOn(Date value) { authoredOn = value; }


	@Expose
	private ReferralRequestRequester requester;

	/**
	 * Getter for requester
	 * @return The individual who initiated the request and has responsibility for its activation.
	 */
	public ReferralRequestRequester getRequester() { return requester; }

	/**
	 * Setter for requester
	 * @param value The individual who initiated the request and has responsibility for its activation.
	 */
	public void setRequester(ReferralRequestRequester value) { requester = value; }


	@Expose
	private CodeableConcept specialty;

	/**
	 * Getter for specialty
	 * @return Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology.
	 */
	public CodeableConcept getSpecialty() { return specialty; }

	/**
	 * Setter for specialty
	 * @param value Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology.
	 */
	public void setSpecialty(CodeableConcept value) { specialty = value; }


	@Expose
	private ArrayList<Reference> recipient;

	/**
	 * Getter for recipient
	 * @return The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request.
	 */
	public ArrayList<Reference> getRecipient() { return recipient; }

	/**
	 * Setter for recipient
	 * @param value The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request.
	 */
	public void setRecipient(ArrayList<Reference> value) { recipient = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Indicates another resource whose existence justifies this request.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Indicates another resource whose existence justifies this request.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<Reference> supportingInfo;

	/**
	 * Getter for supportingInfo
	 * @return Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan.
	 */
	public ArrayList<Reference> getSupportingInfo() { return supportingInfo; }

	/**
	 * Setter for supportingInfo
	 * @param value Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan.
	 */
	public void setSupportingInfo(ArrayList<Reference> value) { supportingInfo = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Comments made about the referral request by any of the participants.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Comments made about the referral request by any of the participants.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<Reference> relevantHistory;

	/**
	 * Getter for relevantHistory
	 * @return Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
	 */
	public ArrayList<Reference> getRelevantHistory() { return relevantHistory; }

	/**
	 * Setter for relevantHistory
	 * @param value Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
	 */
	public void setRelevantHistory(ArrayList<Reference> value) { relevantHistory = value; }


}
