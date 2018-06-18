package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 */
public class AuditEventEntity extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Identifies a specific instance of the entity. The reference should always be version specific.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifies a specific instance of the entity. The reference should always be version specific.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private Reference reference;

	/**
	 * Getter for reference
	 * @return Identifies a specific instance of the entity. The reference should be version specific.
	 */
	public Reference getReference() { return reference; }

	/**
	 * Setter for reference
	 * @param value Identifies a specific instance of the entity. The reference should be version specific.
	 */
	public void setReference(Reference value) { reference = value; }


	@Expose
	private Coding type;

	/**
	 * Getter for type
	 * @return The type of the object that was involved in this audit event.
	 */
	public Coding getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of the object that was involved in this audit event.
	 */
	public void setType(Coding value) { type = value; }


	@Expose
	private Coding role;

	/**
	 * Getter for role
	 * @return Code representing the role the entity played in the event being audited.
	 */
	public Coding getRole() { return role; }

	/**
	 * Setter for role
	 * @param value Code representing the role the entity played in the event being audited.
	 */
	public void setRole(Coding value) { role = value; }


	@Expose
	private Coding lifecycle;

	/**
	 * Getter for lifecycle
	 * @return Identifier for the data life-cycle stage for the entity.
	 */
	public Coding getLifecycle() { return lifecycle; }

	/**
	 * Setter for lifecycle
	 * @param value Identifier for the data life-cycle stage for the entity.
	 */
	public void setLifecycle(Coding value) { lifecycle = value; }


	@Expose
	private ArrayList<Coding> securityLabel;

	/**
	 * Getter for securityLabel
	 * @return Security labels for the identified entity.
	 */
	public ArrayList<Coding> getSecurityLabel() { return securityLabel; }

	/**
	 * Setter for securityLabel
	 * @param value Security labels for the identified entity.
	 */
	public void setSecurityLabel(ArrayList<Coding> value) { securityLabel = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A name of the entity in the audit event.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A name of the entity in the audit event.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Text that describes the entity in more detail.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Text that describes the entity in more detail.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String query;

	/**
	 * Getter for query
	 * @return The query parameters for a query-type entities.
	 */
	public String getQuery() { return query; }

	/**
	 * Setter for query
	 * @param value The query parameters for a query-type entities.
	 */
	public void setQuery(String value) { query = value; }


	@Expose
	private ArrayList<AuditEventDetail> detail;

	/**
	 * Getter for detail
	 * @return Tagged value pairs for conveying additional information about the entity.
	 */
	public ArrayList<AuditEventDetail> getDetail() { return detail; }

	/**
	 * Setter for detail
	 * @param value Tagged value pairs for conveying additional information about the entity.
	 */
	public void setDetail(ArrayList<AuditEventDetail> value) { detail = value; }


}
