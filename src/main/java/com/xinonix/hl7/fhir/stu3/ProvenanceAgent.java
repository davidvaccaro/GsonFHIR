package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 */
public class ProvenanceAgent extends BackboneElement {
	@Expose
	private ArrayList<CodeableConcept> role;

	/**
	 * Getter for role
	 * @return The function of the agent with respect to the activity. The security role enabling the agent with respect to the activity.
	 */
	public ArrayList<CodeableConcept> getRole() { return role; }

	/**
	 * Setter for role
	 * @param value The function of the agent with respect to the activity. The security role enabling the agent with respect to the activity.
	 */
	public void setRole(ArrayList<CodeableConcept> value) { role = value; }


	@Expose
	private String whoUri;

	/**
	 * Getter for whoUri
	 * @return The individual, device or organization that participated in the event.
	 */
	public String getWhoUri() { return whoUri; }

	/**
	 * Setter for whoUri
	 * @param value The individual, device or organization that participated in the event.
	 */
	public void setWhoUri(String value) { whoUri = value; }


	@Expose
	private Reference whoReference;

	/**
	 * Getter for whoReference
	 * @return The individual, device or organization that participated in the event.
	 */
	public Reference getWhoReference() { return whoReference; }

	/**
	 * Setter for whoReference
	 * @param value The individual, device or organization that participated in the event.
	 */
	public void setWhoReference(Reference value) { whoReference = value; }


	@Expose
	private String onBehalfOfUri;

	/**
	 * Getter for onBehalfOfUri
	 * @return The individual, device, or organization for whom the change was made.
	 */
	public String getOnBehalfOfUri() { return onBehalfOfUri; }

	/**
	 * Setter for onBehalfOfUri
	 * @param value The individual, device, or organization for whom the change was made.
	 */
	public void setOnBehalfOfUri(String value) { onBehalfOfUri = value; }


	@Expose
	private Reference onBehalfOfReference;

	/**
	 * Getter for onBehalfOfReference
	 * @return The individual, device, or organization for whom the change was made.
	 */
	public Reference getOnBehalfOfReference() { return onBehalfOfReference; }

	/**
	 * Setter for onBehalfOfReference
	 * @param value The individual, device, or organization for whom the change was made.
	 */
	public void setOnBehalfOfReference(Reference value) { onBehalfOfReference = value; }


	@Expose
	private CodeableConcept relatedAgentType;

	/**
	 * Getter for relatedAgentType
	 * @return The type of relationship between agents.
	 */
	public CodeableConcept getRelatedAgentType() { return relatedAgentType; }

	/**
	 * Setter for relatedAgentType
	 * @param value The type of relationship between agents.
	 */
	public void setRelatedAgentType(CodeableConcept value) { relatedAgentType = value; }


}
