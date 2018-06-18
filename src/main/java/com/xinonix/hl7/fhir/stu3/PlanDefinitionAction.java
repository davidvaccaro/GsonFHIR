package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
 */
public class PlanDefinitionAction extends BackboneElement {
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
	private ArrayList<CodeableConcept> reason;

	/**
	 * Getter for reason
	 * @return A description of why this action is necessary or appropriate.
	 */
	public ArrayList<CodeableConcept> getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value A description of why this action is necessary or appropriate.
	 */
	public void setReason(ArrayList<CodeableConcept> value) { reason = value; }


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
	private ArrayList<String> goalId;

	/**
	 * Getter for goalId
	 * @return Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition.
	 */
	public ArrayList<String> getGoalId() { return goalId; }

	/**
	 * Setter for goalId
	 * @param value Identifies goals that this action supports. The reference must be to a goal element defined within this plan definition.
	 */
	public void setGoalId(ArrayList<String> value) { goalId = value; }


	@Expose
	private ArrayList<TriggerDefinition> triggerDefinition;

	/**
	 * Getter for triggerDefinition
	 * @return A description of when the action should be triggered.
	 */
	public ArrayList<TriggerDefinition> getTriggerDefinition() { return triggerDefinition; }

	/**
	 * Setter for triggerDefinition
	 * @param value A description of when the action should be triggered.
	 */
	public void setTriggerDefinition(ArrayList<TriggerDefinition> value) { triggerDefinition = value; }


	@Expose
	private ArrayList<PlanDefinitionCondition> condition;

	/**
	 * Getter for condition
	 * @return An expression that describes applicability criteria, or start/stop conditions for the action.
	 */
	public ArrayList<PlanDefinitionCondition> getCondition() { return condition; }

	/**
	 * Setter for condition
	 * @param value An expression that describes applicability criteria, or start/stop conditions for the action.
	 */
	public void setCondition(ArrayList<PlanDefinitionCondition> value) { condition = value; }


	@Expose
	private ArrayList<DataRequirement> input;

	/**
	 * Getter for input
	 * @return Defines input data requirements for the action.
	 */
	public ArrayList<DataRequirement> getInput() { return input; }

	/**
	 * Setter for input
	 * @param value Defines input data requirements for the action.
	 */
	public void setInput(ArrayList<DataRequirement> value) { input = value; }


	@Expose
	private ArrayList<DataRequirement> output;

	/**
	 * Getter for output
	 * @return Defines the outputs of the action, if any.
	 */
	public ArrayList<DataRequirement> getOutput() { return output; }

	/**
	 * Setter for output
	 * @param value Defines the outputs of the action, if any.
	 */
	public void setOutput(ArrayList<DataRequirement> value) { output = value; }


	@Expose
	private ArrayList<PlanDefinitionRelatedAction> relatedAction;

	/**
	 * Getter for relatedAction
	 * @return A relationship to another action such as "before" or "30-60 minutes after start of".
	 */
	public ArrayList<PlanDefinitionRelatedAction> getRelatedAction() { return relatedAction; }

	/**
	 * Setter for relatedAction
	 * @param value A relationship to another action such as "before" or "30-60 minutes after start of".
	 */
	public void setRelatedAction(ArrayList<PlanDefinitionRelatedAction> value) { relatedAction = value; }


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
	private ArrayList<PlanDefinitionParticipant> participant;

	/**
	 * Getter for participant
	 * @return Indicates who should participate in performing the action described.
	 */
	public ArrayList<PlanDefinitionParticipant> getParticipant() { return participant; }

	/**
	 * Setter for participant
	 * @param value Indicates who should participate in performing the action described.
	 */
	public void setParticipant(ArrayList<PlanDefinitionParticipant> value) { participant = value; }


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


	public enum GroupingBehavior{
		@SerializedName("visual-group") VISUAL_GROUP,
		@SerializedName("logical-group") LOGICAL_GROUP,
		@SerializedName("sentence-group") SENTENCE_GROUP
	}

	@Expose
	private GroupingBehavior groupingBehavior;

	/**
	 * Getter for groupingBehavior
	 * @return Defines the grouping behavior for the action and its children.
	 */
	public GroupingBehavior getGroupingBehavior() { return groupingBehavior; }

