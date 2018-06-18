package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 */
public class PlanDefinitionGoal extends BackboneElement {
	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Indicates a category the goal falls within.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Indicates a category the goal falls within.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept description;

	/**
	 * Getter for description
	 * @return Human-readable and/or coded description of a specific desired objective of care, such as "control blood pressure" or "negotiate an obstacle course" or "dance with child at wedding".
	 */
	public CodeableConcept getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Human-readable and/or coded description of a specific desired objective of care, such as "control blood pressure" or "negotiate an obstacle course" or "dance with child at wedding".
	 */
	public void setDescription(CodeableConcept value) { description = value; }


	@Expose
	private CodeableConcept priority;

	/**
	 * Getter for priority
	 * @return Identifies the expected level of importance associated with reaching/sustaining the defined goal.
	 */
	public CodeableConcept getPriority() { return priority; }

	/**
	 * Setter for priority
	 * @param value Identifies the expected level of importance associated with reaching/sustaining the defined goal.
	 */
	public void setPriority(CodeableConcept value) { priority = value; }


	@Expose
	private CodeableConcept start;

	/**
	 * Getter for start
	 * @return The event after which the goal should begin being pursued.
	 */
	public CodeableConcept getStart() { return start; }

	/**
	 * Setter for start
	 * @param value The event after which the goal should begin being pursued.
	 */
	public void setStart(CodeableConcept value) { start = value; }


	@Expose
	private ArrayList<CodeableConcept> addresses;

	/**
	 * Getter for addresses
	 * @return Identifies problems, conditions, issues, or concerns the goal is intended to address.
	 */
	public ArrayList<CodeableConcept> getAddresses() { return addresses; }

	/**
	 * Setter for addresses
	 * @param value Identifies problems, conditions, issues, or concerns the goal is intended to address.
	 */
	public void setAddresses(ArrayList<CodeableConcept> value) { addresses = value; }


	@Expose
	private ArrayList<RelatedArtifact> documentation;

	/**
	 * Getter for documentation
	 * @return Didactic or other informational resources associated with the goal that provide further supporting information about the goal. Information resources can include inline text commentary and links to web resources.
	 */
	public ArrayList<RelatedArtifact> getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Didactic or other informational resources associated with the goal that provide further supporting information about the goal. Information resources can include inline text commentary and links to web resources.
	 */
	public void setDocumentation(ArrayList<RelatedArtifact> value) { documentation = value; }


	@Expose
	private ArrayList<PlanDefinitionTarget> target;

	/**
	 * Getter for target
	 * @return Indicates what should be done and within what timeframe.
	 */
	public ArrayList<PlanDefinitionTarget> getTarget() { return target; }

	/**
	 * Setter for target
	 * @param value Indicates what should be done and within what timeframe.
	 */
	public void setTarget(ArrayList<PlanDefinitionTarget> value) { target = value; }


}
