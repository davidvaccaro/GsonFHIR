package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection.
 */
public class ImagingManifestStudy extends BackboneElement {
	@Expose
	private String uid;

	/**
	 * Getter for uid
	 * @return Study instance UID of the SOP instances in the selection.
	 */
	public String getUid() { return uid; }

	/**
	 * Setter for uid
	 * @param value Study instance UID of the SOP instances in the selection.
	 */
	public void setUid(String value) { uid = value; }


	@Expose
	private Reference imagingStudy;

	/**
	 * Getter for imagingStudy
	 * @return Reference to the Imaging Study in FHIR form.
	 */
	public Reference getImagingStudy() { return imagingStudy; }

	/**
	 * Setter for imagingStudy
	 * @param value Reference to the Imaging Study in FHIR form.
	 */
	public void setImagingStudy(Reference value) { imagingStudy = value; }


	@Expose
	private ArrayList<Reference> endpoint;

	/**
	 * Getter for endpoint
	 * @return The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type.
	 */
	public ArrayList<Reference> getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type.
	 */
	public void setEndpoint(ArrayList<Reference> value) { endpoint = value; }


	@Expose
	private ArrayList<ImagingManifestSeries> series;

	/**
	 * Getter for series
	 * @return Series identity and locating information of the DICOM SOP instances in the selection.
	 */
	public ArrayList<ImagingManifestSeries> getSeries() { return series; }

	/**
	 * Setter for series
	 * @param value Series identity and locating information of the DICOM SOP instances in the selection.
	 */
	public void setSeries(ArrayList<ImagingManifestSeries> value) { series = value; }


}
