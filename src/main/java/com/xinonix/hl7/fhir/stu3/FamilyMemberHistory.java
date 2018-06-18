package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 */
public class FamilyMemberHistory extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a FamilyMemberHistory resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a FamilyMemberHistory resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> definition;

	/**
	 * Getter for definition
	 * @return A protocol or questionnaire that was adhered to in whole or in part by this event.
	 */
	public ArrayList<Reference> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value A protocol or questionnaire that was adhered to in whole or in part by this event.
	 */
	public void setDefinition(ArrayList<Reference> value) { definition = value; }


	public enum Status{
		@SerializedName("partial") PARTIAL,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("health-unknown") HEALTH_UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return A code specifying the status of the record of the family history of a specific family member.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value A code specifying the status of the record of the family history of a specific family member.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean notDone;

	/**
	 * Getter for notDone
	 * @return If true, indicates the taking of an individual family member's history did not occur. The notDone element should not be used to document negated conditions, such as a family member that did not have a condition.
	 */
	public boolean getNotDone() { return notDone; }

	/**
	 * Setter for notDone
	 * @param value If true, indicates the taking of an individual family member's history did not occur. The notDone element should not be used to document negated conditions, such as a family member that did not have a condition.
	 */
	public void setNotDone(boolean value) { notDone = value; }


	@Expose
	private CodeableConcept notDoneReason;

	/**
	 * Getter for notDoneReason
	 * @return Describes why the family member's history is absent.
	 */
	public CodeableConcept getNotDoneReason() { return notDoneReason; }

	/**
	 * Setter for notDoneReason
	 * @param value Describes why the family member's history is absent.
	 */
	public void setNotDoneReason(CodeableConcept value) { notDoneReason = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The person who this history concerns.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The person who this history concerns.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date (and possibly time) when the family member history was taken.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date (and possibly time) when the family member history was taken.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".
	 */
	public void setName(String value) { name = value; }


	@Expose
	private CodeableConcept relationship;

	/**
	 * Getter for relationship
	 * @return The type of relationship this person has to the patient (father, mother, brother etc.).
	 */
	public CodeableConcept getRelationship() { return relationship; }

	/**
	 * Setter for relationship
	 * @param value The type of relationship this person has to the patient (father, mother, brother etc.).
	 */
	public void setRelationship(CodeableConcept value) { relationship = value; }


	public enum Gender{
		@SerializedName("male") MALE,
		@SerializedName("female") FEMALE,
		@SerializedName("other") OTHER,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Gender gender;

	/**
	 * Getter for gender
	 * @return Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
	 */
	public Gender getGender() { return gender; }

	/**
	 * Setter for gender
	 * @param value Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
	 */
	public void setGender(Gender value) { gender = value; }


	@Expose
	private Period bornPeriod;

	/**
	 * Getter for bornPeriod
	 * @return The actual or approximate date of birth of the relative.
	 */
	public Period getBornPeriod() { return bornPeriod; }

	/**
	 * Setter for bornPeriod
	 * @param value The actual or approximate date of birth of the relative.
	 */
	public void setBornPeriod(Period value) { bornPeriod = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date bornDate;

	/**
	 * Getter for bornDate
	 * @return The actual or approximate date of birth of the relative.
	 */
	public Date getBornDate() { return bornDate; }

	/**
	 * Setter for bornDate
	 * @param value The actual or approximate date of birth of the relative.
	 */
	public void setBornDate(Date value) { bornDate = value; }


	@Expose
	private String bornString;

	/**
	 * Getter for bornString
	 * @return The actual or approximate date of birth of the relative.
	 */
	public String getBornString() { return bornString; }

	/**
	 * Setter for bornString
	 * @param value The actual or approximate date of birth of the relative.
	 */
	public void setBornString(String value) { bornString = value; }


	@Expose
	private Age ageAge;

	/**
	 * Getter for ageAge
	 * @return The age of the relative at the time the family member history is recorded.
	 */
	public Age getAgeAge() { return ageAge; }

	/**
	 * Setter for ageAge
	 * @param value The age of the relative at the time the family member history is recorded.
	 */
	public void setAgeAge(Age value) { ageAge = value; }


	@Expose
	private Range ageRange;

	/**
	 * Getter for ageRange
	 * @return The age of the relative at the time the family member history is recorded.
	 */
	public Range getAgeRange() { return ageRange; }

	/**
	 * Setter for ageRange
	 * @param value The age of the relative at the time the family member history is recorded.
	 */
	public void setAgeRange(Range value) { ageRange = value; }


	@Expose
	private String ageString;

	/**
	 * Getter for ageString
	 * @return The age of the relative at the time the family member history is recorded.
	 */
	public String getAgeString() { return ageString; }

	/**
	 * Setter for ageString
	 * @param value The age of the relative at the time the family member history is recorded.
	 */
	public void setAgeString(String value) { ageString = value; }


	@Expose
	private boolean estimatedAge;

	/**
	 * Getter for estimatedAge
	 * @return If true, indicates that the age value specified is an estimated value.
	 */
	public boolean getEstimatedAge() { return estimatedAge; }

	/**
	 * Setter for estimatedAge
	 * @param value If true, indicates that the age value specified is an estimated value.
	 */
	public void setEstimatedAge(boolean value) { estimatedAge = value; }


	@Expose
	private boolean deceasedBoolean;

	/**
	 * Getter for deceasedBoolean
	 * @return Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
	 */
	public boolean getDeceasedBoolean() { return deceasedBoolean; }

	/**
	 * Setter for deceasedBoolean
	 * @param value Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
	 */
	public void setDeceasedBoolean(boolean value) { deceasedBoolean = value; }


	@Expose
	private Age deceasedAge;

	/**
	 * Getter for deceasedAge
	 * @return Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
	 */
	public Age getDeceasedAge() { return deceasedAge; }

	/**
	 * Setter for deceasedAge
	 * @param value Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
	 */
	public void setDeceasedAge(Age value) { deceasedAge = value; }


	@Expose
	private Range deceasedRange;

	/**
	 * Getter for deceasedRange
	 * @return Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
	 */
	public Range getDeceasedRange() { return deceasedRange; }

	/**
	 * Setter for deceasedRange
	 * @param value Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
	 */
	public void setDeceasedRange(Range value) { deceasedRange = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date deceasedDate;

	/**
	 * Getter for deceasedDate
	 * @return Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
	 */
	public Date getDeceasedDate() { return deceasedDate; }

	/**
	 * Setter for deceasedDate
	 * @param value Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
	 */
	public void setDeceasedDate(Date value) { deceasedDate = value; }


	@Expose
	private String deceasedString;

	/**
	 * Getter for deceasedString
	 * @return Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
	 */
	public String getDeceasedString() { return deceasedString; }

	/**
	 * Setter for deceasedString
	 * @param value Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
	 */
	public void setDeceasedString(String value) { deceasedString = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return Describes why the family member history occurred in coded or textual form.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value Describes why the family member history occurred in coded or textual form.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<FamilyMemberHistoryCondition> condition;

	/**
	 * Getter for condition
	 * @return The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
	 */
	public ArrayList<FamilyMemberHistoryCondition> getCondition() { return condition; }

	/**
	 * Setter for condition
	 * @param value The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
	 */
	public void setCondition(ArrayList<FamilyMemberHistoryCondition> value) { condition = value; }


}
