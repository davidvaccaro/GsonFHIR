package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
 */
public class StructureDefinition extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a StructureDefinition resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a StructureDefinition resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this structure definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this structure definition is (or will be) published. The URL SHOULD include the major version of the structure definition. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this structure definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this structure definition is (or will be) published. The URL SHOULD include the major version of the structure definition. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this structure definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this structure definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the structure definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the structure definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the structure definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the structure definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the structure definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the structure definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive, user-friendly title for the structure definition.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive, user-friendly title for the structure definition.
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
	 * @return The status of this structure definition. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this structure definition. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this structure definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this structure definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the structure definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the structure definition changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the structure definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the structure definition changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the structure definition.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the structure definition.
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
	 * @return A free text natural language description of the structure definition from a consumer's perspective.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the structure definition from a consumer's perspective.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate structure definition instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate structure definition instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the structure definition is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the structure definition is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this structure definition is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this structure definition is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private String copyright;

	/**
	 * Getter for copyright
	 * @return A copyright statement relating to the structure definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the structure definition.
	 */
	public String getCopyright() { return copyright; }

	/**
	 * Setter for copyright
	 * @param value A copyright statement relating to the structure definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the structure definition.
	 */
	public void setCopyright(String value) { copyright = value; }


	@Expose
	private ArrayList<Coding> keyword;

	/**
	 * Getter for keyword
	 * @return A set of key words or terms from external terminologies that may be used to assist with indexing and searching of templates.
	 */
	public ArrayList<Coding> getKeyword() { return keyword; }

	/**
	 * Setter for keyword
	 * @param value A set of key words or terms from external terminologies that may be used to assist with indexing and searching of templates.
	 */
	public void setKeyword(ArrayList<Coding> value) { keyword = value; }


	@Expose
	private String fhirVersion;

	/**
	 * Getter for fhirVersion
	 * @return The version of the FHIR specification on which this StructureDefinition is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 3.0.1 for this version.
	 */
	public String getFhirVersion() { return fhirVersion; }

	/**
	 * Setter for fhirVersion
	 * @param value The version of the FHIR specification on which this StructureDefinition is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is 3.0.1 for this version.
	 */
	public void setFhirVersion(String value) { fhirVersion = value; }


	@Expose
	private ArrayList<StructureDefinitionMapping> mapping;

	/**
	 * Getter for mapping
	 * @return An external specification that the content is mapped to.
	 */
	public ArrayList<StructureDefinitionMapping> getMapping() { return mapping; }

	/**
	 * Setter for mapping
	 * @param value An external specification that the content is mapped to.
	 */
	public void setMapping(ArrayList<StructureDefinitionMapping> value) { mapping = value; }


	public enum Kind{
		@SerializedName("primitive-type") PRIMITIVE_TYPE,
		@SerializedName("complex-type") COMPLEX_TYPE,
		@SerializedName("resource") RESOURCE,
		@SerializedName("logical") LOGICAL
	}

	@Expose
	private Kind kind;

	/**
	 * Getter for kind
	 * @return Defines the kind of structure that this definition is describing.
	 */
	public Kind getKind() { return kind; }

	/**
	 * Setter for kind
	 * @param value Defines the kind of structure that this definition is describing.
	 */
	public void setKind(Kind value) { kind = value; }


	@Expose
	@SerializedName("abstract")
	private boolean abstractValue;

	/**
	 * Getter for abstractValue
	 * @return Whether structure this definition describes is abstract or not  - that is, whether the structure is not intended to be instantiated. For Resources and Data types, abstract types will never be exchanged  between systems.
	 */
	public boolean getAbstract() { return abstractValue; }

	/**
	 * Setter for abstractValue
	 * @param value Whether structure this definition describes is abstract or not  - that is, whether the structure is not intended to be instantiated. For Resources and Data types, abstract types will never be exchanged  between systems.
	 */
	public void setAbstract(boolean value) { abstractValue = value; }


	public enum ContextType{
		@SerializedName("resource") RESOURCE,
		@SerializedName("datatype") DATATYPE,
		@SerializedName("extension") EXTENSION
	}

	@Expose
	private ContextType contextType;

	/**
	 * Getter for contextType
	 * @return If this is an extension, Identifies the context within FHIR resources where the extension can be used.
	 */
	public ContextType getContextType() { return contextType; }

	/**
	 * Setter for contextType
	 * @param value If this is an extension, Identifies the context within FHIR resources where the extension can be used.
	 */
	public void setContextType(ContextType value) { contextType = value; }


	@Expose
	private ArrayList<String> context;

	/**
	 * Getter for context
	 * @return Identifies the types of resource or data type elements to which the extension can be applied.
	 */
	public ArrayList<String> getContext() { return context; }

	/**
	 * Setter for context
	 * @param value Identifies the types of resource or data type elements to which the extension can be applied.
	 */
	public void setContext(ArrayList<String> value) { context = value; }


	@Expose
	private ArrayList<String> contextInvariant;

	/**
	 * Getter for contextInvariant
	 * @return A set of rules as Fluent Invariants about when the extension can be used (e.g. co-occurrence variants for the extension).
	 */
	public ArrayList<String> getContextInvariant() { return contextInvariant; }

	/**
	 * Setter for contextInvariant
	 * @param value A set of rules as Fluent Invariants about when the extension can be used (e.g. co-occurrence variants for the extension).
	 */
	public void setContextInvariant(ArrayList<String> value) { contextInvariant = value; }


	@Expose
	private String type;

	/**
	 * Getter for type
	 * @return The type this structure describes. If the derivation kind is 'specialization' then this is the master definition for a type, and there is always one of these (a data type, an extension, a resource, including abstract ones). Otherwise the structure definition is a constraint on the stated type (and in this case, the type cannot be an abstract type).
	 */
	public String getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type this structure describes. If the derivation kind is 'specialization' then this is the master definition for a type, and there is always one of these (a data type, an extension, a resource, including abstract ones). Otherwise the structure definition is a constraint on the stated type (and in this case, the type cannot be an abstract type).
	 */
	public void setType(String value) { type = value; }


	@Expose
	private String baseDefinition;

	/**
	 * Getter for baseDefinition
	 * @return An absolute URI that is the base structure from which this type is derived, either by specialization or constraint.
	 */
	public String getBaseDefinition() { return baseDefinition; }

	/**
	 * Setter for baseDefinition
	 * @param value An absolute URI that is the base structure from which this type is derived, either by specialization or constraint.
	 */
	public void setBaseDefinition(String value) { baseDefinition = value; }


	public enum Derivation{
		@SerializedName("specialization") SPECIALIZATION,
		@SerializedName("constraint") CONSTRAINT
	}

	@Expose
	private Derivation derivation;

	/**
	 * Getter for derivation
	 * @return How the type relates to the baseDefinition.
	 */
	public Derivation getDerivation() { return derivation; }

	/**
	 * Setter for derivation
	 * @param value How the type relates to the baseDefinition.
	 */
	public void setDerivation(Derivation value) { derivation = value; }


	@Expose
	private StructureDefinitionSnapshot snapshot;

	/**
	 * Getter for snapshot
	 * @return A snapshot view is expressed in a stand alone form that can be used and interpreted without considering the base StructureDefinition.
	 */
	public StructureDefinitionSnapshot getSnapshot() { return snapshot; }

	/**
	 * Setter for snapshot
	 * @param value A snapshot view is expressed in a stand alone form that can be used and interpreted without considering the base StructureDefinition.
	 */
	public void setSnapshot(StructureDefinitionSnapshot value) { snapshot = value; }


	@Expose
	private StructureDefinitionDifferential differential;

	/**
	 * Getter for differential
	 * @return A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies.
	 */
	public StructureDefinitionDifferential getDifferential() { return differential; }

	/**
	 * Setter for differential
	 * @param value A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies.
	 */
	public void setDifferential(StructureDefinitionDifferential value) { differential = value; }


}
