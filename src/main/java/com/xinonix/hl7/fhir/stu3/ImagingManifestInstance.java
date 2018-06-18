package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection.
 */
public class ImagingManifestInstance extends BackboneElement {
	@Expose
	private String sopClass;

	/**
	 * Getter for sopClass
	 * @return SOP class UID of the selected instance.
	 */
	public String getSopClass() { return sopClass; }

	/**
	 * Setter for sopClass
	 * @param value SOP class UID of the selected instance.
	 */
	public void setSopClass(String value) { sopClass = value; }


	@Expose
	private String uid;

	/**
	 * Getter for uid
	 * @return SOP Instance UID of the selected instance.
	 */
	public String getUid() { return uid; }

	/**
	 * Setter for uid
	 * @param value SOP Instance UID of the selected instance.
	 */
	public void setUid(String value) { uid = value; }


}
