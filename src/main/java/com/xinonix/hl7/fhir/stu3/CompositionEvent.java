package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;


/**
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.
 */
public class CompositionEvent extends BackboneElement {
	@Expose
	private ArrayList<CodeableConcept> code;

	/**
	 * Getter for code
	 * @return This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
	 */
	public ArrayList<CodeableConcept> getCode() { return code; }

	/**
	 * Setter for code
	 * @param value This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
	 */
	public void setCode(ArrayList<CodeableConcept> value) { code = value; }


	@Expose
	private Period period;

	/**
	 * Getter for period
	 * @return The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.
	 */
	public Period getPeriod() { return period; }

	/**
	 * Setter for period
	 * @param value The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.
	 */
	public void setPeriod(Period value) { period = value; }


	@Expose
	private ArrayList<Reference> detail;

	/**
	 * Getter for detail
	 * @return The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.
	 */
	public ArrayList<Reference> getDetail() { return detail; }

	/**
	 * Setter for detail
	 * @param value The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.
	 */
	public void setDetail(ArrayList<Reference> value) { detail = value; }


}
