package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 */
public class ConceptMapTarget extends BackboneElement {
	@Expose
	private String code;

	/**
	 * Getter for code
	 * @return Identity (code or path) or the element/item that the map refers to.
	 */
	public String getCode() { return code; }

	/**
	 * Setter for code
	 * @param value Identity (code or path) or the element/item that the map refers to.
	 */
	public void setCode(String value) { code = value; }


	@Expose
	private String display;

	/**
	 * Getter for display
	 * @return The display for the code. The display is only provided to help editors when editing the concept map.
	 */
	public String getDisplay() { return display; }

	/**
	 * Setter for display
	 * @param value The display for the code. The display is only provided to help editors when editing the concept map.
	 */
	public void setDisplay(String value) { display = value; }


	public enum Equivalence{
		@SerializedName("relatedto") RELATEDTO,
		@SerializedName("equivalent") EQUIVALENT,
		@SerializedName("equal") EQUAL,
		@SerializedName("wider") WIDER,
		@SerializedName("subsumes") SUBSUMES,
		@SerializedName("narrower") NARROWER,
		@SerializedName("specializes") SPECIALIZES,
		@SerializedName("inexact") INEXACT,
		@SerializedName("unmatched") UNMATCHED,
		@SerializedName("disjoint") DISJOINT
	}

	@Expose
	private Equivalence equivalence;

	/**
	 * Getter for equivalence
	 * @return The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source).
	 */
	public Equivalence getEquivalence() { return equivalence; }

	/**
	 * Setter for equivalence
	 * @param value The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source).
	 */
	public void setEquivalence(Equivalence value) { equivalence = value; }


	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return A description of status/issues in mapping that conveys additional information not represented in  the structured data.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value A description of status/issues in mapping that conveys additional information not represented in  the structured data.
	 */
	public void setComment(String value) { comment = value; }


	@Expose
	private ArrayList<ConceptMapDependsOn> dependsOn;

	/**
	 * Getter for dependsOn
	 * @return A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.
	 */
	public ArrayList<ConceptMapDependsOn> getDependsOn() { return dependsOn; }

	/**
	 * Setter for dependsOn
	 * @param value A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.
	 */
	public void setDependsOn(ArrayList<ConceptMapDependsOn> value) { dependsOn = value; }


	@Expose
	private ArrayList<ConceptMapDependsOn> product;

	/**
	 * Getter for product
	 * @return A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on.
	 */
	public ArrayList<ConceptMapDependsOn> getProduct() { return product; }

	/**
	 * Setter for product
	 * @param value A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on.
	 */
	public void setProduct(ArrayList<ConceptMapDependsOn> value) { product = value; }


}
