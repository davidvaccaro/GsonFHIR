package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
 */
public class MedicationDispense extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a MedicationDispense resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a MedicationDispense resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> partOf;

	/**
	 * Getter for partOf
	 * @return The procedure that the dispense is done because of.
	 */
	public ArrayList<Reference> getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value The procedure that the dispense is done because of.
	 */
	public void setPartOf(ArrayList<Reference> value) { partOf = value; }


	public enum Status{
		@SerializedName("preparation") PREPARATION,
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("on-hold") ON_HOLD,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("stopped") STOPPED
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return A code specifying the state of the set of dispense events.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value A code specifying the state of the set of dispense events.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Indicates type of medication dispense and where the medication is expected to be consumed or administered.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Indicates type of medication dispense and where the medication is expected to be consumed or administered.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept medicationCodeableConcept;

	/**
	 * Getter for medicationCodeableConcept
	 * @return Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public CodeableConcept getMedicationCodeableConcept() { return medicationCodeableConcept; }

	/**
	 * Setter for medicationCodeableConcept
	 * @param value Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public void setMedicationCodeableConcept(CodeableConcept value) { medicationCodeableConcept = value; }


	@Expose
	private Reference medicationReference;

	/**
	 * Getter for medicationReference
	 * @return Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public Reference getMedicationReference() { return medicationReference; }

	/**
	 * Setter for medicationReference
	 * @param value Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public void setMedicationReference(Reference value) { medicationReference = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return A link to a resource representing the person or the group to whom the medication will be given.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value A link to a resource representing the person or the group to whom the medication will be given.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter or episode of care that establishes the context for this event.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter or episode of care that establishes the context for this event.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	private ArrayList<Reference> supportingInformation;

	/**
	 * Getter for supportingInformation
	 * @return Additional information that supports the medication being dispensed.
	 */
	public ArrayList<Reference> getSupportingInformation() { return supportingInformation; }

	/**
	 * Setter for supportingInformation
	 * @param value Additional information that supports the medication being dispensed.
	 */
	public void setSupportingInformation(ArrayList<Reference> value) { supportingInformation = value; }


	@Expose
	private ArrayList<MedicationDispensePerformer> performer;

	/**
	 * Getter for performer
	 * @return Indicates who or what performed the event.  It should be assumed that the performer is the dispenser of the medication.
	 */
	public ArrayList<MedicationDispensePerformer> getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value Indicates who or what performed the event.  It should be assumed that the performer is the dispenser of the medication.
	 */
	public void setPerformer(ArrayList<MedicationDispensePerformer> value) { performer = value; }


	@Expose
	private ArrayList<Reference> authorizingPrescription;

	/**
	 * Getter for authorizingPrescription
	 * @return Indicates the medication order that is being dispensed against.
	 */
	public ArrayList<Reference> getAuthorizingPrescription() { return authorizingPrescription; }

	/**
	 * Setter for authorizingPrescription
	 * @param value Indicates the medication order that is being dispensed against.
	 */
	public void setAuthorizingPrescription(ArrayList<Reference> value) { authorizingPrescription = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The amount of medication that has been dispensed. Includes unit of measure.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The amount of medication that has been dispensed. Includes unit of measure.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private Quantity daysSupply;

	/**
	 * Getter for daysSupply
	 * @return The amount of medication expressed as a timing amount.
	 */
	public Quantity getDaysSupply() { return daysSupply; }

	/**
	 * Setter for daysSupply
	 * @param value The amount of medication expressed as a timing amount.
	 */
	public void setDaysSupply(Quantity value) { daysSupply = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date whenPrepared;

	/**
	 * Getter for whenPrepared
	 * @return The time when the dispensed product was packaged and reviewed.
	 */
	public Date getWhenPrepared() { return whenPrepared; }

	/**
	 * Setter for whenPrepared
	 * @param value The time when the dispensed product was packaged and reviewed.
	 */
	public void setWhenPrepared(Date value) { whenPrepared = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date whenHandedOver;

	/**
	 * Getter for whenHandedOver
	 * @return The time the dispensed product was provided to the patient or their representative.
	 */
	public Date getWhenHandedOver() { return whenHandedOver; }

	/**
	 * Setter for whenHandedOver
	 * @param value The time the dispensed product was provided to the patient or their representative.
	 */
	public void setWhenHandedOver(Date value) { whenHandedOver = value; }


	@Expose
	private Reference destination;

	/**
	 * Getter for destination
	 * @return Identification of the facility/location where the medication was shipped to, as part of the dispense event.
	 */
	public Reference getDestination() { return destination; }

	/**
	 * Setter for destination
	 * @param value Identification of the facility/location where the medication was shipped to, as part of the dispense event.
	 */
	public void setDestination(Reference value) { destination = value; }


	@Expose
	private ArrayList<Reference> receiver;

	/**
	 * Getter for receiver
	 * @return Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.
	 */
	public ArrayList<Reference> getReceiver() { return receiver; }

	/**
	 * Setter for receiver
	 * @param value Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.
	 */
	public void setReceiver(ArrayList<Reference> value) { receiver = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Extra information about the dispense that could not be conveyed in the other attributes.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Extra information about the dispense that could not be conveyed in the other attributes.
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
	private MedicationDispenseSubstitution substitution;

	/**
	 * Getter for substitution
	 * @return Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.  If nothing is specified, substitution was not done.
	 */
	public MedicationDispenseSubstitution getSubstitution() { return substitution; }

	/**
	 * Setter for substitution
	 * @param value Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.  If nothing is specified, substitution was not done.
	 */
	public void setSubstitution(MedicationDispenseSubstitution value) { substitution = value; }


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
	private boolean notDone;

	/**
	 * Getter for notDone
	 * @return True if the dispense was not performed for some reason.
	 */
	public boolean getNotDone() { return notDone; }

	/**
	 * Setter for notDone
	 * @param value True if the dispense was not performed for some reason.
	 */
	public void setNotDone(boolean value) { notDone = value; }


	@Expose
	private CodeableConcept notDoneReasonCodeableConcept;

	/**
	 * Getter for notDoneReasonCodeableConcept
	 * @return Indicates the reason why a dispense was not performed.
	 */
	public CodeableConcept getNotDoneReasonCodeableConcept() { return notDoneReasonCodeableConcept; }

	/**
	 * Setter for notDoneReasonCodeableConcept
	 * @param value Indicates the reason why a dispense was not performed.
	 */
	public void setNotDoneReasonCodeableConcept(CodeableConcept value) { notDoneReasonCodeableConcept = value; }


	@Expose
	private Reference notDoneReasonReference;

	/**
	 * Getter for notDoneReasonReference
	 * @return Indicates the reason why a dispense was not performed.
	 */
	public Reference getNotDoneReasonReference() { return notDoneReasonReference; }

	/**
	 * Setter for notDoneReasonReference
	 * @param value Indicates the reason why a dispense was not performed.
	 */
	public void setNotDoneReasonReference(Reference value) { notDoneReasonReference = value; }


	@Expose
	private ArrayList<Reference> eventHistory;

	/**
	 * Getter for eventHistory
	 * @return A summary of the events of interest that have occurred, such as when the dispense was verified.
	 */
	public ArrayList<Reference> getEventHistory() { return eventHistory; }

	/**
	 * Setter for eventHistory
	 * @param value A summary of the events of interest that have occurred, such as when the dispense was verified.
	 */
	public void setEventHistory(ArrayList<Reference> value) { eventHistory = value; }


}
