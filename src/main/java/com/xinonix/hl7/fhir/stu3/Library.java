package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.
 */
public class Library extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Library resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Library resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this library when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this library is (or will be) published. The URL SHOULD include the major version of the library. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this library when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this library is (or will be) published. The URL SHOULD include the major version of the library. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this library when it is represented in other formats, or referenced in a specification, model, design or an instance. e.g. CMS or NQF identifiers for a measure artifact. Note that at least one identifier is required for non-experimental active artifacts.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this library when it is represented in other formats, or referenced in a specification, model, design or an instance. e.g. CMS or NQF identifiers for a measure artifact. Note that at least one identifier is required for non-experimental active artifacts.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the library when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the library author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the library when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the library author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the library. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the library. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive, user-friendly title for the library.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive, user-friendly title for the library.
	 */
	public void setTitle(String value) { title = value; }


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
	 * @return The status of this library. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this library. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this library is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this library is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Identifies the type of library such as a Logic Library, Model Definition, Asset Collection, or Module Definition.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Identifies the type of library such as a Logic Library, Model Definition, Asset Collection, or Module Definition.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the library was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the library changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the library was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the library changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the library.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the library.
	 */
	public void setPublisher(String value) { publisher = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A free text natural language description of the library from a consumer's perspective.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the library from a consumer's perspective.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this library is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this library is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private String usage;

	/**
	 * Getter for usage
	 * @return A detailed description of how the library is used from a clinical perspective.
	 */
	public String getUsage() { return usage; }

	/**
	 * Setter for usage
	 * @param value A detailed description of how the library is used from a clinical perspective.
	 */
	public void setUsage(String value) { usage = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date approvalDate;

	/**
	 * Getter for approvalDate
	 * @return The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
	 */
	public Date getApprovalDate() { return approvalDate; }

	/**
	 * Setter for approvalDate
	 * @param value The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
	 */
	public void setApprovalDate(Date value) { approvalDate = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date lastReviewDate;

	/**
	 * Getter for lastReviewDate
	 * @return The date on which the resource content was last reviewed. Review happens periodically after approval, but doesn't change the original approval date.
	 */
	public Date getLastReviewDate() { return lastReviewDate; }

	/**
	 * Setter for lastReviewDate
	 * @param value The date on which the resource content was last reviewed. Review happens periodically after approval, but doesn't change the original approval date.
	 */
	public void setLastReviewDate(Date value) { lastReviewDate = value; }


	@Expose
	private Period effectivePeriod;

	/**
	 * Getter for effectivePeriod
	 * @return The period during which the library content was or is planned to be in active use.
	 */
	public Period getEffectivePeriod() { return effectivePeriod; }

	/**
	 * Setter for effectivePeriod
	 * @param value The period during which the library content was or is planned to be in active use.
	 */
	public void setEffectivePeriod(Period value) { effectivePeriod = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate library instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate library instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the library is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the library is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private ArrayList<CodeableConcept> topic;

	/**
	 * Getter for topic
	 * @return Descriptive topics related to the content of the library. Topics provide a high-level categorization of the library that can be useful for filtering and searching.
	 */
	public ArrayList<CodeableConcept> getTopic() { return topic; }

	/**
	 * Setter for topic
	 * @param value Descriptive topics related to the content of the library. Topics provide a high-level categorization of the library that can be useful for filtering and searching.
	 */
	public void setTopic(ArrayList<CodeableConcept> value) { topic = value; }


	@Expose
	private ArrayList<Contributor> contributor;

	/**
	 * Getter for contributor
	 * @return A contributor to the content of the library, including authors, editors, reviewers, and endorsers.
	 */
	public ArrayList<Contributor> getContributor() { return contributor; }

	/**
	 * Setter for contributor
	 * @param value A contributor to the content of the library, including authors, editors, reviewers, and endorsers.
	 */
	public void setContributor(ArrayList<Contributor> value) { contributor = value; }


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
	private String copyright;

	/**
	 * Getter for copyright
	 * @return A copyright statement relating to the library and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the library.
	 */
	public String getCopyright() { return copyright; }

	/**
	 * Setter for copyright
	 * @param value A copyright statement relating to the library and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the library.
	 */
	public void setCopyright(String value) { copyright = value; }


	@Expose
	private ArrayList<RelatedArtifact> relatedArtifact;

	/**
	 * Getter for relatedArtifact
	 * @return Related artifacts such as additional documentation, justification, or bibliographic references.
	 */
	public ArrayList<RelatedArtifact> getRelatedArtifact() { return relatedArtifact; }

	/**
	 * Setter for relatedArtifact
	 * @param value Related artifacts such as additional documentation, justification, or bibliographic references.
	 */
	public void setRelatedArtifact(ArrayList<RelatedArtifact> value) { relatedArtifact = value; }


	@Expose
	private ArrayList<ParameterDefinition> parameter;

	/**
	 * Getter for parameter
	 * @return The parameter element defines parameters used by the library.
	 */
	public ArrayList<ParameterDefinition> getParameter() { return parameter; }

	/**
	 * Setter for parameter
	 * @param value The parameter element defines parameters used by the library.
	 */
	public void setParameter(ArrayList<ParameterDefinition> value) { parameter = value; }


	@Expose
	private ArrayList<DataRequirement> dataRequirement;

	/**
	 * Getter for dataRequirement
	 * @return Describes a set of data that must be provided in order to be able to successfully perform the computations defined by the library.
	 */
	public ArrayList<DataRequirement> getDataRequirement() { return dataRequirement; }

	/**
	 * Setter for dataRequirement
	 * @param value Describes a set of data that must be provided in order to be able to successfully perform the computations defined by the library.
	 */
	public void setDataRequirement(ArrayList<DataRequirement> value) { dataRequirement = value; }


	@Expose
	private ArrayList<Attachment> content;

	/**
	 * Getter for content
	 * @return The content of the library as an Attachment. The content may be a reference to a url, or may be directly embedded as a base-64 string. Either way, the contentType of the attachment determines how to interpret the content.
	 */
	public ArrayList<Attachment> getContent() { return content; }

	/**
	 * Setter for content
	 * @param value The content of the library as an Attachment. The content may be a reference to a url, or may be directly embedded as a base-64 string. Either way, the contentType of the attachment determines how to interpret the content.
	 */
	public void setContent(ArrayList<Attachment> value) { content = value; }


}
