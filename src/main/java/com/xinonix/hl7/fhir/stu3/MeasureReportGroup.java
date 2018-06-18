package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * The MeasureReport resource contains the results of evaluating a measure.
 */
public class MeasureReportGroup extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return The identifier of the population group as defined in the measure definition.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The identifier of the population group as defined in the measure definition.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private ArrayList<MeasureReportPopulation> population;

	/**
	 * Getter for population
	 * @return The populations that make up the population group, one for each type of population appropriate for the measure.
	 */
	public ArrayList<MeasureReportPopulation> getPopulation() { return population; }

	/**
	 * Setter for population
	 * @param value The populations that make up the population group, one for each type of population appropriate for the measure.
	 */
	public void setPopulation(ArrayList<MeasureReportPopulation> value) { population = value; }


	@Expose
	private Double measureScore;

	/**
	 * Getter for measureScore
	 * @return The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group.
	 */
	public Double getMeasureScore() { return measureScore; }

	/**
	 * Setter for measureScore
	 * @param value The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group.
	 */
	public void setMeasureScore(Double value) { measureScore = value; }


	@Expose
	private ArrayList<MeasureReportStratifier> stratifier;

	/**
	 * Getter for stratifier
	 * @return When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure.
	 */
	public ArrayList<MeasureReportStratifier> getStratifier() { return stratifier; }

	/**
	 * Setter for stratifier
	 * @param value When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure.
	 */
	public void setStratifier(ArrayList<MeasureReportStratifier> value) { stratifier = value; }


}
