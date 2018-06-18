package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 */
public class ExpansionProfile extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a ExpansionProfile resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a ExpansionProfile resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this expansion profile when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this expansion profile is (or will be) published. The URL SHOULD include the major version of the expansion profile. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this expansion profile when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this expansion profile is (or will be) published. The URL SHOULD include the major version of the expansion profile. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this expansion profile when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this expansion profile when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the expansion profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the expansion profile author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the expansion profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the expansion profile author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the expansion profile. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the expansion profile. This name should be usable as an identifier for the module by machine processing applications such as code generation.
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
	 * @return The status of this expansion profile. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this expansion profile. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this expansion profile is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this expansion profile is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the expansion profile was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the expansion profile changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the expansion profile was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the expansion profile changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the expansion profile.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the expansion profile.
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
	 * @return A free text natural language description of the expansion profile from a consumer's perspective.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the expansion profile from a consumer's perspective.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate expansion profile instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate expansion profile instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the expansion profile is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the expansion profile is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private ArrayList<ExpansionProfileFixedVersion> fixedVersion;

	/**
	 * Getter for fixedVersion
	 * @return Fix use of a particular code system to a particular version.
	 */
	public ArrayList<ExpansionProfileFixedVersion> getFixedVersion() { return fixedVersion; }

	/**
	 * Setter for fixedVersion
	 * @param value Fix use of a particular code system to a particular version.
	 */
	public void setFixedVersion(ArrayList<ExpansionProfileFixedVersion> value) { fixedVersion = value; }


	@Expose
	private ExpansionProfileExcludedSystem excludedSystem;

	/**
	 * Getter for excludedSystem
	 * @return Code system, or a particular version of a code system to be excluded from value set expansions.
	 */
	public ExpansionProfileExcludedSystem getExcludedSystem() { return excludedSystem; }

	/**
	 * Setter for excludedSystem
	 * @param value Code system, or a particular version of a code system to be excluded from value set expansions.
	 */
	public void setExcludedSystem(ExpansionProfileExcludedSystem value) { excludedSystem = value; }


	@Expose
	private boolean includeDesignations;

	/**
	 * Getter for includeDesignations
	 * @return Controls whether concept designations are to be included or excluded in value set expansions.
	 */
	public boolean getIncludeDesignations() { return includeDesignations; }

	/**
	 * Setter for includeDesignations
	 * @param value Controls whether concept designations are to be included or excluded in value set expansions.
	 */
	public void setIncludeDesignations(boolean value) { includeDesignations = value; }


	@Expose
	private ExpansionProfileDesignation designation;

	/**
	 * Getter for designation
	 * @return A set of criteria that provide the constraints imposed on the value set expansion by including or excluding designations.
	 */
	public ExpansionProfileDesignation getDesignation() { return designation; }

	/**
	 * Setter for designation
	 * @param value A set of criteria that provide the constraints imposed on the value set expansion by including or excluding designations.
	 */
	public void setDesignation(ExpansionProfileDesignation value) { designation = value; }


	@Expose
	private boolean includeDefinition;

	/**
	 * Getter for includeDefinition
	 * @return Controls whether the value set definition is included or excluded in value set expansions.
	 */
	public boolean getIncludeDefinition() { return includeDefinition; }

	/**
	 * Setter for includeDefinition
	 * @param value Controls whether the value set definition is included or excluded in value set expansions.
	 */
	public void setIncludeDefinition(boolean value) { includeDefinition = value; }


	@Expose
	private boolean activeOnly;

	/**
	 * Getter for activeOnly
	 * @return Controls whether inactive concepts are included or excluded in value set expansions.
	 */
	public boolean getActiveOnly() { return activeOnly; }

	/**
	 * Setter for activeOnly
	 * @param value Controls whether inactive concepts are included or excluded in value set expansions.
	 */
	public void setActiveOnly(boolean value) { activeOnly = value; }


	@Expose
	private boolean excludeNested;

	/**
	 * Getter for excludeNested
	 * @return Controls whether or not the value set expansion nests codes or not (i.e. ValueSet.expansion.contains.contains).
	 */
	public boolean getExcludeNested() { return excludeNested; }

	/**
	 * Setter for excludeNested
	 * @param value Controls whether or not the value set expansion nests codes or not (i.e. ValueSet.expansion.contains.contains).
	 */
	public void setExcludeNested(boolean value) { excludeNested = value; }


	@Expose
	private boolean excludeNotForUI;

	/**
	 * Getter for excludeNotForUI
	 * @return Controls whether or not the value set expansion includes codes which cannot be displayed in user interfaces.
	 */
	public boolean getExcludeNotForUI() { return excludeNotForUI; }

	/**
	 * Setter for excludeNotForUI
	 * @param value Controls whether or not the value set expansion includes codes which cannot be displayed in user interfaces.
	 */
	public void setExcludeNotForUI(boolean value) { excludeNotForUI = value; }


	@Expose
	private boolean excludePostCoordinated;

	/**
	 * Getter for excludePostCoordinated
	 * @return Controls whether or not the value set expansion includes post coordinated codes.
	 */
	public boolean getExcludePostCoordinated() { return excludePostCoordinated; }

	/**
	 * Setter for excludePostCoordinated
	 * @param value Controls whether or not the value set expansion includes post coordinated codes.
	 */
	public void setExcludePostCoordinated(boolean value) { excludePostCoordinated = value; }


	@Expose
	private String displayLanguage;

	/**
	 * Getter for displayLanguage
	 * @return Specifies the language to be used for description in the expansions i.e. the language to be used for ValueSet.expansion.contains.display.
	 */
	public String getDisplayLanguage() { return displayLanguage; }

	/**
	 * Setter for displayLanguage
	 * @param value Specifies the language to be used for description in the expansions i.e. the language to be used for ValueSet.expansion.contains.display.
	 */
	public void setDisplayLanguage(String value) { displayLanguage = value; }


	@Expose
	private boolean limitedExpansion;

	/**
	 * Getter for limitedExpansion
	 * @return If the value set being expanded is incomplete (because it is too big to expand), return a limited expansion (a subset) with an indicator that expansion is incomplete, using the extension [http://hl7.org/fhir/StructureDefinition/valueset-toocostly](extension-valueset-toocostly.html).
	 */
	public boolean getLimitedExpansion() { return limitedExpansion; }

	/**
	 * Setter for limitedExpansion
	 * @param value If the value set being expanded is incomplete (because it is too big to expand), return a limited expansion (a subset) with an indicator that expansion is incomplete, using the extension [http://hl7.org/fhir/StructureDefinition/valueset-toocostly](extension-valueset-toocostly.html).
	 */
	public void setLimitedExpansion(boolean value) { limitedExpansion = value; }


}
