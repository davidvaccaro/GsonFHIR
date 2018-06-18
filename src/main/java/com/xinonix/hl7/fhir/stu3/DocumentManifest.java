package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A collection of documents compiled for a purpose together with metadata that applies to the collection.
 */
public class DocumentManifest extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a DocumentManifest resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a DocumentManifest resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier masterIdentifier;

	/**
	 * Getter for masterIdentifier
	 * @return A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.
	 */
	public Identifier getMasterIdentifier() { return masterIdentifier; }

	/**
	 * Setter for masterIdentifier
	 * @param value A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.
	 */
	public void setMasterIdentifier(Identifier value) { masterIdentifier = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Other identifiers associated with the document manifest, including version independent  identifiers.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Other identifiers associated with the document manifest, including version independent  identifiers.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("current") CURRENT,
		@SerializedName("superseded") SUPERSEDED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The status of this document manifest.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this document manifest.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date created;

	/**
	 * Getter for created
	 * @return When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).
	 */
	public Date getCreated() { return created; }

	/**
	 * Setter for created
	 * @param value When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated, etc.).
	 */
	public void setCreated(Date value) { created = value; }


	@Expose
	private ArrayList<Reference> author;

	/**
	 * Getter for author
	 * @return Identifies who is responsible for creating the manifest, and adding  documents to it.
	 */
	public ArrayList<Reference> getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Identifies who is responsible for creating the manifest, and adding  documents to it.
	 */
	public void setAuthor(ArrayList<Reference> value) { author = value; }


	@Expose
	private ArrayList<Reference> recipient;

	/**
	 * Getter for recipient
	 * @return A patient, practitioner, or organization for which this set of documents is intended.
	 */
	public ArrayList<Reference> getRecipient() { return recipient; }

	/**
	 * Setter for recipient
	 * @param value A patient, practitioner, or organization for which this set of documents is intended.
	 */
	public void setRecipient(ArrayList<Reference> value) { recipient = value; }


	@Expose
	private String source;

	/**
	 * Getter for source
	 * @return Identifies the source system, application, or software that produced the document manifest.
	 */
	public String getSource() { return source; }

	/**
	 * Setter for source
	 * @param value Identifies the source system, application, or software that produced the document manifest.
	 */
	public void setSource(String value) { source = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Human-readable description of the source document. This is sometimes known as the "title".
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Human-readable description of the source document. This is sometimes known as the "title".
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<DocumentManifestContent> content;

	/**
	 * Getter for content
	 * @return The list of Documents included in the manifest.
	 */
	public ArrayList<DocumentManifestContent> getContent() { return content; }

	/**
	 * Setter for content
	 * @param value The list of Documents included in the manifest.
	 */
	public void setContent(ArrayList<DocumentManifestContent> value) { content = value; }


	@Expose
	private ArrayList<DocumentManifestRelated> related;

	/**
	 * Getter for related
	 * @return Related identifiers or resources associated with the DocumentManifest.
	 */
	public ArrayList<DocumentManifestRelated> getRelated() { return related; }

	/**
	 * Setter for related
	 * @param value Related identifiers or resources associated with the DocumentManifest.
	 */
	public void setRelated(ArrayList<DocumentManifestRelated> value) { related = value; }


}
