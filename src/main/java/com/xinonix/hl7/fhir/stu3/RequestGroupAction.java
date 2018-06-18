package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 */
public class RequestGroupAction extends BackboneElement {
	@Expose
	private String label;

	/**
	 * Getter for label
	 * @return A user-visible label for the action.
	 */
	public String getLabel() { return label; }

	/**
	 * Setter for label
	 * @param value A user-visible label for the action.
	 */
	public void setLabel(String value) { label = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return The title of the action displayed to a user.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value The title of the action displayed to a user.
	 */
	public void setTitle(String value) { title = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A short description of the action used to provide a summary to display to the user.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A short description of the action used to provide a summary to display to the user.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private String textEquivalent;

	/**
	 * Getter for textEquivalent
	 * @return A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that may not be capable of interpreting it dynamically.
	 */
	public String getTextEquivalent() { return textEquivalent; }

	/**
	 * Setter for textEquivalent
	 * @param value A text equivalent of the action to be performed. This provides a human-interpretable description of the action when the definition is consumed by a system that may not be capable of interpreting it dynamically.
	 */
	public void setTextEquivalent(String value) { textEquivalent = value; }


	@Expose
	private ArrayList<CodeableConcept> code;

	/**
	 * Getter for code
	 * @return A code that provides meaning for the action or action group. For example, a section may have a LOINC code for a the section of a documentation template.
	 */
	public ArrayList<CodeableConcept> getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code that provides meaning for the action or action group. For example, a section may have a LOINC code for a the section of a documentation template.
	 */
	public void setCode(ArrayList<CodeableConcept> value) { code = value; }


	@Expose
	private ArrayList<RelatedArtifact> documentation;

	/**
	 * Getter for documentation
	 * @return Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
	 */
	public ArrayList<RelatedArtifact> getDocumentation() { return documentation; }

	/**
	 * Setter for documentation
	 * @param value Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.
	 */
	public void setDocumentation(ArrayList<RelatedArtifact> value) { documentation = value; }


	@Expose
	private ArrayList<RequestGroupCondition> condition;

	/**
	 * Getter for condition
	 * @return An expression that describes applicability criteria, or start/stop conditions for the action.
	 */
	public ArrayList<RequestGroupCondition> getCondition() { return condition; }

	/**
	 * Setter for condition
	 * @param value An expression that describes applicability criteria, or start/stop conditions for the action.
	 */
	public void setCondition(ArrayList<RequestGroupCondition> value) { condition = value; }


	@Expose
	private ArrayList<RequestGroupRelatedAction> relatedAction;

	/**
	 * Getter for relatedAction
	 * @return A relationship to another action such as "before" or "30-60 minutes after start of".
	 */
	public ArrayList<RequestGroupRelatedAction> getRelatedAction() { return relatedAction; }

	/**
	 * Setter for relatedAction
	 * @param value A relationship to another action such as "before" or "30-60 minutes after start of".
	 */
	public void setRelatedAction(ArrayList<RequestGroupRelatedAction> value) { relatedAction = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date timingDateTime;

	/**
	 * Getter for timingDateTime
	 * @return An optional value describing when the action should be performed.
	 */
	public Date getTimingDateTime() { return timingDateTime; }

	/**
	 * Setter for timingDateTime
	 * @param value An optional value describing when the action should be performed.
	 */
	public void setTimingDateTime(Date value) { timingDateTime = value; }


	@Expose
	private Period timingPeriod;

	/**
	 * Getter for timingPeriod
	 * @return An optional value describing when the action should be performed.
	 */
	public Period getTimingPeriod() { return timingPeriod; }

	/**
	 * Setter for timingPeriod
	 * @param value An optional value describing when the action should be performed.
	 */
	public void setTimingPeriod(Period value) { timingPeriod = value; }


	@Expose
	private Duration timingDuration;

	/**
	 * Getter for timingDuration
	 * @return An optional value describing when the action should be performed.
	 */
	public Duration getTimingDuration() { return timingDuration; }

	/**
	 * Setter for timingDuration
	 * @param value An optional value describing when the action should be performed.
	 */
	public void setTimingDuration(Duration value) { timingDuration = value; }


	@Expose
	private Range timingRange;

	/**
	 * Getter for timingRange
	 * @return An optional value describing when the action should be performed.
	 */
	public Range getTimingRange() { return timingRange; }

	/**
	 * Setter for timingRange
	 * @param value An optional value describing when the action should be performed.
	 */
	public void setTimingRange(Range value) { timingRange = value; }


	@Expose
	private Timing timingTiming;

	/**
	 * Getter for timingTiming
	 * @return An optional value describing when the action should be performed.
	 */
	public Timing getTimingTiming() { return timingTiming; }

	/**
	 * Setter for timingTiming
	 * @param value An optional value describing when the action should be performed.
	 */
	public void setTimingTiming(Timing value) { timingTiming = value; }


	@Expose
	private ArrayList<Reference> participant;

	/**
	 * Getter for participant
	 * @return The participant that should perform or be responsible for this action.
	 */
	public ArrayList<Reference> getParticipant() { return participant; }

	/**
	 * Setter for participant
	 * @param value The participant that should perform or be responsible for this action.
	 */
	public void setParticipant(ArrayList<Reference> value) { participant = value; }


	@Expose
	private Coding type;

	/**
	 * Getter for type
	 * @return The type of action to perform (create, update, remove).
	 */
	public Coding getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of action to perform (create, update, remove).
	 */
	public void setType(Coding value) { type = value; }


	@Expose
	private String groupingBehavior;

	/**
	 * Getter for groupingBehavior
	 * @return Defines the grouping behavior for the action and its children.
	 */
	public String getGroupingBehavior() { return groupingBehavior; }

	/**
	 * Setter for groupingBehavior
	 * @param value Defines the grouping behavior for the action and its children.
	 */
	public void setGroupingBehavior(String value) { groupingBehavior = value; }


	@Expose
	private String selectionBehavior;

	/**
	 * Getter for selectionBehavior
	 * @return Defines the selection behavior for the action and its children.
	 */
	public String getSelectionBehavior() { return selectionBehavior; }

	/**
	 * Setter for selectionBehavior
	 * @param value Defines the selection behavior for the action and its children.
	 */
	public void setSelectionBehavior(String value) { selectionBehavior = value; }


	@Expose
	private String requiredBehavior;

	/**
	 * Getter for requiredBehavior
	 * @return Defines the requiredness behavior for the action.
	 */
	public String getRequiredBehavior() { return requiredBehavior; }

	/**
	 * Setter for requiredBehavior
	 * @param value Defines the requiredness behavior for the action.
	 */
	public void setRequiredBehavior(String value) { requiredBehavior = value; }


	@Expose
	private String precheckBehavior;

	/**
	 * Getter for precheckBehavior
	 * @return Defines whether the action should usually be preselected.
	 */
	public String getPrecheckBehavior() { return precheckBehavior; }

	/**
	 * Setter for precheckBehavior
	 * @param value Defines whether the action should usually be preselected.
	 */
	public void setPrecheckBehavior(String value) { precheckBehavior = value; }


	@Expose
	private String cardinalityBehavior;

	/**
	 * Getter for cardinalityBehavior
	 * @return Defines whether the action can be selected multiple times.
	 */
	public String getCardinalityBehavior() { return cardinalityBehavior; }

	/**
	 * Setter for cardinalityBehavior
	 * @param value Defines whether the action can be selected multiple times.
	 */
	public void setCardinalityBehavior(String value) { cardinalityBehavior = value; }


	@Expose
	private Reference resource;

	/**
	 * Getter for resource
	 * @return The resource that is the target of the action (e.g. CommunicationRequest).
	 */
	public Reference getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value The resource that is the target of the action (e.g. CommunicationRequest).
	 */
	public void setResource(Reference value) { resource = value; }


	@Expose
	private ArrayList<RequestGroupAction> action;

	/**
	 * Getter for action
	 * @return Sub actions.
	 */
	public ArrayList<RequestGroupAction> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Sub actions.
	 */
	public void setAction(ArrayList<RequestGroupAction> value) { action = value; }


}
