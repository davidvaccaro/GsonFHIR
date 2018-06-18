package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
 */
public class AdverseEvent extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a AdverseEvent resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a AdverseEvent resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return The identifier(s) of this adverse event that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itsefl is not appropriate.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The identifier(s) of this adverse event that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itsefl is not appropriate.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	public enum Category{
		@SerializedName("AE") AE,
		@SerializedName("PAE") PAE
	}

	@Expose
	private Category category;

	/**
	 * Getter for category
	 * @return The type of event which is important to characterize what occurred and caused harm to the subject, or had the potential to cause harm to the subject.
	 */
	public Category getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value The type of event which is important to characterize what occurred and caused harm to the subject, or had the potential to cause harm to the subject.
	 */
	public void setCategory(Category value) { category = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return This element defines the specific type of event that occurred or that was prevented from occurring.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value This element defines the specific type of event that occurred or that was prevented from occurring.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return This subject or group impacted by the event.  With a prospective adverse event, there will be no subject as the adverse event was prevented.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value This subject or group impacted by the event.  With a prospective adverse event, there will be no subject as the adverse event was prevented.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date (and perhaps time) when the adverse event occurred.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date (and perhaps time) when the adverse event occurred.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private ArrayList<Reference> reaction;

	/**
	 * Getter for reaction
	 * @return Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical).
	 */
	public ArrayList<Reference> getReaction() { return reaction; }

	/**
	 * Setter for reaction
	 * @param value Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical).
	 */
	public void setReaction(ArrayList<Reference> value) { reaction = value; }


	@Expose
	private Reference location;

	/**
	 * Getter for location
	 * @return The information about where the adverse event occurred.
	 */
	public Reference getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value The information about where the adverse event occurred.
	 */
	public void setLocation(Reference value) { location = value; }


	@Expose
	private CodeableConcept seriousness;

	/**
	 * Getter for seriousness
	 * @return Describes the seriousness or severity of the adverse event.
	 */
	public CodeableConcept getSeriousness() { return seriousness; }

	/**
	 * Setter for seriousness
	 * @param value Describes the seriousness or severity of the adverse event.
	 */
	public void setSeriousness(CodeableConcept value) { seriousness = value; }


	@Expose
	private CodeableConcept outcome;

	/**
	 * Getter for outcome
	 * @return Describes the type of outcome from the adverse event.
	 */
	public CodeableConcept getOutcome() { return outcome; }

	/**
	 * Setter for outcome
	 * @param value Describes the type of outcome from the adverse event.
	 */
	public void setOutcome(CodeableConcept value) { outcome = value; }


	@Expose
	private Reference recorder;

	/**
	 * Getter for recorder
	 * @return Information on who recorded the adverse event.  May be the patient or a practitioner.
	 */
	public Reference getRecorder() { return recorder; }

	/**
	 * Setter for recorder
	 * @param value Information on who recorded the adverse event.  May be the patient or a practitioner.
	 */
	public void setRecorder(Reference value) { recorder = value; }


	@Expose
	private Reference eventParticipant;

	/**
	 * Getter for eventParticipant
	 * @return Parties that may or should contribute or have contributed information to the Act. Such information includes information leading to the decision to perform the Act and how to perform the Act (e.g. consultant), information that the Act itself seeks to reveal (e.g. informant of clinical history), or information about what Act was performed (e.g. informant witness).
	 */
	public Reference getEventParticipant() { return eventParticipant; }

	/**
	 * Setter for eventParticipant
	 * @param value Parties that may or should contribute or have contributed information to the Act. Such information includes information leading to the decision to perform the Act and how to perform the Act (e.g. consultant), information that the Act itself seeks to reveal (e.g. informant of clinical history), or information about what Act was performed (e.g. informant witness).
	 */
	public void setEventParticipant(Reference value) { eventParticipant = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Describes the adverse event in text.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Describes the adverse event in text.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<AdverseEventSuspectEntity> suspectEntity;

	/**
	 * Getter for suspectEntity
	 * @return Describes the entity that is suspected to have caused the adverse event.
	 */
	public ArrayList<AdverseEventSuspectEntity> getSuspectEntity() { return suspectEntity; }

	/**
	 * Setter for suspectEntity
	 * @param value Describes the entity that is suspected to have caused the adverse event.
	 */
	public void setSuspectEntity(ArrayList<AdverseEventSuspectEntity> value) { suspectEntity = value; }


	@Expose
	private ArrayList<Reference> subjectMedicalHistory;

	/**
	 * Getter for subjectMedicalHistory
	 * @return AdverseEvent.subjectMedicalHistory.
	 */
	public ArrayList<Reference> getSubjectMedicalHistory() { return subjectMedicalHistory; }

	/**
	 * Setter for subjectMedicalHistory
	 * @param value AdverseEvent.subjectMedicalHistory.
	 */
	public void setSubjectMedicalHistory(ArrayList<Reference> value) { subjectMedicalHistory = value; }


	@Expose
	private ArrayList<Reference> referenceDocument;

	/**
	 * Getter for referenceDocument
	 * @return AdverseEvent.referenceDocument.
	 */
	public ArrayList<Reference> getReferenceDocument() { return referenceDocument; }

	/**
	 * Setter for referenceDocument
	 * @param value AdverseEvent.referenceDocument.
	 */
	public void setReferenceDocument(ArrayList<Reference> value) { referenceDocument = value; }


	@Expose
	private ArrayList<Reference> study;

	/**
	 * Getter for study
	 * @return AdverseEvent.study.
	 */
	public ArrayList<Reference> getStudy() { return study; }

	/**
	 * Setter for study
	 * @param value AdverseEvent.study.
	 */
	public void setStudy(ArrayList<Reference> value) { study = value; }


}
