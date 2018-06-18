package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
 */
public class GuidanceResponse extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a GuidanceResponse resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a GuidanceResponse resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private String requestId;

	/**
	 * Getter for requestId
	 * @return The id of the request associated with this response. If an id was given as part of the request, it will be reproduced here to enable the requester to more easily identify the response in a multi-request scenario.
	 */
	public String getRequestId() { return requestId; }

	/**
	 * Setter for requestId
	 * @param value The id of the request associated with this response. If an id was given as part of the request, it will be reproduced here to enable the requester to more easily identify the response in a multi-request scenario.
	 */
	public void setRequestId(String value) { requestId = value; }


	@Expose
	private Identifier identifier;

	/**
	 * Getter for identifier
	 * @return Allows a service to provide a unique, business identifier for the response.
	 */
	public Identifier getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value Allows a service to provide a unique, business identifier for the response.
	 */
	public void setIdentifier(Identifier value) { identifier = value; }


	@Expose
	private Reference module;

	/**
	 * Getter for module
	 * @return A reference to the knowledge module that was invoked.
	 */
	public Reference getModule() { return module; }

	/**
	 * Setter for module
	 * @param value A reference to the knowledge module that was invoked.
	 */
	public void setModule(Reference value) { module = value; }


	public enum Status{
		@SerializedName("success") SUCCESS,
		@SerializedName("data-requested") DATA_REQUESTED,
		@SerializedName("data-required") DATA_REQUIRED,
		@SerializedName("in-progress") IN_PROGRESS,
		@SerializedName("failure") FAILURE,
		@SerializedName("entered-in-error") ENTERED_IN_ERROR
	}

	@Expose
	private Status status;

	/**
	 * Getter for status
	 * @return The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
	 */
	public Status getStatus() { return status; }

	/**
	 * Setter for status
	 * @param value The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information.
	 */
	public void setStatus(Status value) { status = value; }


	@Expose
	private Reference subject;

	/**
	 * Getter for subject
	 * @return The patient for which the request was processed.
	 */
	public Reference getSubject() { return subject; }

	/**
	 * Setter for subject
	 * @param value The patient for which the request was processed.
	 */
	public void setSubject(Reference value) { subject = value; }


	@Expose
	private Reference context;

	/**
	 * Getter for context
	 * @return Allows the context of the guidance response to be provided if available. In a service context, this would likely be unavailable.
	 */
	public Reference getContext() { return context; }

	/**
	 * Setter for context
	 * @param value Allows the context of the guidance response to be provided if available. In a service context, this would likely be unavailable.
	 */
	public void setContext(Reference value) { context = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date occurrenceDateTime;

	/**
	 * Getter for occurrenceDateTime
	 * @return Indicates when the guidance response was processed.
	 */
	public Date getOccurrenceDateTime() { return occurrenceDateTime; }

	/**
	 * Setter for occurrenceDateTime
	 * @param value Indicates when the guidance response was processed.
	 */
	public void setOccurrenceDateTime(Date value) { occurrenceDateTime = value; }


	@Expose
	private Reference performer;

	/**
	 * Getter for performer
	 * @return Provides a reference to the device that performed the guidance.
	 */
	public Reference getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value Provides a reference to the device that performed the guidance.
	 */
	public void setPerformer(Reference value) { performer = value; }


	@Expose
	private CodeableConcept reasonCodeableConcept;

	/**
	 * Getter for reasonCodeableConcept
	 * @return Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
	 */
	public CodeableConcept getReasonCodeableConcept() { return reasonCodeableConcept; }

	/**
	 * Setter for reasonCodeableConcept
	 * @param value Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
	 */
	public void setReasonCodeableConcept(CodeableConcept value) { reasonCodeableConcept = value; }


	@Expose
	private Reference reasonReference;

	/**
	 * Getter for reasonReference
	 * @return Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
	 */
	public Reference getReasonReference() { return reasonReference; }

	/**
	 * Setter for reasonReference
	 * @param value Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
	 */
	public void setReasonReference(Reference value) { reasonReference = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Provides a mechanism to communicate additional information about the response.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Provides a mechanism to communicate additional information about the response.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


	@Expose
	private ArrayList<Reference> evaluationMessage;

	/**
	 * Getter for evaluationMessage
	 * @return Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.
	 */
	public ArrayList<Reference> getEvaluationMessage() { return evaluationMessage; }

	/**
	 * Setter for evaluationMessage
	 * @param value Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.
	 */
	public void setEvaluationMessage(ArrayList<Reference> value) { evaluationMessage = value; }


	@Expose
	private Reference outputParameters;

	/**
	 * Getter for outputParameters
	 * @return The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.
	 */
	public Reference getOutputParameters() { return outputParameters; }

	/**
	 * Setter for outputParameters
	 * @param value The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.
	 */
	public void setOutputParameters(Reference value) { outputParameters = value; }


	@Expose
	private Reference result;

	/**
	 * Getter for result
	 * @return The actions, if any, produced by the evaluation of the artifact.
	 */
	public Reference getResult() { return result; }

	/**
	 * Setter for result
	 * @param value The actions, if any, produced by the evaluation of the artifact.
	 */
	public void setResult(Reference value) { result = value; }


	@Expose
	private ArrayList<DataRequirement> dataRequirement;

	/**
	 * Getter for dataRequirement
	 * @return If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data.
	 */
	public ArrayList<DataRequirement> getDataRequirement() { return dataRequirement; }

	/**
	 * Setter for dataRequirement
	 * @param value If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data.
	 */
	public void setDataRequirement(ArrayList<DataRequirement> value) { dataRequirement = value; }


}
