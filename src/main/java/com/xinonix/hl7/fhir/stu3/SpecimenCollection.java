package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A sample to be used for analysis.
 */
public class SpecimenCollection extends BackboneElement {
	@Expose
	private Reference collector;

	/**
	 * Getter for collector
	 * @return Person who collected the specimen.
	 */
	public Reference getCollector() { return collector; }

	/**
	 * Setter for collector
	 * @param value Person who collected the specimen.
	 */
	public void setCollector(Reference value) { collector = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date collectedDateTime;

	/**
	 * Getter for collectedDateTime
	 * @return Time when specimen was collected from subject - the physiologically relevant time.
	 */
	public Date getCollectedDateTime() { return collectedDateTime; }

	/**
	 * Setter for collectedDateTime
	 * @param value Time when specimen was collected from subject - the physiologically relevant time.
	 */
	public void setCollectedDateTime(Date value) { collectedDateTime = value; }


	@Expose
	private Period collectedPeriod;

	/**
	 * Getter for collectedPeriod
	 * @return Time when specimen was collected from subject - the physiologically relevant time.
	 */
	public Period getCollectedPeriod() { return collectedPeriod; }

	/**
	 * Setter for collectedPeriod
	 * @param value Time when specimen was collected from subject - the physiologically relevant time.
	 */
	public void setCollectedPeriod(Period value) { collectedPeriod = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private CodeableConcept method;

	/**
	 * Getter for method
	 * @return A coded value specifying the technique that is used to perform the procedure.
	 */
	public CodeableConcept getMethod() { return method; }

	/**
	 * Setter for method
	 * @param value A coded value specifying the technique that is used to perform the procedure.
	 */
	public void setMethod(CodeableConcept value) { method = value; }


	@Expose
	private CodeableConcept bodySite;

	/**
	 * Getter for bodySite
	 * @return Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.
	 */
	public CodeableConcept getBodySite() { return bodySite; }

	/**
	 * Setter for bodySite
	 * @param value Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.
	 */
	public void setBodySite(CodeableConcept value) { bodySite = value; }


}
