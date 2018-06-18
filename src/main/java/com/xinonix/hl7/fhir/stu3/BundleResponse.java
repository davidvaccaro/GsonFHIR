package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A container for a collection of resources.
 */
public class BundleResponse extends BackboneElement {
	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	private String location;

	/**
	 * Getter for location
	 * @return The location header created by processing this operation.
	 */
	public String getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value The location header created by processing this operation.
	 */
	public void setLocation(String value) { location = value; }


	@Expose
	private String etag;

	/**
	 * Getter for etag
	 * @return The etag for the resource, it the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency)).
	 */
	public String getEtag() { return etag; }

	/**
	 * Setter for etag
	 * @param value The etag for the resource, it the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency)).
	 */
	public void setEtag(String value) { etag = value; }


	@Expose
	private String lastModified;

	/**
	 * Getter for lastModified
	 * @return The date/time that the resource was modified on the server.
	 */
	public String getLastModified() { return lastModified; }

	/**
	 * Setter for lastModified
	 * @param value The date/time that the resource was modified on the server.
	 */
	public void setLastModified(String value) { lastModified = value; }


	@Expose
	private Resource outcome;

	/**
	 * Getter for outcome
	 * @return An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction.
	 */
	public Resource getOutcome() { return outcome; }

	/**
	 * Setter for outcome
	 * @param value An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction.
	 */
	public void setOutcome(Resource value) { outcome = value; }


}
