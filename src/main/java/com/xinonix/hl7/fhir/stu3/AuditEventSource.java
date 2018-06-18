package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 */
public class AuditEventSource extends BackboneElement {
	@Expose
	private String site;

	/**
	 * Getter for site
	 * @return Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group.
	 */
	public String getSite() { return site; }

	/**
	 * Setter for site
	 * @param value Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group.
	 */
	public void setSite(String value) { site = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Identifier of the source where the event was detected.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifier of the source where the event was detected.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private ArrayList<Coding> type;

	/**
	 * Getter for type
	 * @return Code specifying the type of source where event originated.
	 */
	public ArrayList<Coding> getType() { return type; }

	/**
	 * Setter for type
	 * @param value Code specifying the type of source where event originated.
	 */
	public void setType(ArrayList<Coding> value) { type = value; }


}
