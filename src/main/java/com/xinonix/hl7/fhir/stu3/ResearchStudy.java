package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
 */
public class ResearchStudy extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ResearchStudy resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ResearchStudy resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifiers assigned to this research study by the sponsor or other systems.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifiers assigned to this research study by the sponsor or other systems.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive user-friendly label for the study.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive user-friendly label for the study.
	 */
	public void setTitle(String value) { title = value; }


	@Expose
	private ArrayList<Reference> protocol;

	/**
	 * Getter for protocol
	 * @return The set of steps expected to be performed as part of the execution of the study.
	 */
	public ArrayList<Reference> getProtocol() { return protocol; }

	/**
	 * Setter for protocol
	 * @param value The set of steps expected to be performed as part of the execution of the study.
	 */
	public void setProtocol(ArrayList<Reference> value) { protocol = value; }


	@Expose
	private ArrayList<Reference> partOf;

	/**
	 * Getter for partOf
	 * @return A larger research study of which this particular study is a component or step.
	 */
	public ArrayList<Reference> getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value A larger research study of which this particular study is a component or step.
	 */
	public void setPartOf(ArrayList<Reference> value) { partOf = value; }


	public enum Status{
		@SerializedName("draft") DRAFT,
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("suspended") SUSPENDED,
		@SerializedName("stopped") STOPPED,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The current state of the study.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The current state of the study.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private ArrayList<CodeableConcept> category;

	/**
	 * Getter for category
	 * @return Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
	 */
	public ArrayList<CodeableConcept> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
	 */
	public void setCategory(ArrayList<CodeableConcept> value) { category = value; }


	@Expose
	private ArrayList<CodeableConcept> focus;

	/**
	 * Getter for focus
	 * @return The condition(s), medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
	 */
	public ArrayList<CodeableConcept> getFocus() { return focus; }

	/**
	 * Setter for focus
	 * @param value The condition(s), medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
	 */
	public void setFocus(ArrayList<CodeableConcept> value) { focus = value; }


	@Expose
	private ArrayList<ContactDetail> contact;

	/**
	 * Getter for contact
	 * @return Contact details to assist a user in learning more about or engaging with the study.
	 */
	public ArrayList<ContactDetail> getContact() { return contact; }

	/**
	 * Setter for contact
	 * @param value Contact details to assist a user in learning more about or engaging with the study.
	 */
	public void setContact(ArrayList<ContactDetail> value) { contact = value; }


	@Expose
	private ArrayList<RelatedArtifact> relatedArtifact;

	/**
	 * Getter for relatedArtifact
	 * @return Citations, references and other related documents.
	 */
	public ArrayList<RelatedArtifact> getRelatedArtifact() { return relatedArtifact; }

	/**
	 * Setter for relatedArtifact
	 * @param value Citations, references and other related documents.
	 */
	public void setRelatedArtifact(ArrayList<RelatedArtifact> value) { relatedArtifact = value; }


	@Expose
	private ArrayList<CodeableConcept> keyword;

	/**
	 * Getter for keyword
	 * @return Key terms to aid in searching for or filtering the study.
	 */
	public ArrayList<CodeableConcept> getKeyword() { return keyword; }

	/**
	 * Setter for keyword
	 * @param value Key terms to aid in searching for or filtering the study.
	 */
	public void setKeyword(ArrayList<CodeableConcept> value) { keyword = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return Indicates a country, state or other region where the study is taking place.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value Indicates a country, state or other region where the study is taking place.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A full description of how the study is being conducted.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A full description of how the study is being conducted.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<Reference> enrollment;

	/**
	 * Getter for enrollment
	 * @return Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. " 200 female Europeans between the ages of 20 and 45 with early onset diabetes".
	 */
	public ArrayList<Reference> getEnrollment() { return enrollment; }

	/**
	 * Setter for enrollment
	 * @param value Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. " 200 female Europeans between the ages of 20 and 45 with early onset diabetes".
	 */
	public void setEnrollment(ArrayList<Reference> value) { enrollment = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Identifies the start date and the expected (or actual, depending on status) end date for the study.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Identifies the start date and the expected (or actual, depending on status) end date for the study.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private Reference sponsor;

	/**
	 * Getter for sponsor
	 * @return The organization responsible for the execution of the study.
	 */
	public Reference getSponsor() { return sponsor; }

	/**
	 * Setter for sponsor
	 * @param value The organization responsible for the execution of the study.
	 */
	public void setSponsor(Reference value) { sponsor = value; }


	@Expose
	private Reference principalInvestigator;

	/**
	 * Getter for principalInvestigator
	 * @return Indicates the individual who has primary oversite of the execution of the study.
	 */
	public Reference getPrincipalInvestigator() { return principalInvestigator; }

	/**
	 * Setter for principalInvestigator
	 * @param value Indicates the individual who has primary oversite of the execution of the study.
	 */
	public void setPrincipalInvestigator(Reference value) { principalInvestigator = value; }


	@Expose
	private ArrayList<Reference> site;

	/**
	 * Getter for site
	 * @return Clinic, hospital or other healthcare location that is participating in the study.
	 */
	public ArrayList<Reference> getSite() { return site; }

	/**
	 * Setter for site
	 * @param value Clinic, hospital or other healthcare location that is participating in the study.
	 */
	public void setSite(ArrayList<Reference> value) { site = value; }


	@Expose
	private CodeableConcept reasonStopped;

	/**
	 * Getter for reasonStopped
	 * @return A description and/or code explaining the premature termination of the study.
	 */
	public CodeableConcept getReasonStopped() { return reasonStopped; }

	/**
	 * Setter for reasonStopped
	 * @param value A description and/or code explaining the premature termination of the study.
	 */
	public void setReasonStopped(CodeableConcept value) { reasonStopped = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Comments made about the event by the performer, subject or other participants.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Comments made about the event by the performer, subject or other participants.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<ResearchStudyArm> arm;

	/**
	 * Getter for arm
	 * @return Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
	 */
	public ArrayList<ResearchStudyArm> getArm() { return arm; }

	/**
	 * Setter for arm
	 * @param value Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
	 */
	public void setArm(ArrayList<ResearchStudyArm> value) { arm = value; }


}
