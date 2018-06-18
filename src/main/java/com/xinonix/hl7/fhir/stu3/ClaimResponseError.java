package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * This resource provides the adjudication details from the processing of a Claim resource.
 */
public class ClaimResponseError extends BackboneElement {
	@Expose
	private Integer sequenceLinkId;

	/**
	 * Getter for sequenceLinkId
	 * @return The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.
	 */
	public Integer getSequenceLinkId() { return sequenceLinkId; }

	/**
	 * Setter for sequenceLinkId
	 * @param value The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere.
	 */
	public void setSequenceLinkId(Integer value) { sequenceLinkId = value; }


	@Expose
	private Integer detailSequenceLinkId;

	/**
	 * Getter for detailSequenceLinkId
	 * @return The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
	 */
	public Integer getDetailSequenceLinkId() { return detailSequenceLinkId; }

	/**
	 * Setter for detailSequenceLinkId
	 * @param value The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
	 */
	public void setDetailSequenceLinkId(Integer value) { detailSequenceLinkId = value; }


	@Expose
	private Integer subdetailSequenceLinkId;

	/**
	 * Getter for subdetailSequenceLinkId
	 * @return The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
	 */
	public Integer getSubdetailSequenceLinkId() { return subdetailSequenceLinkId; }

	/**
	 * Setter for subdetailSequenceLinkId
	 * @param value The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition.
	 */
	public void setSubdetailSequenceLinkId(Integer value) { subdetailSequenceLinkId = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return An error code,from a specified code system, which details why the claim could not be adjudicated.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value An error code,from a specified code system, which details why the claim could not be adjudicated.
	 */
	public void setCode(CodeableConcept value) { code = value; }


}
