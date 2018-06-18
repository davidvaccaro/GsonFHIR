package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTypeAdapterTime;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 */
public class QuestionnaireEnableWhen extends BackboneElement {
	@Expose
	private String question;

	/**
	 * Getter for question
	 * @return The linkId for the question whose answer (or lack of answer) governs whether this item is enabled.
	 */
	public String getQuestion() { return question; }

	/**
	 * Setter for question
	 * @param value The linkId for the question whose answer (or lack of answer) governs whether this item is enabled.
	 */
	public void setQuestion(String value) { question = value; }


	@Expose
	private boolean hasAnswer;

	/**
	 * Getter for hasAnswer
	 * @return An indication that this item should be enabled only if the specified question is answered (hasAnswer=true) or not answered (hasAnswer=false).
	 */
	public boolean getHasAnswer() { return hasAnswer; }

	/**
	 * Setter for hasAnswer
	 * @param value An indication that this item should be enabled only if the specified question is answered (hasAnswer=true) or not answered (hasAnswer=false).
	 */
	public void setHasAnswer(boolean value) { hasAnswer = value; }


	@Expose
	private boolean answerBoolean;

	/**
	 * Getter for answerBoolean
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public boolean getAnswerBoolean() { return answerBoolean; }

	/**
	 * Setter for answerBoolean
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerBoolean(boolean value) { answerBoolean = value; }


	@Expose
	private Double answerDecimal;

	/**
	 * Getter for answerDecimal
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public Double getAnswerDecimal() { return answerDecimal; }

	/**
	 * Setter for answerDecimal
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerDecimal(Double value) { answerDecimal = value; }


	@Expose
	private Integer answerInteger;

	/**
	 * Getter for answerInteger
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public Integer getAnswerInteger() { return answerInteger; }

	/**
	 * Setter for answerInteger
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerInteger(Integer value) { answerInteger = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date answerDate;

	/**
	 * Getter for answerDate
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public Date getAnswerDate() { return answerDate; }

	/**
	 * Setter for answerDate
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerDate(Date value) { answerDate = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date answerDateTime;

	/**
	 * Getter for answerDateTime
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public Date getAnswerDateTime() { return answerDateTime; }

	/**
	 * Setter for answerDateTime
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerDateTime(Date value) { answerDateTime = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date answerTime;

	/**
	 * Getter for answerTime
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public Date getAnswerTime() { return answerTime; }

	/**
	 * Setter for answerTime
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerTime(Date value) { answerTime = value; }


	@Expose
	private String answerString;

	/**
	 * Getter for answerString
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public String getAnswerString() { return answerString; }

	/**
	 * Setter for answerString
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerString(String value) { answerString = value; }


	@Expose
	private String answerUri;

	/**
	 * Getter for answerUri
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public String getAnswerUri() { return answerUri; }

	/**
	 * Setter for answerUri
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerUri(String value) { answerUri = value; }


	@Expose
	private Attachment answerAttachment;

	/**
	 * Getter for answerAttachment
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public Attachment getAnswerAttachment() { return answerAttachment; }

	/**
	 * Setter for answerAttachment
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerAttachment(Attachment value) { answerAttachment = value; }


	@Expose
	private Coding answerCoding;

	/**
	 * Getter for answerCoding
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public Coding getAnswerCoding() { return answerCoding; }

	/**
	 * Setter for answerCoding
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerCoding(Coding value) { answerCoding = value; }


	@Expose
	private Quantity answerQuantity;

	/**
	 * Getter for answerQuantity
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public Quantity getAnswerQuantity() { return answerQuantity; }

	/**
	 * Setter for answerQuantity
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerQuantity(Quantity value) { answerQuantity = value; }


	@Expose
	private Reference answerReference;

	/**
	 * Getter for answerReference
	 * @return An answer that the referenced question must match in order for the item to be enabled.
	 */
	public Reference getAnswerReference() { return answerReference; }

	/**
	 * Setter for answerReference
	 * @param value An answer that the referenced question must match in order for the item to be enabled.
	 */
	public void setAnswerReference(Reference value) { answerReference = value; }


}
