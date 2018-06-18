package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A code system resource specifies a set of codes drawn from one or more code systems.
 */
public class CodeSystem extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a CodeSystem resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a CodeSystem resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this code system when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this code system is (or will be) published. The URL SHOULD include the major version of the code system. For more information see [Technical and Business Versions](resource.html#versions). This is used in [Coding]{datatypes.html#Coding}.system.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this code system when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this code system is (or will be) published. The URL SHOULD include the major version of the code system. For more information see [Technical and Business Versions](resource.html#versions). This is used in [Coding]{datatypes.html#Coding}.system.
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the code system when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the code system author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. This is used in [Coding]{datatypes.html#Coding}.version.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the code system when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the code system author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. This is used in [Coding]{datatypes.html#Coding}.version.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the code system. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the code system. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive, user-friendly title for the code system.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive, user-friendly title for the code system.
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
	 * @return The status of this code system. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this code system. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this code system is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this code system is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the code system was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the code system changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the code system was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the code system changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the code system.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the code system.
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
	private String description;

	/**
	 * Getter for description
	 * @return A free text natural language description of the code system from a consumer's perspective.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the code system from a consumer's perspective.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate code system instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate code system instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the code system is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the code system is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this code system is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this code system is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private String copyright;

	/**
	 * Getter for copyright
	 * @return A copyright statement relating to the code system and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the code system.
	 */
	public String getCopyright() { return copyright; }

	/**
	 * Setter for copyright
	 * @param value A copyright statement relating to the code system and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the code system.
	 */
	public void setCopyright(String value) { copyright = value; }


	@Expose
	private boolean caseSensitive;

	/**
	 * Getter for caseSensitive
	 * @return If code comparison is case sensitive when codes within this system are compared to each other.
	 */
	public boolean getCaseSensitive() { return caseSensitive; }

	/**
	 * Setter for caseSensitive
	 * @param value If code comparison is case sensitive when codes within this system are compared to each other.
	 */
	public void setCaseSensitive(boolean value) { caseSensitive = value; }


	@Expose
	private String valueSet;

	/**
	 * Getter for valueSet
	 * @return Canonical URL of value set that contains the entire code system.
	 */
	public String getValueSet() { return valueSet; }

	/**
	 * Setter for valueSet
	 * @param value Canonical URL of value set that contains the entire code system.
	 */
	public void setValueSet(String value) { valueSet = value; }


	public enum HierarchyMeaning{
		@SerializedName("grouped-by") GROUPED_BY,
		@SerializedName("is-a") IS_A,
		@SerializedName("part-of") PART_OF,
		@SerializedName("classified-with") CLASSIFIED_WITH
	}

	@Expose
	private HierarchyMeaning hierarchyMeaning;

	/**
	 * Getter for hierarchyMeaning
	 * @return The meaning of the hierarchy of concepts.
	 */
	public HierarchyMeaning getHierarchyMeaning() { return hierarchyMeaning; }

	/**
	 * Setter for hierarchyMeaning
	 * @param value The meaning of the hierarchy of concepts.
	 */
	public void setHierarchyMeaning(HierarchyMeaning value) { hierarchyMeaning = value; }


	@Expose
	private boolean compositional;

	/**
	 * Getter for compositional
	 * @return True If code system defines a post-composition grammar.
	 */
	public boolean getCompositional() { return compositional; }

	/**
	 * Setter for compositional
	 * @param value True If code system defines a post-composition grammar.
	 */
	public void setCompositional(boolean value) { compositional = value; }


	@Expose
	private boolean versionNeeded;

	/**
	 * Getter for versionNeeded
	 * @return This flag is used to signify that the code system has not (or does not) maintain the definitions, and a version must be specified when referencing this code system.
	 */
	public boolean getVersionNeeded() { return versionNeeded; }

	/**
	 * Setter for versionNeeded
	 * @param value This flag is used to signify that the code system has not (or does not) maintain the definitions, and a version must be specified when referencing this code system.
	 */
	public void setVersionNeeded(boolean value) { versionNeeded = value; }


	public enum Content{
		@SerializedName("not-present") NOT_PRESENT,
		@SerializedName("example") EXAMPLE,
		@SerializedName("fragment") FRAGMENT,
		@SerializedName("complete") COMPLETE
	}

	@Expose
	private Content content;

	/**
	 * Getter for content
	 * @return How much of the content of the code system - the concepts and codes it defines - are represented in this resource.
	 */
	public Content getContent() { return content; }

	/**
	 * Setter for content
	 * @param value How much of the content of the code system - the concepts and codes it defines - are represented in this resource.
	 */
	public void setContent(Content value) { content = value; }


	@Expose
	private Integer count;

	/**
	 * Getter for count
	 * @return The total number of concepts defined by the code system. Where the code system has a compositional grammar, the count refers to the number of base (primitive) concepts.
	 */
	public Integer getCount() { return count; }

	/**
	 * Setter for count
	 * @param value The total number of concepts defined by the code system. Where the code system has a compositional grammar, the count refers to the number of base (primitive) concepts.
	 */
	public void setCount(Integer value) { count = value; }


	@Expose
	private ArrayList<CodeSystemFilter> filter;

	/**
	 * Getter for filter
	 * @return A filter that can be used in a value set compose statement when selecting concepts using a filter.
	 */
	public ArrayList<CodeSystemFilter> getFilter() { return filter; }

	/**
	 * Setter for filter
	 * @param value A filter that can be used in a value set compose statement when selecting concepts using a filter.
	 */
	public void setFilter(ArrayList<CodeSystemFilter> value) { filter = value; }


	@Expose
	private ArrayList<CodeSystemProperty> property;

	/**
	 * Getter for property
	 * @return A property defines an additional slot through which additional information can be provided about a concept.
	 */
	public ArrayList<CodeSystemProperty> getProperty() { return property; }

	/**
	 * Setter for property
	 * @param value A property defines an additional slot through which additional information can be provided about a concept.
	 */
	public void setProperty(ArrayList<CodeSystemProperty> value) { property = value; }


	@Expose
	private ArrayList<CodeSystemConcept> concept;

	/**
	 * Getter for concept
	 * @return Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are.
	 */
	public ArrayList<CodeSystemConcept> getConcept() { return concept; }

	/**
	 * Setter for concept
	 * @param value Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are.
	 */
	public void setConcept(ArrayList<CodeSystemConcept> value) { concept = value; }


}
