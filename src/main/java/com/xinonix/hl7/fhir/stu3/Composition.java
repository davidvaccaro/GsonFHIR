package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.
 */
public class Composition extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Composition resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Composition resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	public enum Status{
		@SerializedName("preliminary") PRELIMINARY,
		@SerializedName("final") FINAL,
		@SerializedName("amended") AMENDED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	@SerializedName("class")
	private CodeableConcept classCode;

	/**
	 * Getter for classCode
	 * @return A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.
	 */
	public CodeableConcept getClassCode() { return classCode; }

	/**
	 * Setter for classCode
	 * @param value A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.
	 */
	public void setClassCode(CodeableConcept value) { classCode = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference encounter;

	/**
	 * Getter for encounter
	 * @return Describes the clinical encounter or type of care this documentation is associated with.
	 */
	public Reference getEncounter() { return encounter; }

	/**
	 * Setter for encounter
	 * @param value Describes the clinical encounter or type of care this documentation is associated with.
	 */
	public void setEncounter(Reference value) { encounter = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The composition editing time, when the composition was last logically changed by the author.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The composition editing time, when the composition was last logically changed by the author.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private ArrayList<Reference> author;

	/**
	 * Getter for author
	 * @return Identifies who is responsible for the information in the composition, not necessarily who typed it in.
	 */
	public ArrayList<Reference> getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Identifies who is responsible for the information in the composition, not necessarily who typed it in.
	 */
	public void setAuthor(ArrayList<Reference> value) { author = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return Official human-readable label for the composition.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value Official human-readable label for the composition.
	 */
	public void setTitle(String value) { title = value; }


	@Expose
	private String confidentiality;

	/**
	 * Getter for confidentiality
	 * @return The code specifying the level of confidentiality of the Composition.
	 */
	public String getConfidentiality() { return confidentiality; }

	/**
	 * Setter for confidentiality
	 * @param value The code specifying the level of confidentiality of the Composition.
	 */
	public void setConfidentiality(String value) { confidentiality = value; }


	@Expose
	private ArrayList<CompositionAttester> attester;

	/**
	 * Getter for attester
	 * @return A participant who has attested to the accuracy of the composition/document.
	 */
	public ArrayList<CompositionAttester> getAttester() { return attester; }

	/**
	 * Setter for attester
	 * @param value A participant who has attested to the accuracy of the composition/document.
	 */
	public void setAttester(ArrayList<CompositionAttester> value) { attester = value; }


	@Expose
	private Reference custodian;

	/**
	 * Getter for custodian
	 * @return Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.
	 */
	public Reference getCustodian() { return custodian; }

	/**
	 * Setter for custodian
	 * @param value Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.
	 */
	public void setCustodian(Reference value) { custodian = value; }


	@Expose
	private ArrayList<CompositionRelatesTo> relatesTo;

	/**
	 * Getter for relatesTo
	 * @return Relationships that this composition has with other compositions or documents that already exist.
	 */
	public ArrayList<CompositionRelatesTo> getRelatesTo() { return relatesTo; }

	/**
	 * Setter for relatesTo
	 * @param value Relationships that this composition has with other compositions or documents that already exist.
	 */
	public void setRelatesTo(ArrayList<CompositionRelatesTo> value) { relatesTo = value; }


	@Expose
	private ArrayList<CompositionEvent> event;

	/**
	 * Getter for event
	 * @return The clinical service, such as a colonoscopy or an appendectomy, being documented.
	 */
	public ArrayList<CompositionEvent> getEvent() { return event; }

	/**
	 * Setter for event
	 * @param value The clinical service, such as a colonoscopy or an appendectomy, being documented.
	 */
	public void setEvent(ArrayList<CompositionEvent> value) { event = value; }


	@Expose
	private ArrayList<CompositionSection> section;

	/**
	 * Getter for section
	 * @return The root of the sections that make up the composition.
	 */
	public ArrayList<CompositionSection> getSection() { return section; }

	/**
	 * Setter for section
	 * @param value The root of the sections that make up the composition.
	 */
	public void setSection(ArrayList<CompositionSection> value) { section = value; }


}
