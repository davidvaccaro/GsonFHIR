package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 */
public class SearchParameter extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a SearchParameter resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a SearchParameter resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published. The URL SHOULD include the major version of the search parameter. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this search parameter when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this search parameter is (or will be) published. The URL SHOULD include the major version of the search parameter. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the search parameter when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the search parameter author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the search parameter when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the search parameter author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the search parameter. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the search parameter. This name should be usable as an identifier for the module by machine processing applications such as code generation.
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
	 * @return The status of this search parameter. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this search parameter. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this search parameter is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this search parameter is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the search parameter was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the search parameter was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the search parameter changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the search parameter.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the search parameter.
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
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate search parameter instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate search parameter instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the search parameter is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the search parameter is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this search parameter is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this search parameter is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return The code used in the URL or the parameter name in a parameters resource for this search parameter.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value The code used in the URL or the parameter name in a parameters resource for this search parameter.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private ArrayList<String> base;

	/**
	 * Getter for base
	 * @return The base resource type(s) that this search parameter can be used against.
	 */
	public ArrayList<String> getBase() { return base; }

	/**
	 * Setter for base
	 * @param value The base resource type(s) that this search parameter can be used against.
	 */
	public void setBase(ArrayList<String> value) { base = value; }


	public enum Type{
		@SerializedName("number") NUMBER,
		@SerializedName("date") DATE,
		@SerializedName("string") STRING,
		@SerializedName("token") TOKEN,
		@SerializedName("reference") REFERENCE,
		@SerializedName("composite") COMPOSITE,
		@SerializedName("quantity") QUANTITY,
		@SerializedName("uri") URI
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return The type of value a search parameter refers to, and how the content is interpreted.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of value a search parameter refers to, and how the content is interpreted.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String derivedFrom;

	/**
	 * Getter for derivedFrom
	 * @return Where this search parameter is originally defined. If a derivedFrom is provided, then the details in the search parameter must be consistent with the definition from which it is defined. I.e. the parameter should have the same meaning, and (usually) the functionality should be a proper subset of the underlying search parameter.
	 */
	public String getDerivedFrom() { return derivedFrom; }

	/**
	 * Setter for derivedFrom
	 * @param value Where this search parameter is originally defined. If a derivedFrom is provided, then the details in the search parameter must be consistent with the definition from which it is defined. I.e. the parameter should have the same meaning, and (usually) the functionality should be a proper subset of the underlying search parameter.
	 */
	public void setDerivedFrom(String value) { derivedFrom = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A free text natural language description of the search parameter from a consumer's perspective. and how it used.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the search parameter from a consumer's perspective. and how it used.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String expression;

	/**
	 * Getter for expression
	 * @return A FHIRPath expression that returns a set of elements for the search parameter.
	 */
	public String getExpression() { return expression; }

	/**
	 * Setter for expression
	 * @param value A FHIRPath expression that returns a set of elements for the search parameter.
	 */
	public void setExpression(String value) { expression = value; }


	@Expose
	private String xpath;

	/**
	 * Getter for xpath
	 * @return An XPath expression that returns a set of elements for the search parameter.
	 */
	public String getXpath() { return xpath; }

	/**
	 * Setter for xpath
	 * @param value An XPath expression that returns a set of elements for the search parameter.
	 */
	public void setXpath(String value) { xpath = value; }


	public enum XpathUsage{
		@SerializedName("normal") NORMAL,
		@SerializedName("phonetic") PHONETIC,
		@SerializedName("nearby") NEARBY,
		@SerializedName("distance") DISTANCE,
		@SerializedName("other") OTHER
	}

	@Expose
	private XpathUsage xpathUsage;

	/**
	 * Getter for xpathUsage
	 * @return How the search parameter relates to the set of elements returned by evaluating the xpath query.
	 */
	public XpathUsage getXpathUsage() { return xpathUsage; }

	/**
	 * Setter for xpathUsage
	 * @param value How the search parameter relates to the set of elements returned by evaluating the xpath query.
	 */
	public void setXpathUsage(XpathUsage value) { xpathUsage = value; }


	@Expose
	private ArrayList<String> target;

	/**
	 * Getter for target
	 * @return Types of resource (if a resource is referenced).
	 */
	public ArrayList<String> getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value Types of resource (if a resource is referenced).
	 */
	public void setTarget(ArrayList<String> value) { target = value; }


	@Expose
	private ArrayList<String> comparator;

	/**
	 * Getter for comparator
	 * @return Comparators supported for the search parameter.
	 */
	public ArrayList<String> getComparator() { return comparator; }

	/**
	 * Setter for comparator
	 * @param value Comparators supported for the search parameter.
	 */
	public void setComparator(ArrayList<String> value) { comparator = value; }


	@Expose
	private ArrayList<String> modifier;

	/**
	 * Getter for modifier
	 * @return A modifier supported for the search parameter.
	 */
	public ArrayList<String> getModifier() { return modifier; }

	/**
	 * Setter for modifier
	 * @param value A modifier supported for the search parameter.
	 */
	public void setModifier(ArrayList<String> value) { modifier = value; }


	@Expose
	private ArrayList<String> chain;

	/**
	 * Getter for chain
	 * @return Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from SearchParameter.code for a parameter on the target resource type.
	 */
	public ArrayList<String> getChain() { return chain; }

	/**
	 * Setter for chain
	 * @param value Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from SearchParameter.code for a parameter on the target resource type.
	 */
	public void setChain(ArrayList<String> value) { chain = value; }


	@Expose
	private ArrayList<SearchParameterComponent> component;

	/**
	 * Getter for component
	 * @return Used to define the parts of a composite search parameter.
	 */
	public ArrayList<SearchParameterComponent> getComponent() { return component; }

	/**
	 * Setter for component
	 * @param value Used to define the parts of a composite search parameter.
	 */
	public void setComponent(ArrayList<SearchParameterComponent> value) { component = value; }


}
