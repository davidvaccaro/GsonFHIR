package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Identifies two or more records (resource instances) that are referring to the same real-world "occurrence".
 */
public class LinkageItem extends BackboneElement {
	public enum Type{
		@SerializedName("source") SOURCE,
		@SerializedName("alternate") ALTERNATE,
		@SerializedName("historical") HISTORICAL
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Distinguishes which item is "source of truth" (if any) and which items are no longer considered to be current representations.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Distinguishes which item is "source of truth" (if any) and which items are no longer considered to be current representations.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private Reference resource;

	/**
	 * Getter for resource
	 * @return The resource instance being linked as part of the group.
	 */
	public Reference getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value The resource instance being linked as part of the group.
	 */
	public void setResource(Reference value) { resource = value; }


}
