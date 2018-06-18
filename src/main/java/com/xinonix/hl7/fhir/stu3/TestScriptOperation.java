package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptOperation extends BackboneElement {
	@Expose
	private Coding type;

	/**
	 * Getter for type
	 * @return Server interaction or operation type.
	 */
	public Coding getType() { return type; }

	/**
	 * Setter for type
	 * @param value Server interaction or operation type.
	 */
	public void setType(Coding value) { type = value; }


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


	public enum Accept{
		@SerializedName("xml") XML,
		@SerializedName("json") JSON,
		@SerializedName("ttl") TTL,
		@SerializedName("none") NONE
	}

	@Expose
	private Accept accept;

	/**
	 * Getter for accept
	 * @return The content-type or mime-type to use for RESTful operation in the 'Accept' header.
	 */
	public Accept getAccept() { return accept; }

	/**
	 * Setter for accept
	 * @param value The content-type or mime-type to use for RESTful operation in the 'Accept' header.
	 */
	public void setAccept(Accept value) { accept = value; }


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
	private Integer destination;

	/**
	 * Getter for destination
	 * @return The server where the request message is destined for.  Must be one of the server numbers listed in TestScript.destination section.
	 */
	public Integer getDestination() { return destination; }

	/**
	 * Setter for destination
	 * @param value The server where the request message is destined for.  Must be one of the server numbers listed in TestScript.destination section.
	 */
	public void setDestination(Integer value) { destination = value; }


	@Expose
	private boolean encodeRequestUrl;

	/**
	 * Getter for encodeRequestUrl
	 * @return Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
	 */
	public boolean getEncodeRequestUrl() { return encodeRequestUrl; }

	/**
	 * Setter for encodeRequestUrl
	 * @param value Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
	 */
	public void setEncodeRequestUrl(boolean value) { encodeRequestUrl = value; }


	@Expose
	private Integer origin;

	/**
	 * Getter for origin
	 * @return The server where the request message originates from.  Must be one of the server numbers listed in TestScript.origin section.
	 */
	public Integer getOrigin() { return origin; }

	/**
	 * Setter for origin
	 * @param value The server where the request message originates from.  Must be one of the server numbers listed in TestScript.origin section.
	 */
	public void setOrigin(Integer value) { origin = value; }


	@Expose
	private String params;

	/**
	 * Getter for params
	 * @return Path plus parameters after [type].  Used to set parts of the request URL explicitly.
	 */
	public String getParams() { return params; }

	/**
	 * Setter for params
	 * @param value Path plus parameters after [type].  Used to set parts of the request URL explicitly.
	 */
	public void setParams(String value) { params = value; }


	@Expose
	private ArrayList<TestScriptRequestHeader> requestHeader;

	/**
	 * Getter for requestHeader
	 * @return Header elements would be used to set HTTP headers.
	 */
	public ArrayList<TestScriptRequestHeader> getRequestHeader() { return requestHeader; }

	/**
	 * Setter for requestHeader
	 * @param value Header elements would be used to set HTTP headers.
	 */
	public void setRequestHeader(ArrayList<TestScriptRequestHeader> value) { requestHeader = value; }


	@Expose
	private String requestId;

	/**
	 * Getter for requestId
	 * @return The fixture id (maybe new) to map to the request.
	 */
	public String getRequestId() { return requestId; }

	/**
	 * Setter for requestId
	 * @param value The fixture id (maybe new) to map to the request.
	 */
	public void setRequestId(String value) { requestId = value; }


	@Expose
	private String responseId;

	/**
	 * Getter for responseId
	 * @return The fixture id (maybe new) to map to the response.
	 */
	public String getResponseId() { return responseId; }

	/**
	 * Setter for responseId
	 * @param value The fixture id (maybe new) to map to the response.
	 */
	public void setResponseId(String value) { responseId = value; }


	@Expose
	private String sourceId;

	/**
	 * Getter for sourceId
	 * @return The id of the fixture used as the body of a PUT or POST request.
	 */
	public String getSourceId() { return sourceId; }

	/**
	 * Setter for sourceId
	 * @param value The id of the fixture used as the body of a PUT or POST request.
	 */
	public void setSourceId(String value) { sourceId = value; }


	@Expose
	private String targetId;

	/**
	 * Getter for targetId
	 * @return Id of fixture used for extracting the [id],  [type], and [vid] for GET requests.
	 */
	public String getTargetId() { return targetId; }

	/**
	 * Setter for targetId
	 * @param value Id of fixture used for extracting the [id],  [type], and [vid] for GET requests.
	 */
	public void setTargetId(String value) { targetId = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return Complete request URL.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value Complete request URL.
	 */
	public void setUrl(String value) { url = value; }


}
