package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 */
public class EligibilityResponseInsurance extends BackboneElement {
	@Expose
	private Reference coverage;

	/**
	 * Getter for coverage
	 * @return A suite of updated or additional Coverages from the Insurer.
	 */
	public Reference getCoverage() { return coverage; }

	/**
	 * Setter for coverage
	 * @param value A suite of updated or additional Coverages from the Insurer.
	 */
	public void setCoverage(Reference value) { coverage = value; }


	@Expose
	private Reference contract;

	/**
	 * Getter for contract
	 * @return The contract resource which may provide more detailed information.
	 */
	public Reference getContract() { return contract; }

	/**
	 * Setter for contract
	 * @param value The contract resource which may provide more detailed information.
	 */
	public void setContract(Reference value) { contract = value; }


	@Expose
	private ArrayList<EligibilityResponseBenefitBalance> benefitBalance;

	/**
	 * Getter for benefitBalance
	 * @return Benefits and optionally current balances by Category.
	 */
	public ArrayList<EligibilityResponseBenefitBalance> getBenefitBalance() { return benefitBalance; }

	/**
	 * Setter for benefitBalance
	 * @param value Benefits and optionally current balances by Category.
	 */
	public void setBenefitBalance(ArrayList<EligibilityResponseBenefitBalance> value) { benefitBalance = value; }


}
