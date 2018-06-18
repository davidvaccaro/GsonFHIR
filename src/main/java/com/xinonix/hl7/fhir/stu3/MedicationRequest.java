package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 */
public class MedicationRequest extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a MedicationRequest resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a MedicationRequest resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return This records identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. For example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records must be tracked through an entire system.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value This records identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. For example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records must be tracked through an entire system.
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
	 * @return A plan or request that is fulfilled in whole or in part by this medication request.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value A plan or request that is fulfilled in whole or in part by this medication request.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private Identifier groupIdentifier;

	/**
	 * Getter for groupIdentifier
	 * @return A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription.
	 */
	public Identifier getGroupIdentifier() { return groupIdentifier; }

	/**
	 * Setter for groupIdentifier
	 * @param value A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription.
	 */
	public void setGroupIdentifier(Identifier value) { groupIdentifier = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("on-hold") ON_HOLD,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("stopped") STOPPED,
		@SerializedName("draft") DRAFT,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return A code specifying the current state of the order.  Generally this will be active or completed state.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value A code specifying the current state of the order.  Generally this will be active or completed state.
	 */
	public void setStatus(Status value) { status = value; }


	public enum Intent{
		@SerializedName("proposal") PROPOSAL,
		@SerializedName("plan") PLAN,
		@SerializedName("order") ORDER,
		@SerializedName("instance-order") INSTANCE_ORDER
	}

	@Expose
	private Intent intent;

	/**
	 * Getter for intent
	 * @return Whether the request is a proposal, plan, or an original order.
	 */
	public Intent getIntent() { return intent; }

	/**
	 * Setter for intent
	 * @param value Whether the request is a proposal, plan, or an original order.
	 */
	public void setIntent(Intent value) { intent = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Indicates the type of medication order and where the medication is expected to be consumed or administered.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Indicates the type of medication order and where the medication is expected to be consumed or administered.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	public enum Priority{
		@SerializedName("routine") ROUTINE,
		@SerializedName("urgent") URGENT,
		@SerializedName("stat") STAT,
		@SerializedName("asap") ASAP
	}

	@Expose
	private Priority priority;

	/**
	 * Getter for priority
	 * @return Indicates how quickly the Medication Request should be addressed with respect to other requests.
	 */
	public Priority getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Indicates how quickly the Medication Request should be addressed with respect to other requests.
	 */
	public void setPriority(Priority value) { priority = value; }


	@Expose
	private CodeableConcept medicationCodeableConcept;

	/**
	 * Getter for medicationCodeableConcept
	 * @return Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public CodeableConcept getMedicationCodeableConcept() { return medicationCodeableConcept; }

	/**
	 * Setter for medicationCodeableConcept
	 * @param value Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public void setMedicationCodeableConcept(CodeableConcept value) { medicationCodeableConcept = value; }


	@Expose
	private Reference medicationReference;

	/**
	 * Getter for medicationReference
	 * @return Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public Reference getMedicationReference() { return medicationReference; }

	/**
	 * Setter for medicationReference
	 * @param value Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public void setMedicationReference(Reference value) { medicationReference = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return A link to a resource representing the person or set of individuals to whom the medication will be given.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value A link to a resource representing the person or set of individuals to whom the medication will be given.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return A link to an encounter, or episode of care, that identifies the particular occurrence or set occurrences of contact between patient and health care provider.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value A link to an encounter, or episode of care, that identifies the particular occurrence or set occurrences of contact between patient and health care provider.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	private ArrayList<Reference> supportingInformation;

	/**
	 * Getter for supportingInformation
	 * @return Include additional information (for example, patient height and weight) that supports the ordering of the medication.
	 */
	public ArrayList<Reference> getSupportingInformation() { return supportingInformation; }

	/**
	 * Setter for supportingInformation
	 * @param value Include additional information (for example, patient height and weight) that supports the ordering of the medication.
	 */
	public void setSupportingInformation(ArrayList<Reference> value) { supportingInformation = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date authoredOn;

	/**
	 * Getter for authoredOn
	 * @return The date (and perhaps time) when the prescription was initially written or authored on.
	 */
	public Date getAuthoredOn() { return authoredOn; }

	/**
	 * Setter for authoredOn
	 * @param value The date (and perhaps time) when the prescription was initially written or authored on.
	 */
	public void setAuthoredOn(Date value) { authoredOn = value; }


	@Expose
	private MedicationRequestRequester requester;

	/**
	 * Getter for requester
	 * @return The individual, organization or device that initiated the request and has responsibility for its activation.
	 */
	public MedicationRequestRequester getRequester() { return requester; }

	/**
	 * Setter for requester
	 * @param value The individual, organization or device that initiated the request and has responsibility for its activation.
	 */
	public void setRequester(MedicationRequestRequester value) { requester = value; }


	@Expose
	private Reference recorder;

	/**
	 * Getter for recorder
	 * @return The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order.
	 */
	public Reference getRecorder() { return recorder; }

	/**
	 * Setter for recorder
	 * @param value The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order.
	 */
	public void setRecorder(Reference value) { recorder = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return The reason or the indication for ordering the medication.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value The reason or the indication for ordering the medication.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Condition or observation that supports why the medication was ordered.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Condition or observation that supports why the medication was ordered.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Extra information about the prescription that could not be conveyed by the other attributes.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Extra information about the prescription that could not be conveyed by the other attributes.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<Dosage> dosageInstruction;

	/**
	 * Getter for dosageInstruction
	 * @return Indicates how the medication is to be used by the patient.
	 */
	public ArrayList<Dosage> getDosageInstruction() { return dosageInstruction; }

	/**
	 * Setter for dosageInstruction
	 * @param value Indicates how the medication is to be used by the patient.
	 */
	public void setDosageInstruction(ArrayList<Dosage> value) { dosageInstruction = value; }


	@Expose
	private MedicationRequestDispenseRequest dispenseRequest;

	/**
	 * Getter for dispenseRequest
	 * @return Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
	 */
	public MedicationRequestDispenseRequest getDispenseRequest() { return dispenseRequest; }

	/**
	 * Setter for dispenseRequest
	 * @param value Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
	 */
	public void setDispenseRequest(MedicationRequestDispenseRequest value) { dispenseRequest = value; }


	@Expose
	private MedicationRequestSubstitution substitution;

	/**
	 * Getter for substitution
	 * @return Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done.
	 */
	public MedicationRequestSubstitution getSubstitution() { return substitution; }

	/**
	 * Setter for substitution
	 * @param value Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done.
	 */
	public void setSubstitution(MedicationRequestSubstitution value) { substitution = value; }


	@Expose
	private Reference priorPrescription;

	/**
	 * Getter for priorPrescription
	 * @return A link to a resource representing an earlier order related order or prescription.
	 */
	public Reference getPriorPrescription() { return priorPrescription; }

	/**
	 * Setter for priorPrescription
	 * @param value A link to a resource representing an earlier order related order or prescription.
	 */
	public void setPriorPrescription(Reference value) { priorPrescription = value; }


	@Expose
	private ArrayList<Reference> detectedIssue;

	/**
	 * Getter for detectedIssue
	 * @return Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.
	 */
	public ArrayList<Reference> getDetectedIssue() { return detectedIssue; }

	/**
	 * Setter for detectedIssue
	 * @param value Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.
	 */
	public void setDetectedIssue(ArrayList<Reference> value) { detectedIssue = value; }


	@Expose
	private ArrayList<Reference> eventHistory;

	/**
	 * Getter for eventHistory
	 * @return Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
	 */
	public ArrayList<Reference> getEventHistory() { return eventHistory; }

	/**
	 * Setter for eventHistory
	 * @param value Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
	 */
	public void setEventHistory(ArrayList<Reference> value) { eventHistory = value; }


}
