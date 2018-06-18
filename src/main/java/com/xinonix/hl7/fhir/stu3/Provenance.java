package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 */
public class Provenance extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Provenance resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Provenance resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Reference> target;

	/**
	 * Getter for target
	 * @return The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.
	 */
	public ArrayList<Reference> getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.
	 */
	public void setTarget(ArrayList<Reference> value) { target = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The period during which the activity occurred.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The period during which the activity occurred.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private String recorded;

	/**
	 * Getter for recorded
	 * @return The instant of time at which the activity was recorded.
	 */
	public String getRecorded() { return recorded; }

	/**
	 * Setter for recorded
	 * @param value The instant of time at which the activity was recorded.
	 */
	public void setRecorded(String value) { recorded = value; }


	@Expose
	private ArrayList<String> policy;

	/**
	 * Getter for policy
	 * @return Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
	 */
	public ArrayList<String> getPolicy() { return policy; }

	/**
	 * Setter for policy
	 * @param value Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
	 */
	public void setPolicy(ArrayList<String> value) { policy = value; }


	@Expose
	private Reference location;

	/**
	 * Getter for location
	 * @return Where the activity occurred, if relevant.
	 */
	public Reference getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value Where the activity occurred, if relevant.
	 */
	public void setLocation(Reference value) { location = value; }


	@Expose
	private ArrayList<Coding> reason;

	/**
	 * Getter for reason
	 * @return The reason that the activity was taking place.
	 */
	public ArrayList<Coding> getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value The reason that the activity was taking place.
	 */
	public void setReason(ArrayList<Coding> value) { reason = value; }


	@Expose
	private Coding activity;

	/**
	 * Getter for activity
	 * @return An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.
	 */
	public Coding getActivity() { return activity; }

	/**
	 * Setter for activity
	 * @param value An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.
	 */
	public void setActivity(Coding value) { activity = value; }


	@Expose
	private ArrayList<ProvenanceAgent> agent;

	/**
	 * Getter for agent
	 * @return An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.
	 */
	public ArrayList<ProvenanceAgent> getAgent() { return agent; }

	/**
	 * Setter for agent
	 * @param value An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.
	 */
	public void setAgent(ArrayList<ProvenanceAgent> value) { agent = value; }


	@Expose
	private ArrayList<ProvenanceEntity> entity;

	/**
	 * Getter for entity
	 * @return An entity used in this activity.
	 */
	public ArrayList<ProvenanceEntity> getEntity() { return entity; }

	/**
	 * Setter for entity
	 * @param value An entity used in this activity.
	 */
	public void setEntity(ArrayList<ProvenanceEntity> value) { entity = value; }


	@Expose
	private ArrayList<Signature> signature;

	/**
	 * Getter for signature
	 * @return A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
	 */
	public ArrayList<Signature> getSignature() { return signature; }

	/**
	 * Setter for signature
	 * @param value A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
	 */
	public void setSignature(ArrayList<Signature> value) { signature = value; }


}
