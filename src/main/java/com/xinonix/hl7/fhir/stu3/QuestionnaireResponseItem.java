package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 */
public class QuestionnaireResponseItem extends BackboneElement {
	@Expose
	private String linkId;

	/**
	 * Getter for linkId
	 * @return The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.
	 */
	public String getLinkId() { return linkId; }

	/**
	 * Setter for linkId
	 * @param value The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.
	 */
	public void setLinkId(String value) { linkId = value; }


	@Expose
	private String definition;

	/**
	 * Getter for definition
	 * @return A reference to an [[[ElementDefinition]]] that provides the details for the item.
	 */
	public String getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value A reference to an [[[ElementDefinition]]] that provides the details for the item.
	 */
	public void setDefinition(String value) { definition = value; }


	@Expose
	private String text;

	/**
	 * Getter for text
	 * @return Text that is displayed above the contents of the group or as the text of the question being answered.
	 */
	public String getText() { return text; }

	/**
	 * Setter for text
	 * @param value Text that is displayed above the contents of the group or as the text of the question being answered.
	 */
	public void setText(String value) { text = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return More specific subject this section's answers are about, details the subject given in QuestionnaireResponse.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value More specific subject this section's answers are about, details the subject given in QuestionnaireResponse.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private ArrayList<QuestionnaireResponseAnswer> answer;

	/**
	 * Getter for answer
	 * @return The respondent's answer(s) to the question.
	 */
	public ArrayList<QuestionnaireResponseAnswer> getAnswer() { return answer; }

	/**
	 * Setter for answer
	 * @param value The respondent's answer(s) to the question.
	 */
	public void setAnswer(ArrayList<QuestionnaireResponseAnswer> value) { answer = value; }


	@Expose
	private ArrayList<QuestionnaireResponseItem> item;

	/**
	 * Getter for item
	 * @return Questions or sub-groups nested beneath a question or group.
	 */
	public ArrayList<QuestionnaireResponseItem> getItem() { return item; }

	/**
	 * Setter for item
	 * @param value Questions or sub-groups nested beneath a question or group.
	 */
	public void setItem(ArrayList<QuestionnaireResponseItem> value) { item = value; }


}
