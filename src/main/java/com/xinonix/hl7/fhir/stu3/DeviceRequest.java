package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
 */
public class DeviceRequest extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a DeviceRequest resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a DeviceRequest resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifiers assigned to this order by the orderer or by the receiver.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifiers assigned to this order by the orderer or by the receiver.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> definition;

	/**
	 * Getter for definition
	 * @return Protocol or definition followed by this request. For example: The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%.
	 */
	public ArrayList<Reference> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value Protocol or definition followed by this request. For example: The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%.
	 */
	public void setDefinition(ArrayList<Reference> value) { definition = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return Plan/proposal/order fulfilled by this request.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value Plan/proposal/order fulfilled by this request.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private ArrayList<Reference> priorRequest;

	/**
	 * Getter for priorRequest
	 * @return The request takes the place of the referenced completed or terminated request(s).
	 */
	public ArrayList<Reference> getPriorRequest() { return priorRequest; }

	/**
	 * Setter for priorRequest
	 * @param value The request takes the place of the referenced completed or terminated request(s).
	 */
	public void setPriorRequest(ArrayList<Reference> value) { priorRequest = value; }


	@Expose
	private Identifier groupIdentifier;

	/**
	 * Getter for groupIdentifier
	 * @return Composite request this is part of.
	 */
	public Identifier getGroupIdentifier() { return groupIdentifier; }

	/**
	 * Setter for groupIdentifier
	 * @param value Composite request this is part of.
	 */
	public void setGroupIdentifier(Identifier value) { groupIdentifier = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The status of the request.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the request.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private CodeableConcept intent;

	/**
	 * Getter for intent
	 * @return Whether the request is a proposal, plan, an original order or a reflex order.
	 */
	public CodeableConcept getIntent() { return intent; }

	/**
	 * Setter for intent
	 * @param value Whether the request is a proposal, plan, an original order or a reflex order.
	 */
	public void setIntent(CodeableConcept value) { intent = value; }


	@Expose
	private String priority;

	/**
	 * Getter for priority
	 * @return Indicates how quickly the {{title}} should be addressed with respect to other requests.
	 */
	public String getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Indicates how quickly the {{title}} should be addressed with respect to other requests.
	 */
	public void setPriority(String value) { priority = value; }


	@Expose
	private Reference codeReference;

	/**
	 * Getter for codeReference
	 * @return The details of the device to be used.
	 */
	public Reference getCodeReference() { return codeReference; }

	/**
	 * Setter for codeReference
	 * @param value The details of the device to be used.
	 */
	public void setCodeReference(Reference value) { codeReference = value; }


	@Expose
	private CodeableConcept codeCodeableConcept;

	/**
	 * Getter for codeCodeableConcept
	 * @return The details of the device to be used.
	 */
	public CodeableConcept getCodeCodeableConcept() { return codeCodeableConcept; }

	/**
	 * Setter for codeCodeableConcept
	 * @param value The details of the device to be used.
	 */
	public void setCodeCodeableConcept(CodeableConcept value) { codeCodeableConcept = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The patient who will use the device.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The patient who will use the device.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return An encounter that provides additional context in which this request is made.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value An encounter that provides additional context in which this request is made.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date occurrenceDateTime;

	/**
	 * Getter for occurrenceDateTime
	 * @return The timing schedule for the use of the device. The Schedule data type allows many different expressions, for example. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
	 */
	public Date getOccurrenceDateTime() { return occurrenceDateTime; }

	/**
	 * Setter for occurrenceDateTime
	 * @param value The timing schedule for the use of the device. The Schedule data type allows many different expressions, for example. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
	 */
	public void setOccurrenceDateTime(Date value) { occurrenceDateTime = value; }


	@Expose
	private Period occurrencePeriod;

	/**
	 * Getter for occurrencePeriod
	 * @return The timing schedule for the use of the device. The Schedule data type allows many different expressions, for example. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
	 */
	public Period getOccurrencePeriod() { return occurrencePeriod; }

	/**
	 * Setter for occurrencePeriod
	 * @param value The timing schedule for the use of the device. The Schedule data type allows many different expressions, for example. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
	 */
	public void setOccurrencePeriod(Period value) { occurrencePeriod = value; }


	@Expose
	private Timing occurrenceTiming;

	/**
	 * Getter for occurrenceTiming
	 * @return The timing schedule for the use of the device. The Schedule data type allows many different expressions, for example. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
	 */
	public Timing getOccurrenceTiming() { return occurrenceTiming; }

	/**
	 * Setter for occurrenceTiming
	 * @param value The timing schedule for the use of the device. The Schedule data type allows many different expressions, for example. "Every 8 hours"; "Three times a day"; "1/2 an hour before breakfast for 10 days from 23-Dec 2011:"; "15 Oct 2013, 17 Oct 2013 and 1 Nov 2013".
	 */
	public void setOccurrenceTiming(Timing value) { occurrenceTiming = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date authoredOn;

	/**
	 * Getter for authoredOn
	 * @return When the request transitioned to being actionable.
	 */
	public Date getAuthoredOn() { return authoredOn; }

	/**
	 * Setter for authoredOn
	 * @param value When the request transitioned to being actionable.
	 */
	public void setAuthoredOn(Date value) { authoredOn = value; }


	@Expose
	private DeviceRequestRequester requester;

	/**
	 * Getter for requester
	 * @return The individual who initiated the request and has responsibility for its activation.
	 */
	public DeviceRequestRequester getRequester() { return requester; }

	/**
	 * Setter for requester
	 * @param value The individual who initiated the request and has responsibility for its activation.
	 */
	public void setRequester(DeviceRequestRequester value) { requester = value; }


	@Expose
	private CodeableConcept performerType;

	/**
	 * Getter for performerType
	 * @return Desired type of performer for doing the diagnostic testing.
	 */
	public CodeableConcept getPerformerType() { return performerType; }

	/**
	 * Setter for performerType
	 * @param value Desired type of performer for doing the diagnostic testing.
	 */
	public void setPerformerType(CodeableConcept value) { performerType = value; }


	@Expose
	private Reference performer;

	/**
	 * Getter for performer
	 * @return The desired perfomer for doing the diagnostic testing.
	 */
	public Reference getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value The desired perfomer for doing the diagnostic testing.
	 */
	public void setPerformer(Reference value) { performer = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return Reason or justification for the use of this device.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value Reason or justification for the use of this device.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Reason or justification for the use of this device.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Reason or justification for the use of this device.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private ArrayList<Reference> supportingInfo;

	/**
	 * Getter for supportingInfo
	 * @return Additional clinical information about the patient that may influence the request fulfilment.  For example, this may includes body where on the subject's the device will be used ( i.e. the target site).
	 */
	public ArrayList<Reference> getSupportingInfo() { return supportingInfo; }

	/**
	 * Setter for supportingInfo
	 * @param value Additional clinical information about the patient that may influence the request fulfilment.  For example, this may includes body where on the subject's the device will be used ( i.e. the target site).
	 */
	public void setSupportingInfo(ArrayList<Reference> value) { supportingInfo = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<Reference> relevantHistory;

	/**
	 * Getter for relevantHistory
	 * @return Key events in the history of the request.
	 */
	public ArrayList<Reference> getRelevantHistory() { return relevantHistory; }

	/**
	 * Setter for relevantHistory
	 * @param value Key events in the history of the request.
	 */
	public void setRelevantHistory(ArrayList<Reference> value) { relevantHistory = value; }


}
