package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
public class Contract extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Contract resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Contract resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Unique identifier for this Contract.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Unique identifier for this Contract.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private String status;

	/**
	 * Getter for status
	 * @return The status of the resource instance.
	 */
	public String getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the resource instance.
	 */
	public void setStatus(String value) { status = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date issued;

	/**
	 * Getter for issued
	 * @return When this  Contract was issued.
	 */
	public Date getIssued() { return issued; }

	/**
	 * Setter for issued
	 * @param value When this  Contract was issued.
	 */
	public void setIssued(Date value) { issued = value; }


	@Expose
	private Period applies;

	/**
	 * Getter for applies
	 * @return Relevant time or time-period when this Contract is applicable.
	 */
	public Period getApplies() { return applies; }

	/**
	 * Setter for applies
	 * @param value Relevant time or time-period when this Contract is applicable.
	 */
	public void setApplies(Period value) { applies = value; }


	@Expose
	private ArrayList<Reference> subject;

	/**
	 * Getter for subject
	 * @return The target entity impacted by or of interest to parties to the agreement.
	 */
	public ArrayList<Reference> getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The target entity impacted by or of interest to parties to the agreement.
	 */
	public void setSubject(ArrayList<Reference> value) { subject = value; }


	@Expose
	private ArrayList<Reference> topic;

	/**
	 * Getter for topic
	 * @return The matter of concern in the context of this agreement.
	 */
	public ArrayList<Reference> getTopic() { return topic; }

	/**
	 * Setter for topic
	 * @param value The matter of concern in the context of this agreement.
	 */
	public void setTopic(ArrayList<Reference> value) { topic = value; }


	@Expose
	private ArrayList<Reference> authority;

	/**
	 * Getter for authority
	 * @return A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
	 */
	public ArrayList<Reference> getAuthority() { return authority; }

	/**
	 * Setter for authority
	 * @param value A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
	 */
	public void setAuthority(ArrayList<Reference> value) { authority = value; }


	@Expose
	private ArrayList<Reference> domain;

	/**
	 * Getter for domain
	 * @return Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
	 */
	public ArrayList<Reference> getDomain() { return domain; }

	/**
	 * Setter for domain
	 * @param value Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
	 */
	public void setDomain(ArrayList<Reference> value) { domain = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private ArrayList<CodeableConcept> subType;

	/**
	 * Getter for subType
	 * @return More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
	 */
	public ArrayList<CodeableConcept> getSubType() { return subType; }

	/**
	 * Setter for subType
	 * @param value More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
	 */
	public void setSubType(ArrayList<CodeableConcept> value) { subType = value; }


	@Expose
	private ArrayList<CodeableConcept> action;

	/**
	 * Getter for action
	 * @return Action stipulated by this Contract.
	 */
	public ArrayList<CodeableConcept> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Action stipulated by this Contract.
	 */
	public void setAction(ArrayList<CodeableConcept> value) { action = value; }


	@Expose
	private ArrayList<CodeableConcept> actionReason;

	/**
	 * Getter for actionReason
	 * @return Reason for action stipulated by this Contract.
	 */
	public ArrayList<CodeableConcept> getActionReason() { return actionReason; }

	/**
	 * Setter for actionReason
	 * @param value Reason for action stipulated by this Contract.
	 */
	public void setActionReason(ArrayList<CodeableConcept> value) { actionReason = value; }


	@Expose
	private CodeableConcept decisionType;

	/**
	 * Getter for decisionType
	 * @return The type of decision made by a grantor with respect to an offer made by a grantee.
	 */
	public CodeableConcept getDecisionType() { return decisionType; }

	/**
	 * Setter for decisionType
	 * @param value The type of decision made by a grantor with respect to an offer made by a grantee.
	 */
	public void setDecisionType(CodeableConcept value) { decisionType = value; }


	@Expose
	private CodeableConcept contentDerivative;

	/**
	 * Getter for contentDerivative
	 * @return The minimal content derived from the basal information source at a specific stage in its lifecycle.
	 */
	public CodeableConcept getContentDerivative() { return contentDerivative; }

	/**
	 * Setter for contentDerivative
	 * @param value The minimal content derived from the basal information source at a specific stage in its lifecycle.
	 */
	public void setContentDerivative(CodeableConcept value) { contentDerivative = value; }


	@Expose
	private ArrayList<Coding> securityLabel;

	/**
	 * Getter for securityLabel
	 * @return A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels.
	 */
	public ArrayList<Coding> getSecurityLabel() { return securityLabel; }

	/**
	 * Setter for securityLabel
	 * @param value A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels.
	 */
	public void setSecurityLabel(ArrayList<Coding> value) { securityLabel = value; }


	@Expose
	private ArrayList<ContractAgent> agent;

	/**
	 * Getter for agent
	 * @return An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
	 */
	public ArrayList<ContractAgent> getAgent() { return agent; }

	/**
	 * Setter for agent
	 * @param value An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.
	 */
	public void setAgent(ArrayList<ContractAgent> value) { agent = value; }


	@Expose
	private ArrayList<ContractSigner> signer;

	/**
	 * Getter for signer
	 * @return Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.
	 */
	public ArrayList<ContractSigner> getSigner() { return signer; }

	/**
	 * Setter for signer
	 * @param value Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.
	 */
	public void setSigner(ArrayList<ContractSigner> value) { signer = value; }


	@Expose
	private ArrayList<ContractValuedItem> valuedItem;

	/**
	 * Getter for valuedItem
	 * @return Contract Valued Item List.
	 */
	public ArrayList<ContractValuedItem> getValuedItem() { return valuedItem; }

	/**
	 * Setter for valuedItem
	 * @param value Contract Valued Item List.
	 */
	public void setValuedItem(ArrayList<ContractValuedItem> value) { valuedItem = value; }


	@Expose
	private ArrayList<ContractTerm> term;

	/**
	 * Getter for term
	 * @return One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
	 */
	public ArrayList<ContractTerm> getTerm() { return term; }

	/**
	 * Setter for term
	 * @param value One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
	 */
	public void setTerm(ArrayList<ContractTerm> value) { term = value; }


	@Expose
	private Attachment bindingAttachment;

	/**
	 * Getter for bindingAttachment
	 * @return Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.
	 */
	public Attachment getBindingAttachment() { return bindingAttachment; }

	/**
	 * Setter for bindingAttachment
	 * @param value Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.
	 */
	public void setBindingAttachment(Attachment value) { bindingAttachment = value; }


	@Expose
	private Reference bindingReference;

	/**
	 * Getter for bindingReference
	 * @return Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.
	 */
	public Reference getBindingReference() { return bindingReference; }

	/**
	 * Setter for bindingReference
	 * @param value Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the "source of truth" and which would be the basis for legal action related to enforcement of this Contract.
	 */
	public void setBindingReference(Reference value) { bindingReference = value; }


	@Expose
	private ArrayList<ContractFriendly> friendly;

	/**
	 * Getter for friendly
	 * @return The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
	 */
	public ArrayList<ContractFriendly> getFriendly() { return friendly; }

	/**
	 * Setter for friendly
	 * @param value The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
	 */
	public void setFriendly(ArrayList<ContractFriendly> value) { friendly = value; }


	@Expose
	private ArrayList<ContractLegal> legal;

	/**
	 * Getter for legal
	 * @return List of Legal expressions or representations of this Contract.
	 */
	public ArrayList<ContractLegal> getLegal() { return legal; }

	/**
	 * Setter for legal
	 * @param value List of Legal expressions or representations of this Contract.
	 */
	public void setLegal(ArrayList<ContractLegal> value) { legal = value; }


	@Expose
	private ArrayList<ContractRule> rule;

	/**
	 * Getter for rule
	 * @return List of Computable Policy Rule Language Representations of this Contract.
	 */
	public ArrayList<ContractRule> getRule() { return rule; }

	/**
	 * Setter for rule
	 * @param value List of Computable Policy Rule Language Representations of this Contract.
	 */
	public void setRule(ArrayList<ContractRule> value) { rule = value; }


}
