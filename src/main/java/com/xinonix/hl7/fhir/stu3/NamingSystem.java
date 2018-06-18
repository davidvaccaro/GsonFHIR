package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
 */
public class NamingSystem extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a NamingSystem resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a NamingSystem resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the naming system. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the naming system. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	public enum Status{
		@SerializedName("draft") DRAFT,
		@SerializedName("active") ACTIVE,
		@SerializedName("retired") RETIRED,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The status of this naming system. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this naming system. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	public enum Kind{
		@SerializedName("codesystem") CODESYSTEM,
		@SerializedName("identifier") IDENTIFIER,
		@SerializedName("root") ROOT
	}

	@Expose
	private Kind kind;

	/**
	 * Getter for kind
	 * @return Indicates the purpose for the naming system - what kinds of things does it make unique?
	 */
	public Kind getKind() { return kind; }

	/**
	 * Setter for kind
	 * @param value Indicates the purpose for the naming system - what kinds of things does it make unique?
	 */
	public void setKind(Kind value) { kind = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the naming system was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the naming system changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the naming system was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the naming system changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the naming system.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the naming system.
	 */
	public void setPublisher(String value) { publisher = value; }


	@Expose
	private ArrayList<ContactDetail> contact;

	/**
	 * Getter for contact
	 * @return Contact details to assist a user in finding and communicating with the publisher.
	 */
	public ArrayList<ContactDetail> getContact() { return contact; }

	/**
	 * Setter for contact
	 * @param value Contact details to assist a user in finding and communicating with the publisher.
	 */
	public void setContact(ArrayList<ContactDetail> value) { contact = value; }


	@Expose
	private String responsible;

	/**
	 * Getter for responsible
	 * @return The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their non-collision.
	 */
	public String getResponsible() { return responsible; }

	/**
	 * Setter for responsible
	 * @param value The name of the organization that is responsible for issuing identifiers or codes for this namespace and ensuring their non-collision.
	 */
	public void setResponsible(String value) { responsible = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Categorizes a naming system for easier search by grouping related naming systems.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Categorizes a naming system for easier search by grouping related naming systems.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A free text natural language description of the naming system from a consumer's perspective. Details about what the namespace identifies including scope, granularity, version labeling, etc.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the naming system from a consumer's perspective. Details about what the namespace identifies including scope, granularity, version labeling, etc.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate naming system instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate naming system instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the naming system is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the naming system is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private String usage;

	/**
	 * Getter for usage
	 * @return Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower case, etc.
	 */
	public String getUsage() { return usage; }

	/**
	 * Setter for usage
	 * @param value Provides guidance on the use of the namespace, including the handling of formatting characters, use of upper vs. lower case, etc.
	 */
	public void setUsage(String value) { usage = value; }


	@Expose
	private ArrayList<NamingSystemUniqueId> uniqueId;

	/**
	 * Getter for uniqueId
	 * @return Indicates how the system may be identified when referenced in electronic exchange.
	 */
	public ArrayList<NamingSystemUniqueId> getUniqueId() { return uniqueId; }

	/**
	 * Setter for uniqueId
	 * @param value Indicates how the system may be identified when referenced in electronic exchange.
	 */
	public void setUniqueId(ArrayList<NamingSystemUniqueId> value) { uniqueId = value; }


	@Expose
	private Reference replacedBy;

	/**
	 * Getter for replacedBy
	 * @return For naming systems that are retired, indicates the naming system that should be used in their place (if any).
	 */
	public Reference getReplacedBy() { return replacedBy; }

	/**
	 * Setter for replacedBy
	 * @param value For naming systems that are retired, indicates the naming system that should be used in their place (if any).
	 */
	public void setReplacedBy(Reference value) { replacedBy = value; }


}
