package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 */
public class Consent extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Consent resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Consent resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Unique identifier for this copy of the Consent Statement.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Unique identifier for this copy of the Consent Statement.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	public enum Status{
		@SerializedName("draft") DRAFT,
		@SerializedName("proposed") PROPOSED,
		@SerializedName("active") ACTIVE,
		@SerializedName("rejected") REJECTED,
		@SerializedName("inactive") INACTIVE,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Indicates the current state of this consent.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Indicates the current state of this consent.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private ArrayList<CodeableConcept> category;

	/**
	 * Getter for category
	 * @return A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
	 */
	public ArrayList<CodeableConcept> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.
	 */
	public void setCategory(ArrayList<CodeableConcept> value) { category = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The patient/healthcare consumer to whom this consent applies.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The patient/healthcare consumer to whom this consent applies.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Relevant time or time-period when this Consent is applicable.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Relevant time or time-period when this Consent is applicable.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date dateTime;

	/**
	 * Getter for dateTime
	 * @return When this  Consent was issued / created / indexed.
	 */
	public Date getDateTime() { return dateTime; }

	/**
	 * Setter for dateTime
	 * @param value When this  Consent was issued / created / indexed.
	 */
	public void setDateTime(Date value) { dateTime = value; }


	@Expose
	private ArrayList<Reference> consentingParty;

	/**
	 * Getter for consentingParty
	 * @return Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.
	 */
	public ArrayList<Reference> getConsentingParty() { return consentingParty; }

	/**
	 * Setter for consentingParty
	 * @param value Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.
	 */
	public void setConsentingParty(ArrayList<Reference> value) { consentingParty = value; }


	@Expose
	private ArrayList<ConsentActor> actor;

	/**
	 * Getter for actor
	 * @return Who or what is controlled by this consent. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
	 */
	public ArrayList<ConsentActor> getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value Who or what is controlled by this consent. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
	 */
	public void setActor(ArrayList<ConsentActor> value) { actor = value; }


	@Expose
	private ArrayList<CodeableConcept> action;

	/**
	 * Getter for action
	 * @return Actions controlled by this consent.
	 */
	public ArrayList<CodeableConcept> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Actions controlled by this consent.
	 */
	public void setAction(ArrayList<CodeableConcept> value) { action = value; }


	@Expose
	private ArrayList<Reference> organization;

	/**
	 * Getter for organization
	 * @return The organization that manages the consent, and the framework within which it is executed.
	 */
	public ArrayList<Reference> getOrganization() { return organization; }

	/**
	 * Setter for organization
	 * @param value The organization that manages the consent, and the framework within which it is executed.
	 */
	public void setOrganization(ArrayList<Reference> value) { organization = value; }


	@Expose
	private Attachment sourceAttachment;

	/**
	 * Getter for sourceAttachment
	 * @return The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document.
	 */
	public Attachment getSourceAttachment() { return sourceAttachment; }

	/**
	 * Setter for sourceAttachment
	 * @param value The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document.
	 */
	public void setSourceAttachment(Attachment value) { sourceAttachment = value; }


	@Expose
	private Identifier sourceIdentifier;

	/**
	 * Getter for sourceIdentifier
	 * @return The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document.
	 */
	public Identifier getSourceIdentifier() { return sourceIdentifier; }

	/**
	 * Setter for sourceIdentifier
	 * @param value The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document.
	 */
	public void setSourceIdentifier(Identifier value) { sourceIdentifier = value; }


	@Expose
	private Reference sourceReference;

	/**
	 * Getter for sourceReference
	 * @return The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document.
	 */
	public Reference getSourceReference() { return sourceReference; }

	/**
	 * Setter for sourceReference
	 * @param value The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document.
	 */
	public void setSourceReference(Reference value) { sourceReference = value; }


	@Expose
	private ArrayList<ConsentPolicy> policy;

	/**
	 * Getter for policy
	 * @return The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
	 */
	public ArrayList<ConsentPolicy> getPolicy() { return policy; }

	/**
	 * Setter for policy
	 * @param value The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.
	 */
	public void setPolicy(ArrayList<ConsentPolicy> value) { policy = value; }


	@Expose
	private String policyRule;

	/**
	 * Getter for policyRule
	 * @return A referece to the specific computable policy.
	 */
	public String getPolicyRule() { return policyRule; }

	/**
	 * Setter for policyRule
	 * @param value A referece to the specific computable policy.
	 */
	public void setPolicyRule(String value) { policyRule = value; }


	@Expose
	private ArrayList<Coding> securityLabel;

	/**
	 * Getter for securityLabel
	 * @return A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels.
	 */
	public ArrayList<Coding> getSecurityLabel() { return securityLabel; }

	/**
	 * Setter for securityLabel
	 * @param value A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels.
	 */
	public void setSecurityLabel(ArrayList<Coding> value) { securityLabel = value; }


	@Expose
	private ArrayList<Coding> purpose;

	/**
	 * Getter for purpose
	 * @return The context of the activities a user is taking - why the user is accessing the data - that are controlled by this consent.
	 */
	public ArrayList<Coding> getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value The context of the activities a user is taking - why the user is accessing the data - that are controlled by this consent.
	 */
	public void setPurpose(ArrayList<Coding> value) { purpose = value; }


	@Expose
	private Period dataPeriod;

	/**
	 * Getter for dataPeriod
	 * @return Clinical or Operational Relevant period of time that bounds the data controlled by this consent.
	 */
	public Period getDataPeriod() { return dataPeriod; }

	/**
	 * Setter for dataPeriod
	 * @param value Clinical or Operational Relevant period of time that bounds the data controlled by this consent.
	 */
	public void setDataPeriod(Period value) { dataPeriod = value; }


	@Expose
	private ArrayList<ConsentData> data;

	/**
	 * Getter for data
	 * @return The resources controlled by this consent, if specific resources are referenced.
	 */
	public ArrayList<ConsentData> getData() { return data; }

	/**
	 * Setter for data
	 * @param value The resources controlled by this consent, if specific resources are referenced.
	 */
	public void setData(ArrayList<ConsentData> value) { data = value; }


	@Expose
	private ArrayList<ConsentExcept> except;

	/**
	 * Getter for except
	 * @return An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
	 */
	public ArrayList<ConsentExcept> getExcept() { return except; }

	/**
	 * Setter for except
	 * @param value An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.
	 */
	public void setExcept(ArrayList<ConsentExcept> value) { except = value; }


}
