package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 */
public class OperationDefinition extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a OperationDefinition resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a OperationDefinition resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published. The URL SHOULD include the major version of the operation definition. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published. The URL SHOULD include the major version of the operation definition. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the operation definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the operation definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the operation definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the operation definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the operation definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the operation definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
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
	 * @return The status of this operation definition. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this operation definition. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	public enum Kind{
		@SerializedName("operation") OPERATION,
		@SerializedName("query") QUERY
	}

	@Expose
	private Kind kind;

	/**
	 * Getter for kind
	 * @return Whether this is an operation or a named query.
	 */
	public Kind getKind() { return kind; }

	/**
	 * Setter for kind
	 * @param value Whether this is an operation or a named query.
	 */
	public void setKind(Kind value) { kind = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this operation definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this operation definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the operation definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the operation definition changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the operation definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the operation definition changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the operation definition.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the operation definition.
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
	 * @return A free text natural language description of the operation definition from a consumer's perspective.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the operation definition from a consumer's perspective.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate operation definition instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate operation definition instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the operation definition is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the operation definition is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this operation definition is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this operation definition is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private boolean idempotent;

	/**
	 * Getter for idempotent
	 * @return Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST.
	 */
	public boolean getIdempotent() { return idempotent; }

	/**
	 * Setter for idempotent
	 * @param value Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST.
	 */
	public void setIdempotent(boolean value) { idempotent = value; }


	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return The name used to invoke the operation.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The name used to invoke the operation.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return Additional information about how to use this operation or named query.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value Additional information about how to use this operation or named query.
	 */
	public void setComment(String value) { comment = value; }


	@Expose
	private Reference base;

	/**
	 * Getter for base
	 * @return Indicates that this operation definition is a constraining profile on the base.
	 */
	public Reference getBase() { return base; }

	/**
	 * Setter for base
	 * @param value Indicates that this operation definition is a constraining profile on the base.
	 */
	public void setBase(Reference value) { base = value; }


	@Expose
	private ArrayList<String> resource;

	/**
	 * Getter for resource
	 * @return The types on which this operation can be executed.
	 */
	public ArrayList<String> getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value The types on which this operation can be executed.
	 */
	public void setResource(ArrayList<String> value) { resource = value; }


	@Expose
	private boolean system;

	/**
	 * Getter for system
	 * @return Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context).
	 */
	public boolean getSystem() { return system; }

	/**
	 * Setter for system
	 * @param value Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context).
	 */
	public void setSystem(boolean value) { system = value; }


	@Expose
	private boolean type;

	/**
	 * Getter for type
	 * @return Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a specific resource id for the context).
	 */
	public boolean getType() { return type; }

	/**
	 * Setter for type
	 * @param value Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a specific resource id for the context).
	 */
	public void setType(boolean value) { type = value; }


	@Expose
	private boolean instance;

	/**
	 * Getter for instance
	 * @return Indicates whether this operation can be invoked on a particular instance of one of the given types.
	 */
	public boolean getInstance() { return instance; }

	/**
	 * Setter for instance
	 * @param value Indicates whether this operation can be invoked on a particular instance of one of the given types.
	 */
	public void setInstance(boolean value) { instance = value; }


	@Expose
	private ArrayList<OperationDefinitionParameter> parameter;

	/**
	 * Getter for parameter
	 * @return The parameters for the operation/query.
	 */
	public ArrayList<OperationDefinitionParameter> getParameter() { return parameter; }

	/**
	 * Setter for parameter
	 * @param value The parameters for the operation/query.
	 */
	public void setParameter(ArrayList<OperationDefinitionParameter> value) { parameter = value; }


	@Expose
	private ArrayList<OperationDefinitionOverload> overload;

	/**
	 * Getter for overload
	 * @return Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when generating overloaded parameter sets for this operation.
	 */
	public ArrayList<OperationDefinitionOverload> getOverload() { return overload; }

	/**
	 * Setter for overload
	 * @param value Defines an appropriate combination of parameters to use when invoking this operation, to help code generators when generating overloaded parameter sets for this operation.
	 */
	public void setOverload(ArrayList<OperationDefinitionOverload> value) { overload = value; }


}
