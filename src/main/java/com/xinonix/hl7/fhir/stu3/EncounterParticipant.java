package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
public class EncounterParticipant extends BackboneElement {
	@Expose
	private ArrayList<CodeableConcept> type;

	/**
	 * Getter for type
	 * @return Role of participant in encounter.
	 */
	public ArrayList<CodeableConcept> getType() { return type; }

	/**
	 * Setter for type
	 * @param value Role of participant in encounter.
	 */
	public void setType(ArrayList<CodeableConcept> value) { type = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The period of time that the specified participant participated in the encounter. These can overlap or be sub-sets of the overall encounter's period.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The period of time that the specified participant participated in the encounter. These can overlap or be sub-sets of the overall encounter's period.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private Reference individual;

	/**
	 * Getter for individual
	 * @return Persons involved in the encounter other than the patient.
	 */
	public Reference getIndividual() { return individual; }

	/**
	 * Setter for individual
	 * @param value Persons involved in the encounter other than the patient.
	 */
	public void setIndividual(Reference value) { individual = value; }


}
