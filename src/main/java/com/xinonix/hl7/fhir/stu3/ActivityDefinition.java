package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
 */
public class ActivityDefinition extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ActivityDefinition resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ActivityDefinition resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this activity definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this activity definition is (or will be) published. The URL SHOULD include the major version of the activity definition. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this activity definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this activity definition is (or will be) published. The URL SHOULD include the major version of the activity definition. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this activity definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this activity definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the activity definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the activity definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active assets.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the activity definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the activity definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active assets.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the activity definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the activity definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive, user-friendly title for the activity definition.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive, user-friendly title for the activity definition.
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
	 * @return The status of this activity definition. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this activity definition. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this activity definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this activity definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the activity definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the activity definition changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the activity definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the activity definition changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the activity definition.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the activity definition.
	 */
	public void setPublisher(String value) { publisher = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A free text natural language description of the activity definition from a consumer's perspective.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the activity definition from a consumer's perspective.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this activity definition is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this activity definition is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private String usage;

	/**
	 * Getter for usage
	 * @return A detailed description of how the asset is used from a clinical perspective.
	 */
	public String getUsage() { return usage; }

	/**
	 * Setter for usage
	 * @param value A detailed description of how the asset is used from a clinical perspective.
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
	 * @return The period during which the activity definition content was or is planned to be in active use.
	 */
	public Period getEffectivePeriod() { return effectivePeriod; }

	/**
	 * Setter for effectivePeriod
	 * @param value The period during which the activity definition content was or is planned to be in active use.
	 */
	public void setEffectivePeriod(Period value) { effectivePeriod = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate activity definition instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate activity definition instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the activity definition is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the activity definition is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private ArrayList<CodeableConcept> topic;

	/**
	 * Getter for topic
	 * @return Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that can be useful for filtering and searching.
	 */
	public ArrayList<CodeableConcept> getTopic() { return topic; }

	/**
	 * Setter for topic
	 * @param value Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that can be useful for filtering and searching.
	 */
	public void setTopic(ArrayList<CodeableConcept> value) { topic = value; }


	@Expose
	private ArrayList<Contributor> contributor;

	/**
	 * Getter for contributor
	 * @return A contributor to the content of the asset, including authors, editors, reviewers, and endorsers.
	 */
	public ArrayList<Contributor> getContributor() { return contributor; }

	/**
	 * Setter for contributor
	 * @param value A contributor to the content of the asset, including authors, editors, reviewers, and endorsers.
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
	 * @return A copyright statement relating to the activity definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the activity definition.
	 */
	public String getCopyright() { return copyright; }

	/**
	 * Setter for copyright
	 * @param value A copyright statement relating to the activity definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the activity definition.
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
	private ArrayList<Reference> library;

	/**
	 * Getter for library
	 * @return A reference to a Library resource containing any formal logic used by the asset.
	 */
	public ArrayList<Reference> getLibrary() { return library; }

	/**
	 * Setter for library
	 * @param value A reference to a Library resource containing any formal logic used by the asset.
	 */
	public void setLibrary(ArrayList<Reference> value) { library = value; }


	@Expose
	private String kind;

	/**
	 * Getter for kind
	 * @return A description of the kind of resource the activity definition is representing. For example, a MedicationRequest, a ProcedureRequest, or a CommunicationRequest. Typically, but not always, this is a Request resource.
	 */
	public String getKind() { return kind; }

	/**
	 * Setter for kind
	 * @param value A description of the kind of resource the activity definition is representing. For example, a MedicationRequest, a ProcedureRequest, or a CommunicationRequest. Typically, but not always, this is a Request resource.
	 */
	public void setKind(String value) { kind = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Detailed description of the type of activity; e.g. What lab test, what procedure, what kind of encounter.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Detailed description of the type of activity; e.g. What lab test, what procedure, what kind of encounter.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private Timing timingTiming;

	/**
	 * Getter for timingTiming
	 * @return The period, timing or frequency upon which the described activity is to occur.
	 */
	public Timing getTimingTiming() { return timingTiming; }

	/**
	 * Setter for timingTiming
	 * @param value The period, timing or frequency upon which the described activity is to occur.
	 */
	public void setTimingTiming(Timing value) { timingTiming = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date timingDateTime;

	/**
	 * Getter for timingDateTime
	 * @return The period, timing or frequency upon which the described activity is to occur.
	 */
	public Date getTimingDateTime() { return timingDateTime; }

	/**
	 * Setter for timingDateTime
	 * @param value The period, timing or frequency upon which the described activity is to occur.
	 */
	public void setTimingDateTime(Date value) { timingDateTime = value; }


	@Expose
	private Period timingPeriod;

	/**
	 * Getter for timingPeriod
	 * @return The period, timing or frequency upon which the described activity is to occur.
	 */
	public Period getTimingPeriod() { return timingPeriod; }

	/**
	 * Setter for timingPeriod
	 * @param value The period, timing or frequency upon which the described activity is to occur.
	 */
	public void setTimingPeriod(Period value) { timingPeriod = value; }


	@Expose
	private Range timingRange;

	/**
	 * Getter for timingRange
	 * @return The period, timing or frequency upon which the described activity is to occur.
	 */
	public Range getTimingRange() { return timingRange; }

	/**
	 * Setter for timingRange
	 * @param value The period, timing or frequency upon which the described activity is to occur.
	 */
	public void setTimingRange(Range value) { timingRange = value; }


	@Expose
	private Reference location;

	/**
	 * Getter for location
	 * @return Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
	 */
	public Reference getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
	 */
	public void setLocation(Reference value) { location = value; }


	@Expose
	private ArrayList<ActivityDefinitionParticipant> participant;

	/**
	 * Getter for participant
	 * @return Indicates who should participate in performing the action described.
	 */
	public ArrayList<ActivityDefinitionParticipant> getParticipant() { return participant; }

	/**
	 * Setter for participant
	 * @param value Indicates who should participate in performing the action described.
	 */
	public void setParticipant(ArrayList<ActivityDefinitionParticipant> value) { participant = value; }


	@Expose
	private Reference productReference;

	/**
	 * Getter for productReference
	 * @return Identifies the food, drug or other product being consumed or supplied in the activity.
	 */
	public Reference getProductReference() { return productReference; }

	/**
	 * Setter for productReference
	 * @param value Identifies the food, drug or other product being consumed or supplied in the activity.
	 */
	public void setProductReference(Reference value) { productReference = value; }


	@Expose
	private CodeableConcept productCodeableConcept;

	/**
	 * Getter for productCodeableConcept
	 * @return Identifies the food, drug or other product being consumed or supplied in the activity.
	 */
	public CodeableConcept getProductCodeableConcept() { return productCodeableConcept; }

	/**
	 * Setter for productCodeableConcept
	 * @param value Identifies the food, drug or other product being consumed or supplied in the activity.
	 */
	public void setProductCodeableConcept(CodeableConcept value) { productCodeableConcept = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return Identifies the quantity expected to be consumed at once (per dose, per meal, etc.).
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value Identifies the quantity expected to be consumed at once (per dose, per meal, etc.).
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private ArrayList<Dosage> dosage;

	/**
	 * Getter for dosage
	 * @return Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources.
	 */
	public ArrayList<Dosage> getDosage() { return dosage; }

	/**
	 * Setter for dosage
	 * @param value Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources.
	 */
	public void setDosage(ArrayList<Dosage> value) { dosage = value; }


	@Expose
	private ArrayList<CodeableConcept> bodySite;

	/**
	 * Getter for bodySite
	 * @return Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).
	 */
	public ArrayList<CodeableConcept> getBodySite() { return bodySite; }

	/**
	 * Setter for bodySite
	 * @param value Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).
	 */
	public void setBodySite(ArrayList<CodeableConcept> value) { bodySite = value; }


	@Expose
	private Reference transform;

	/**
	 * Getter for transform
	 * @return A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input.
	 */
	public Reference getTransform() { return transform; }

	/**
	 * Setter for transform
	 * @param value A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input.
	 */
	public void setTransform(Reference value) { transform = value; }


	@Expose
	private ArrayList<ActivityDefinitionDynamicValue> dynamicValue;

	/**
	 * Getter for dynamicValue
	 * @return Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the intent resource that would contain the result.
	 */
	public ArrayList<ActivityDefinitionDynamicValue> getDynamicValue() { return dynamicValue; }

	/**
	 * Setter for dynamicValue
	 * @param value Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the intent resource that would contain the result.
	 */
	public void setDynamicValue(ArrayList<ActivityDefinitionDynamicValue> value) { dynamicValue = value; }


}
