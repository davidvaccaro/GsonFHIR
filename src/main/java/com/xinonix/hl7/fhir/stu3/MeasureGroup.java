package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * The Measure resource provides the definition of a quality measure.
 */
public class MeasureGroup extends BackboneElement {
	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return A unique identifier for the group. This identifier will used to report data for the group in the measure report.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A unique identifier for the group. This identifier will used to report data for the group in the measure report.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Optional name or short description of this group.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Optional name or short description of this group.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return The human readable description of this population group.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value The human readable description of this population group.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private ArrayList<MeasurePopulation> population;

	/**
	 * Getter for population
	 * @return A population criteria for the measure.
	 */
	public ArrayList<MeasurePopulation> getPopulation() { return population; }

	/**
	 * Setter for population
	 * @param value A population criteria for the measure.
	 */
	public void setPopulation(ArrayList<MeasurePopulation> value) { population = value; }


	@Expose
	private ArrayList<MeasureStratifier> stratifier;

	/**
	 * Getter for stratifier
	 * @return The stratifier criteria for the measure report, specified as either the name of a valid CQL expression defined within a referenced library, or a valid FHIR Resource Path.
	 */
	public ArrayList<MeasureStratifier> getStratifier() { return stratifier; }

	/**
	 * Setter for stratifier
	 * @param value The stratifier criteria for the measure report, specified as either the name of a valid CQL expression defined within a referenced library, or a valid FHIR Resource Path.
	 */
	public void setStratifier(ArrayList<MeasureStratifier> value) { stratifier = value; }


}
