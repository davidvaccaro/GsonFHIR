package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * The ServiceDefinition describes a unit of decision support functionality that is made available as a service, such as immunization modules or drug-drug interaction checking.
 */
public class ServiceDefinition extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ServiceDefinition resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ServiceDefinition resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this service definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this service definition is (or will be) published. The URL SHOULD include the major version of the service definition. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this service definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this service definition is (or will be) published. The URL SHOULD include the major version of the service definition. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this service definition when it is represented in other formats, or referenced in a specification, model, design or an instance. This is used for CMS or NQF identifiers for a measure artifact. Note that at least one identifier is required for non-experimental active artifacts.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this service definition when it is represented in other formats, or referenced in a specification, model, design or an instance. This is used for CMS or NQF identifiers for a measure artifact. Note that at least one identifier is required for non-experimental active artifacts.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the service definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the service definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the service definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the service definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the service definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the service definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive, user-friendly title for the service definition.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive, user-friendly title for the service definition.
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
	 * @return The status of this service definition. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this service definition. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this service definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this service definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the service definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the service definition changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the service definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the service definition changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the service definition.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the service definition.
	 */
	public void setPublisher(String value) { publisher = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A free text natural language description of the service definition from a consumer's perspective.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the service definition from a consumer's perspective.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this service definition is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this service definition is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private String usage;

	/**
	 * Getter for usage
	 * @return A detailed description of how the module is used from a clinical perspective.
	 */
	public String getUsage() { return usage; }

	/**
	 * Setter for usage
	 * @param value A detailed description of how the module is used from a clinical perspective.
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
	 * @return The period during which the service definition content was or is planned to be in active use.
	 */
	public Period getEffectivePeriod() { return effectivePeriod; }

	/**
	 * Setter for effectivePeriod
	 * @param value The period during which the service definition content was or is planned to be in active use.
	 */
	public void setEffectivePeriod(Period value) { effectivePeriod = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate service definition instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate service definition instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the service definition is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the service definition is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private ArrayList<CodeableConcept> topic;

	/**
	 * Getter for topic
	 * @return Descriptive topics related to the module. Topics provide a high-level categorization of the module that can be useful for filtering and searching.
	 */
	public ArrayList<CodeableConcept> getTopic() { return topic; }

	/**
	 * Setter for topic
	 * @param value Descriptive topics related to the module. Topics provide a high-level categorization of the module that can be useful for filtering and searching.
	 */
	public void setTopic(ArrayList<CodeableConcept> value) { topic = value; }


	@Expose
	private ArrayList<Contributor> contributor;

	/**
	 * Getter for contributor
	 * @return A contributor to the content of the module, including authors, editors, reviewers, and endorsers.
	 */
	public ArrayList<Contributor> getContributor() { return contributor; }

	/**
	 * Setter for contributor
	 * @param value A contributor to the content of the module, including authors, editors, reviewers, and endorsers.
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
	 * @return A copyright statement relating to the service definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the service definition.
	 */
	public String getCopyright() { return copyright; }

	/**
	 * Setter for copyright
	 * @param value A copyright statement relating to the service definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the service definition.
	 */
	public void setCopyright(String value) { copyright = value; }


	@Expose
	private ArrayList<RelatedArtifact> relatedArtifact;

	/**
	 * Getter for relatedArtifact
	 * @return Related resources such as additional documentation, justification, or bibliographic references.
	 */
	public ArrayList<RelatedArtifact> getRelatedArtifact() { return relatedArtifact; }

	/**
	 * Setter for relatedArtifact
	 * @param value Related resources such as additional documentation, justification, or bibliographic references.
	 */
	public void setRelatedArtifact(ArrayList<RelatedArtifact> value) { relatedArtifact = value; }


	@Expose
	private ArrayList<TriggerDefinition> trigger;

	/**
	 * Getter for trigger
	 * @return The trigger element defines when the rule should be invoked. This information is used by consumers of the rule to determine how to integrate the rule into a specific workflow.
	 */
	public ArrayList<TriggerDefinition> getTrigger() { return trigger; }

	/**
	 * Setter for trigger
	 * @param value The trigger element defines when the rule should be invoked. This information is used by consumers of the rule to determine how to integrate the rule into a specific workflow.
	 */
	public void setTrigger(ArrayList<TriggerDefinition> value) { trigger = value; }


	@Expose
	private ArrayList<DataRequirement> dataRequirement;

	/**
	 * Getter for dataRequirement
	 * @return Data requirements are a machine processable description of the data required by the module in order to perform a successful evaluation.
	 */
	public ArrayList<DataRequirement> getDataRequirement() { return dataRequirement; }

	/**
	 * Setter for dataRequirement
	 * @param value Data requirements are a machine processable description of the data required by the module in order to perform a successful evaluation.
	 */
	public void setDataRequirement(ArrayList<DataRequirement> value) { dataRequirement = value; }


	@Expose
	private Reference operationDefinition;

	/**
	 * Getter for operationDefinition
	 * @return A reference to the operation that is used to invoke this service.
	 */
	public Reference getOperationDefinition() { return operationDefinition; }

	/**
	 * Setter for operationDefinition
	 * @param value A reference to the operation that is used to invoke this service.
	 */
	public void setOperationDefinition(Reference value) { operationDefinition = value; }


}
