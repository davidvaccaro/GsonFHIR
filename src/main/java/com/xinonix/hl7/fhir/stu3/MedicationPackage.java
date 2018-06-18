package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 */
public class MedicationPackage extends BackboneElement {
	@Expose
	private CodeableConcept container;

	/**
	 * Getter for container
	 * @return The kind of container that this package comes as.
	 */
	public CodeableConcept getContainer() { return container; }

	/**
	 * Setter for container
	 * @param value The kind of container that this package comes as.
	 */
	public void setContainer(CodeableConcept value) { container = value; }


	@Expose
	private ArrayList<MedicationContent> content;

	/**
	 * Getter for content
	 * @return A set of components that go to make up the described item.
	 */
	public ArrayList<MedicationContent> getContent() { return content; }

	/**
	 * Setter for content
	 * @param value A set of components that go to make up the described item.
	 */
	public void setContent(ArrayList<MedicationContent> value) { content = value; }


	@Expose
	private ArrayList<MedicationBatch> batch;

	/**
	 * Getter for batch
	 * @return Information about a group of medication produced or packaged from one production run.
	 */
	public ArrayList<MedicationBatch> getBatch() { return batch; }

	/**
	 * Setter for batch
	 * @param value Information about a group of medication produced or packaged from one production run.
	 */
	public void setBatch(ArrayList<MedicationBatch> value) { batch = value; }


}
