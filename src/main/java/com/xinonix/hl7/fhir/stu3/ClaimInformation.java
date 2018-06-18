package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
public class ClaimInformation extends BackboneElement {
	@Expose
	private Integer sequence;

	/**
	 * Getter for sequence
	 * @return Sequence of the information element which serves to provide a link.
	 */
	public Integer getSequence() { return sequence; }

	/**
	 * Setter for sequence
	 * @param value Sequence of the information element which serves to provide a link.
	 */
	public void setSequence(Integer value) { sequence = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return The general class of the information supplied: information; exception; accident, employment; onset, etc.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value The general class of the information supplied: information; exception; accident, employment; onset, etc.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date timingDate;

	/**
	 * Getter for timingDate
	 * @return The date when or period to which this information refers.
	 */
	public Date getTimingDate() { return timingDate; }

	/**
	 * Setter for timingDate
	 * @param value The date when or period to which this information refers.
	 */
	public void setTimingDate(Date value) { timingDate = value; }


	@Expose
	private Period timingPeriod;

	/**
	 * Getter for timingPeriod
	 * @return The date when or period to which this information refers.
	 */
	public Period getTimingPeriod() { return timingPeriod; }

	/**
	 * Setter for timingPeriod
	 * @param value The date when or period to which this information refers.
	 */
	public void setTimingPeriod(Period value) { timingPeriod = value; }


	@Expose
	private String valueString;

	/**
	 * Getter for valueString
	 * @return Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
	 */
	public String getValueString() { return valueString; }

	/**
	 * Setter for valueString
	 * @param value Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
	 */
	public void setValueString(String value) { valueString = value; }


	@Expose
	private Quantity valueQuantity;

	/**
	 * Getter for valueQuantity
	 * @return Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
	 */
	public Quantity getValueQuantity() { return valueQuantity; }

	/**
	 * Setter for valueQuantity
	 * @param value Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
	 */
	public void setValueQuantity(Quantity value) { valueQuantity = value; }


	@Expose
	private Attachment valueAttachment;

	/**
	 * Getter for valueAttachment
	 * @return Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
	 */
	public Attachment getValueAttachment() { return valueAttachment; }

	/**
	 * Setter for valueAttachment
	 * @param value Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
	 */
	public void setValueAttachment(Attachment value) { valueAttachment = value; }


	@Expose
	private Reference valueReference;

	/**
	 * Getter for valueReference
	 * @return Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
	 */
	public Reference getValueReference() { return valueReference; }

	/**
	 * Setter for valueReference
	 * @param value Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
	 */
	public void setValueReference(Reference value) { valueReference = value; }


	@Expose
	private CodeableConcept reason;

	/**
	 * Getter for reason
	 * @return For example, provides the reason for: the additional stay, or missing tooth or any other situation where a reason code is required in addition to the content.
	 */
	public CodeableConcept getReason() { return reason; }

	/**
	 * Setter for reason
	 * @param value For example, provides the reason for: the additional stay, or missing tooth or any other situation where a reason code is required in addition to the content.
	 */
	public void setReason(CodeableConcept value) { reason = value; }


}
