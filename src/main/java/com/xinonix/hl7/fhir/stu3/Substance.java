package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A homogeneous material with a definite composition.
 */
public class Substance extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Substance resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Substance resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Unique identifier for the substance.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Unique identifier for the substance.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("inactive") INACTIVE,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return A code to indicate if the substance is actively used.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value A code to indicate if the substance is actively used.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private ArrayList<CodeableConcept> category;

	/**
	 * Getter for category
	 * @return A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
	 */
	public ArrayList<CodeableConcept> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
	 */
	public void setCategory(ArrayList<CodeableConcept> value) { category = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return A code (or set of codes) that identify this substance.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code (or set of codes) that identify this substance.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A description of the substance - its appearance, handling requirements, and other usage notes.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A description of the substance - its appearance, handling requirements, and other usage notes.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<SubstanceInstance> instance;

	/**
	 * Getter for instance
	 * @return Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
	 */
	public ArrayList<SubstanceInstance> getInstance() { return instance; }

	/**
	 * Setter for instance
	 * @param value Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
	 */
	public void setInstance(ArrayList<SubstanceInstance> value) { instance = value; }


	@Expose
	private ArrayList<SubstanceIngredient> ingredient;

	/**
	 * Getter for ingredient
	 * @return A substance can be composed of other substances.
	 */
	public ArrayList<SubstanceIngredient> getIngredient() { return ingredient; }

	/**
	 * Setter for ingredient
	 * @param value A substance can be composed of other substances.
	 */
	public void setIngredient(ArrayList<SubstanceIngredient> value) { ingredient = value; }


}
