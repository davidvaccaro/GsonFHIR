package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTypeAdapterTime;
import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 */
public class QuestionnaireResponseAnswer extends BackboneElement {
	@Expose
	private boolean valueBoolean;

	/**
	 * Getter for valueBoolean
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public boolean getValueBoolean() { return valueBoolean; }

	/**
	 * Setter for valueBoolean
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueBoolean(boolean value) { valueBoolean = value; }


	@Expose
	private Double valueDecimal;

	/**
	 * Getter for valueDecimal
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public Double getValueDecimal() { return valueDecimal; }

	/**
	 * Setter for valueDecimal
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueDecimal(Double value) { valueDecimal = value; }


	@Expose
	private Integer valueInteger;

	/**
	 * Getter for valueInteger
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public Integer getValueInteger() { return valueInteger; }

	/**
	 * Setter for valueInteger
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueInteger(Integer value) { valueInteger = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date valueDate;

	/**
	 * Getter for valueDate
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public Date getValueDate() { return valueDate; }

	/**
	 * Setter for valueDate
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueDate(Date value) { valueDate = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date valueDateTime;

	/**
	 * Getter for valueDateTime
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public Date getValueDateTime() { return valueDateTime; }

	/**
	 * Setter for valueDateTime
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueDateTime(Date value) { valueDateTime = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date valueTime;

	/**
	 * Getter for valueTime
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public Date getValueTime() { return valueTime; }

	/**
	 * Setter for valueTime
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueTime(Date value) { valueTime = value; }


	@Expose
	private String valueString;

	/**
	 * Getter for valueString
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public String getValueString() { return valueString; }

	/**
	 * Setter for valueString
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueString(String value) { valueString = value; }


	@Expose
	private String valueUri;

	/**
	 * Getter for valueUri
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public String getValueUri() { return valueUri; }

	/**
	 * Setter for valueUri
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueUri(String value) { valueUri = value; }


	@Expose
	private Attachment valueAttachment;

	/**
	 * Getter for valueAttachment
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public Attachment getValueAttachment() { return valueAttachment; }

	/**
	 * Setter for valueAttachment
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueAttachment(Attachment value) { valueAttachment = value; }


	@Expose
	private Coding valueCoding;

	/**
	 * Getter for valueCoding
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public Coding getValueCoding() { return valueCoding; }

	/**
	 * Setter for valueCoding
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueCoding(Coding value) { valueCoding = value; }


	@Expose
	private Quantity valueQuantity;

	/**
	 * Getter for valueQuantity
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public Quantity getValueQuantity() { return valueQuantity; }

	/**
	 * Setter for valueQuantity
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueQuantity(Quantity value) { valueQuantity = value; }


	@Expose
	private Reference valueReference;

	/**
	 * Getter for valueReference
	 * @return The answer (or one of the answers) provided by the respondent to the question.
	 */
	public Reference getValueReference() { return valueReference; }

	/**
	 * Setter for valueReference
	 * @param value The answer (or one of the answers) provided by the respondent to the question.
	 */
	public void setValueReference(Reference value) { valueReference = value; }


	@Expose
	private ArrayList<QuestionnaireResponseItem> item;

	/**
	 * Getter for item
	 * @return Nested groups and/or questions found within this particular answer.
	 */
	public ArrayList<QuestionnaireResponseItem> getItem() { return item; }

	/**
	 * Setter for item
	 * @param value Nested groups and/or questions found within this particular answer.
	 */
	public void setItem(ArrayList<QuestionnaireResponseItem> value) { item = value; }


}
