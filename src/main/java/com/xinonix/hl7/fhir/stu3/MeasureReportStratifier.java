package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * The MeasureReport resource contains the results of evaluating a measure.
 */
public class MeasureReportStratifier extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return The identifier of this stratifier, as defined in the measure definition.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The identifier of this stratifier, as defined in the measure definition.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private ArrayList<MeasureReportStratum> stratum;

	/**
	 * Getter for stratum
	 * @return This element contains the results for a single stratum within the stratifier. For example, when stratifying on administrative gender, there will be four strata, one for each possible gender value.
	 */
	public ArrayList<MeasureReportStratum> getStratum() { return stratum; }

	/**
	 * Setter for stratum
	 * @param value This element contains the results for a single stratum within the stratifier. For example, when stratifying on administrative gender, there will be four strata, one for each possible gender value.
	 */
	public void setStratum(ArrayList<MeasureReportStratum> value) { stratum = value; }


}
