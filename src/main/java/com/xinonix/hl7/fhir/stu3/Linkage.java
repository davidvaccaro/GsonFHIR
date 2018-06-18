package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Identifies two or more records (resource instances) that are referring to the same real-world "occurrence".
 */
public class Linkage extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Linkage resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Linkage resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Indicates whether the asserted set of linkages are considered to be "in effect".
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Indicates whether the asserted set of linkages are considered to be "in effect".
	 */
	public void setActive(boolean value) { active = value; }


	@Expose
	private Reference author;

	/**
	 * Getter for author
	 * @return Identifies the user or organization responsible for asserting the linkages and who establishes the context for evaluating the nature of each linkage.
	 */
	public Reference getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Identifies the user or organization responsible for asserting the linkages and who establishes the context for evaluating the nature of each linkage.
	 */
	public void setAuthor(Reference value) { author = value; }


	@Expose
	private ArrayList<LinkageItem> item;

	/**
	 * Getter for item
	 * @return Identifies one of the records that is considered to refer to the same real-world occurrence as well as how the items hould be evaluated within the collection of linked items.
	 */
	public ArrayList<LinkageItem> getItem() { return item; }

	/**
	 * Setter for item
	 * @param value Identifies one of the records that is considered to refer to the same real-world occurrence as well as how the items hould be evaluated within the collection of linked items.
	 */
	public void setItem(ArrayList<LinkageItem> value) { item = value; }


}
