package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 */
public class ExpansionProfileExclude extends BackboneElement {
	@Expose
	private ArrayList<ExpansionProfileDesignation2> designation;

	/**
	 * Getter for designation
	 * @return A data group for each designation to be excluded.
	 */
	public ArrayList<ExpansionProfileDesignation2> getDesignation() { return designation; }

	/**
	 * Setter for designation
	 * @param value A data group for each designation to be excluded.
	 */
	public void setDesignation(ArrayList<ExpansionProfileDesignation2> value) { designation = value; }


}
