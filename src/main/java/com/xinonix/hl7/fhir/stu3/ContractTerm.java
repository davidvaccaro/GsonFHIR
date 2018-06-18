package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
public class ContractTerm extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Unique identifier for this particular Contract Provision.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Unique identifier for this particular Contract Provision.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date issued;

	/**
	 * Getter for issued
	 * @return When this Contract Provision was issued.
	 */
	public Date getIssued() { return issued; }

	/**
	 * Setter for issued
	 * @param value When this Contract Provision was issued.
	 */
	public void setIssued(Date value) { issued = value; }


	@Expose
	private Period applies;

	/**
	 * Getter for applies
	 * @return Relevant time or time-period when this Contract Provision is applicable.
	 */
	public Period getApplies() { return applies; }

	/**
	 * Setter for applies
	 * @param value Relevant time or time-period when this Contract Provision is applicable.
	 */
	public void setApplies(Period value) { applies = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private CodeableConcept subType;

	/**
	 * Getter for subType
	 * @return Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment.
	 */
	public CodeableConcept getSubType() { return subType; }

	/**
	 * Setter for subType
	 * @param value Subtype of this Contract Provision, e.g. life time maximum payment for a contract term for specific valued item, e.g. disability payment.
	 */
	public void setSubType(CodeableConcept value) { subType = value; }


	@Expose
	private ArrayList<Reference> topic;

	/**
	 * Getter for topic
	 * @return The matter of concern in the context of this provision of the agrement.
	 */
	public ArrayList<Reference> getTopic() { return topic; }

	/**
	 * Setter for topic
	 * @param value The matter of concern in the context of this provision of the agrement.
	 */
	public void setTopic(ArrayList<Reference> value) { topic = value; }


	@Expose
	private ArrayList<CodeableConcept> action;

	/**
	 * Getter for action
	 * @return Action stipulated by this Contract Provision.
	 */
	public ArrayList<CodeableConcept> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Action stipulated by this Contract Provision.
	 */
	public void setAction(ArrayList<CodeableConcept> value) { action = value; }


	@Expose
	private ArrayList<CodeableConcept> actionReason;

	/**
	 * Getter for actionReason
	 * @return Reason or purpose for the action stipulated by this Contract Provision.
	 */
	public ArrayList<CodeableConcept> getActionReason() { return actionReason; }

	/**
	 * Setter for actionReason
	 * @param value Reason or purpose for the action stipulated by this Contract Provision.
	 */
	public void setActionReason(ArrayList<CodeableConcept> value) { actionReason = value; }


	@Expose
	private ArrayList<Coding> securityLabel;

	/**
	 * Getter for securityLabel
	 * @return A set of security labels that define which terms are controlled by this condition.
	 */
	public ArrayList<Coding> getSecurityLabel() { return securityLabel; }

	/**
	 * Setter for securityLabel
	 * @param value A set of security labels that define which terms are controlled by this condition.
	 */
	public void setSecurityLabel(ArrayList<Coding> value) { securityLabel = value; }


	@Expose
	private ArrayList<ContractAgent1> agent;

	/**
	 * Getter for agent
	 * @return An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
	 */
	public ArrayList<ContractAgent1> getAgent() { return agent; }

	/**
	 * Setter for agent
	 * @param value An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
	 */
	public void setAgent(ArrayList<ContractAgent1> value) { agent = value; }


	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return Human readable form of this Contract Provision.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value Human readable form of this Contract Provision.
	 */
	public void setText(String value) { text = value; }


	@Expose
	private ArrayList<ContractValuedItem1> valuedItem;

	/**
	 * Getter for valuedItem
	 * @return Contract Provision Valued Item List.
	 */
	public ArrayList<ContractValuedItem1> getValuedItem() { return valuedItem; }

	/**
	 * Setter for valuedItem
	 * @param value Contract Provision Valued Item List.
	 */
	public void setValuedItem(ArrayList<ContractValuedItem1> value) { valuedItem = value; }


	@Expose
	private ArrayList<ContractTerm> group;

	/**
	 * Getter for group
	 * @return Nested group of Contract Provisions.
	 */
	public ArrayList<ContractTerm> getGroup() { return group; }

	/**
	 * Setter for group
	 * @param value Nested group of Contract Provisions.
	 */
	public void setGroup(ArrayList<ContractTerm> value) { group = value; }


}
