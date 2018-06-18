package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 */
public class DeviceComponent extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a DeviceComponent resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a DeviceComponent resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return The locally assigned unique identification by the software. For example: handle ID.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value The locally assigned unique identification by the software. For example: handle ID.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private CodeableConcept type;

	/**
	 * Getter for type
	 * @return The component type as defined in the object-oriented or metric nomenclature partition.
	 */
	public CodeableConcept getType() { return type; }

	/**
	 * Setter for type
	 * @param value The component type as defined in the object-oriented or metric nomenclature partition.
	 */
	public void setType(CodeableConcept value) { type = value; }


	@Expose
	private String lastSystemChange;

	/**
	 * Getter for lastSystemChange
	 * @return The timestamp for the most recent system change which includes device configuration or setting change.
	 */
	public String getLastSystemChange() { return lastSystemChange; }

	/**
	 * Setter for lastSystemChange
	 * @param value The timestamp for the most recent system change which includes device configuration or setting change.
	 */
	public void setLastSystemChange(String value) { lastSystemChange = value; }


	@Expose
	private Reference source;

	/**
	 * Getter for source
	 * @return The link to the source Device that contains administrative device information such as manufacture, serial number, etc.
	 */
	public Reference getSource() { return source; }

	/**
	 * Setter for source
	 * @param value The link to the source Device that contains administrative device information such as manufacture, serial number, etc.
	 */
	public void setSource(Reference value) { source = value; }


	@Expose
	private Reference parent;

	/**
	 * Getter for parent
	 * @return The link to the parent resource. For example: Channel is linked to its VMD parent.
	 */
	public Reference getParent() { return parent; }

	/**
	 * Setter for parent
	 * @param value The link to the parent resource. For example: Channel is linked to its VMD parent.
	 */
	public void setParent(Reference value) { parent = value; }


	@Expose
	private ArrayList<CodeableConcept> operationalStatus;

	/**
	 * Getter for operationalStatus
	 * @return The current operational status of the device. For example: On, Off, Standby, etc.
	 */
	public ArrayList<CodeableConcept> getOperationalStatus() { return operationalStatus; }

	/**
	 * Setter for operationalStatus
	 * @param value The current operational status of the device. For example: On, Off, Standby, etc.
	 */
	public void setOperationalStatus(ArrayList<CodeableConcept> value) { operationalStatus = value; }


	@Expose
	private CodeableConcept parameterGroup;

	/**
	 * Getter for parameterGroup
	 * @return The parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular.
	 */
	public CodeableConcept getParameterGroup() { return parameterGroup; }

	/**
	 * Setter for parameterGroup
	 * @param value The parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular.
	 */
	public void setParameterGroup(CodeableConcept value) { parameterGroup = value; }


	public enum MeasurementPrinciple{
		@SerializedName("other") OTHER,
		@SerializedName("chemical") CHEMICAL,
		@SerializedName("electrical") ELECTRICAL,
		@SerializedName("impedance") IMPEDANCE,
		@SerializedName("nuclear") NUCLEAR,
		@SerializedName("optical") OPTICAL,
		@SerializedName("thermal") THERMAL,
		@SerializedName("biological") BIOLOGICAL,
		@SerializedName("mechanical") MECHANICAL,
		@SerializedName("acoustical") ACOUSTICAL,
		@SerializedName("manual") MANUAL
	}

	@Expose
	private MeasurementPrinciple measurementPrinciple;

	/**
	 * Getter for measurementPrinciple
	 * @return The physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
	 */
	public MeasurementPrinciple getMeasurementPrinciple() { return measurementPrinciple; }

	/**
	 * Setter for measurementPrinciple
	 * @param value The physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
	 */
	public void setMeasurementPrinciple(MeasurementPrinciple value) { measurementPrinciple = value; }


	@Expose
	private ArrayList<DeviceComponentProductionSpecification> productionSpecification;

	/**
	 * Getter for productionSpecification
	 * @return The production specification such as component revision, serial number, etc.
	 */
	public ArrayList<DeviceComponentProductionSpecification> getProductionSpecification() { return productionSpecification; }

	/**
	 * Setter for productionSpecification
	 * @param value The production specification such as component revision, serial number, etc.
	 */
	public void setProductionSpecification(ArrayList<DeviceComponentProductionSpecification> value) { productionSpecification = value; }


	@Expose
	private CodeableConcept languageCode;

	/**
	 * Getter for languageCode
	 * @return The language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US.
	 */
	public CodeableConcept getLanguageCode() { return languageCode; }

	/**
	 * Setter for languageCode
	 * @param value The language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US.
	 */
	public void setLanguageCode(CodeableConcept value) { languageCode = value; }


}
