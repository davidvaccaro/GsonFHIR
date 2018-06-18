package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 */
public class NutritionOrder extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a NutritionOrder resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a NutritionOrder resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return Identifiers assigned to this order by the order sender or by the order receiver.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifiers assigned to this order by the order sender or by the order receiver.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Status{
		@SerializedName("proposed") PROPOSED,
		@SerializedName("draft") DRAFT,
		@SerializedName("planned") PLANNED,
		@SerializedName("requested") REQUESTED,
		@SerializedName("active") ACTIVE,
		@SerializedName("on-hold") ON_HOLD,
		@SerializedName("completed") COMPLETED,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The workflow status of the nutrition order/request.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The workflow status of the nutrition order/request.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private Reference encounter;

	/**
	 * Getter for encounter
	 * @return An encounter that provides additional information about the healthcare context in which this request is made.
	 */
	public Reference getEncounter() { return encounter; }

	/**
	 * Setter for encounter
	 * @param value An encounter that provides additional information about the healthcare context in which this request is made.
	 */
	public void setEncounter(Reference value) { encounter = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date dateTime;

	/**
	 * Getter for dateTime
	 * @return The date and time that this nutrition order was requested.
	 */
	public Date getDateTime() { return dateTime; }

	/**
	 * Setter for dateTime
	 * @param value The date and time that this nutrition order was requested.
	 */
	public void setDateTime(Date value) { dateTime = value; }


	@Expose
	private Reference orderer;

	/**
	 * Getter for orderer
	 * @return The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.
	 */
	public Reference getOrderer() { return orderer; }

	/**
	 * Setter for orderer
	 * @param value The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.
	 */
	public void setOrderer(Reference value) { orderer = value; }


	@Expose
	private ArrayList<Reference> allergyIntolerance;

	/**
	 * Getter for allergyIntolerance
	 * @return A link to a record of allergies or intolerances  which should be included in the nutrition order.
	 */
	public ArrayList<Reference> getAllergyIntolerance() { return allergyIntolerance; }

	/**
	 * Setter for allergyIntolerance
	 * @param value A link to a record of allergies or intolerances  which should be included in the nutrition order.
	 */
	public void setAllergyIntolerance(ArrayList<Reference> value) { allergyIntolerance = value; }


	@Expose
	private ArrayList<CodeableConcept> foodPreferenceModifier;

	/**
	 * Getter for foodPreferenceModifier
	 * @return This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
	 */
	public ArrayList<CodeableConcept> getFoodPreferenceModifier() { return foodPreferenceModifier; }

	/**
	 * Setter for foodPreferenceModifier
	 * @param value This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
	 */
	public void setFoodPreferenceModifier(ArrayList<CodeableConcept> value) { foodPreferenceModifier = value; }


	@Expose
	private ArrayList<CodeableConcept> excludeFoodModifier;

	/**
	 * Getter for excludeFoodModifier
	 * @return This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
	 */
	public ArrayList<CodeableConcept> getExcludeFoodModifier() { return excludeFoodModifier; }

	/**
	 * Setter for excludeFoodModifier
	 * @param value This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
	 */
	public void setExcludeFoodModifier(ArrayList<CodeableConcept> value) { excludeFoodModifier = value; }


	@Expose
	private NutritionOrderOralDiet oralDiet;

	/**
	 * Getter for oralDiet
	 * @return Diet given orally in contrast to enteral (tube) feeding.
	 */
	public NutritionOrderOralDiet getOralDiet() { return oralDiet; }

	/**
	 * Setter for oralDiet
	 * @param value Diet given orally in contrast to enteral (tube) feeding.
	 */
	public void setOralDiet(NutritionOrderOralDiet value) { oralDiet = value; }


	@Expose
	private ArrayList<NutritionOrderSupplement> supplement;

	/**
	 * Getter for supplement
	 * @return Oral nutritional products given in order to add further nutritional value to the patient's diet.
	 */
	public ArrayList<NutritionOrderSupplement> getSupplement() { return supplement; }

	/**
	 * Setter for supplement
	 * @param value Oral nutritional products given in order to add further nutritional value to the patient's diet.
	 */
	public void setSupplement(ArrayList<NutritionOrderSupplement> value) { supplement = value; }


	@Expose
	private NutritionOrderEnteralFormula enteralFormula;

	/**
	 * Getter for enteralFormula
	 * @return Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
	 */
	public NutritionOrderEnteralFormula getEnteralFormula() { return enteralFormula; }

	/**
	 * Setter for enteralFormula
	 * @param value Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
	 */
	public void setEnteralFormula(NutritionOrderEnteralFormula value) { enteralFormula = value; }


}
