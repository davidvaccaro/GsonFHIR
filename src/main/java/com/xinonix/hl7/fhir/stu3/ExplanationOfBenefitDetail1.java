package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 */
public class ExplanationOfBenefitDetail1 extends BackboneElement {
	@Expose
	private CodeableConcept revenue;

	/**
	 * Getter for revenue
	 * @return The type of reveneu or cost center providing the product and/or service.
	 */
	public CodeableConcept getRevenue() { return revenue; }

	/**
	 * Setter for revenue
	 * @param value The type of reveneu or cost center providing the product and/or service.
	 */
	public void setRevenue(CodeableConcept value) { revenue = value; }


	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return Health Care Service Type Codes  to identify the classification of service or benefits.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Health Care Service Type Codes  to identify the classification of service or benefits.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private CodeableConcept service;

	/**
	 * Getter for service
	 * @return A code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI).
	 */
	public CodeableConcept getService() { return service; }

	/**
	 * Setter for service
	 * @param value A code to indicate the Professional Service or Product supplied (eg. CTP, HCPCS,USCLS,ICD10, NCPDP,DIN,ACHI,CCI).
	 */
	public void setService(CodeableConcept value) { service = value; }


	@Expose
	private ArrayList<CodeableConcept> modifier;

	/**
	 * Getter for modifier
	 * @return Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
	 */
	public ArrayList<CodeableConcept> getModifier() { return modifier; }

	/**
	 * Setter for modifier
	 * @param value Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or for medical whether the treatment was outside the clinic or out of office hours.
	 */
	public void setModifier(ArrayList<CodeableConcept> value) { modifier = value; }


	@Expose
	private Money fee;

	/**
	 * Getter for fee
	 * @return The fee charged for the professional service or product.
	 */
	public Money getFee() { return fee; }

	/**
	 * Setter for fee
	 * @param value The fee charged for the professional service or product.
	 */
	public void setFee(Money value) { fee = value; }


	@Expose
	private ArrayList<Integer> noteNumber;

	/**
	 * Getter for noteNumber
	 * @return A list of note references to the notes provided below.
	 */
	public ArrayList<Integer> getNoteNumber() { return noteNumber; }

	/**
	 * Setter for noteNumber
	 * @param value A list of note references to the notes provided below.
	 */
	public void setNoteNumber(ArrayList<Integer> value) { noteNumber = value; }


	@Expose
	private ArrayList<ExplanationOfBenefitAdjudication> adjudication;

	/**
	 * Getter for adjudication
	 * @return The adjudications results.
	 */
	public ArrayList<ExplanationOfBenefitAdjudication> getAdjudication() { return adjudication; }

	/**
	 * Setter for adjudication
	 * @param value The adjudications results.
	 */
	public void setAdjudication(ArrayList<ExplanationOfBenefitAdjudication> value) { adjudication = value; }


}
