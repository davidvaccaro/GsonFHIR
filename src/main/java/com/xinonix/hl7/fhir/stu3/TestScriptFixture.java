package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 */
public class TestScriptFixture extends BackboneElement {
	@Expose
	private boolean autocreate;

	/**
	 * Getter for autocreate
	 * @return Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
	 */
	public boolean getAutocreate() { return autocreate; }

	/**
	 * Setter for autocreate
	 * @param value Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
	 */
	public void setAutocreate(boolean value) { autocreate = value; }


	@Expose
	private boolean autodelete;

	/**
	 * Getter for autodelete
	 * @return Whether or not to implicitly delete the fixture during teardown. If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
	 */
	public boolean getAutodelete() { return autodelete; }

	/**
	 * Setter for autodelete
	 * @param value Whether or not to implicitly delete the fixture during teardown. If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
	 */
	public void setAutodelete(boolean value) { autodelete = value; }


	@Expose
	private Reference resource;

	/**
	 * Getter for resource
	 * @return Reference to the resource (containing the contents of the resource needed for operations).
	 */
	public Reference getResource() { return resource; }

	/**
	 * Setter for resource
	 * @param value Reference to the resource (containing the contents of the resource needed for operations).
	 */
	public void setResource(Reference value) { resource = value; }


}
