package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
 */
public class MessageDefinition extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a MessageDefinition resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a MessageDefinition resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this message definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this message definition is (or will be) published. The URL SHOULD include the major version of the message definition. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this message definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this message definition is (or will be) published. The URL SHOULD include the major version of the message definition. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this message definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this message definition when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the message definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the message definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the message definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the message definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the message definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the message definition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive, user-friendly title for the message definition.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive, user-friendly title for the message definition.
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
	 * @return The status of this message definition. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this message definition. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this message definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this message definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the message definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the message definition changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the message definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the message definition changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the message definition.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the message definition.
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
	 * @return A free text natural language description of the message definition from a consumer's perspective.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the message definition from a consumer's perspective.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate message definition instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate message definition instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the message definition is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the message definition is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this message definition is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this message definition is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private String copyright;

	/**
	 * Getter for copyright
	 * @return A copyright statement relating to the message definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the message definition.
	 */
	public String getCopyright() { return copyright; }

	/**
	 * Setter for copyright
	 * @param value A copyright statement relating to the message definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the message definition.
	 */
	public void setCopyright(String value) { copyright = value; }


	@Expose
	private Reference base;

	/**
	 * Getter for base
	 * @return The MessageDefinition that is the basis for the contents of this resource.
	 */
	public Reference getBase() { return base; }

	/**
	 * Setter for base
	 * @param value The MessageDefinition that is the basis for the contents of this resource.
	 */
	public void setBase(Reference value) { base = value; }


	@Expose
	private ArrayList<Reference> parent;

	/**
	 * Getter for parent
	 * @return Identifies a protocol or workflow that this MessageDefinition represents a step in.
	 */
	public ArrayList<Reference> getParent() { return parent; }

	/**
	 * Setter for parent
	 * @param value Identifies a protocol or workflow that this MessageDefinition represents a step in.
	 */
	public void setParent(ArrayList<Reference> value) { parent = value; }


	@Expose
	private ArrayList<Reference> replaces;

	/**
	 * Getter for replaces
	 * @return A MessageDefinition that is superseded by this definition.
	 */
	public ArrayList<Reference> getReplaces() { return replaces; }

	/**
	 * Setter for replaces
	 * @param value A MessageDefinition that is superseded by this definition.
	 */
	public void setReplaces(ArrayList<Reference> value) { replaces = value; }


	@Expose
	private Coding event;

	/**
	 * Getter for event
	 * @return A coded identifier of a supported messaging event.
	 */
	public Coding getEvent() { return event; }

	/**
	 * Setter for event
	 * @param value A coded identifier of a supported messaging event.
	 */
	public void setEvent(Coding value) { event = value; }


	@Expose
	private String category;

	/**
	 * Getter for category
	 * @return The impact of the content of the message.
	 */
	public String getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value The impact of the content of the message.
	 */
	public void setCategory(String value) { category = value; }


	@Expose
	private ArrayList<MessageDefinitionFocus> focus;

	/**
	 * Getter for focus
	 * @return Identifies the resource (or resources) that are being addressed by the event.  For example, the Encounter for an admit message or two Account records for a merge.
	 */
	public ArrayList<MessageDefinitionFocus> getFocus() { return focus; }

	/**
	 * Setter for focus
	 * @param value Identifies the resource (or resources) that are being addressed by the event.  For example, the Encounter for an admit message or two Account records for a merge.
	 */
	public void setFocus(ArrayList<MessageDefinitionFocus> value) { focus = value; }


	@Expose
	private boolean responseRequired;

	/**
	 * Getter for responseRequired
	 * @return Indicates whether a response is required for this message.
	 */
	public boolean getResponseRequired() { return responseRequired; }

	/**
	 * Setter for responseRequired
	 * @param value Indicates whether a response is required for this message.
	 */
	public void setResponseRequired(boolean value) { responseRequired = value; }


	@Expose
	private ArrayList<MessageDefinitionAllowedResponse> allowedResponse;

	/**
	 * Getter for allowedResponse
	 * @return Indicates what types of messages may be sent as an application-level response to this message.
	 */
	public ArrayList<MessageDefinitionAllowedResponse> getAllowedResponse() { return allowedResponse; }

	/**
	 * Setter for allowedResponse
	 * @param value Indicates what types of messages may be sent as an application-level response to this message.
	 */
	public void setAllowedResponse(ArrayList<MessageDefinitionAllowedResponse> value) { allowedResponse = value; }


}
