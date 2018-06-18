package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 */
public class QuestionnaireResponse extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a QuestionnaireResponse resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a QuestionnaireResponse resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return A business identifier assigned to a particular completed (or partially completed) questionnaire.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A business identifier assigned to a particular completed (or partially completed) questionnaire.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ProcedureRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ProcedureRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private ArrayList<Reference> parent;

	/**
	 * Getter for parent
	 * @return A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.
	 */
	public ArrayList<Reference> getParent() { return parent; }

	/**
	 * Setter for parent
	 * @param value A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.
	 */
	public void setParent(ArrayList<Reference> value) { parent = value; }


	@Expose
	private Reference questionnaire;

	/**
	 * Getter for questionnaire
	 * @return The Questionnaire that defines and organizes the questions for which answers are being provided.
	 */
	public Reference getQuestionnaire() { return questionnaire; }

	/**
	 * Setter for questionnaire
	 * @param value The Questionnaire that defines and organizes the questions for which answers are being provided.
	 */
	public void setQuestionnaire(Reference value) { questionnaire = value; }


	public enum Status{
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("completed") COMPLETED,
		@SerializedName("amended") AMENDED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("stopped") STOPPED
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The position of the questionnaire response within its overall lifecycle.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The position of the questionnaire response within its overall lifecycle.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return The encounter or episode of care with primary association to the questionnaire response.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value The encounter or episode of care with primary association to the questionnaire response.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date authored;

	/**
	 * Getter for authored
	 * @return The date and/or time that this set of answers were last changed.
	 */
	public Date getAuthored() { return authored; }

	/**
	 * Setter for authored
	 * @param value The date and/or time that this set of answers were last changed.
	 */
	public void setAuthored(Date value) { authored = value; }


	@Expose
	private Reference author;

	/**
	 * Getter for author
	 * @return Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.
	 */
	public Reference getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.
	 */
	public void setAuthor(Reference value) { author = value; }


	@Expose
	private Reference source;

	/**
	 * Getter for source
	 * @return The person who answered the questions about the subject.
	 */
	public Reference getSource() { return source; }

	/**
	 * Setter for source
	 * @param value The person who answered the questions about the subject.
	 */
	public void setSource(Reference value) { source = value; }


	@Expose
	private ArrayList<QuestionnaireResponseItem> item;

	/**
	 * Getter for item
	 * @return A group or question item from the original questionnaire for which answers are provided.
	 */
	public ArrayList<QuestionnaireResponseItem> getItem() { return item; }

	/**
	 * Setter for item
	 * @param value A group or question item from the original questionnaire for which answers are provided.
	 */
	public void setItem(ArrayList<QuestionnaireResponseItem> value) { item = value; }


}
