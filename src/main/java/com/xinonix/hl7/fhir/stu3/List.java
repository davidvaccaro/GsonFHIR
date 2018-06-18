package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A set of information summarized from a list of other resources.
 */
public class List extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a List resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a List resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifier for the List assigned for business purposes outside the context of FHIR.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier for the List assigned for business purposes outside the context of FHIR.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("current") CURRENT,
		@SerializedName("retired") RETIRED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Indicates the current state of this list.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Indicates the current state of this list.
	 */
	public void setStatus(Status value) { status = value; }


	public enum Mode{
		@SerializedName("working") WORKING,
		@SerializedName("snapshot") SNAPSHOT,
		@SerializedName("changes") CHANGES
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
	 */
	public void setMode(Mode value) { mode = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A label for the list assigned by the author.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A label for the list assigned by the author.
	 */
	public void setTitle(String value) { title = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return This code defines the purpose of the list - why it was created.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value This code defines the purpose of the list - why it was created.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The common subject (or patient) of the resources that are in the list, if there is one.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The common subject (or patient) of the resources that are in the list, if there is one.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference encounter;

	/**
	 * Getter for encounter
	 * @return The encounter that is the context in which this list was created.
	 */
	public Reference getEncounter() { return encounter; }

	/**
	 * Setter for encounter
	 * @param value The encounter that is the context in which this list was created.
	 */
	public void setEncounter(Reference value) { encounter = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date that the list was prepared.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date that the list was prepared.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private Reference source;

	/**
	 * Getter for source
	 * @return The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.
	 */
	public Reference getSource() { return source; }

	/**
	 * Setter for source
	 * @param value The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.
	 */
	public void setSource(Reference value) { source = value; }


	@Expose
	private CodeableConcept orderedBy;

	/**
	 * Getter for orderedBy
	 * @return What order applies to the items in the list.
	 */
	public CodeableConcept getOrderedBy() { return orderedBy; }

	/**
	 * Setter for orderedBy
	 * @param value What order applies to the items in the list.
	 */
	public void setOrderedBy(CodeableConcept value) { orderedBy = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Comments that apply to the overall list.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Comments that apply to the overall list.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<ListEntry> entry;

	/**
	 * Getter for entry
	 * @return Entries in this list.
	 */
	public ArrayList<ListEntry> getEntry() { return entry; }

	/**
	 * Setter for entry
	 * @param value Entries in this list.
	 */
	public void setEntry(ArrayList<ListEntry> value) { entry = value; }


	@Expose
	private CodeableConcept emptyReason;

	/**
	 * Getter for emptyReason
	 * @return If the list is empty, why the list is empty.
	 */
	public CodeableConcept getEmptyReason() { return emptyReason; }

	/**
	 * Setter for emptyReason
	 * @param value If the list is empty, why the list is empty.
	 */
	public void setEmptyReason(CodeableConcept value) { emptyReason = value; }


}
