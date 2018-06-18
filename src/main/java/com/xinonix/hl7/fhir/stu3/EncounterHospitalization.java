package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
public class EncounterHospitalization extends BackboneElement {
	@Expose
	private Identifier preAdmissionIdentifier;

	/**
	 * Getter for preAdmissionIdentifier
	 * @return Pre-admission identifier.
	 */
	public Identifier getPreAdmissionIdentifier() { return preAdmissionIdentifier; }

	/**
	 * Setter for preAdmissionIdentifier
	 * @param value Pre-admission identifier.
	 */
	public void setPreAdmissionIdentifier(Identifier value) { preAdmissionIdentifier = value; }


	@Expose
	private Reference origin;

	/**
	 * Getter for origin
	 * @return The location from which the patient came before admission.
	 */
	public Reference getOrigin() { return origin; }

	/**
	 * Setter for origin
	 * @param value The location from which the patient came before admission.
	 */
	public void setOrigin(Reference value) { origin = value; }


	@Expose
	private CodeableConcept admitSource;

	/**
	 * Getter for admitSource
	 * @return From where patient was admitted (physician referral, transfer).
	 */
	public CodeableConcept getAdmitSource() { return admitSource; }

	/**
	 * Setter for admitSource
	 * @param value From where patient was admitted (physician referral, transfer).
	 */
	public void setAdmitSource(CodeableConcept value) { admitSource = value; }


	@Expose
	private CodeableConcept reAdmission;

	/**
	 * Getter for reAdmission
	 * @return Whether this hospitalization is a readmission and why if known.
	 */
	public CodeableConcept getReAdmission() { return reAdmission; }

	/**
	 * Setter for reAdmission
	 * @param value Whether this hospitalization is a readmission and why if known.
	 */
	public void setReAdmission(CodeableConcept value) { reAdmission = value; }


	@Expose
	private ArrayList<CodeableConcept> dietPreference;

	/**
	 * Getter for dietPreference
	 * @return Diet preferences reported by the patient.
	 */
	public ArrayList<CodeableConcept> getDietPreference() { return dietPreference; }

	/**
	 * Setter for dietPreference
	 * @param value Diet preferences reported by the patient.
	 */
	public void setDietPreference(ArrayList<CodeableConcept> value) { dietPreference = value; }


	@Expose
	private ArrayList<CodeableConcept> specialCourtesy;

	/**
	 * Getter for specialCourtesy
	 * @return Special courtesies (VIP, board member).
	 */
	public ArrayList<CodeableConcept> getSpecialCourtesy() { return specialCourtesy; }

	/**
	 * Setter for specialCourtesy
	 * @param value Special courtesies (VIP, board member).
	 */
	public void setSpecialCourtesy(ArrayList<CodeableConcept> value) { specialCourtesy = value; }


	@Expose
	private ArrayList<CodeableConcept> specialArrangement;

	/**
	 * Getter for specialArrangement
	 * @return Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things.
	 */
	public ArrayList<CodeableConcept> getSpecialArrangement() { return specialArrangement; }

	/**
	 * Setter for specialArrangement
	 * @param value Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things.
	 */
	public void setSpecialArrangement(ArrayList<CodeableConcept> value) { specialArrangement = value; }


	@Expose
	private Reference destination;

	/**
	 * Getter for destination
	 * @return Location to which the patient is discharged.
	 */
	public Reference getDestination() { return destination; }

	/**
	 * Setter for destination
	 * @param value Location to which the patient is discharged.
	 */
	public void setDestination(Reference value) { destination = value; }


	@Expose
	private CodeableConcept dischargeDisposition;

	/**
	 * Getter for dischargeDisposition
	 * @return Category or kind of location after discharge.
	 */
	public CodeableConcept getDischargeDisposition() { return dischargeDisposition; }

	/**
	 * Setter for dischargeDisposition
	 * @param value Category or kind of location after discharge.
	 */
	public void setDischargeDisposition(CodeableConcept value) { dischargeDisposition = value; }


}