	/**
	 * Setter for groupingBehavior
	 * @param value Defines the grouping behavior for the action and its children.
	 */
	public void setGroupingBehavior(GroupingBehavior value) { groupingBehavior = value; }


	public enum SelectionBehavior{
		@SerializedName("any") ANY,
		@SerializedName("all") ALL,
		@SerializedName("all-or-none") ALL_OR_NONE,
		@SerializedName("exactly-one") EXACTLY_ONE,
		@SerializedName("at-most-one") AT_MOST_ONE,
		@SerializedName("one-or-more") ONE_OR_MORE
	}

	@Expose
	private SelectionBehavior selectionBehavior;

	/**
	 * Getter for selectionBehavior
	 * @return Defines the selection behavior for the action and its children.
	 */
	public SelectionBehavior getSelectionBehavior() { return selectionBehavior; }

	/**
	 * Setter for selectionBehavior
	 * @param value Defines the selection behavior for the action and its children.
	 */
	public void setSelectionBehavior(SelectionBehavior value) { selectionBehavior = value; }


	public enum RequiredBehavior{
		@SerializedName("must") MUST,
		@SerializedName("could") COULD,
		@SerializedName("must-unless-documented") MUST_UNLESS_DOCUMENTED
	}

	@Expose
	private RequiredBehavior requiredBehavior;

	/**
	 * Getter for requiredBehavior
	 * @return Defines the requiredness behavior for the action.
	 */
	public RequiredBehavior getRequiredBehavior() { return requiredBehavior; }

	/**
	 * Setter for requiredBehavior
	 * @param value Defines the requiredness behavior for the action.
	 */
	public void setRequiredBehavior(RequiredBehavior value) { requiredBehavior = value; }


	public enum PrecheckBehavior{
		@SerializedName("yes") YES,
		@SerializedName("no") NO
	}

	@Expose
	private PrecheckBehavior precheckBehavior;

	/**
	 * Getter for precheckBehavior
	 * @return Defines whether the action should usually be preselected.
	 */
	public PrecheckBehavior getPrecheckBehavior() { return precheckBehavior; }

	/**
	 * Setter for precheckBehavior
	 * @param value Defines whether the action should usually be preselected.
	 */
	public void setPrecheckBehavior(PrecheckBehavior value) { precheckBehavior = value; }


	public enum CardinalityBehavior{
		@SerializedName("single") SINGLE,
		@SerializedName("multiple") MULTIPLE
	}

	@Expose
	private CardinalityBehavior cardinalityBehavior;

	/**
	 * Getter for cardinalityBehavior
	 * @return Defines whether the action can be selected multiple times.
	 */
	public CardinalityBehavior getCardinalityBehavior() { return cardinalityBehavior; }

	/**
	 * Setter for cardinalityBehavior
	 * @param value Defines whether the action can be selected multiple times.
	 */
	public void setCardinalityBehavior(CardinalityBehavior value) { cardinalityBehavior = value; }


	@Expose
	private Reference definition;

	/**
	 * Getter for definition
	 * @return A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.
	 */
	public Reference getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value A reference to an ActivityDefinition that describes the action to be taken in detail, or a PlanDefinition that describes a series of actions to be taken.
	 */
	public void setDefinition(Reference value) { definition = value; }


	@Expose
	private Reference transform;

	/**
	 * Getter for transform
	 * @return A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input.
	 */
	public Reference getTransform() { return transform; }

	/**
	 * Setter for transform
	 * @param value A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input.
	 */
	public void setTransform(Reference value) { transform = value; }


	@Expose
	private ArrayList<PlanDefinitionDynamicValue> dynamicValue;

	/**
	 * Getter for dynamicValue
	 * @return Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
	 */
	public ArrayList<PlanDefinitionDynamicValue> getDynamicValue() { return dynamicValue; }

	/**
	 * Setter for dynamicValue
	 * @param value Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.
	 */
	public void setDynamicValue(ArrayList<PlanDefinitionDynamicValue> value) { dynamicValue = value; }


	@Expose
	private ArrayList<PlanDefinitionAction> action;

	/**
	 * Getter for action
	 * @return Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.
	 */
	public ArrayList<PlanDefinitionAction> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.
	 */
	public void setAction(ArrayList<PlanDefinitionAction> value) { action = value; }


}
