package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScript extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a TestScript resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a TestScript resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An absolute URI that is used to identify this test script when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this test script is (or will be) published. The URL SHOULD include the major version of the test script. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An absolute URI that is used to identify this test script when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this test script is (or will be) published. The URL SHOULD include the major version of the test script. For more information see [Technical and Business Versions](resource.html#versions).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return A formal identifier that is used to identify this test script when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A formal identifier that is used to identify this test script when it is represented in other formats, or referenced in a specification, model, design or an instance.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private String version;

	/**
	 * Getter for version
	 * @return The identifier that is used to identify this version of the test script when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the test script author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public String getVersion() { return version; }

	/**
	 * Setter for version
	 * @param value The identifier that is used to identify this version of the test script when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the test script author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
	 */
	public void setVersion(String value) { version = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A natural language name identifying the test script. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A natural language name identifying the test script. This name should be usable as an identifier for the module by machine processing applications such as code generation.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A short, descriptive, user-friendly title for the test script.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A short, descriptive, user-friendly title for the test script.
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
	 * @return The status of this test script. Enables tracking the life-cycle of the content.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of this test script. Enables tracking the life-cycle of the content.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean experimental;

	/**
	 * Getter for experimental
	 * @return A boolean value to indicate that this test script is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public boolean getExperimental() { return experimental; }

	/**
	 * Setter for experimental
	 * @param value A boolean value to indicate that this test script is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage.
	 */
	public void setExperimental(boolean value) { experimental = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date date;

	/**
	 * Getter for date
	 * @return The date  (and optionally time) when the test script was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the test script changes.
	 */
	public Date getDate() { return date; }

	/**
	 * Setter for date
	 * @param value The date  (and optionally time) when the test script was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the test script changes.
	 */
	public void setDate(Date value) { date = value; }


	@Expose
	private String publisher;

	/**
	 * Getter for publisher
	 * @return The name of the individual or organization that published the test script.
	 */
	public String getPublisher() { return publisher; }

	/**
	 * Setter for publisher
	 * @param value The name of the individual or organization that published the test script.
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
	 * @return A free text natural language description of the test script from a consumer's perspective.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A free text natural language description of the test script from a consumer's perspective.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<UsageContext> useContext;

	/**
	 * Getter for useContext
	 * @return The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate test script instances.
	 */
	public ArrayList<UsageContext> getUseContext() { return useContext; }

	/**
	 * Setter for useContext
	 * @param value The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate test script instances.
	 */
	public void setUseContext(ArrayList<UsageContext> value) { useContext = value; }


	@Expose
	private ArrayList<CodeableConcept> jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return A legal or geographic region in which the test script is intended to be used.
	 */
	public ArrayList<CodeableConcept> getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value A legal or geographic region in which the test script is intended to be used.
	 */
	public void setJurisdiction(ArrayList<CodeableConcept> value) { jurisdiction = value; }


	@Expose
	private String purpose;

	/**
	 * Getter for purpose
	 * @return Explaination of why this test script is needed and why it has been designed as it has.
	 */
	public String getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value Explaination of why this test script is needed and why it has been designed as it has.
	 */
	public void setPurpose(String value) { purpose = value; }


	@Expose
	private String copyright;

	/**
	 * Getter for copyright
	 * @return A copyright statement relating to the test script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the test script.
	 */
	public String getCopyright() { return copyright; }

	/**
	 * Setter for copyright
	 * @param value A copyright statement relating to the test script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the test script.
	 */
	public void setCopyright(String value) { copyright = value; }


	@Expose
	private ArrayList<TestScriptOrigin> origin;

	/**
	 * Getter for origin
	 * @return An abstract server used in operations within this test script in the origin element.
	 */
	public ArrayList<TestScriptOrigin> getOrigin() { return origin; }

	/**
	 * Setter for origin
	 * @param value An abstract server used in operations within this test script in the origin element.
	 */
	public void setOrigin(ArrayList<TestScriptOrigin> value) { origin = value; }


	@Expose
	private ArrayList<TestScriptDestination> destination;

	/**
	 * Getter for destination
	 * @return An abstract server used in operations within this test script in the destination element.
	 */
	public ArrayList<TestScriptDestination> getDestination() { return destination; }

	/**
	 * Setter for destination
	 * @param value An abstract server used in operations within this test script in the destination element.
	 */
	public void setDestination(ArrayList<TestScriptDestination> value) { destination = value; }


	@Expose
	private TestScriptMetadata metadata;

	/**
	 * Getter for metadata
	 * @return The required capability must exist and are assumed to function correctly on the FHIR server being tested.
	 */
	public TestScriptMetadata getMetadata() { return metadata; }

	/**
	 * Setter for metadata
	 * @param value The required capability must exist and are assumed to function correctly on the FHIR server being tested.
	 */
	public void setMetadata(TestScriptMetadata value) { metadata = value; }


	@Expose
	private ArrayList<TestScriptFixture> fixture;

	/**
	 * Getter for fixture
	 * @return Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
	 */
	public ArrayList<TestScriptFixture> getFixture() { return fixture; }

	/**
	 * Setter for fixture
	 * @param value Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
	 */
	public void setFixture(ArrayList<TestScriptFixture> value) { fixture = value; }


	@Expose
	private ArrayList<Reference> profile;

	/**
	 * Getter for profile
	 * @return Reference to the profile to be used for validation.
	 */
	public ArrayList<Reference> getProfile() { return profile; }

	/**
	 * Setter for profile
	 * @param value Reference to the profile to be used for validation.
	 */
	public void setProfile(ArrayList<Reference> value) { profile = value; }


	@Expose
	private ArrayList<TestScriptVariable> variable;

	/**
	 * Getter for variable
	 * @return Variable is set based either on element value in response body or on header field value in the response headers.
	 */
	public ArrayList<TestScriptVariable> getVariable() { return variable; }

	/**
	 * Setter for variable
	 * @param value Variable is set based either on element value in response body or on header field value in the response headers.
	 */
	public void setVariable(ArrayList<TestScriptVariable> value) { variable = value; }


	@Expose
	private ArrayList<TestScriptRule> rule;

	/**
	 * Getter for rule
	 * @return Assert rule to be used in one or more asserts within the test script.
	 */
	public ArrayList<TestScriptRule> getRule() { return rule; }

	/**
	 * Setter for rule
	 * @param value Assert rule to be used in one or more asserts within the test script.
	 */
	public void setRule(ArrayList<TestScriptRule> value) { rule = value; }


	@Expose
	private ArrayList<TestScriptRuleset> ruleset;

	/**
	 * Getter for ruleset
	 * @return Contains one or more rules.  Offers a way to group rules so assertions could reference the group of rules and have them all applied.
	 */
	public ArrayList<TestScriptRuleset> getRuleset() { return ruleset; }

	/**
	 * Setter for ruleset
	 * @param value Contains one or more rules.  Offers a way to group rules so assertions could reference the group of rules and have them all applied.
	 */
	public void setRuleset(ArrayList<TestScriptRuleset> value) { ruleset = value; }


	@Expose
	private TestScriptSetup setup;

	/**
	 * Getter for setup
	 * @return A series of required setup operations before tests are executed.
	 */
	public TestScriptSetup getSetup() { return setup; }

	/**
	 * Setter for setup
	 * @param value A series of required setup operations before tests are executed.
	 */
	public void setSetup(TestScriptSetup value) { setup = value; }


	@Expose
	private ArrayList<TestScriptTest> test;

	/**
	 * Getter for test
	 * @return A test in this script.
	 */
	public ArrayList<TestScriptTest> getTest() { return test; }

	/**
	 * Setter for test
	 * @param value A test in this script.
	 */
	public void setTest(ArrayList<TestScriptTest> value) { test = value; }


	@Expose
	private TestScriptTeardown teardown;

	/**
	 * Getter for teardown
	 * @return A series of operations required to clean up after the all the tests are executed (successfully or otherwise).
	 */
	public TestScriptTeardown getTeardown() { return teardown; }

	/**
	 * Setter for teardown
	 * @param value A series of operations required to clean up after the all the tests are executed (successfully or otherwise).
	 */
	public void setTeardown(TestScriptTeardown value) { teardown = value; }


}
