package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
 */
public class ResearchSubject extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ResearchSubject resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ResearchSubject resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Identifiers assigned to this research study by the sponsor or other systems.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifiers assigned to this research study by the sponsor or other systems.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	public enum Status{
		@SerializedName("candidate") CANDIDATE,
		@SerializedName("enrolled") ENROLLED,
		@SerializedName("active") ACTIVE,
		@SerializedName("suspended") SUSPENDED,
		@SerializedName("withdrawn") WITHDRAWN,
		@SerializedName("completed") COMPLETED
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The current state of the subject.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The current state of the subject.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The dates the subject began and ended their participation in the study.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The dates the subject began and ended their participation in the study.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private Reference study;

	/**
	 * Getter for study
	 * @return Reference to the study the subject is participating in.
	 */
	public Reference getStudy() { return study; }

	/**
	 * Setter for study
	 * @param value Reference to the study the subject is participating in.
	 */
	public void setStudy(Reference value) { study = value; }


	@Expose
	private Reference individual;

	/**
	 * Getter for individual
	 * @return The record of the person or animal who is involved in the study.
	 */
	public Reference getIndividual() { return individual; }

	/**
	 * Setter for individual
	 * @param value The record of the person or animal who is involved in the study.
	 */
	public void setIndividual(Reference value) { individual = value; }


	@Expose
	private String assignedArm;

	/**
	 * Getter for assignedArm
	 * @return The name of the arm in the study the subject is expected to follow as part of this study.
	 */
	public String getAssignedArm() { return assignedArm; }

	/**
	 * Setter for assignedArm
	 * @param value The name of the arm in the study the subject is expected to follow as part of this study.
	 */
	public void setAssignedArm(String value) { assignedArm = value; }


	@Expose
	private String actualArm;

	/**
	 * Getter for actualArm
	 * @return The name of the arm in the study the subject actually followed as part of this study.
	 */
	public String getActualArm() { return actualArm; }

	/**
	 * Setter for actualArm
	 * @param value The name of the arm in the study the subject actually followed as part of this study.
	 */
	public void setActualArm(String value) { actualArm = value; }


	@Expose
	private Reference consent;

	/**
	 * Getter for consent
	 * @return A record of the patient's informed agreement to participate in the study.
	 */
	public Reference getConsent() { return consent; }

	/**
	 * Setter for consent
	 * @param value A record of the patient's informed agreement to participate in the study.
	 */
	public void setConsent(Reference value) { consent = value; }


}
