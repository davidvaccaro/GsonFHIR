package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 */
public class Medication extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Medication resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Medication resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	public enum Status{
		@SerializedName("active") ACTIVE,
		@SerializedName("inactive") INACTIVE,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return A code to indicate if the medication is in active use.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value A code to indicate if the medication is in active use.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private boolean isBrand;

	/**
	 * Getter for isBrand
	 * @return Set to true if the item is attributable to a specific manufacturer.
	 */
	public boolean getIsBrand() { return isBrand; }

	/**
	 * Setter for isBrand
	 * @param value Set to true if the item is attributable to a specific manufacturer.
	 */
	public void setIsBrand(boolean value) { isBrand = value; }


	@Expose
	private boolean isOverTheCounter;

	/**
	 * Getter for isOverTheCounter
	 * @return Set to true if the medication can be obtained without an order from a prescriber.
	 */
	public boolean getIsOverTheCounter() { return isOverTheCounter; }

	/**
	 * Setter for isOverTheCounter
	 * @param value Set to true if the medication can be obtained without an order from a prescriber.
	 */
	public void setIsOverTheCounter(boolean value) { isOverTheCounter = value; }


	@Expose
	private Reference manufacturer;

	/**
	 * Getter for manufacturer
	 * @return Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product.
	 */
	public Reference getManufacturer() { return manufacturer; }

	/**
	 * Setter for manufacturer
	 * @param value Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product.
	 */
	public void setManufacturer(Reference value) { manufacturer = value; }


	@Expose
	private CodeableConcept form;

	/**
	 * Getter for form
	 * @return Describes the form of the item.  Powder; tablets; capsule.
	 */
	public CodeableConcept getForm() { return form; }

	/**
	 * Setter for form
	 * @param value Describes the form of the item.  Powder; tablets; capsule.
	 */
	public void setForm(CodeableConcept value) { form = value; }


	@Expose
	private ArrayList<MedicationIngredient> ingredient;

	/**
	 * Getter for ingredient
	 * @return Identifies a particular constituent of interest in the product.
	 */
	public ArrayList<MedicationIngredient> getIngredient() { return ingredient; }

	/**
	 * Setter for ingredient
	 * @param value Identifies a particular constituent of interest in the product.
	 */
	public void setIngredient(ArrayList<MedicationIngredient> value) { ingredient = value; }


	@Expose
	@SerializedName("package")
	private MedicationPackage packageValue;

	/**
	 * Getter for packageValue
	 * @return Information that only applies to packages (not products).
	 */
	public MedicationPackage getPackage() { return packageValue; }

	/**
	 * Setter for packageValue
	 * @param value Information that only applies to packages (not products).
	 */
	public void setPackage(MedicationPackage value) { packageValue = value; }


	@Expose
	private ArrayList<Attachment> image;

	/**
	 * Getter for image
	 * @return Photo(s) or graphic representation(s) of the medication.
	 */
	public ArrayList<Attachment> getImage() { return image; }

	/**
	 * Setter for image
	 * @param value Photo(s) or graphic representation(s) of the medication.
	 */
	public void setImage(ArrayList<Attachment> value) { image = value; }


}
