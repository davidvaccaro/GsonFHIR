package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * This resource provides the adjudication details from the processing of a Claim resource.
 */
public class ClaimResponseDetail extends BackboneElement {
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
	 * @return The adjudications results.
	 */
	public ArrayList<ClaimResponseAdjudication> getAdjudication() { return adjudication; }

	/**
	 * Setter for adjudication
	 * @param value The adjudications results.
	 */
	public void setAdjudication(ArrayList<ClaimResponseAdjudication> value) { adjudication = value; }


	@Expose
	private ArrayList<ClaimResponseSubDetail> subDetail;

	/**
	 * Getter for subDetail
	 * @return The third tier service adjudications for submitted services.
	 */
	public ArrayList<ClaimResponseSubDetail> getSubDetail() { return subDetail; }

	/**
	 * Setter for subDetail
	 * @param value The third tier service adjudications for submitted services.
	 */
	public void setSubDetail(ArrayList<ClaimResponseSubDetail> value) { subDetail = value; }


}
