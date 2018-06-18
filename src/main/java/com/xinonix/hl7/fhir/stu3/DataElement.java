package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * The formal description of a single piece of information that can be gathered and reported.
 */
public class DataElement extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a DataElement resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a DataElement resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this data element when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this data element is (or will be) published. The URL SHOULD include the major version of the data element. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this data element when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this data element is (or will be) published. The URL SHOULD include the major version of the data element. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this data element when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this data element when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the data element when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the data element author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the data element when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the data element author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public void setVersion(String value) { version = value; }


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
	 * @return The status of this data element. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this data element. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this data element is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this data element is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the data element was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the data element changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the data element was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the data element changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the data element.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the data element.
	 */
	public void setPublisher(String value) { publisher = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the data element. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the data element. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive, user-friendly title for the data element.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive, user-friendly title for the data element.
	 */
	public void setTitle(String value) { title = value; }


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
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate data element instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate data element instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the data element is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the data element is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private String copyright;

	/**
	 * Getter for copyright
	 * @return A copyright statement relating to the data element and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the data element.
	 */
	public String getCopyright() { return copyright; }

	/**
	 * Setter for copyright
	 * @param value A copyright statement relating to the data element and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the data element.
	 */
	public void setCopyright(String value) { copyright = value; }


	public enum Stringency{
		@SerializedName("comparable") COMPARABLE,
		@SerializedName("fully-specified") FULLY_SPECIFIED,
		@SerializedName("equivalent") EQUIVALENT,
		@SerializedName("convertable") CONVERTABLE,
		@SerializedName("scaleable") SCALEABLE,
		@SerializedName("flexible") FLEXIBLE
	}

	@Expose
	private Stringency stringency;

	/**
	 * Getter for stringency
	 * @return Identifies how precise the data element is in its definition.
	 */
	public Stringency getStringency() { return stringency; }

	/**
	 * Setter for stringency
	 * @param value Identifies how precise the data element is in its definition.
	 */
	public void setStringency(Stringency value) { stringency = value; }


	@Expose
	private ArrayList<DataElementMapping> mapping;

	/**
	 * Getter for mapping
	 * @return Identifies a specification (other than a terminology) that the elements which make up the DataElement have some correspondence with.
	 */
	public ArrayList<DataElementMapping> getMapping() { return mapping; }

	/**
	 * Setter for mapping
	 * @param value Identifies a specification (other than a terminology) that the elements which make up the DataElement have some correspondence with.
	 */
	public void setMapping(ArrayList<DataElementMapping> value) { mapping = value; }


	@Expose
	private ArrayList<ElementDefinition> element;

	/**
	 * Getter for element
	 * @return Defines the structure, type, allowed values and other constraining characteristics of the data element.
	 */
	public ArrayList<ElementDefinition> getElement() { return element; }

	/**
	 * Setter for element
	 * @param value Defines the structure, type, allowed values and other constraining characteristics of the data element.
	 */
	public void setElement(ArrayList<ElementDefinition> value) { element = value; }


}
