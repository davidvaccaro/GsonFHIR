package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A container for a collection of resources.
 */
public class BundleEntry extends BackboneElement {
	@Expose
	private ArrayList<BundleLink> link;

	/**
	 * Getter for link
	 * @return A series of links that provide context to this entry.
	 */
	public ArrayList<BundleLink> getLink() { return link; }

	/**
	 * Setter for link
	 * @param value A series of links that provide context to this entry.
	 */
	public void setLink(ArrayList<BundleLink> value) { link = value; }


	@Expose
	private String fullUrl;

	/**
	 * Getter for fullUrl
	 * @return The Absolute URL for the resource.  The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: 
* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)
* Results from operations might involve resources that are not identified.
	 */
	public String getFullUrl() { return fullUrl; }

	/**
	 * Setter for fullUrl
	 * @param value The Absolute URL for the resource.  The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: 
* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)
* Results from operations might involve resources that are not identified.
	 */
	public void setFullUrl(String value) { fullUrl = value; }


	@Expose
	private Resource resource;

	/**
	 * Getter for resource
	 * @return The Resources for the entry.
	 */
	public Resource getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value The Resources for the entry.
	 */
	public void setResource(Resource value) { resource = value; }


	@Expose
	private BundleSearch search;

	/**
	 * Getter for search
	 * @return Information about the search process that lead to the creation of this entry.
	 */
	public BundleSearch getSearch() { return search; }

	/**
	 * Setter for search
	 * @param value Information about the search process that lead to the creation of this entry.
	 */
	public void setSearch(BundleSearch value) { search = value; }


	@Expose
	private BundleRequest request;

	/**
	 * Getter for request
	 * @return Additional information about how this entry should be processed as part of a transaction.
	 */
	public BundleRequest getRequest() { return request; }

	/**
	 * Setter for request
	 * @param value Additional information about how this entry should be processed as part of a transaction.
	 */
	public void setRequest(BundleRequest value) { request = value; }


	@Expose
	private BundleResponse response;

	/**
	 * Getter for response
	 * @return Additional information about how this entry should be processed as part of a transaction.
	 */
	public BundleResponse getResponse() { return response; }

	/**
	 * Setter for response
	 * @param value Additional information about how this entry should be processed as part of a transaction.
	 */
	public void setResponse(BundleResponse value) { response = value; }


}
