package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 */
public class ExpansionProfileInclude extends BackboneElement {
	@Expose
	private ArrayList<ExpansionProfileDesignation1> designation;

	/**
	 * Getter for designation
	 * @return A data group for each designation to be included.
	 */
	public ArrayList<ExpansionProfileDesignation1> getDesignation() { return designation; }

	/**
	 * Setter for designation
	 * @param value A data group for each designation to be included.
	 */
	public void setDesignation(ArrayList<ExpansionProfileDesignation1> value) { designation = value; }


}
