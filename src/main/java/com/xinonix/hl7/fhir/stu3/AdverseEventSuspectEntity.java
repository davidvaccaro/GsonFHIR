package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
 */
public class AdverseEventSuspectEntity extends BackboneElement {
	@Expose
	private Reference instance;

	/**
	 * Getter for instance
	 * @return Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device.
	 */
	public Reference getInstance() { return instance; }

	/**
	 * Setter for instance
	 * @param value Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device.
	 */
	public void setInstance(Reference value) { instance = value; }


	public enum Causality{
		@SerializedName("causality1") CAUSALITY1,
		@SerializedName("causality2") CAUSALITY2
	}

	@Expose
	private Causality causality;

	/**
	 * Getter for causality
	 * @return causality1 | causality2.
	 */
	public Causality getCausality() { return causality; }

	/**
	 * Setter for causality
	 * @param value causality1 | causality2.
	 */
	public void setCausality(Causality value) { causality = value; }


	@Expose
	private CodeableConcept causalityAssessment;

	/**
	 * Getter for causalityAssessment
	 * @return assess1 | assess2.
	 */
	public CodeableConcept getCausalityAssessment() { return causalityAssessment; }

	/**
	 * Setter for causalityAssessment
	 * @param value assess1 | assess2.
	 */
	public void setCausalityAssessment(CodeableConcept value) { causalityAssessment = value; }


	@Expose
	private String causalityProductRelatedness;

	/**
	 * Getter for causalityProductRelatedness
	 * @return AdverseEvent.suspectEntity.causalityProductRelatedness.
	 */
	public String getCausalityProductRelatedness() { return causalityProductRelatedness; }

	/**
	 * Setter for causalityProductRelatedness
	 * @param value AdverseEvent.suspectEntity.causalityProductRelatedness.
	 */
	public void setCausalityProductRelatedness(String value) { causalityProductRelatedness = value; }


	@Expose
	private CodeableConcept causalityMethod;

	/**
	 * Getter for causalityMethod
	 * @return method1 | method2.
	 */
	public CodeableConcept getCausalityMethod() { return causalityMethod; }

	/**
	 * Setter for causalityMethod
	 * @param value method1 | method2.
	 */
	public void setCausalityMethod(CodeableConcept value) { causalityMethod = value; }


	@Expose
	private Reference causalityAuthor;

	/**
	 * Getter for causalityAuthor
	 * @return AdverseEvent.suspectEntity.causalityAuthor.
	 */
	public Reference getCausalityAuthor() { return causalityAuthor; }

	/**
	 * Setter for causalityAuthor
	 * @param value AdverseEvent.suspectEntity.causalityAuthor.
	 */
	public void setCausalityAuthor(Reference value) { causalityAuthor = value; }


	@Expose
	private CodeableConcept causalityResult;

	/**
	 * Getter for causalityResult
	 * @return result1 | result2.
	 */
	public CodeableConcept getCausalityResult() { return causalityResult; }

	/**
	 * Setter for causalityResult
	 * @param value result1 | result2.
	 */
	public void setCausalityResult(CodeableConcept value) { causalityResult = value; }


}
