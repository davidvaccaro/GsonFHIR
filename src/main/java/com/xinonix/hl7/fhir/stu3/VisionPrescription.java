package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 */
public class VisionPrescription extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a VisionPrescription resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a VisionPrescription resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Business identifier which may be used by other parties to reference or identify the prescription.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Business identifier which may be used by other parties to reference or identify the prescription.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


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
	private Reference patient;

	/**
	 * Getter for patient
	 * @return A link to a resource representing the person to whom the vision products will be supplied.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value A link to a resource representing the person to whom the vision products will be supplied.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private Reference encounter;

	/**
	 * Getter for encounter
	 * @return A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
	 */
	public Reference getEncounter() { return encounter; }

	/**
	 * Setter for encounter
	 * @param value A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
	 */
	public void setEncounter(Reference value) { encounter = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date dateWritten;

	/**
	 * Getter for dateWritten
	 * @return The date (and perhaps time) when the prescription was written.
	 */
	public Date getDateWritten() { return dateWritten; }

	/**
	 * Setter for dateWritten
	 * @param value The date (and perhaps time) when the prescription was written.
	 */
	public void setDateWritten(Date value) { dateWritten = value; }


	@Expose
	private Reference prescriber;

	/**
	 * Getter for prescriber
	 * @return The healthcare professional responsible for authorizing the prescription.
	 */
	public Reference getPrescriber() { return prescriber; }

	/**
	 * Setter for prescriber
	 * @param value The healthcare professional responsible for authorizing the prescription.
	 */
	public void setPrescriber(Reference value) { prescriber = value; }


	@Expose
	private CodeableConcept reasonCodeableConcept;

	/**
	 * Getter for reasonCodeableConcept
	 * @return Can be the reason or the indication for writing the prescription.
	 */
	public CodeableConcept getReasonCodeableConcept() { return reasonCodeableConcept; }

	/**
	 * Setter for reasonCodeableConcept
	 * @param value Can be the reason or the indication for writing the prescription.
	 */
	public void setReasonCodeableConcept(CodeableConcept value) { reasonCodeableConcept = value; }


	@Expose
	private Reference reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Can be the reason or the indication for writing the prescription.
	 */
	public Reference getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Can be the reason or the indication for writing the prescription.
	 */
	public void setReasonReference(Reference value) { reasonReference = value; }


	@Expose
	private ArrayList<VisionPrescriptionDispense> dispense;

	/**
	 * Getter for dispense
	 * @return Deals with details of the dispense part of the supply specification.
	 */
	public ArrayList<VisionPrescriptionDispense> getDispense() { return dispense; }

	/**
	 * Setter for dispense
	 * @param value Deals with details of the dispense part of the supply specification.
	 */
	public void setDispense(ArrayList<VisionPrescriptionDispense> value) { dispense = value; }


}
