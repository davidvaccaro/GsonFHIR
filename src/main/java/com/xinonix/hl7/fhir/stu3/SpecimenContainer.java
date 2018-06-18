package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A sample to be used for analysis.
 */
public class SpecimenContainer extends BackboneElement {
	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return Textual description of the container.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value Textual description of the container.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return The type of container associated with the specimen (e.g. slide, aliquot, etc.).
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value The type of container associated with the specimen (e.g. slide, aliquot, etc.).
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private Quantity capacity;

	/**
	 * Getter for capacity
	 * @return The capacity (volume or other measure) the container may contain.
	 */
	public Quantity getCapacity() { return capacity; }

	/**
	 * Setter for capacity
	 * @param value The capacity (volume or other measure) the container may contain.
	 */
	public void setCapacity(Quantity value) { capacity = value; }


	@Expose
	private Quantity specimenQuantity;

	/**
	 * Getter for specimenQuantity
	 * @return The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.
	 */
	public Quantity getSpecimenQuantity() { return specimenQuantity; }

	/**
	 * Setter for specimenQuantity
	 * @param value The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.
	 */
	public void setSpecimenQuantity(Quantity value) { specimenQuantity = value; }


	@Expose
	private CodeableConcept additiveCodeableConcept;

	/**
	 * Getter for additiveCodeableConcept
	 * @return Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
	 */
	public CodeableConcept getAdditiveCodeableConcept() { return additiveCodeableConcept; }

	/**
	 * Setter for additiveCodeableConcept
	 * @param value Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
	 */
	public void setAdditiveCodeableConcept(CodeableConcept value) { additiveCodeableConcept = value; }


	@Expose
	private Reference additiveReference;

	/**
	 * Getter for additiveReference
	 * @return Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
	 */
	public Reference getAdditiveReference() { return additiveReference; }

	/**
	 * Setter for additiveReference
	 * @param value Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.
	 */
	public void setAdditiveReference(Reference value) { additiveReference = value; }


}
