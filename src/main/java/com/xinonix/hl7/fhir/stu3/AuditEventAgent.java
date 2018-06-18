package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 */
public class AuditEventAgent extends BackboneElement {
	@Expose
	private ArrayList<CodeableConcept> role;

	/**
	 * Getter for role
	 * @return The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context.
	 */
	public ArrayList<CodeableConcept> getRole() { return role; }

	/**
	 * Setter for role
	 * @param value The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context.
	 */
	public void setRole(ArrayList<CodeableConcept> value) { role = value; }


	@Expose
	private Reference reference;

	/**
	 * Getter for reference
	 * @return Direct reference to a resource that identifies the agent.
	 */
	public Reference getReference() { return reference; }

	/**
	 * Setter for reference
	 * @param value Direct reference to a resource that identifies the agent.
	 */
	public void setReference(Reference value) { reference = value; }


	@Expose
	private Identifier userId;

	/**
	 * Getter for userId
	 * @return Unique identifier for the user actively participating in the event.
	 */
	public Identifier getUserId() { return userId; }

	/**
	 * Setter for userId
	 * @param value Unique identifier for the user actively participating in the event.
	 */
	public void setUserId(Identifier value) { userId = value; }


	@Expose
	private String altId;

	/**
	 * Getter for altId
	 * @return Alternative agent Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available.
	 */
	public String getAltId() { return altId; }

	/**
	 * Setter for altId
	 * @param value Alternative agent Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available.
	 */
	public void setAltId(String value) { altId = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Human-meaningful name for the agent.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Human-meaningful name for the agent.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private boolean requestor;

	/**
	 * Getter for requestor
	 * @return Indicator that the user is or is not the requestor, or initiator, for the event being audited.
	 */
	public boolean getRequestor() { return requestor; }

	/**
	 * Setter for requestor
	 * @param value Indicator that the user is or is not the requestor, or initiator, for the event being audited.
	 */
	public void setRequestor(boolean value) { requestor = value; }


	@Expose
	private Reference location;

	/**
	 * Getter for location
	 * @return Where the event occurred.
	 */
	public Reference getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value Where the event occurred.
	 */
	public void setLocation(Reference value) { location = value; }


	@Expose
	private ArrayList<String> policy;

	/**
	 * Getter for policy
	 * @return The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
	 */
	public ArrayList<String> getPolicy() { return policy; }

	/**
	 * Setter for policy
	 * @param value The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
	 */
	public void setPolicy(ArrayList<String> value) { policy = value; }


	@Expose
	private Coding media;

	/**
	 * Getter for media
	 * @return Type of media involved. Used when the event is about exporting/importing onto media.
	 */
	public Coding getMedia() { return media; }

	/**
	 * Setter for media
	 * @param value Type of media involved. Used when the event is about exporting/importing onto media.
	 */
	public void setMedia(Coding value) { media = value; }


	@Expose
	private AuditEventNetwork network;

	/**
	 * Getter for network
	 * @return Logical network location for application activity, if the activity has a network location.
	 */
	public AuditEventNetwork getNetwork() { return network; }

	/**
	 * Setter for network
	 * @param value Logical network location for application activity, if the activity has a network location.
	 */
	public void setNetwork(AuditEventNetwork value) { network = value; }


	@Expose
	private ArrayList<CodeableConcept> purposeOfUse;

	/**
	 * Getter for purposeOfUse
	 * @return The reason (purpose of use), specific to this agent, that was used during the event being recorded.
	 */
	public ArrayList<CodeableConcept> getPurposeOfUse() { return purposeOfUse; }

	/**
	 * Setter for purposeOfUse
	 * @param value The reason (purpose of use), specific to this agent, that was used during the event being recorded.
	 */
	public void setPurposeOfUse(ArrayList<CodeableConcept> value) { purposeOfUse = value; }


}
