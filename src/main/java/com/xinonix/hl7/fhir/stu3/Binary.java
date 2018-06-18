package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A binary resource can contain any content, whether text, image, pdf, zip archive, etc.
 */
public class Binary extends Resource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Binary resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Binary resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String contentType;

	/**
	 * Getter for contentType
	 * @return MimeType of the binary content represented as a standard MimeType (BCP 13).
	 */
	public String getContentType() { return contentType; }

	/**
	 * Setter for contentType
	 * @param value MimeType of the binary content represented as a standard MimeType (BCP 13).
	 */
	public void setContentType(String value) { contentType = value; }


	@Expose
	private Reference securityContext;

	/**
	 * Getter for securityContext
	 * @return Treat this binary as if it was this other resource for access control purposes.
	 */
	public Reference getSecurityContext() { return securityContext; }

	/**
	 * Setter for securityContext
	 * @param value Treat this binary as if it was this other resource for access control purposes.
	 */
	public void setSecurityContext(Reference value) { securityContext = value; }


	@Expose
	private String content;

	/**
	 * Getter for content
	 * @return The actual content, base64 encoded.
	 */
	public String getContent() { return content; }

	/**
	 * Setter for content
	 * @param value The actual content, base64 encoded.
	 */
	public void setContent(String value) { content = value; }


}
