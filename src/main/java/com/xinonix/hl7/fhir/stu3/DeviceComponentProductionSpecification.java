package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 */
public class DeviceComponentProductionSpecification extends BackboneElement {
	@Expose
	private CodeableConcept specType;

	/**
	 * Getter for specType
	 * @return The specification type, such as, serial number, part number, hardware revision, software revision, etc.
	 */
	public CodeableConcept getSpecType() { return specType; }

	/**
	 * Setter for specType
	 * @param value The specification type, such as, serial number, part number, hardware revision, software revision, etc.
	 */
	public void setSpecType(CodeableConcept value) { specType = value; }


	@Expose
	private Identifier componentId;

	/**
	 * Getter for componentId
	 * @return The internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacturer can make use of.
	 */
	public Identifier getComponentId() { return componentId; }

	/**
	 * Setter for componentId
	 * @param value The internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacturer can make use of.
	 */
	public void setComponentId(Identifier value) { componentId = value; }


	@Expose
	private String productionSpec;

	/**
	 * Getter for productionSpec
	 * @return The printable string defining the component.
	 */
	public String getProductionSpec() { return productionSpec; }

	/**
	 * Setter for productionSpec
	 * @param value The printable string defining the component.
	 */
	public void setProductionSpec(String value) { productionSpec = value; }


}
