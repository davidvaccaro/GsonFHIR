package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A container for a collection of resources.
 */
public class BundleRequest extends BackboneElement {
	public enum Method{
		@SerializedName("GET") GET,
		@SerializedName("POST") POST,
		@SerializedName("PUT") PUT,
		@SerializedName("DELETE") DELETE
	}

	@Expose
	private Method method;

	/**
	 * Getter for method
	 * @return The HTTP verb for this entry in either a change history, or a transaction/ transaction response.
	 */
	public Method getMethod() { return method; }

	/**
	 * Setter for method
	 * @param value The HTTP verb for this entry in either a change history, or a transaction/ transaction response.
	 */
	public void setMethod(Method value) { method = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return The URL for this entry, relative to the root (the address to which the request is posted).
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value The URL for this entry, relative to the root (the address to which the request is posted).
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private String ifNoneMatch;

	/**
	 * Getter for ifNoneMatch
	 * @return If the ETag values match, return a 304 Not Modified status. See the API documentation for ["Conditional Read"](http.html#cread).
	 */
	public String getIfNoneMatch() { return ifNoneMatch; }

	/**
	 * Setter for ifNoneMatch
	 * @param value If the ETag values match, return a 304 Not Modified status. See the API documentation for ["Conditional Read"](http.html#cread).
	 */
	public void setIfNoneMatch(String value) { ifNoneMatch = value; }


	@Expose
	private String ifModifiedSince;

	/**
	 * Getter for ifModifiedSince
	 * @return Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).
	 */
	public String getIfModifiedSince() { return ifModifiedSince; }

	/**
	 * Setter for ifModifiedSince
	 * @param value Only perform the operation if the last updated date matches. See the API documentation for ["Conditional Read"](http.html#cread).
	 */
	public void setIfModifiedSince(String value) { ifModifiedSince = value; }


	@Expose
	private String ifMatch;

	/**
	 * Getter for ifMatch
	 * @return Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).
	 */
	public String getIfMatch() { return ifMatch; }

	/**
	 * Setter for ifMatch
	 * @param value Only perform the operation if the Etag value matches. For more information, see the API section ["Managing Resource Contention"](http.html#concurrency).
	 */
	public void setIfMatch(String value) { ifMatch = value; }


	@Expose
	private String ifNoneExist;

	/**
	 * Getter for ifNoneExist
	 * @return Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").
	 */
	public String getIfNoneExist() { return ifNoneExist; }

	/**
	 * Setter for ifNoneExist
	 * @param value Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for ["Conditional Create"](http.html#ccreate). This is just the query portion of the URL - what follows the "?" (not including the "?").
	 */
	public void setIfNoneExist(String value) { ifNoneExist = value; }


}
