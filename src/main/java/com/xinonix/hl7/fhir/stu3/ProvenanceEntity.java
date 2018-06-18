package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 */
public class ProvenanceEntity extends BackboneElement {
	public enum Role{
		@SerializedName("derivation") DERIVATION,
		@SerializedName("revision") REVISION,
		@SerializedName("quotation") QUOTATION,
		@SerializedName("source") SOURCE,
		@SerializedName("removal") REMOVAL
	}

	@Expose
	private Role role;

	/**
	 * Getter for role
	 * @return How the entity was used during the activity.
	 */
	public Role getRole() { return role; }

	/**
	 * Setter for role
	 * @param value How the entity was used during the activity.
	 */
	public void setRole(Role value) { role = value; }


	@Expose
	private String whatUri;

	/**
	 * Getter for whatUri
	 * @return Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
	 */
	public String getWhatUri() { return whatUri; }

	/**
	 * Setter for whatUri
	 * @param value Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
	 */
	public void setWhatUri(String value) { whatUri = value; }


	@Expose
	private Reference whatReference;

	/**
	 * Getter for whatReference
	 * @return Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
	 */
	public Reference getWhatReference() { return whatReference; }

	/**
	 * Setter for whatReference
	 * @param value Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
	 */
	public void setWhatReference(Reference value) { whatReference = value; }


	@Expose
	private Identifier whatIdentifier;

	/**
	 * Getter for whatIdentifier
	 * @return Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
	 */
	public Identifier getWhatIdentifier() { return whatIdentifier; }

	/**
	 * Setter for whatIdentifier
	 * @param value Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative.
	 */
	public void setWhatIdentifier(Identifier value) { whatIdentifier = value; }


	@Expose
	private ArrayList<ProvenanceAgent> agent;

	/**
	 * Getter for agent
	 * @return The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.
	 */
	public ArrayList<ProvenanceAgent> getAgent() { return agent; }

	/**
	 * Setter for agent
	 * @param value The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity.
	 */
	public void setAgent(ArrayList<ProvenanceAgent> value) { agent = value; }


}
