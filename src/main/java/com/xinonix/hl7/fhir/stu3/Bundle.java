package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A container for a collection of resources.
 */
public class Bundle extends Resource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Bundle resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Bundle resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return A persistent identifier for the batch that won't change as a batch is copied from server to server.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A persistent identifier for the batch that won't change as a batch is copied from server to server.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	public enum Type{
		@SerializedName("document") DOCUMENT,
		@SerializedName("message") MESSAGE,
		@SerializedName("transaction") TRANSACTION,
		@SerializedName("transaction-response") TRANSACTION_RESPONSE,
		@SerializedName("batch") BATCH,
		@SerializedName("batch-response") BATCH_RESPONSE,
		@SerializedName("history") HISTORY,
		@SerializedName("searchset") SEARCHSET,
		@SerializedName("collection") COLLECTION
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Indicates the purpose of this bundle - how it was intended to be used.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Indicates the purpose of this bundle - how it was intended to be used.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private Integer total;

	/**
	 * Getter for total
	 * @return If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle).
	 */
	public Integer getTotal() { return total; }

	/**
	 * Setter for total
	 * @param value If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle).
	 */
	public void setTotal(Integer value) { total = value; }


	@Expose
	private ArrayList<BundleLink> link;

	/**
	 * Getter for link
	 * @return A series of links that provide context to this bundle.
	 */
	public ArrayList<BundleLink> getLink() { return link; }

	/**
	 * Setter for link
	 * @param value A series of links that provide context to this bundle.
	 */
	public void setLink(ArrayList<BundleLink> value) { link = value; }


	@Expose
	private ArrayList<BundleEntry> entry;

	/**
	 * Getter for entry
	 * @return An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only).
	 */
	public ArrayList<BundleEntry> getEntry() { return entry; }

	/**
	 * Setter for entry
	 * @param value An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only).
	 */
	public void setEntry(ArrayList<BundleEntry> value) { entry = value; }


	@Expose
	private Signature signature;

	/**
	 * Getter for signature
	 * @return Digital Signature - base64 encoded. XML-DSIg or a JWT.
	 */
	public Signature getSignature() { return signature; }

	/**
	 * Setter for signature
	 * @param value Digital Signature - base64 encoded. XML-DSIg or a JWT.
	 */
	public void setSignature(Signature value) { signature = value; }


}
