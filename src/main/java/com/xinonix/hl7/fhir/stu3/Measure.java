package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * The Measure resource provides the definition of a quality measure.
 */
public class Measure extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Measure resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Measure resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this measure when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this measure is (or will be) published. The URL SHOULD include the major version of the measure. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this measure when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this measure is (or will be) published. The URL SHOULD include the major version of the measure. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this measure when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this measure when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the measure when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the measure author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the measure when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the measure author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the measure. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the measure. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive, user-friendly title for the measure.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive, user-friendly title for the measure.
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
	 * @return The status of this measure. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this measure. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this measure is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this measure is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the measure was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the measure changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the measure was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the measure changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the measure.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the measure.
	 */
	public void setPublisher(String value) { publisher = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A free text natural language description of the measure from a consumer's perspective.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the measure from a consumer's perspective.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this measure is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this measure is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private String usage;

	/**
	 * Getter for usage
	 * @return A detailed description of how the measure is used from a clinical perspective.
	 */
	public String getUsage() { return usage; }

	/**
	 * Setter for usage
	 * @param value A detailed description of how the measure is used from a clinical perspective.
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
	 * @return The period during which the measure content was or is planned to be in active use.
	 */
	public Period getEffectivePeriod() { return effectivePeriod; }

	/**
	 * Setter for effectivePeriod
	 * @param value The period during which the measure content was or is planned to be in active use.
	 */
	public void setEffectivePeriod(Period value) { effectivePeriod = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate measure instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate measure instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the measure is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the measure is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private ArrayList<CodeableConcept> topic;

	/**
	 * Getter for topic
	 * @return Descriptive topics related to the content of the measure. Topics provide a high-level categorization of the type of the measure that can be useful for filtering and searching.
	 */
	public ArrayList<CodeableConcept> getTopic() { return topic; }

	/**
	 * Setter for topic
	 * @param value Descriptive topics related to the content of the measure. Topics provide a high-level categorization of the type of the measure that can be useful for filtering and searching.
	 */
	public void setTopic(ArrayList<CodeableConcept> value) { topic = value; }


	@Expose
	private ArrayList<Contributor> contributor;

	/**
	 * Getter for contributor
	 * @return A contributor to the content of the measure, including authors, editors, reviewers, and endorsers.
	 */
	public ArrayList<Contributor> getContributor() { return contributor; }

	/**
	 * Setter for contributor
	 * @param value A contributor to the content of the measure, including authors, editors, reviewers, and endorsers.
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
	 * @return A copyright statement relating to the measure and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the measure.
	 */
	public String getCopyright() { return copyright; }

	/**
	 * Setter for copyright
	 * @param value A copyright statement relating to the measure and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the measure.
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
	 * @return A reference to a Library resource containing the formal logic used by the measure.
	 */
	public ArrayList<Reference> getLibrary() { return library; }

	/**
	 * Setter for library
	 * @param value A reference to a Library resource containing the formal logic used by the measure.
	 */
	public void setLibrary(ArrayList<Reference> value) { library = value; }


	@Expose
	private String disclaimer;

	/**
	 * Getter for disclaimer
	 * @return Notices and disclaimers regarding the use of the measure, or related to intellectual property (such as code systems) referenced by the measure.
	 */
	public String getDisclaimer() { return disclaimer; }

	/**
	 * Setter for disclaimer
	 * @param value Notices and disclaimers regarding the use of the measure, or related to intellectual property (such as code systems) referenced by the measure.
	 */
	public void setDisclaimer(String value) { disclaimer = value; }


	@Expose
	private CodeableConcept scoring;

	/**
	 * Getter for scoring
	 * @return Indicates how the calculation is performed for the measure, including proportion, ratio, continuous variable, and cohort. The value set is extensible, allowing additional measure scoring types to be represented.
	 */
	public CodeableConcept getScoring() { return scoring; }

	/**
	 * Setter for scoring
	 * @param value Indicates how the calculation is performed for the measure, including proportion, ratio, continuous variable, and cohort. The value set is extensible, allowing additional measure scoring types to be represented.
	 */
	public void setScoring(CodeableConcept value) { scoring = value; }


	@Expose
	private CodeableConcept compositeScoring;

	/**
	 * Getter for compositeScoring
	 * @return If this is a composite measure, the scoring method used to combine the component measures to determine the composite score.
	 */
	public CodeableConcept getCompositeScoring() { return compositeScoring; }

	/**
	 * Setter for compositeScoring
	 * @param value If this is a composite measure, the scoring method used to combine the component measures to determine the composite score.
	 */
	public void setCompositeScoring(CodeableConcept value) { compositeScoring = value; }


	@Expose
	private ArrayList<CodeableConcept> type;

	/**
	 * Getter for type
	 * @return Indicates whether the measure is used to examine a process, an outcome over time, a patient-reported outcome, or a structure measure such as utilization.
	 */
	public ArrayList<CodeableConcept> getType() { return type; }

	/**
	 * Setter for type
	 * @param value Indicates whether the measure is used to examine a process, an outcome over time, a patient-reported outcome, or a structure measure such as utilization.
	 */
	public void setType(ArrayList<CodeableConcept> value) { type = value; }


	@Expose
	private String riskAdjustment;

	/**
	 * Getter for riskAdjustment
	 * @return A description of the risk adjustment factors that may impact the resulting score for the measure and how they may be accounted for when computing and reporting measure results.
	 */
	public String getRiskAdjustment() { return riskAdjustment; }

	/**
	 * Setter for riskAdjustment
	 * @param value A description of the risk adjustment factors that may impact the resulting score for the measure and how they may be accounted for when computing and reporting measure results.
	 */
	public void setRiskAdjustment(String value) { riskAdjustment = value; }


	@Expose
	private String rateAggregation;

	/**
	 * Getter for rateAggregation
	 * @return Describes how to combine the information calculated, based on logic in each of several populations, into one summarized result.
	 */
	public String getRateAggregation() { return rateAggregation; }

	/**
	 * Setter for rateAggregation
	 * @param value Describes how to combine the information calculated, based on logic in each of several populations, into one summarized result.
	 */
	public void setRateAggregation(String value) { rateAggregation = value; }


	@Expose
	private String rationale;

	/**
	 * Getter for rationale
	 * @return Provides a succint statement of the need for the measure. Usually includes statements pertaining to importance criterion: impact, gap in care, and evidence.
	 */
	public String getRationale() { return rationale; }

	/**
	 * Setter for rationale
	 * @param value Provides a succint statement of the need for the measure. Usually includes statements pertaining to importance criterion: impact, gap in care, and evidence.
	 */
	public void setRationale(String value) { rationale = value; }


	@Expose
	private String clinicalRecommendationStatement;

	/**
	 * Getter for clinicalRecommendationStatement
	 * @return Provides a summary of relevant clinical guidelines or other clinical recommendations supporting the measure.
	 */
	public String getClinicalRecommendationStatement() { return clinicalRecommendationStatement; }

	/**
	 * Setter for clinicalRecommendationStatement
	 * @param value Provides a summary of relevant clinical guidelines or other clinical recommendations supporting the measure.
	 */
	public void setClinicalRecommendationStatement(String value) { clinicalRecommendationStatement = value; }


	@Expose
	private String improvementNotation;

	/**
	 * Getter for improvementNotation
	 * @return Information on whether an increase or decrease in score is the preferred result (e.g., a higher score indicates better quality OR a lower score indicates better quality OR quality is whthin a range).
	 */
	public String getImprovementNotation() { return improvementNotation; }

	/**
	 * Setter for improvementNotation
	 * @param value Information on whether an increase or decrease in score is the preferred result (e.g., a higher score indicates better quality OR a lower score indicates better quality OR quality is whthin a range).
	 */
	public void setImprovementNotation(String value) { improvementNotation = value; }


	@Expose
	private ArrayList<String> definition;

	/**
	 * Getter for definition
	 * @return Provides a description of an individual term used within the measure.
	 */
	public ArrayList<String> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value Provides a description of an individual term used within the measure.
	 */
	public void setDefinition(ArrayList<String> value) { definition = value; }


	@Expose
	private String guidance;

	/**
	 * Getter for guidance
	 * @return Additional guidance for the measure including how it can be used in a clinical context, and the intent of the measure.
	 */
	public String getGuidance() { return guidance; }

	/**
	 * Setter for guidance
	 * @param value Additional guidance for the measure including how it can be used in a clinical context, and the intent of the measure.
	 */
	public void setGuidance(String value) { guidance = value; }


	@Expose
	private String set;

	/**
	 * Getter for set
	 * @return The measure set, e.g. Preventive Care and Screening.
	 */
	public String getSet() { return set; }

	/**
	 * Setter for set
	 * @param value The measure set, e.g. Preventive Care and Screening.
	 */
	public void setSet(String value) { set = value; }


	@Expose
	private ArrayList<MeasureGroup> group;

	/**
	 * Getter for group
	 * @return A group of population criteria for the measure.
	 */
	public ArrayList<MeasureGroup> getGroup() { return group; }

	/**
	 * Setter for group
	 * @param value A group of population criteria for the measure.
	 */
	public void setGroup(ArrayList<MeasureGroup> value) { group = value; }


	@Expose
	private ArrayList<MeasureSupplementalData> supplementalData;

	/**
	 * Getter for supplementalData
	 * @return The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.
	 */
	public ArrayList<MeasureSupplementalData> getSupplementalData() { return supplementalData; }

	/**
	 * Setter for supplementalData
	 * @param value The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path.
	 */
	public void setSupplementalData(ArrayList<MeasureSupplementalData> value) { supplementalData = value; }


}
