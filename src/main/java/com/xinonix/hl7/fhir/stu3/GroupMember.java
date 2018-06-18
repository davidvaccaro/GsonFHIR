package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
 */
public class GroupMember extends BackboneElement {
	@Expose
	private Reference entity;

	/**
	 * Getter for entity
	 * @return A reference to the entity that is a member of the group. Must be consistent with Group.type.
	 */
	public Reference getEntity() { return entity; }

	/**
	 * Setter for entity
	 * @param value A reference to the entity that is a member of the group. Must be consistent with Group.type.
	 */
	public void setEntity(Reference value) { entity = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The period that the member was in the group, if known.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The period that the member was in the group, if known.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private boolean inactive;

	/**
	 * Getter for inactive
	 * @return A flag to indicate that the member is no longer in the group, but previously may have been a member.
	 */
	public boolean getInactive() { return inactive; }

	/**
	 * Setter for inactive
	 * @param value A flag to indicate that the member is no longer in the group, but previously may have been a member.
	 */
	public void setInactive(boolean value) { inactive = value; }


}
