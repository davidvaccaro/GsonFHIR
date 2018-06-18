package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 */
public class ImagingStudyInstance extends BackboneElement {
	@Expose
	private String uid;

	/**
	 * Getter for uid
	 * @return Formal identifier for this image or other content.
	 */
	public String getUid() { return uid; }

	/**
	 * Setter for uid
	 * @param value Formal identifier for this image or other content.
	 */
	public void setUid(String value) { uid = value; }


	@Expose
	private Integer number;

	/**
	 * Getter for number
	 * @return The number of instance in the series.
	 */
	public Integer getNumber() { return number; }

	/**
	 * Setter for number
	 * @param value The number of instance in the series.
	 */
	public void setNumber(Integer value) { number = value; }


	@Expose
	private String sopClass;

	/**
	 * Getter for sopClass
	 * @return DICOM instance  type.
	 */
	public String getSopClass() { return sopClass; }

	/**
	 * Setter for sopClass
	 * @param value DICOM instance  type.
	 */
	public void setSopClass(String value) { sopClass = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return The description of the instance.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value The description of the instance.
	 */
	public void setTitle(String value) { title = value; }


}
