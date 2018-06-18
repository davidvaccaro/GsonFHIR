package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 */
public class ClaimSubDetail extends BackboneElement {
	@Expose
	private Integer sequence;

	/**
	 * Getter for sequence
	 * @return A service line number.
	 */
	public Integer getSequence() { return sequence; }

	/**
	 * Setter for sequence
	 * @param value A service line number.
	 */
	public void setSequence(Integer value) { sequence = value; }


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
	private ArrayList<CodeableConcept> programCode;

	/**
	 * Getter for programCode
	 * @return For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program.
	 */
	public ArrayList<CodeableConcept> getProgramCode() { return programCode; }

	/**
	 * Setter for programCode
	 * @param value For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program.
	 */
	public void setProgramCode(ArrayList<CodeableConcept> value) { programCode = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The number of repetitions of a service or product.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The number of repetitions of a service or product.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private Money unitPrice;

	/**
	 * Getter for unitPrice
	 * @return The fee for an addittional service or product or charge.
	 */
	public Money getUnitPrice() { return unitPrice; }

	/**
	 * Setter for unitPrice
	 * @param value The fee for an addittional service or product or charge.
	 */
	public void setUnitPrice(Money value) { unitPrice = value; }


	@Expose
	private Double factor;

	/**
	 * Getter for factor
	 * @return A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 */
	public Double getFactor() { return factor; }

	/**
	 * Setter for factor
	 * @param value A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 */
	public void setFactor(Double value) { factor = value; }


	@Expose
	private Money net;

	/**
	 * Getter for net
	 * @return The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 */
	public Money getNet() { return net; }

	/**
	 * Setter for net
	 * @param value The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 */
	public void setNet(Money value) { net = value; }


	@Expose
	private ArrayList<Reference> udi;

	/**
	 * Getter for udi
	 * @return List of Unique Device Identifiers associated with this line item.
	 */
	public ArrayList<Reference> getUdi() { return udi; }

	/**
	 * Setter for udi
	 * @param value List of Unique Device Identifiers associated with this line item.
	 */
	public void setUdi(ArrayList<Reference> value) { udi = value; }


}
