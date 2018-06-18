package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.
 */
public class ProcedureFocalDevice extends BackboneElement {
	@Expose
	private CodeableConcept action;

	/**
	 * Getter for action
	 * @return The kind of change that happened to the device during the procedure.
	 */
	public CodeableConcept getAction() { return action; }

	/**
	 * Setter for action
	 * @param value The kind of change that happened to the device during the procedure.
	 */
	public void setAction(CodeableConcept value) { action = value; }


	@Expose
	private Reference manipulated;

	/**
	 * Getter for manipulated
	 * @return The device that was manipulated (changed) during the procedure.
	 */
	public Reference getManipulated() { return manipulated; }

	/**
	 * Setter for manipulated
	 * @param value The device that was manipulated (changed) during the procedure.
	 */
	public void setManipulated(Reference value) { manipulated = value; }


}
