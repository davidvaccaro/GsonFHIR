package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 */
public class CarePlanDetail extends BackboneElement {
	@Expose
	private CodeableConcept category;

	/**
	 * Getter for category
	 * @return High-level categorization of the type of activity in a care plan.
	 */
	public CodeableConcept getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value High-level categorization of the type of activity in a care plan.
	 */
	public void setCategory(CodeableConcept value) { category = value; }


	@Expose
	private Reference definition;

	/**
	 * Getter for definition
	 * @return Identifies the protocol, questionnaire, guideline or other specification the planned activity should be conducted in accordance with.
	 */
	public Reference getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value Identifies the protocol, questionnaire, guideline or other specification the planned activity should be conducted in accordance with.
	 */
	public void setDefinition(Reference value) { definition = value; }


	@Expose
	private CodeableConcept code;

	/**
	 * Getter for code
	 * @return Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter.
	 */
	public CodeableConcept getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter.
	 */
	public void setCode(CodeableConcept value) { code = value; }


	@Expose
	private ArrayList<CodeableConcept> reasonCode;

	/**
	 * Getter for reasonCode
	 * @return Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited.
	 */
	public ArrayList<CodeableConcept> getReasonCode() { return reasonCode; }

	/**
	 * Setter for reasonCode
	 * @param value Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited.
	 */
	public void setReasonCode(ArrayList<CodeableConcept> value) { reasonCode = value; }


	@Expose
	private ArrayList<Reference> reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.
	 */
	public ArrayList<Reference> getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.
	 */
	public void setReasonReference(ArrayList<Reference> value) { reasonReference = value; }


	@Expose
	private ArrayList<Reference> goal;

	/**
	 * Getter for goal
	 * @return Internal reference that identifies the goals that this activity is intended to contribute towards meeting.
	 */
	public ArrayList<Reference> getGoal() { return goal; }

	/**
	 * Setter for goal
	 * @param value Internal reference that identifies the goals that this activity is intended to contribute towards meeting.
	 */
	public void setGoal(ArrayList<Reference> value) { goal = value; }


	public enum Status{
		@SerializedName("not-started") NOT_STARTED,
		@SerializedName("scheduled") SCHEDULED,
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("on-hold") ON_HOLD,
		@SerializedName("completed") COMPLETED,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Identifies what progress is being made for the specific activity.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Identifies what progress is being made for the specific activity.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private String statusReason;

	/**
	 * Getter for statusReason
	 * @return Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.
	 */
	public String getStatusReason() { return statusReason; }

	/**
	 * Setter for statusReason
	 * @param value Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.
	 */
	public void setStatusReason(String value) { statusReason = value; }


	@Expose
	private boolean prohibited;

	/**
	 * Getter for prohibited
	 * @return If true, indicates that the described activity is one that must NOT be engaged in when following the plan.  If false, indicates that the described activity is one that should be engaged in when following the plan.
	 */
	public boolean getProhibited() { return prohibited; }

	/**
	 * Setter for prohibited
	 * @param value If true, indicates that the described activity is one that must NOT be engaged in when following the plan.  If false, indicates that the described activity is one that should be engaged in when following the plan.
	 */
	public void setProhibited(boolean value) { prohibited = value; }


	@Expose
	private Timing scheduledTiming;

	/**
	 * Getter for scheduledTiming
	 * @return The period, timing or frequency upon which the described activity is to occur.
	 */
	public Timing getScheduledTiming() { return scheduledTiming; }

	/**
	 * Setter for scheduledTiming
	 * @param value The period, timing or frequency upon which the described activity is to occur.
	 */
	public void setScheduledTiming(Timing value) { scheduledTiming = value; }


	@Expose
	private Period scheduledPeriod;

	/**
	 * Getter for scheduledPeriod
	 * @return The period, timing or frequency upon which the described activity is to occur.
	 */
	public Period getScheduledPeriod() { return scheduledPeriod; }

	/**
	 * Setter for scheduledPeriod
	 * @param value The period, timing or frequency upon which the described activity is to occur.
	 */
	public void setScheduledPeriod(Period value) { scheduledPeriod = value; }


	@Expose
	private String scheduledString;

	/**
	 * Getter for scheduledString
	 * @return The period, timing or frequency upon which the described activity is to occur.
	 */
	public String getScheduledString() { return scheduledString; }

	/**
	 * Setter for scheduledString
	 * @param value The period, timing or frequency upon which the described activity is to occur.
	 */
	public void setScheduledString(String value) { scheduledString = value; }


	@Expose
	private Reference location;

	/**
	 * Getter for location
	 * @return Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
	 */
	public Reference getLocation() { return location; }

	/**
	 * Setter for location
	 * @param value Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
	 */
	public void setLocation(Reference value) { location = value; }


	@Expose
	private ArrayList<Reference> performer;

	/**
	 * Getter for performer
	 * @return Identifies who's expected to be involved in the activity.
	 */
	public ArrayList<Reference> getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value Identifies who's expected to be involved in the activity.
	 */
	public void setPerformer(ArrayList<Reference> value) { performer = value; }


	@Expose
	private CodeableConcept productCodeableConcept;

	/**
	 * Getter for productCodeableConcept
	 * @return Identifies the food, drug or other product to be consumed or supplied in the activity.
	 */
	public CodeableConcept getProductCodeableConcept() { return productCodeableConcept; }

	/**
	 * Setter for productCodeableConcept
	 * @param value Identifies the food, drug or other product to be consumed or supplied in the activity.
	 */
	public void setProductCodeableConcept(CodeableConcept value) { productCodeableConcept = value; }


	@Expose
	private Reference productReference;

	/**
	 * Getter for productReference
	 * @return Identifies the food, drug or other product to be consumed or supplied in the activity.
	 */
	public Reference getProductReference() { return productReference; }

	/**
	 * Setter for productReference
	 * @param value Identifies the food, drug or other product to be consumed or supplied in the activity.
	 */
	public void setProductReference(Reference value) { productReference = value; }


	@Expose
	private Quantity dailyAmount;

	/**
	 * Getter for dailyAmount
	 * @return Identifies the quantity expected to be consumed in a given day.
	 */
	public Quantity getDailyAmount() { return dailyAmount; }

	/**
	 * Setter for dailyAmount
	 * @param value Identifies the quantity expected to be consumed in a given day.
	 */
	public void setDailyAmount(Quantity value) { dailyAmount = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return Identifies the quantity expected to be supplied, administered or consumed by the subject.
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value Identifies the quantity expected to be supplied, administered or consumed by the subject.
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
	 */
	public void setDescription(String value) { description = value; }


}
