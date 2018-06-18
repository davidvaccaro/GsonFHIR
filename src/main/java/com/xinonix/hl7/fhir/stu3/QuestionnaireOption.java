package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;
import com.xinonix.serialization.DateTypeAdapterTime;

/**
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 */
public class QuestionnaireOption extends BackboneElement {
	@Expose
	private Integer valueInteger;

	/**
	 * Getter for valueInteger
	 * @return A potential answer that's allowed as the answer to this question.
	 */
	public Integer getValueInteger() { return valueInteger; }

	/**
	 * Setter for valueInteger
	 * @param value A potential answer that's allowed as the answer to this question.
	 */
	public void setValueInteger(Integer value) { valueInteger = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date valueDate;

	/**
	 * Getter for valueDate
	 * @return A potential answer that's allowed as the answer to this question.
	 */
	public Date getValueDate() { return valueDate; }

	/**
	 * Setter for valueDate
	 * @param value A potential answer that's allowed as the answer to this question.
	 */
	public void setValueDate(Date value) { valueDate = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterTime.class)
	private Date valueTime;

	/**
	 * Getter for valueTime
	 * @return A potential answer that's allowed as the answer to this question.
	 */
	public Date getValueTime() { return valueTime; }

	/**
	 * Setter for valueTime
	 * @param value A potential answer that's allowed as the answer to this question.
	 */
	public void setValueTime(Date value) { valueTime = value; }


	@Expose
	private String valueString;

	/**
	 * Getter for valueString
	 * @return A potential answer that's allowed as the answer to this question.
	 */
	public String getValueString() { return valueString; }

	/**
	 * Setter for valueString
	 * @param value A potential answer that's allowed as the answer to this question.
	 */
	public void setValueString(String value) { valueString = value; }


	@Expose
	private Coding valueCoding;

	/**
	 * Getter for valueCoding
	 * @return A potential answer that's allowed as the answer to this question.
	 */
	public Coding getValueCoding() { return valueCoding; }

	/**
	 * Setter for valueCoding
	 * @param value A potential answer that's allowed as the answer to this question.
	 */
	public void setValueCoding(Coding value) { valueCoding = value; }


}
