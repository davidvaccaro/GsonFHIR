package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 */
public class MedicationAdministration extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a MedicationAdministration resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a MedicationAdministration resource
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
	private ArrayList<Reference> definition;

	/**
	 * Getter for definition
	 * @return A protocol, guideline, orderset or other definition that was adhered to in whole or in part by this event.
	 */
	public ArrayList<Reference> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value A protocol, guideline, orderset or other definition that was adhered to in whole or in part by this event.
	 */
	public void setDefinition(ArrayList<Reference> value) { definition = value; }


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


	public enum Status{
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("on-hold") ON_HOLD,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("stopped") STOPPED,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Indicates the type of medication administration and where the medication is expected to be consumed or administered.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Indicates the type of medication administration and where the medication is expected to be consumed or administered.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept medicationCodeableConcept;

	/**
	 * Getter for medicationCodeableConcept
	 * @return Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public CodeableConcept getMedicationCodeableConcept() { return medicationCodeableConcept; }

	/**
	 * Setter for medicationCodeableConcept
	 * @param value Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public void setMedicationCodeableConcept(CodeableConcept value) { medicationCodeableConcept = value; }


	@Expose
	private Reference medicationReference;

	/**
	 * Getter for medicationReference
	 * @return Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public Reference getMedicationReference() { return medicationReference; }

	/**
	 * Setter for medicationReference
	 * @param value Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
	 */
	public void setMedicationReference(Reference value) { medicationReference = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The person or animal or group receiving the medication.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The person or animal or group receiving the medication.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	private ArrayList<Reference> supportingInformation;

	/**
	 * Getter for supportingInformation
	 * @return Additional information (for example, patient height and weight) that supports the administration of the medication.
	 */
	public ArrayList<Reference> getSupportingInformation() { return supportingInformation; }

	/**
	 * Setter for supportingInformation
	 * @param value Additional information (for example, patient height and weight) that supports the administration of the medication.
	 */
	public void setSupportingInformation(ArrayList<Reference> value) { supportingInformation = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date effectiveDateTime;

	/**
	 * Getter for effectiveDateTime
	 * @return A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
	 */
	public Date getEffectiveDateTime() { return effectiveDateTime; }

	/**
	 * Setter for effectiveDateTime
	 * @param value A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
	 */
	public void setEffectiveDateTime(Date value) { effectiveDateTime = value; }


	@Expose
	private Period effectivePeriod;

	/**
	 * Getter for effectivePeriod
	 * @return A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
	 */
	public Period getEffectivePeriod() { return effectivePeriod; }

	/**
	 * Setter for effectivePeriod
	 * @param value A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
	 */
	public void setEffectivePeriod(Period value) { effectivePeriod = value; }


	@Expose
	private ArrayList<MedicationAdministrationPerformer> performer;

	/**
	 * Getter for performer
	 * @return The individual who was responsible for giving the medication to the patient.
	 */
	public ArrayList<MedicationAdministrationPerformer> getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value The individual who was responsible for giving the medication to the patient.
	 */
	public void setPerformer(ArrayList<MedicationAdministrationPerformer> value) { performer = value; }


	@Expose
	private boolean notGiven;

	/**
	 * Getter for notGiven
	 * @return Set this to true if the record is saying that the medication was NOT administered.
	 */
	public boolean getNotGiven() { return notGiven; }

	/**
	 * Setter for notGiven
	 * @param value Set this to true if the record is saying that the medication was NOT administered.
	 */
	public void setNotGiven(boolean value) { notGiven = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonNotGiven;

	/**
	 * Getter for reasonNotGiven
	 * @return A code indicating why the administration was not performed.
	 */
	public ArrayList<CodeableConcept> getReasonNotGiven() { return reasonNotGiven; }

	/**
	 * Setter for reasonNotGiven
	 * @param value A code indicating why the administration was not performed.
	 */
	public void setReasonNotGiven(ArrayList<CodeableConcept> value) { reasonNotGiven = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return A code indicating why the medication was given.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value A code indicating why the medication was given.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Condition or observation that supports why the medication was administered.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Condition or observation that supports why the medication was administered.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private Reference prescription;

	/**
	 * Getter for prescription
	 * @return The original request, instruction or authority to perform the administration.
	 */
	public Reference getPrescription() { return prescription; }

	/**
	 * Setter for prescription
	 * @param value The original request, instruction or authority to perform the administration.
	 */
	public void setPrescription(Reference value) { prescription = value; }


	@Expose
	private ArrayList<Reference> device;

	/**
	 * Getter for device
	 * @return The device used in administering the medication to the patient.  For example, a particular infusion pump.
	 */
	public ArrayList<Reference> getDevice() { return device; }

	/**
	 * Setter for device
	 * @param value The device used in administering the medication to the patient.  For example, a particular infusion pump.
	 */
	public void setDevice(ArrayList<Reference> value) { device = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Extra information about the medication administration that is not conveyed by the other attributes.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Extra information about the medication administration that is not conveyed by the other attributes.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private MedicationAdministrationDosage dosage;

	/**
	 * Getter for dosage
	 * @return Describes the medication dosage information details e.g. dose, rate, site, route, etc.
	 */
	public MedicationAdministrationDosage getDosage() { return dosage; }

	/**
	 * Setter for dosage
	 * @param value Describes the medication dosage information details e.g. dose, rate, site, route, etc.
	 */
	public void setDosage(MedicationAdministrationDosage value) { dosage = value; }


	@Expose
	private ArrayList<Reference> eventHistory;

	/**
	 * Getter for eventHistory
	 * @return A summary of the events of interest that have occurred, such as when the administration was verified.
	 */
	public ArrayList<Reference> getEventHistory() { return eventHistory; }

	/**
	 * Setter for eventHistory
	 * @param value A summary of the events of interest that have occurred, such as when the administration was verified.
	 */
	public void setEventHistory(ArrayList<Reference> value) { eventHistory = value; }


}
