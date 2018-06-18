package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A container for a collection of resources.
 */
public class BundleSearch extends BackboneElement {
	public enum Mode{
		@SerializedName("match") MATCH,
		@SerializedName("include") INCLUDE,
		@SerializedName("outcome") OUTCOME
	}

	@Expose
	private Mode mode;

	/**
	 * Getter for mode
	 * @return Why this entry is in the result set - whether it's included as a match or because of an _include requirement.
	 */
	public Mode getMode() { return mode; }

	/**
	 * Setter for mode
	 * @param value Why this entry is in the result set - whether it's included as a match or because of an _include requirement.
	 */
	public void setMode(Mode value) { mode = value; }


	@Expose
	private Double score;

	/**
	 * Getter for score
	 * @return When searching, the server's search ranking score for the entry.
	 */
	public Double getScore() { return score; }

	/**
	 * Setter for score
	 * @param value When searching, the server's search ranking score for the entry.
	 */
	public void setScore(Double value) { score = value; }


}
