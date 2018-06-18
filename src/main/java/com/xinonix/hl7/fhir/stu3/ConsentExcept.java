package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 */
public class ConsentExcept extends BackboneElement {
	public enum Type{
		@SerializedName("deny") DENY,
		@SerializedName("permit") PERMIT
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Action  to take - permit or deny - when the exception conditions are met.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Action  to take - permit or deny - when the exception conditions are met.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The timeframe in this exception is valid.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The timeframe in this exception is valid.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private ArrayList<ConsentActor1> actor;

	/**
	 * Getter for actor
	 * @return Who or what is controlled by this Exception. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
	 */
	public ArrayList<ConsentActor1> getActor() { return actor; }

	/**
	 * Setter for actor
	 * @param value Who or what is controlled by this Exception. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
	 */
	public void setActor(ArrayList<ConsentActor1> value) { actor = value; }


	@Expose
	private ArrayList<CodeableConcept> action;

	/**
	 * Getter for action
	 * @return Actions controlled by this Exception.
	 */
	public ArrayList<CodeableConcept> getAction() { return action; }

	/**
	 * Setter for action
	 * @param value Actions controlled by this Exception.
	 */
	public void setAction(ArrayList<CodeableConcept> value) { action = value; }


	@Expose
	private ArrayList<Coding> securityLabel;

	/**
	 * Getter for securityLabel
	 * @return A set of security labels that define which resources are controlled by this exception. If more than one label is specified, all resources must have all the specified labels.
	 */
	public ArrayList<Coding> getSecurityLabel() { return securityLabel; }

	/**
	 * Setter for securityLabel
	 * @param value A set of security labels that define which resources are controlled by this exception. If more than one label is specified, all resources must have all the specified labels.
	 */
	public void setSecurityLabel(ArrayList<Coding> value) { securityLabel = value; }


	@Expose
	private ArrayList<Coding> purpose;

	/**
	 * Getter for purpose
	 * @return The context of the activities a user is taking - why the user is accessing the data - that are controlled by this exception.
	 */
	public ArrayList<Coding> getPurpose() { return purpose; }

	/**
	 * Setter for purpose
	 * @param value The context of the activities a user is taking - why the user is accessing the data - that are controlled by this exception.
	 */
	public void setPurpose(ArrayList<Coding> value) { purpose = value; }


	@Expose
	@SerializedName("class")
	private ArrayList<Coding> classCode;

	/**
	 * Getter for classCode
	 * @return The class of information covered by this exception. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to.
	 */
	public ArrayList<Coding> getClassCode() { return classCode; }

	/**
	 * Setter for classCode
	 * @param value The class of information covered by this exception. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to.
	 */
	public void setClassCode(ArrayList<Coding> value) { classCode = value; }


	@Expose
	private ArrayList<Coding> code;

	/**
	 * Getter for code
	 * @return If this code is found in an instance, then the exception applies.
	 */
	public ArrayList<Coding> getCode() { return code; }

	/**
	 * Setter for code
	 * @param value If this code is found in an instance, then the exception applies.
	 */
	public void setCode(ArrayList<Coding> value) { code = value; }


	@Expose
	private Period dataPeriod;

	/**
	 * Getter for dataPeriod
	 * @return Clinical or Operational Relevant period of time that bounds the data controlled by this exception.
	 */
	public Period getDataPeriod() { return dataPeriod; }

	/**
	 * Setter for dataPeriod
	 * @param value Clinical or Operational Relevant period of time that bounds the data controlled by this exception.
	 */
	public void setDataPeriod(Period value) { dataPeriod = value; }


	@Expose
	private ArrayList<ConsentData1> data;

	/**
	 * Getter for data
	 * @return The resources controlled by this exception, if specific resources are referenced.
	 */
	public ArrayList<ConsentData1> getData() { return data; }

	/**
	 * Setter for data
	 * @param value The resources controlled by this exception, if specific resources are referenced.
	 */
	public void setData(ArrayList<ConsentData1> value) { data = value; }


}
