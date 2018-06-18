package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 */
public class AuditEvent extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a AuditEvent resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a AuditEvent resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Coding type;

	/**
	 * Getter for type
	 * @return Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.
	 */
	public Coding getType() { return type; }

	/**
	 * Setter for type
	 * @param value Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function.
	 */
	public void setType(Coding value) { type = value; }


	@Expose
	private ArrayList<Coding> subtype;

	/**
	 * Getter for subtype
	 * @return Identifier for the category of event.
	 */
	public ArrayList<Coding> getSubtype() { return subtype; }

	/**
	 * Setter for subtype
	 * @param value Identifier for the category of event.
	 */
	public void setSubtype(ArrayList<Coding> value) { subtype = value; }


	public enum Action{
		@SerializedName("C") C,
		@SerializedName("R") R,
		@SerializedName("U") U,
		@SerializedName("D") D,
		@SerializedName("E") E
	}

	@Expose
	private Action action;

	/**
	 * Getter for action
	 * @return Indicator for type of action performed during the event that generated the audit.
	 */
	public Action getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Indicator for type of action performed during the event that generated the audit.
	 */
	public void setAction(Action value) { action = value; }


	@Expose
	private String recorded;

	/**
	 * Getter for recorded
	 * @return The time when the event occurred on the source.
	 */
	public String getRecorded() { return recorded; }

	/**
	 * Setter for recorded
	 * @param value The time when the event occurred on the source.
	 */
	public void setRecorded(String value) { recorded = value; }


	public enum Outcome{
		@SerializedName("0") ZERO,
		@SerializedName("4") FOUR,
		@SerializedName("8") EIGHT,
		@SerializedName("12") TWELVE
	}

	@Expose
	private Outcome outcome;

	/**
	 * Getter for outcome
	 * @return Indicates whether the event succeeded or failed.
	 */
	public Outcome getOutcome() { return outcome; }

	/**
	 * Setter for outcome
	 * @param value Indicates whether the event succeeded or failed.
	 */
	public void setOutcome(Outcome value) { outcome = value; }


	@Expose
	private String outcomeDesc;

	/**
	 * Getter for outcomeDesc
	 * @return A free text description of the outcome of the event.
	 */
	public String getOutcomeDesc() { return outcomeDesc; }

	/**
	 * Setter for outcomeDesc
	 * @param value A free text description of the outcome of the event.
	 */
	public void setOutcomeDesc(String value) { outcomeDesc = value; }


	@Expose
	private ArrayList<CodeableConcept> purposeOfEvent;

	/**
	 * Getter for purposeOfEvent
	 * @return The purposeOfUse (reason) that was used during the event being recorded.
	 */
	public ArrayList<CodeableConcept> getPurposeOfEvent() { return purposeOfEvent; }

	/**
	 * Setter for purposeOfEvent
	 * @param value The purposeOfUse (reason) that was used during the event being recorded.
	 */
	public void setPurposeOfEvent(ArrayList<CodeableConcept> value) { purposeOfEvent = value; }


	@Expose
	private ArrayList<AuditEventAgent> agent;

	/**
	 * Getter for agent
	 * @return An actor taking an active role in the event or activity that is logged.
	 */
	public ArrayList<AuditEventAgent> getAgent() { return agent; }

	/**
	 * Setter for agent
	 * @param value An actor taking an active role in the event or activity that is logged.
	 */
	public void setAgent(ArrayList<AuditEventAgent> value) { agent = value; }


	@Expose
	private AuditEventSource source;

	/**
	 * Getter for source
	 * @return The system that is reporting the event.
	 */
	public AuditEventSource getSource() { return source; }

	/**
	 * Setter for source
	 * @param value The system that is reporting the event.
	 */
	public void setSource(AuditEventSource value) { source = value; }


	@Expose
	private ArrayList<AuditEventEntity> entity;

	/**
	 * Getter for entity
	 * @return Specific instances of data or objects that have been accessed.
	 */
	public ArrayList<AuditEventEntity> getEntity() { return entity; }

	/**
	 * Setter for entity
	 * @param value Specific instances of data or objects that have been accessed.
	 */
	public void setEntity(ArrayList<AuditEventEntity> value) { entity = value; }


}
