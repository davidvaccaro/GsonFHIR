package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
 */
public class Group extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Group resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Group resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A unique business identifier for this group.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A unique business identifier for this group.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private boolean active;

	/**
	 * Getter for active
	 * @return Indicates whether the record for the group is available for use or is merely being retained for historical purposes.
	 */
	public boolean getActive() { return active; }

	/**
	 * Setter for active
	 * @param value Indicates whether the record for the group is available for use or is merely being retained for historical purposes.
	 */
	public void setActive(boolean value) { active = value; }


	public enum Type{
		@SerializedName("person") PERSON,
		@SerializedName("animal") ANIMAL,
		@SerializedName("practitioner") PRACTITIONER,
		@SerializedName("device") DEVICE,
		@SerializedName("medication") MEDICATION,
		@SerializedName("substance") SUBSTANCE
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Identifies the broad classification of the kind of resources the group includes.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Identifies the broad classification of the kind of resources the group includes.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private boolean actual;

	/**
	 * Getter for actual
	 * @return If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.
	 */
	public boolean getActual() { return actual; }

	/**
	 * Setter for actual
	 * @param value If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals.
	 */
	public void setActual(boolean value) { actual = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Provides a specific type of resource the group includes; e.g. "cow", "syringe", etc.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Provides a specific type of resource the group includes; e.g. "cow", "syringe", etc.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A label assigned to the group for human identification and communication.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A label assigned to the group for human identification and communication.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private Integer quantity;

	/**
	 * Getter for quantity
	 * @return A count of the number of resource instances that are part of the group.
	 */
	public Integer getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value A count of the number of resource instances that are part of the group.
	 */
	public void setQuantity(Integer value) { quantity = value; }


	@Expose
	private ArrayList<GroupCharacteristic> characteristic;

	/**
	 * Getter for characteristic
	 * @return Identifies the traits shared by members of the group.
	 */
	public ArrayList<GroupCharacteristic> getCharacteristic() { return characteristic; }

	/**
	 * Setter for characteristic
	 * @param value Identifies the traits shared by members of the group.
	 */
	public void setCharacteristic(ArrayList<GroupCharacteristic> value) { characteristic = value; }


	@Expose
	private ArrayList<GroupMember> member;

	/**
	 * Getter for member
	 * @return Identifies the resource instances that are members of the group.
	 */
	public ArrayList<GroupMember> getMember() { return member; }

	/**
	 * Setter for member
	 * @param value Identifies the resource instances that are members of the group.
	 */
	public void setMember(ArrayList<GroupMember> value) { member = value; }


}
