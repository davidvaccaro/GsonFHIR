package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * A Map of relationships between 2 structures that can be used to transform data.
 */
public class StructureMapTarget extends BackboneElement {
	@Expose
	private String context;

	/**
	 * Getter for context
	 * @return Type or variable this rule applies to.
	 */
	public String getContext() { return context; }

	/**
	 * Setter for context
	 * @param value Type or variable this rule applies to.
	 */
	public void setContext(String value) { context = value; }


	public enum ContextType{
		@SerializedName("type") TYPE,
		@SerializedName("variable") VARIABLE
	}

	@Expose
	private ContextType contextType;

	/**
	 * Getter for contextType
	 * @return How to interpret the context.
	 */
	public ContextType getContextType() { return contextType; }

	/**
	 * Setter for contextType
	 * @param value How to interpret the context.
	 */
	public void setContextType(ContextType value) { contextType = value; }


	@Expose
	private String element;

	/**
	 * Getter for element
	 * @return Field to create in the context.
	 */
	public String getElement() { return element; }

	/**
	 * Setter for element
	 * @param value Field to create in the context.
	 */
	public void setElement(String value) { element = value; }


	@Expose
	private String variable;

	/**
	 * Getter for variable
	 * @return Named context for field, if desired, and a field is specified.
	 */
	public String getVariable() { return variable; }

	/**
	 * Setter for variable
	 * @param value Named context for field, if desired, and a field is specified.
	 */
	public void setVariable(String value) { variable = value; }


	@Expose
	private ArrayList<String> listMode;

	/**
	 * Getter for listMode
	 * @return If field is a list, how to manage the list.
	 */
	public ArrayList<String> getListMode() { return listMode; }

	/**
	 * Setter for listMode
	 * @param value If field is a list, how to manage the list.
	 */
	public void setListMode(ArrayList<String> value) { listMode = value; }


	@Expose
	private String listRuleId;

	/**
	 * Getter for listRuleId
	 * @return Internal rule reference for shared list items.
	 */
	public String getListRuleId() { return listRuleId; }

	/**
	 * Setter for listRuleId
	 * @param value Internal rule reference for shared list items.
	 */
	public void setListRuleId(String value) { listRuleId = value; }


	public enum Transform{
		@SerializedName("create") CREATE,
		@SerializedName("copy") COPY,
		@SerializedName("truncate") TRUNCATE,
		@SerializedName("escape") ESCAPE,
		@SerializedName("cast") CAST,
		@SerializedName("append") APPEND,
		@SerializedName("translate") TRANSLATE,
		@SerializedName("reference") REFERENCE,
		@SerializedName("dateOp") DATEOP,
		@SerializedName("uuid") UUID,
		@SerializedName("pointer") POINTER,
		@SerializedName("evaluate") EVALUATE,
		@SerializedName("cc") CC,
		@SerializedName("c") C,
		@SerializedName("qty") QTY,
		@SerializedName("id") ID,
		@SerializedName("cp") CP
	}

	@Expose
	private Transform transform;

	/**
	 * Getter for transform
	 * @return How the data is copied / created.
	 */
	public Transform getTransform() { return transform; }

	/**
	 * Setter for transform
	 * @param value How the data is copied / created.
	 */
	public void setTransform(Transform value) { transform = value; }


	@Expose
	private ArrayList<StructureMapParameter> parameter;

	/**
	 * Getter for parameter
	 * @return Parameters to the transform.
	 */
	public ArrayList<StructureMapParameter> getParameter() { return parameter; }

	/**
	 * Setter for parameter
	 * @param value Parameters to the transform.
	 */
	public void setParameter(ArrayList<StructureMapParameter> value) { parameter = value; }


}
