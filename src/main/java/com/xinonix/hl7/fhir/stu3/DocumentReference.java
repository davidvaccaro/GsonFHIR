package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A reference to a document.
 */
public class DocumentReference extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a DocumentReference resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a DocumentReference resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier masterIdentifier;

	/**
	 * Getter for masterIdentifier
	 * @return Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.
	 */
	public Identifier getMasterIdentifier() { return masterIdentifier; }

	/**
	 * Setter for masterIdentifier
	 * @param value Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.
	 */
	public void setMasterIdentifier(Identifier value) { masterIdentifier = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Other identifiers associated with the document, including version independent identifiers.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Other identifiers associated with the document, including version independent identifiers.
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
	 * @return The status of this document reference.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this document reference.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private String docStatus;

	/**
	 * Getter for docStatus
	 * @return The status of the underlying document.
	 */
	public String getDocStatus() { return docStatus; }

	/**
	 * Setter for docStatus
	 * @param value The status of the underlying document.
	 */
	public void setDocStatus(String value) { docStatus = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	@SerializedName("class")
	private CodeableConcept classCode;

	/**
	 * Getter for classCode
	 * @return A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.
	 */
	public CodeableConcept getClassCode() { return classCode; }

	/**
	 * Setter for classCode
	 * @param value A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.
	 */
	public void setClassCode(CodeableConcept value) { classCode = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date created;

	/**
	 * Getter for created
	 * @return When the document was created.
	 */
	public Date getCreated() { return created; }

	/**
	 * Setter for created
	 * @param value When the document was created.
	 */
	public void setCreated(Date value) { created = value; }


	@Expose
	private String indexed;

	/**
	 * Getter for indexed
	 * @return When the document reference was created.
	 */
	public String getIndexed() { return indexed; }

	/**
	 * Setter for indexed
	 * @param value When the document reference was created.
	 */
	public void setIndexed(String value) { indexed = value; }


	@Expose
	private ArrayList<Reference> author;

	/**
	 * Getter for author
	 * @return Identifies who is responsible for adding the information to the document.
	 */
	public ArrayList<Reference> getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Identifies who is responsible for adding the information to the document.
	 */
	public void setAuthor(ArrayList<Reference> value) { author = value; }


	@Expose
	private Reference authenticator;

	/**
	 * Getter for authenticator
	 * @return Which person or organization authenticates that this document is valid.
	 */
	public Reference getAuthenticator() { return authenticator; }

	/**
	 * Setter for authenticator
	 * @param value Which person or organization authenticates that this document is valid.
	 */
	public void setAuthenticator(Reference value) { authenticator = value; }


	@Expose
	private Reference custodian;

	/**
	 * Getter for custodian
	 * @return Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
	 */
	public Reference getCustodian() { return custodian; }

	/**
	 * Setter for custodian
	 * @param value Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
	 */
	public void setCustodian(Reference value) { custodian = value; }


	@Expose
	private ArrayList<DocumentReferenceRelatesTo> relatesTo;

	/**
	 * Getter for relatesTo
	 * @return Relationships that this document has with other document references that already exist.
	 */
	public ArrayList<DocumentReferenceRelatesTo> getRelatesTo() { return relatesTo; }

	/**
	 * Setter for relatesTo
	 * @param value Relationships that this document has with other document references that already exist.
	 */
	public void setRelatesTo(ArrayList<DocumentReferenceRelatesTo> value) { relatesTo = value; }


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
	private ArrayList<CodeableConcept> securityLabel;

	/**
	 * Getter for securityLabel
	 * @return A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the "reference" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.
	 */
	public ArrayList<CodeableConcept> getSecurityLabel() { return securityLabel; }

	/**
	 * Setter for securityLabel
	 * @param value A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the "reference" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.
	 */
	public void setSecurityLabel(ArrayList<CodeableConcept> value) { securityLabel = value; }


	@Expose
	private ArrayList<DocumentReferenceContent> content;

	/**
	 * Getter for content
	 * @return The document and format referenced. There may be multiple content element repetitions, each with a different format.
	 */
	public ArrayList<DocumentReferenceContent> getContent() { return content; }

	/**
	 * Setter for content
	 * @param value The document and format referenced. There may be multiple content element repetitions, each with a different format.
	 */
	public void setContent(ArrayList<DocumentReferenceContent> value) { content = value; }


	@Expose
	private DocumentReferenceContext context;

	/**
	 * Getter for context
	 * @return The clinical context in which the document was prepared.
	 */
	public DocumentReferenceContext getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The clinical context in which the document was prepared.
	 */
	public void setContext(DocumentReferenceContext value) { context = value; }


}
