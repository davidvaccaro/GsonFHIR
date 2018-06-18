package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 */
public class CapabilityStatement extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a CapabilityStatement resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a CapabilityStatement resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this capability statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this capability statement is (or will be) published. The URL SHOULD include the major version of the capability statement. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this capability statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this capability statement is (or will be) published. The URL SHOULD include the major version of the capability statement. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the capability statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the capability statement author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the capability statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the capability statement author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the capability statement. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the capability statement. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive, user-friendly title for the capability statement.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive, user-friendly title for the capability statement.
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
	 * @return The status of this capability statement. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this capability statement. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this capability statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this capability statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the capability statement was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the capability statement changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the capability statement was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the capability statement changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the capability statement.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the capability statement.
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
	 * @return A free text natural language description of the capability statement from a consumer's perspective. Typically, this is used when the capability statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the capability statement from a consumer's perspective. Typically, this is used when the capability statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate capability statement instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate capability statement instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the capability statement is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the capability statement is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this capability statement is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this capability statement is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private String copyright;

	/**
	 * Getter for copyright
	 * @return A copyright statement relating to the capability statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the capability statement.
	 */
	public String getCopyright() { return copyright; }

	/**
	 * Setter for copyright
	 * @param value A copyright statement relating to the capability statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the capability statement.
	 */
	public void setCopyright(String value) { copyright = value; }


	public enum Kind{
		@SerializedName("instance") INSTANCE,
		@SerializedName("capability") CAPABILITY,
		@SerializedName("requirements") REQUIREMENTS
	}

	@Expose
	private Kind kind;

	/**
	 * Getter for kind
	 * @return The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase).
	 */
	public Kind getKind() { return kind; }

	/**
	 * Setter for kind
	 * @param value The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase).
	 */
	public void setKind(Kind value) { kind = value; }


	@Expose
	private ArrayList<String> instantiates;

	/**
	 * Getter for instantiates
	 * @return Reference to a canonical URL of another CapabilityStatement that this software implements or uses. This capability statement is a published API description that corresponds to a business service. The rest of the capability statement does not need to repeat the details of the referenced resource, but can do so.
	 */
	public ArrayList<String> getInstantiates() { return instantiates; }

	/**
	 * Setter for instantiates
	 * @param value Reference to a canonical URL of another CapabilityStatement that this software implements or uses. This capability statement is a published API description that corresponds to a business service. The rest of the capability statement does not need to repeat the details of the referenced resource, but can do so.
	 */
	public void setInstantiates(ArrayList<String> value) { instantiates = value; }


	@Expose
	private CapabilityStatementSoftware software;

	/**
	 * Getter for software
	 * @return Software that is covered by this capability statement.  It is used when the capability statement describes the capabilities of a particular software version, independent of an installation.
	 */
	public CapabilityStatementSoftware getSoftware() { return software; }

	/**
	 * Setter for software
	 * @param value Software that is covered by this capability statement.  It is used when the capability statement describes the capabilities of a particular software version, independent of an installation.
	 */
	public void setSoftware(CapabilityStatementSoftware value) { software = value; }


	@Expose
	private CapabilityStatementImplementation implementation;

	/**
	 * Getter for implementation
	 * @return Identifies a specific implementation instance that is described by the capability statement - i.e. a particular installation, rather than the capabilities of a software program.
	 */
	public CapabilityStatementImplementation getImplementation() { return implementation; }

	/**
	 * Setter for implementation
	 * @param value Identifies a specific implementation instance that is described by the capability statement - i.e. a particular installation, rather than the capabilities of a software program.
	 */
	public void setImplementation(CapabilityStatementImplementation value) { implementation = value; }


	@Expose
	private String fhirVersion;

	/**
	 * Getter for fhirVersion
	 * @return The version of the FHIR specification on which this capability statement is based.
	 */
	public String getFhirVersion() { return fhirVersion; }

	/**
	 * Setter for fhirVersion
	 * @param value The version of the FHIR specification on which this capability statement is based.
	 */
	public void setFhirVersion(String value) { fhirVersion = value; }


	public enum AcceptUnknown{
		@SerializedName("no") NO,
		@SerializedName("extensions") EXTENSIONS,
		@SerializedName("elements") ELEMENTS,
		@SerializedName("both") BOTH
	}

	@Expose
	private AcceptUnknown acceptUnknown;

	/**
	 * Getter for acceptUnknown
	 * @return A code that indicates whether the application accepts unknown elements or extensions when reading resources.
	 */
	public AcceptUnknown getAcceptUnknown() { return acceptUnknown; }

	/**
	 * Setter for acceptUnknown
	 * @param value A code that indicates whether the application accepts unknown elements or extensions when reading resources.
	 */
	public void setAcceptUnknown(AcceptUnknown value) { acceptUnknown = value; }


	@Expose
	private ArrayList<String> format;

	/**
	 * Getter for format
	 * @return A list of the formats supported by this implementation using their content types.
	 */
	public ArrayList<String> getFormat() { return format; }

	/**
	 * Setter for format
	 * @param value A list of the formats supported by this implementation using their content types.
	 */
	public void setFormat(ArrayList<String> value) { format = value; }


	@Expose
	private ArrayList<String> patchFormat;

	/**
	 * Getter for patchFormat
	 * @return A list of the patch formats supported by this implementation using their content types.
	 */
	public ArrayList<String> getPatchFormat() { return patchFormat; }

	/**
	 * Setter for patchFormat
	 * @param value A list of the patch formats supported by this implementation using their content types.
	 */
	public void setPatchFormat(ArrayList<String> value) { patchFormat = value; }


	@Expose
	private ArrayList<String> implementationGuide;

	/**
	 * Getter for implementationGuide
	 * @return A list of implementation guides that the server does (or should) support in their entirety.
	 */
	public ArrayList<String> getImplementationGuide() { return implementationGuide; }

	/**
	 * Setter for implementationGuide
	 * @param value A list of implementation guides that the server does (or should) support in their entirety.
	 */
	public void setImplementationGuide(ArrayList<String> value) { implementationGuide = value; }


	@Expose
	private ArrayList<Reference> profile;

	/**
	 * Getter for profile
	 * @return A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles](profiling.html#profile-uses).
	 */
	public ArrayList<Reference> getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value A list of profiles that represent different use cases supported by the system. For a server, "supported by the system" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles](profiling.html#profile-uses).
	 */
	public void setProfile(ArrayList<Reference> value) { profile = value; }


	@Expose
	private ArrayList<CapabilityStatementRest> rest;

	/**
	 * Getter for rest
	 * @return A definition of the restful capabilities of the solution, if any.
	 */
	public ArrayList<CapabilityStatementRest> getRest() { return rest; }

	/**
	 * Setter for rest
	 * @param value A definition of the restful capabilities of the solution, if any.
	 */
	public void setRest(ArrayList<CapabilityStatementRest> value) { rest = value; }


	@Expose
	private ArrayList<CapabilityStatementMessaging> messaging;

	/**
	 * Getter for messaging
	 * @return A description of the messaging capabilities of the solution.
	 */
	public ArrayList<CapabilityStatementMessaging> getMessaging() { return messaging; }

	/**
	 * Setter for messaging
	 * @param value A description of the messaging capabilities of the solution.
	 */
	public void setMessaging(ArrayList<CapabilityStatementMessaging> value) { messaging = value; }


	@Expose
	private ArrayList<CapabilityStatementDocument> document;

	/**
	 * Getter for document
	 * @return A document definition.
	 */
	public ArrayList<CapabilityStatementDocument> getDocument() { return document; }

	/**
	 * Setter for document
	 * @param value A document definition.
	 */
	public void setDocument(ArrayList<CapabilityStatementDocument> value) { document = value; }


}
