package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 */
public class EligibilityResponseFinancial extends BackboneElement {
	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return Deductable, visits, benefit amount.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value Deductable, visits, benefit amount.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private Integer allowedUnsignedInt;

	/**
	 * Getter for allowedUnsignedInt
	 * @return Benefits allowed.
	 */
	public Integer getAllowedUnsignedInt() { return allowedUnsignedInt; }

	/**
	 * Setter for allowedUnsignedInt
	 * @param value Benefits allowed.
	 */
	public void setAllowedUnsignedInt(Integer value) { allowedUnsignedInt = value; }


	@Expose
	private String allowedString;

	/**
	 * Getter for allowedString
	 * @return Benefits allowed.
	 */
	public String getAllowedString() { return allowedString; }

	/**
	 * Setter for allowedString
	 * @param value Benefits allowed.
	 */
	public void setAllowedString(String value) { allowedString = value; }


	@Expose
	private Money allowedMoney;

	/**
	 * Getter for allowedMoney
	 * @return Benefits allowed.
	 */
	public Money getAllowedMoney() { return allowedMoney; }

	/**
	 * Setter for allowedMoney
	 * @param value Benefits allowed.
	 */
	public void setAllowedMoney(Money value) { allowedMoney = value; }


	@Expose
	private Integer usedUnsignedInt;

	/**
	 * Getter for usedUnsignedInt
	 * @return Benefits used.
	 */
	public Integer getUsedUnsignedInt() { return usedUnsignedInt; }

	/**
	 * Setter for usedUnsignedInt
	 * @param value Benefits used.
	 */
	public void setUsedUnsignedInt(Integer value) { usedUnsignedInt = value; }


	@Expose
	private Money usedMoney;

	/**
	 * Getter for usedMoney
	 * @return Benefits used.
	 */
	public Money getUsedMoney() { return usedMoney; }

	/**
	 * Setter for usedMoney
	 * @param value Benefits used.
	 */
	public void setUsedMoney(Money value) { usedMoney = value; }


}
