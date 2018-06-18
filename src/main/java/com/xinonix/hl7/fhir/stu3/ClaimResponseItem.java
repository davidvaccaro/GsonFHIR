package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * This resource provides the adjudication details from the processing of a Claim resource.
 */
public class ClaimResponseItem extends BackboneElement {
	@Expose
	private Integer sequenceLinkId;

	/**
	 * Getter for sequenceLinkId
	 * @return A service line number.
	 */
	public Integer getSequenceLinkId() { return sequenceLinkId; }

	/**
	 * Setter for sequenceLinkId
	 * @param value A service line number.
	 */
	public void setSequenceLinkId(Integer value) { sequenceLinkId = value; }


	@Expose
	private ArrayList<Integer> noteNumber;

	/**
	 * Getter for noteNumber
	 * @return A list of note references to the notes provided below.
	 */
	public ArrayList<Integer> getNoteNumber() { return noteNumber; }

	/**
	 * Setter for noteNumber
	 * @param value A list of note references to the notes provided below.
	 */
	public void setNoteNumber(ArrayList<Integer> value) { noteNumber = value; }


	@Expose
	private ArrayList<ClaimResponseAdjudication> adjudication;

	/**
	 * Getter for adjudication
	 * @return The adjudication results.
	 */
	public ArrayList<ClaimResponseAdjudication> getAdjudication() { return adjudication; }

	/**
	 * Setter for adjudication
	 * @param value The adjudication results.
	 */
	public void setAdjudication(ArrayList<ClaimResponseAdjudication> value) { adjudication = value; }


	@Expose
	private ArrayList<ClaimResponseDetail> detail;

	/**
	 * Getter for detail
	 * @return The second tier service adjudications for submitted services.
	 */
	public ArrayList<ClaimResponseDetail> getDetail() { return detail; }

	/**
	 * Setter for detail
	 * @param value The second tier service adjudications for submitted services.
	 */
	public void setDetail(ArrayList<ClaimResponseDetail> value) { detail = value; }


}
