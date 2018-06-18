package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 */
public class ProcedureRequest extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ProcedureRequest resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ProcedureRequest resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> definition;

	/**
	 * Getter for definition
	 * @return Protocol or definition followed by this request.
	 */
	public ArrayList<Reference> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value Protocol or definition followed by this request.
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
	private ArrayList<Reference> replaces;

	/**
	 * Getter for replaces
	 * @return The request takes the place of the referenced completed or terminated request(s).
	 */
	public ArrayList<Reference> getReplaces() { return replaces; }

	/**
	 * Setter for replaces
	 * @param value The request takes the place of the referenced completed or terminated request(s).
	 */
	public void setReplaces(ArrayList<Reference> value) { replaces = value; }


	@Expose
	private Identifier requisition;

	/**
	 * Getter for requisition
	 * @return A shared identifier common to all procedure or diagnostic requests that were authorized more or less simultaneously by a single author, representing the composite or group identifier.
	 */
	public Identifier getRequisition() { return requisition; }

	/**
	 * Setter for requisition
	 * @param value A shared identifier common to all procedure or diagnostic requests that were authorized more or less simultaneously by a single author, representing the composite or group identifier.
	 */
	public void setRequisition(Identifier value) { requisition = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The status of the order.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the order.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private String intent;

	/**
	 * Getter for intent
	 * @return Whether the request is a proposal, plan, an original order or a reflex order.
	 */
	public String getIntent() { return intent; }

	/**
	 * Setter for intent
	 * @param value Whether the request is a proposal, plan, an original order or a reflex order.
	 */
	public void setIntent(String value) { intent = value; }


	@Expose
	private String priority;

	/**
	 * Getter for priority
	 * @return Indicates how quickly the ProcedureRequest should be addressed with respect to other requests.
	 */
	public String getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Indicates how quickly the ProcedureRequest should be addressed with respect to other requests.
	 */
	public void setPriority(String value) { priority = value; }


	@Expose
	private boolean doNotPerform;

	/**
	 * Getter for doNotPerform
	 * @return Set this to true if the record is saying that the procedure should NOT be performed.
	 */
	public boolean getDoNotPerform() { return doNotPerform; }

	/**
	 * Setter for doNotPerform
	 * @param value Set this to true if the record is saying that the procedure should NOT be performed.
	 */
	public void setDoNotPerform(boolean value) { doNotPerform = value; }


	@Expose
	private ArrayList<CodeableConcept> category;

	/**
	 * Getter for category
	 * @return A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
	 */
	public ArrayList<CodeableConcept> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
	 */
	public void setCategory(ArrayList<CodeableConcept> value) { category = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return A code that identifies a particular procedure, diagnostic investigation, or panel of investigations, that have been requested.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code that identifies a particular procedure, diagnostic investigation, or panel of investigations, that have been requested.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return On whom or what the procedure or diagnostic is to be performed. This is usually a human patient, but can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value On whom or what the procedure or diagnostic is to be performed. This is usually a human patient, but can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return An encounter or episode of care that provides additional information about the healthcare context in which this request is made.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value An encounter or episode of care that provides additional information about the healthcare context in which this request is made.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date occurrenceDateTime;

	/**
	 * Getter for occurrenceDateTime
	 * @return The date/time at which the diagnostic testing should occur.
	 */
	public Date getOccurrenceDateTime() { return occurrenceDateTime; }

	/**
	 * Setter for occurrenceDateTime
	 * @param value The date/time at which the diagnostic testing should occur.
	 */
	public void setOccurrenceDateTime(Date value) { occurrenceDateTime = value; }


	@Expose
	private Period occurrencePeriod;

	/**
	 * Getter for occurrencePeriod
	 * @return The date/time at which the diagnostic testing should occur.
	 */
	public Period getOccurrencePeriod() { return occurrencePeriod; }

	/**
	 * Setter for occurrencePeriod
	 * @param value The date/time at which the diagnostic testing should occur.
	 */
	public void setOccurrencePeriod(Period value) { occurrencePeriod = value; }


	@Expose
	private Timing occurrenceTiming;

	/**
	 * Getter for occurrenceTiming
	 * @return The date/time at which the diagnostic testing should occur.
	 */
	public Timing getOccurrenceTiming() { return occurrenceTiming; }

	/**
	 * Setter for occurrenceTiming
	 * @param value The date/time at which the diagnostic testing should occur.
	 */
	public void setOccurrenceTiming(Timing value) { occurrenceTiming = value; }


	@Expose
	private boolean asNeededBoolean;

	/**
	 * Getter for asNeededBoolean
	 * @return If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.  For example "pain", "on flare-up", etc.
	 */
	public boolean getAsNeededBoolean() { return asNeededBoolean; }

	/**
	 * Setter for asNeededBoolean
	 * @param value If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.  For example "pain", "on flare-up", etc.
	 */
	public void setAsNeededBoolean(boolean value) { asNeededBoolean = value; }


	@Expose
	private CodeableConcept asNeededCodeableConcept;

	/**
	 * Getter for asNeededCodeableConcept
	 * @return If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.  For example "pain", "on flare-up", etc.
	 */
	public CodeableConcept getAsNeededCodeableConcept() { return asNeededCodeableConcept; }

	/**
	 * Setter for asNeededCodeableConcept
	 * @param value If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.  For example "pain", "on flare-up", etc.
	 */
	public void setAsNeededCodeableConcept(CodeableConcept value) { asNeededCodeableConcept = value; }


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
	private ProcedureRequestRequester requester;

	/**
	 * Getter for requester
	 * @return The individual who initiated the request and has responsibility for its activation.
	 */
	public ProcedureRequestRequester getRequester() { return requester; }

	/**
	 * Setter for requester
	 * @param value The individual who initiated the request and has responsibility for its activation.
	 */
	public void setRequester(ProcedureRequestRequester value) { requester = value; }


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
	 * @return The desired perfomer for doing the diagnostic testing.  For example, the surgeon, dermatopathologist, endoscopist, etc.
	 */
	public Reference getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value The desired perfomer for doing the diagnostic testing.  For example, the surgeon, dermatopathologist, endoscopist, etc.
	 */
	public void setPerformer(Reference value) { performer = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return An explanation or justification for why this diagnostic investigation is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value An explanation or justification for why this diagnostic investigation is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Indicates another resource that provides a justification for why this diagnostic investigation is being requested.   May relate to the resources referred to in supportingInformation.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Indicates another resource that provides a justification for why this diagnostic investigation is being requested.   May relate to the resources referred to in supportingInformation.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private ArrayList<Reference> supportingInfo;

	/**
	 * Getter for supportingInfo
	 * @return Additional clinical information about the patient or specimen that may influence the procedure or diagnostics or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as "ask at order entry questions (AOEs)".  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements.
	 */
	public ArrayList<Reference> getSupportingInfo() { return supportingInfo; }

	/**
	 * Setter for supportingInfo
	 * @param value Additional clinical information about the patient or specimen that may influence the procedure or diagnostics or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as "ask at order entry questions (AOEs)".  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements.
	 */
	public void setSupportingInfo(ArrayList<Reference> value) { supportingInfo = value; }


	@Expose
	private ArrayList<Reference> specimen;

	/**
	 * Getter for specimen
	 * @return One or more specimens that the laboratory procedure will use.
	 */
	public ArrayList<Reference> getSpecimen() { return specimen; }

	/**
	 * Setter for specimen
	 * @param value One or more specimens that the laboratory procedure will use.
	 */
	public void setSpecimen(ArrayList<Reference> value) { specimen = value; }


	@Expose
	private ArrayList<CodeableConcept> bodySite;

	/**
	 * Getter for bodySite
	 * @return Anatomic location where the procedure should be performed. This is the target site.
	 */
	public ArrayList<CodeableConcept> getBodySite() { return bodySite; }

	/**
	 * Setter for bodySite
	 * @param value Anatomic location where the procedure should be performed. This is the target site.
	 */
	public void setBodySite(ArrayList<CodeableConcept> value) { bodySite = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Any other notes and comments made about the service request. For example, letting provider know that "patient hates needles" or other provider instructions.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Any other notes and comments made about the service request. For example, letting provider know that "patient hates needles" or other provider instructions.
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
