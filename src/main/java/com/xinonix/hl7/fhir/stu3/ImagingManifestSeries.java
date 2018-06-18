package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection.
 */
public class ImagingManifestSeries extends BackboneElement {
	@Expose
	private String uid;

	/**
	 * Getter for uid
	 * @return Series instance UID of the SOP instances in the selection.
	 */
	public String getUid() { return uid; }

	/**
	 * Setter for uid
	 * @param value Series instance UID of the SOP instances in the selection.
	 */
	public void setUid(String value) { uid = value; }


	@Expose
	private ArrayList<Reference> endpoint;

	/**
	 * Getter for endpoint
	 * @return The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type.
	 */
	public ArrayList<Reference> getEndpoint() { return endpoint; }

	/**
	 * Setter for endpoint
	 * @param value The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type.
	 */
	public void setEndpoint(ArrayList<Reference> value) { endpoint = value; }


	@Expose
	private ArrayList<ImagingManifestInstance> instance;

	/**
	 * Getter for instance
	 * @return Identity and locating information of the selected DICOM SOP instances.
	 */
	public ArrayList<ImagingManifestInstance> getInstance() { return instance; }

	/**
	 * Setter for instance
	 * @param value Identity and locating information of the selected DICOM SOP instances.
	 */
	public void setInstance(ArrayList<ImagingManifestInstance> value) { instance = value; }


}
