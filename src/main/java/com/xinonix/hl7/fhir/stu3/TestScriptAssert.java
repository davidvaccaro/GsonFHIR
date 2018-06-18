package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptAssert extends BackboneElement {
	@Expose
	private String label;

	/**
	 * Getter for label
	 * @return The label would be used for tracking/logging purposes by test engines.
	 */
	public String getLabel() { return label; }

	/**
	 * Setter for label
	 * @param value The label would be used for tracking/logging purposes by test engines.
	 */
	public void setLabel(String value) { label = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return The description would be used by test engines for tracking and reporting purposes.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value The description would be used by test engines for tracking and reporting purposes.
	 */
	public void setDescription(String value) { description = value; }


	public enum Direction{
		@SerializedName("response") RESPONSE,
		@SerializedName("request") REQUEST
	}

	@Expose
	private Direction direction;

	/**
	 * Getter for direction
	 * @return The direction to use for the assertion.
	 */
	public Direction getDirection() { return direction; }

	/**
	 * Setter for direction
	 * @param value The direction to use for the assertion.
	 */
	public void setDirection(Direction value) { direction = value; }


	@Expose
	private String compareToSourceId;

	/**
	 * Getter for compareToSourceId
	 * @return Id of the source fixture used as the contents to be evaluated by either the "source/expression" or "sourceId/path" definition.
	 */
	public String getCompareToSourceId() { return compareToSourceId; }

	/**
	 * Setter for compareToSourceId
	 * @param value Id of the source fixture used as the contents to be evaluated by either the "source/expression" or "sourceId/path" definition.
	 */
	public void setCompareToSourceId(String value) { compareToSourceId = value; }


	@Expose
	private String compareToSourceExpression;

	/**
	 * Getter for compareToSourceExpression
	 * @return The fluentpath expression to evaluate against the source fixture. When compareToSourceId is defined, either compareToSourceExpression or compareToSourcePath must be defined, but not both.
	 */
	public String getCompareToSourceExpression() { return compareToSourceExpression; }

	/**
	 * Setter for compareToSourceExpression
	 * @param value The fluentpath expression to evaluate against the source fixture. When compareToSourceId is defined, either compareToSourceExpression or compareToSourcePath must be defined, but not both.
	 */
	public void setCompareToSourceExpression(String value) { compareToSourceExpression = value; }


	@Expose
	private String compareToSourcePath;

	/**
	 * Getter for compareToSourcePath
	 * @return XPath or JSONPath expression to evaluate against the source fixture. When compareToSourceId is defined, either compareToSourceExpression or compareToSourcePath must be defined, but not both.
	 */
	public String getCompareToSourcePath() { return compareToSourcePath; }

	/**
	 * Setter for compareToSourcePath
	 * @param value XPath or JSONPath expression to evaluate against the source fixture. When compareToSourceId is defined, either compareToSourceExpression or compareToSourcePath must be defined, but not both.
	 */
	public void setCompareToSourcePath(String value) { compareToSourcePath = value; }


	public enum ContentType{
		@SerializedName("xml") XML,
		@SerializedName("json") JSON,
		@SerializedName("ttl") TTL,
		@SerializedName("none") NONE
	}

	@Expose
	private ContentType contentType;

	/**
	 * Getter for contentType
	 * @return The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
	 */
	public ContentType getContentType() { return contentType; }

	/**
	 * Setter for contentType
	 * @param value The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
	 */
	public void setContentType(ContentType value) { contentType = value; }


	@Expose
	private String expression;

	/**
	 * Getter for expression
	 * @return The fluentpath expression to be evaluated against the request or response message contents - HTTP headers and payload.
	 */
	public String getExpression() { return expression; }

	/**
	 * Setter for expression
	 * @param value The fluentpath expression to be evaluated against the request or response message contents - HTTP headers and payload.
	 */
	public void setExpression(String value) { expression = value; }


	@Expose
	private String headerField;

	/**
	 * Getter for headerField
	 * @return The HTTP header field name e.g. 'Location'.
	 */
	public String getHeaderField() { return headerField; }

	/**
	 * Setter for headerField
	 * @param value The HTTP header field name e.g. 'Location'.
	 */
	public void setHeaderField(String value) { headerField = value; }


	@Expose
	private String minimumId;

	/**
	 * Getter for minimumId
	 * @return The ID of a fixture.  Asserts that the response contains at a minimum the fixture specified by minimumId.
	 */
	public String getMinimumId() { return minimumId; }

	/**
	 * Setter for minimumId
	 * @param value The ID of a fixture.  Asserts that the response contains at a minimum the fixture specified by minimumId.
	 */
	public void setMinimumId(String value) { minimumId = value; }


	@Expose
	private boolean navigationLinks;

	/**
	 * Getter for navigationLinks
	 * @return Whether or not the test execution performs validation on the bundle navigation links.
	 */
	public boolean getNavigationLinks() { return navigationLinks; }

	/**
	 * Setter for navigationLinks
	 * @param value Whether or not the test execution performs validation on the bundle navigation links.
	 */
	public void setNavigationLinks(boolean value) { navigationLinks = value; }


	public enum Operator{
		@SerializedName("equals") EQUALS,
		@SerializedName("notEquals") NOTEQUALS,
		@SerializedName("in") IN,
		@SerializedName("notIn") NOTIN,
		@SerializedName("greaterThan") GREATERTHAN,
		@SerializedName("lessThan") LESSTHAN,
		@SerializedName("empty") EMPTY,
		@SerializedName("notEmpty") NOTEMPTY,
		@SerializedName("contains") CONTAINS,
		@SerializedName("notContains") NOTCONTAINS,
		@SerializedName("eval") EVAL
	}

	@Expose
	private Operator operator;

	/**
	 * Getter for operator
	 * @return The operator type defines the conditional behavior of the assert. If not defined, the default is equals.
	 */
	public Operator getOperator() { return operator; }

	/**
	 * Setter for operator
	 * @param value The operator type defines the conditional behavior of the assert. If not defined, the default is equals.
	 */
	public void setOperator(Operator value) { operator = value; }


	@Expose
	private String path;

	/**
	 * Getter for path
	 * @return The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
	 */
	public String getPath() { return path; }

	/**
	 * Setter for path
	 * @param value The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
	 */
	public void setPath(String value) { path = value; }


	public enum RequestMethod{
		@SerializedName("delete") DELETE,
		@SerializedName("get") GET,
		@SerializedName("options") OPTIONS,
		@SerializedName("patch") PATCH,
		@SerializedName("post") POST,
		@SerializedName("put") PUT
	}

	@Expose
	private RequestMethod requestMethod;

	/**
	 * Getter for requestMethod
	 * @return The request method or HTTP operation code to compare against that used by the client system under test.
	 */
	public RequestMethod getRequestMethod() { return requestMethod; }

	/**
	 * Setter for requestMethod
	 * @param value The request method or HTTP operation code to compare against that used by the client system under test.
	 */
	public void setRequestMethod(RequestMethod value) { requestMethod = value; }


	@Expose
	private String requestURL;

	/**
	 * Getter for requestURL
	 * @return The value to use in a comparison against the request URL path string.
	 */
	public String getRequestURL() { return requestURL; }

	/**
	 * Setter for requestURL
	 * @param value The value to use in a comparison against the request URL path string.
	 */
	public void setRequestURL(String value) { requestURL = value; }


	@Expose
	private String resource;

	/**
	 * Getter for resource
	 * @return The type of the resource.  See http://build.fhir.org/resourcelist.html.
	 */
	public String getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value The type of the resource.  See http://build.fhir.org/resourcelist.html.
	 */
	public void setResource(String value) { resource = value; }


	public enum Response{
		@SerializedName("okay") OKAY,
		@SerializedName("created") CREATED,
		@SerializedName("noContent") NOCONTENT,
		@SerializedName("notModified") NOTMODIFIED,
		@SerializedName("bad") BAD,
		@SerializedName("forbidden") FORBIDDEN,
		@SerializedName("notFound") NOTFOUND,
		@SerializedName("methodNotAllowed") METHODNOTALLOWED,
		@SerializedName("conflict") CONFLICT,
		@SerializedName("gone") GONE,
		@SerializedName("preconditionFailed") PRECONDITIONFAILED,
		@SerializedName("unprocessable") UNPROCESSABLE
	}

	@Expose
	private Response response;

	/**
	 * Getter for response
	 * @return okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
	 */
	public Response getResponse() { return response; }

	/**
	 * Setter for response
	 * @param value okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable.
	 */
	public void setResponse(Response value) { response = value; }


	@Expose
	private String responseCode;

	/**
	 * Getter for responseCode
	 * @return The value of the HTTP response code to be tested.
	 */
	public String getResponseCode() { return responseCode; }

	/**
	 * Setter for responseCode
	 * @param value The value of the HTTP response code to be tested.
	 */
	public void setResponseCode(String value) { responseCode = value; }


	@Expose
	private TestScriptRule2 rule;

	/**
	 * Getter for rule
	 * @return The TestScript.rule this assert will evaluate.
	 */
	public TestScriptRule2 getRule() { return rule; }

	/**
	 * Setter for rule
	 * @param value The TestScript.rule this assert will evaluate.
	 */
	public void setRule(TestScriptRule2 value) { rule = value; }


	@Expose
	private TestScriptRuleset1 ruleset;

	/**
	 * Getter for ruleset
	 * @return The TestScript.ruleset this assert will evaluate.
	 */
	public TestScriptRuleset1 getRuleset() { return ruleset; }

	/**
	 * Setter for ruleset
	 * @param value The TestScript.ruleset this assert will evaluate.
	 */
	public void setRuleset(TestScriptRuleset1 value) { ruleset = value; }


	@Expose
	private String sourceId;

	/**
	 * Getter for sourceId
	 * @return Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
	 */
	public String getSourceId() { return sourceId; }

	/**
	 * Setter for sourceId
	 * @param value Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
	 */
	public void setSourceId(String value) { sourceId = value; }


	@Expose
	private String validateProfileId;

	/**
	 * Getter for validateProfileId
	 * @return The ID of the Profile to validate against.
	 */
	public String getValidateProfileId() { return validateProfileId; }

	/**
	 * Setter for validateProfileId
	 * @param value The ID of the Profile to validate against.
	 */
	public void setValidateProfileId(String value) { validateProfileId = value; }


	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return The value to compare to.
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The value to compare to.
	 */
	public void setValue(String value) { value = value; }


	@Expose
	private boolean warningOnly;

	/**
	 * Getter for warningOnly
	 * @return Whether or not the test execution will produce a warning only on error for this assert.
	 */
	public boolean getWarningOnly() { return warningOnly; }

	/**
	 * Setter for warningOnly
	 * @param value Whether or not the test execution will produce a warning only on error for this assert.
	 */
	public void setWarningOnly(boolean value) { warningOnly = value; }


}
