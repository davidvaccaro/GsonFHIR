package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
 */
public class MedicationAdministrationPerformer extends BackboneElement {
	@Expose
	private Reference actor;

	/**
	 * Getter for actor
	 * @return The device, practitioner, etc. who performed the action.
	 */
	public Reference getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value The device, practitioner, etc. who performed the action.
	 */
	public void setActor(Reference value) { actor = value; }


	@Expose
	private Reference onBehalfOf;

	/**
	 * Getter for onBehalfOf
	 * @return The organization the device or practitioner was acting on behalf of.
	 */
	public Reference getOnBehalfOf() { return onBehalfOf; }

	/**
	 * Setter for onBehalfOf
	 * @param value The organization the device or practitioner was acting on behalf of.
	 */
	public void setOnBehalfOf(Reference value) { onBehalfOf = value; }


}
