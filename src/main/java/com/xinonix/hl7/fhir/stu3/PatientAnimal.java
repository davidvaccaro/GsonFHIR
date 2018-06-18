package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 */
public class PatientAnimal extends BackboneElement {
	@Expose
	private CodeableConcept species;

	/**
	 * Getter for species
	 * @return Identifies the high level taxonomic categorization of the kind of animal.
	 */
	public CodeableConcept getSpecies() { return species; }

	/**
	 * Setter for species
	 * @param value Identifies the high level taxonomic categorization of the kind of animal.
	 */
	public void setSpecies(CodeableConcept value) { species = value; }


	@Expose
	private CodeableConcept breed;

	/**
	 * Getter for breed
	 * @return Identifies the detailed categorization of the kind of animal.
	 */
	public CodeableConcept getBreed() { return breed; }

	/**
	 * Setter for breed
	 * @param value Identifies the detailed categorization of the kind of animal.
	 */
	public void setBreed(CodeableConcept value) { breed = value; }


	@Expose
	private CodeableConcept genderStatus;

	/**
	 * Getter for genderStatus
	 * @return Indicates the current state of the animal's reproductive organs.
	 */
	public CodeableConcept getGenderStatus() { return genderStatus; }

	/**
	 * Setter for genderStatus
	 * @param value Indicates the current state of the animal's reproductive organs.
	 */
	public void setGenderStatus(CodeableConcept value) { genderStatus = value; }


}
