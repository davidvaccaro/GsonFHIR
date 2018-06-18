package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitBenefitBalance extends BackboneElement {
	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Dental, Vision, Medical, Pharmacy, Rehab etc.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Dental, Vision, Medical, Pharmacy, Rehab etc.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept subCategory;

	/**
	 * Getter for subCategory
	 * @return Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.
	 */
	public CodeableConcept getSubCategory() { return subCategory; }

	/**
	 * Setter for subCategory
	 * @param value Dental: basic, major, ortho; Vision exam, glasses, contacts; etc.
	 */
	public void setSubCategory(CodeableConcept value) { subCategory = value; }


	@Expose
	private boolean excluded;

	/**
	 * Getter for excluded
	 * @return True if the indicated class of service is excluded from the plan, missing or False indicated the service is included in the coverage.
	 */
	public boolean getExcluded() { return excluded; }

	/**
	 * Setter for excluded
	 * @param value True if the indicated class of service is excluded from the plan, missing or False indicated the service is included in the coverage.
	 */
	public void setExcluded(boolean value) { excluded = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return A short name or tag for the benefit, for example MED01, or DENT2.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value A short name or tag for the benefit, for example MED01, or DENT2.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private CodeableConcept network;

	/**
	 * Getter for network
	 * @return Network designation.
	 */
	public CodeableConcept getNetwork() { return network; }

	/**
	 * Setter for network
	 * @param value Network designation.
	 */
	public void setNetwork(CodeableConcept value) { network = value; }


	@Expose
	private CodeableConcept unit;

	/**
	 * Getter for unit
	 * @return Unit designation: individual or family.
	 */
	public CodeableConcept getUnit() { return unit; }

	/**
	 * Setter for unit
	 * @param value Unit designation: individual or family.
	 */
	public void setUnit(CodeableConcept value) { unit = value; }


	@Expose
	private CodeableConcept term;

	/**
	 * Getter for term
	 * @return The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'.
	 */
	public CodeableConcept getTerm() { return term; }

	/**
	 * Setter for term
	 * @param value The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'.
	 */
	public void setTerm(CodeableConcept value) { term = value; }


	@Expose
	private ArrayList<ExplanationOfBenefitFinancial> financial;

	/**
	 * Getter for financial
	 * @return Benefits Used to date.
	 */
	public ArrayList<ExplanationOfBenefitFinancial> getFinancial() { return financial; }

	/**
	 * Setter for financial
	 * @param value Benefits Used to date.
	 */
	public void setFinancial(ArrayList<ExplanationOfBenefitFinancial> value) { financial = value; }


}
