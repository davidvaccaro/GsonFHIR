package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 */
public class CarePlan extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a CarePlan resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a CarePlan resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	@Expose
	private ArrayList<Reference> definition;

	/**
	 * Getter for definition
	 * @return Identifies the protocol, questionnaire, guideline or other specification the care plan should be conducted in accordance with.
	 */
	public ArrayList<Reference> getDefinition() { return definition; }

	/**
	 * Setter for definition
	 * @param value Identifies the protocol, questionnaire, guideline or other specification the care plan should be conducted in accordance with.
	 */
	public void setDefinition(ArrayList<Reference> value) { definition = value; }


	@Expose
	private ArrayList<Reference> basedOn;

	/**
	 * Getter for basedOn
	 * @return A care plan that is fulfilled in whole or in part by this care plan.
	 */
	public ArrayList<Reference> getBasedOn() { return basedOn; }

	/**
	 * Setter for basedOn
	 * @param value A care plan that is fulfilled in whole or in part by this care plan.
	 */
	public void setBasedOn(ArrayList<Reference> value) { basedOn = value; }


	@Expose
	private ArrayList<Reference> replaces;

	/**
	 * Getter for replaces
	 * @return Completed or terminated care plan whose function is taken by this new care plan.
	 */
	public ArrayList<Reference> getReplaces() { return replaces; }

	/**
	 * Setter for replaces
	 * @param value Completed or terminated care plan whose function is taken by this new care plan.
	 */
	public void setReplaces(ArrayList<Reference> value) { replaces = value; }


	@Expose
	private ArrayList<Reference> partOf;

	/**
	 * Getter for partOf
	 * @return A larger care plan of which this particular care plan is a component or step.
	 */
	public ArrayList<Reference> getPartOf() { return partOf; }

	/**
	 * Setter for partOf
	 * @param value A larger care plan of which this particular care plan is a component or step.
	 */
	public void setPartOf(ArrayList<Reference> value) { partOf = value; }


	public enum Status{
		@SerializedName("draft") DRAFT,
		@SerializedName("active") ACTIVE,
		@SerializedName("suspended") SUSPENDED,
		@SerializedName("completed") COMPLETED,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR,
		@SerializedName("cancelled") CANCELLED,
		@SerializedName("unknown") UNKNOWN
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
	 */
	public void setStatus(Status value) { status = value; }


	public enum Intent{
		@SerializedName("proposal") PROPOSAL,
		@SerializedName("plan") PLAN,
		@SerializedName("order") ORDER,
		@SerializedName("option") OPTION
	}

	@Expose
	private Intent intent;

	/**
	 * Getter for intent
	 * @return Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the workflow chain.
	 */
	public Intent getIntent() { return intent; }

	/**
	 * Setter for intent
	 * @param value Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the workflow chain.
	 */
	public void setIntent(Intent value) { intent = value; }


	@Expose
	private ArrayList<CodeableConcept> category;

	/**
	 * Getter for category
	 * @return Identifies what "kind" of plan this is to support differentiation between multiple co-existing plans; e.g. "Home health", "psychiatric", "asthma", "disease management", "wellness plan", etc.
	 */
	public ArrayList<CodeableConcept> getCategory() { return category; }

	/**
	 * Setter for category
	 * @param value Identifies what "kind" of plan this is to support differentiation between multiple co-existing plans; e.g. "Home health", "psychiatric", "asthma", "disease management", "wellness plan", etc.
	 */
	public void setCategory(ArrayList<CodeableConcept> value) { category = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return Human-friendly name for the CarePlan.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value Human-friendly name for the CarePlan.
	 */
	public void setTitle(String value) { title = value; }


	@Expose
	private String description;

	/**
	 * Getter for description
	 * @return A description of the scope and nature of the plan.
	 */
	public String getDescription() { return description; }

	/**
	 * Setter for description
	 * @param value A description of the scope and nature of the plan.
	 */
	public void setDescription(String value) { description = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return Identifies the patient or group whose intended care is described by the plan.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value Identifies the patient or group whose intended care is described by the plan.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return Identifies the original context in which this particular CarePlan was created.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value Identifies the original context in which this particular CarePlan was created.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return Indicates when the plan did (or is intended to) come into effect and end.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value Indicates when the plan did (or is intended to) come into effect and end.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private ArrayList<Reference> author;

	/**
	 * Getter for author
	 * @return Identifies the individual(s) or ogranization who is responsible for the content of the care plan.
	 */
	public ArrayList<Reference> getAuthor() { return author; }

	/**
	 * Setter for author
	 * @param value Identifies the individual(s) or ogranization who is responsible for the content of the care plan.
	 */
	public void setAuthor(ArrayList<Reference> value) { author = value; }


	@Expose
	private ArrayList<Reference> careTeam;

	/**
	 * Getter for careTeam
	 * @return Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
	 */
	public ArrayList<Reference> getCareTeam() { return careTeam; }

	/**
	 * Setter for careTeam
	 * @param value Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
	 */
	public void setCareTeam(ArrayList<Reference> value) { careTeam = value; }


	@Expose
	private ArrayList<Reference> addresses;

	/**
	 * Getter for addresses
	 * @return Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
	 */
	public ArrayList<Reference> getAddresses() { return addresses; }

	/**
	 * Setter for addresses
	 * @param value Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
	 */
	public void setAddresses(ArrayList<Reference> value) { addresses = value; }


	@Expose
	private ArrayList<Reference> supportingInfo;

	/**
	 * Getter for supportingInfo
	 * @return Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.
	 */
	public ArrayList<Reference> getSupportingInfo() { return supportingInfo; }

	/**
	 * Setter for supportingInfo
	 * @param value Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc.
	 */
	public void setSupportingInfo(ArrayList<Reference> value) { supportingInfo = value; }


	@Expose
	private ArrayList<Reference> goal;

	/**
	 * Getter for goal
	 * @return Describes the intended objective(s) of carrying out the care plan.
	 */
	public ArrayList<Reference> getGoal() { return goal; }

	/**
	 * Setter for goal
	 * @param value Describes the intended objective(s) of carrying out the care plan.
	 */
	public void setGoal(ArrayList<Reference> value) { goal = value; }


	@Expose
	private ArrayList<CarePlanActivity> activity;

	/**
	 * Getter for activity
	 * @return Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
	 */
	public ArrayList<CarePlanActivity> getActivity() { return activity; }

	/**
	 * Setter for activity
	 * @param value Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
	 */
	public void setActivity(ArrayList<CarePlanActivity> value) { activity = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return General notes about the care plan not covered elsewhere.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value General notes about the care plan not covered elsewhere.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
