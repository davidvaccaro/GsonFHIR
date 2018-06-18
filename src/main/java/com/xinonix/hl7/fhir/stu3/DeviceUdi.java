package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc.
 */
public class DeviceUdi extends BackboneElement {
	@Expose
	private String deviceIdentifier;

	/**
	 * Getter for deviceIdentifier
	 * @return The device identifier (DI) is a mandatory, fixed portion of a UDI that identifies the labeler and the specific version or model of a device.
	 */
	public String getDeviceIdentifier() { return deviceIdentifier; }

	/**
	 * Setter for deviceIdentifier
	 * @param value The device identifier (DI) is a mandatory, fixed portion of a UDI that identifies the labeler and the specific version or model of a device.
	 */
	public void setDeviceIdentifier(String value) { deviceIdentifier = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return Name of device as used in labeling or catalog.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value Name of device as used in labeling or catalog.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String jurisdiction;

	/**
	 * Getter for jurisdiction
	 * @return The identity of the authoritative source for UDI generation within a  jurisdiction.  All UDIs are globally unique within a single namespace. with the appropriate repository uri as the system.  For example,  UDIs of devices managed in the U.S. by the FDA, the value is  http://hl7.org/fhir/NamingSystem/fda-udi.
	 */
	public String getJurisdiction() { return jurisdiction; }

	/**
	 * Setter for jurisdiction
	 * @param value The identity of the authoritative source for UDI generation within a  jurisdiction.  All UDIs are globally unique within a single namespace. with the appropriate repository uri as the system.  For example,  UDIs of devices managed in the U.S. by the FDA, the value is  http://hl7.org/fhir/NamingSystem/fda-udi.
	 */
	public void setJurisdiction(String value) { jurisdiction = value; }


	@Expose
	private String carrierHRF;

	/**
	 * Getter for carrierHRF
	 * @return The full UDI carrier as the human readable form (HRF) representation of the barcode string as printed on the packaging of the device.
	 */
	public String getCarrierHRF() { return carrierHRF; }

	/**
	 * Setter for carrierHRF
	 * @param value The full UDI carrier as the human readable form (HRF) representation of the barcode string as printed on the packaging of the device.
	 */
	public void setCarrierHRF(String value) { carrierHRF = value; }


	@Expose
	private String carrierAIDC;

	/**
	 * Getter for carrierAIDC
	 * @return The full UDI carrier of the Automatic Identification and Data Capture (AIDC) technology representation of the barcode string as printed on the packaging of the device - E.g a barcode or RFID.   Because of limitations on character sets in XML and the need to round-trip JSON data through XML, AIDC Formats *SHALL* be base64 encoded.
	 */
	public String getCarrierAIDC() { return carrierAIDC; }

	/**
	 * Setter for carrierAIDC
	 * @param value The full UDI carrier of the Automatic Identification and Data Capture (AIDC) technology representation of the barcode string as printed on the packaging of the device - E.g a barcode or RFID.   Because of limitations on character sets in XML and the need to round-trip JSON data through XML, AIDC Formats *SHALL* be base64 encoded.
	 */
	public void setCarrierAIDC(String value) { carrierAIDC = value; }


	@Expose
	private String issuer;

	/**
	 * Getter for issuer
	 * @return Organization that is charged with issuing UDIs for devices.  For example, the US FDA issuers include :
1) GS1: 
http://hl7.org/fhir/NamingSystem/gs1-di, 
2) HIBCC:
http://hl7.org/fhir/NamingSystem/hibcc-dI, 
3) ICCBBA for blood containers:
http://hl7.org/fhir/NamingSystem/iccbba-blood-di, 
4) ICCBA for other devices:
http://hl7.org/fhir/NamingSystem/iccbba-other-di.
	 */
	public String getIssuer() { return issuer; }

	/**
	 * Setter for issuer
	 * @param value Organization that is charged with issuing UDIs for devices.  For example, the US FDA issuers include :
1) GS1: 
http://hl7.org/fhir/NamingSystem/gs1-di, 
2) HIBCC:
http://hl7.org/fhir/NamingSystem/hibcc-dI, 
3) ICCBBA for blood containers:
http://hl7.org/fhir/NamingSystem/iccbba-blood-di, 
4) ICCBA for other devices:
http://hl7.org/fhir/NamingSystem/iccbba-other-di.
	 */
	public void setIssuer(String value) { issuer = value; }


	public enum EntryType{
		@SerializedName("barcode") BARCODE,
		@SerializedName("rfid") RFID,
		@SerializedName("manual") MANUAL,
		@SerializedName("card") CARD,
		@SerializedName("self-reported") SELF_REPORTED,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private EntryType entryType;

	/**
	 * Getter for entryType
	 * @return A coded entry to indicate how the data was entered.
	 */
	public EntryType getEntryType() { return entryType; }

	/**
	 * Setter for entryType
	 * @param value A coded entry to indicate how the data was entered.
	 */
	public void setEntryType(EntryType value) { entryType = value; }


}
