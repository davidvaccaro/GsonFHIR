package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now, or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains 

The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
 */
public class MedicationStatement extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a MedicationStatement resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a MedicationStatement resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return A plan, proposal or order that is fulfilled in whole or in part by this event.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value A plan, proposal or order that is fulfilled in whole or in part by this event.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private ArrayList<Reference> partOf;

	/**
	 * Getter for partOf
	 * @return A larger event of which this particular event is a component or step.
	 */
	public ArrayList<Reference> getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value A larger event of which this particular event is a component or step.
	 */
	public void setPartOf(ArrayList<Reference> value) { partOf = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter or episode of care that establishes the context for this MedicationStatement.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter or episode of care that establishes the context for this MedicationStatement.
	 */
	public void setContext(Reference value) { context = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("intended") INTENDED,
		@SerializedName("stopped") STOPPED,
		@SerializedName("on-hold") ON_HOLD
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Indicates where type of medication statement and where the medication is expected to be consumed or administered.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Indicates where type of medication statement and where the medication is expected to be consumed or administered.
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
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date effectiveDateTime;

	/**
	 * Getter for effectiveDateTime
	 * @return The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).
	 */
	public Date getEffectiveDateTime() { return effectiveDateTime; }

	/**
	 * Setter for effectiveDateTime
	 * @param value The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).
	 */
	public void setEffectiveDateTime(Date value) { effectiveDateTime = value; }


	@Expose
	private Period effectivePeriod;

	/**
	 * Getter for effectivePeriod
	 * @return The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).
	 */
	public Period getEffectivePeriod() { return effectivePeriod; }

	/**
	 * Setter for effectivePeriod
	 * @param value The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).
	 */
	public void setEffectivePeriod(Period value) { effectivePeriod = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date dateAsserted;

	/**
	 * Getter for dateAsserted
	 * @return The date when the medication statement was asserted by the information source.
	 */
	public Date getDateAsserted() { return dateAsserted; }

	/**
	 * Setter for dateAsserted
	 * @param value The date when the medication statement was asserted by the information source.
	 */
	public void setDateAsserted(Date value) { dateAsserted = value; }


	@Expose
	private Reference informationSource;

	/**
	 * Getter for informationSource
	 * @return The person or organization that provided the information about the taking of this medication. Note: Use derivedFrom when a MedicationStatement is derived from other resources, e.g Claim or MedicationRequest.
	 */
	public Reference getInformationSource() { return informationSource; }

	/**
	 * Setter for informationSource
	 * @param value The person or organization that provided the information about the taking of this medication. Note: Use derivedFrom when a MedicationStatement is derived from other resources, e.g Claim or MedicationRequest.
	 */
	public void setInformationSource(Reference value) { informationSource = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The person, animal or group who is/was taking the medication.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The person, animal or group who is/was taking the medication.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private ArrayList<Reference> derivedFrom;

	/**
	 * Getter for derivedFrom
	 * @return Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is used to derive the MedicationStatement.
	 */
	public ArrayList<Reference> getDerivedFrom() { return derivedFrom; }

	/**
	 * Setter for derivedFrom
	 * @param value Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is used to derive the MedicationStatement.
	 */
	public void setDerivedFrom(ArrayList<Reference> value) { derivedFrom = value; }


	public enum Taken{
		@SerializedName("y") Y,
		@SerializedName("n") N,
		@SerializedName("unk") UNK,
		@SerializedName("na") NA
	}

	@Expose
	private Taken taken;

	/**
	 * Getter for taken
	 * @return Indicator of the certainty of whether the medication was taken by the patient.
	 */
	public Taken getTaken() { return taken; }

	/**
	 * Setter for taken
	 * @param value Indicator of the certainty of whether the medication was taken by the patient.
	 */
	public void setTaken(Taken value) { taken = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonNotTaken;

	/**
	 * Getter for reasonNotTaken
	 * @return A code indicating why the medication was not taken.
	 */
	public ArrayList<CodeableConcept> getReasonNotTaken() { return reasonNotTaken; }

	/**
	 * Setter for reasonNotTaken
	 * @param value A code indicating why the medication was not taken.
	 */
	public void setReasonNotTaken(ArrayList<CodeableConcept> value) { reasonNotTaken = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return A reason for why the medication is being/was taken.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value A reason for why the medication is being/was taken.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Condition or observation that supports why the medication is being/was taken.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Condition or observation that supports why the medication is being/was taken.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Provides extra information about the medication statement that is not conveyed by the other attributes.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Provides extra information about the medication statement that is not conveyed by the other attributes.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<Dosage> dosage;

	/**
	 * Getter for dosage
	 * @return Indicates how the medication is/was or should be taken by the patient.
	 */
	public ArrayList<Dosage> getDosage() { return dosage; }

	/**
	 * Setter for dosage
	 * @param value Indicates how the medication is/was or should be taken by the patient.
	 */
	public void setDosage(ArrayList<Dosage> value) { dosage = value; }


}
