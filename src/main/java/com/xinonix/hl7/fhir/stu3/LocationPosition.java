package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
 */
public class LocationPosition extends BackboneElement {
	@Expose
	private Double longitude;

	/**
	 * Getter for longitude
	 * @return Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).
	 */
	public Double getLongitude() { return longitude; }

	/**
	 * Setter for longitude
	 * @param value Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).
	 */
	public void setLongitude(Double value) { longitude = value; }


	@Expose
	private Double latitude;

	/**
	 * Getter for latitude
	 * @return Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).
	 */
	public Double getLatitude() { return latitude; }

	/**
	 * Setter for latitude
	 * @param value Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).
	 */
	public void setLatitude(Double value) { latitude = value; }


	@Expose
	private Double altitude;

	/**
	 * Getter for altitude
	 * @return Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).
	 */
	public Double getAltitude() { return altitude; }

	/**
	 * Setter for altitude
	 * @param value Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).
	 */
	public void setAltitude(Double value) { altitude = value; }


}
