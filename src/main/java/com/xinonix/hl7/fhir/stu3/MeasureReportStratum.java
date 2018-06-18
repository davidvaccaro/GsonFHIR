package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * The MeasureReport resource contains the results of evaluating a measure.
 */
public class MeasureReportStratum extends BackboneElement {
	@Expose
	private String value;

	/**
	 * Getter for value
	 * @return The value for this stratum, expressed as a string. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
	 */
	public String getValue() { return value; }

	/**
	 * Setter for value
	 * @param value The value for this stratum, expressed as a string. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.
	 */
	public void setValue(String value) { value = value; }


	@Expose
	private ArrayList<MeasureReportPopulation1> population;

	/**
	 * Getter for population
	 * @return The populations that make up the stratum, one for each type of population appropriate to the measure.
	 */
	public ArrayList<MeasureReportPopulation1> getPopulation() { return population; }

	/**
	 * Setter for population
	 * @param value The populations that make up the stratum, one for each type of population appropriate to the measure.
	 */
	public void setPopulation(ArrayList<MeasureReportPopulation1> value) { population = value; }


	@Expose
	private Double measureScore;

	/**
	 * Getter for measureScore
	 * @return The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
	 */
	public Double getMeasureScore() { return measureScore; }

	/**
	 * Setter for measureScore
	 * @param value The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.
	 */
	public void setMeasureScore(Double value) { measureScore = value; }


}
