package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 */
public class ContractValuedItem1 extends BackboneElement {
	@Expose
	private CodeableConcept entityCodeableConcept;

	/**
	 * Getter for entityCodeableConcept
	 * @return Specific type of Contract Provision Valued Item that may be priced.
	 */
	public CodeableConcept getEntityCodeableConcept() { return entityCodeableConcept; }

	/**
	 * Setter for entityCodeableConcept
	 * @param value Specific type of Contract Provision Valued Item that may be priced.
	 */
	public void setEntityCodeableConcept(CodeableConcept value) { entityCodeableConcept = value; }


	@Expose
	private Reference entityReference;

	/**
	 * Getter for entityReference
	 * @return Specific type of Contract Provision Valued Item that may be priced.
	 */
	public Reference getEntityReference() { return entityReference; }

	/**
	 * Setter for entityReference
	 * @param value Specific type of Contract Provision Valued Item that may be priced.
	 */
	public void setEntityReference(Reference value) { entityReference = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Identifies a Contract Provision Valued Item instance.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Identifies a Contract Provision Valued Item instance.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date effectiveTime;

	/**
	 * Getter for effectiveTime
	 * @return Indicates the time during which this Contract Term ValuedItem information is effective.
	 */
	public Date getEffectiveTime() { return effectiveTime; }

	/**
	 * Setter for effectiveTime
	 * @param value Indicates the time during which this Contract Term ValuedItem information is effective.
	 */
	public void setEffectiveTime(Date value) { effectiveTime = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return Specifies the units by which the Contract Provision Valued Item is measured or counted, and quantifies the countable or measurable Contract Term Valued Item instances.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value Specifies the units by which the Contract Provision Valued Item is measured or counted, and quantifies the countable or measurable Contract Term Valued Item instances.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private Money unitPrice;

	/**
	 * Getter for unitPrice
	 * @return A Contract Provision Valued Item unit valuation measure.
	 */
	public Money getUnitPrice() { return unitPrice; }

	/**
	 * Setter for unitPrice
	 * @param value A Contract Provision Valued Item unit valuation measure.
	 */
	public void setUnitPrice(Money value) { unitPrice = value; }


	@Expose
	private Double factor;

	/**
	 * Getter for factor
	 * @return A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 */
	public Double getFactor() { return factor; }

	/**
	 * Setter for factor
	 * @param value A real number that represents a multiplier used in determining the overall value of the Contract Provision Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 */
	public void setFactor(Double value) { factor = value; }


	@Expose
	private Double points;

	/**
	 * Getter for points
	 * @return An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point.
	 */
	public Double getPoints() { return points; }

	/**
	 * Setter for points
	 * @param value An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Provision Valued Item delivered. The concept of Points allows for assignment of point values for a Contract ProvisionValued Item, such that a monetary amount can be assigned to each point.
	 */
	public void setPoints(Double value) { points = value; }


	@Expose
	private Money net;

	/**
	 * Getter for net
	 * @return Expresses the product of the Contract Provision Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 */
	public Money getNet() { return net; }

	/**
	 * Setter for net
	 * @param value Expresses the product of the Contract Provision Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 */
	public void setNet(Money value) { net = value; }


}
