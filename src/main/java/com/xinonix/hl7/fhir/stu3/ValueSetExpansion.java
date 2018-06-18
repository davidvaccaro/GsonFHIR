package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * A value set specifies a set of codes drawn from one or more code systems.
 */
public class ValueSetExpansion extends BackboneElement {
	@Expose
	private String identifier;

	/**
	 * Getter for identifier
	 * @return An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so.
	 */
	public String getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so.
	 */
	public void setIdentifier(String value) { identifier = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date timestamp;

	/**
	 * Getter for timestamp
	 * @return The time at which the expansion was produced by the expanding system.
	 */
	public Date getTimestamp() { return timestamp; }

	/**
	 * Setter for timestamp
	 * @param value The time at which the expansion was produced by the expanding system.
	 */
	public void setTimestamp(Date value) { timestamp = value; }


	@Expose
	private Integer total;

	/**
	 * Getter for total
	 * @return The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.
	 */
	public Integer getTotal() { return total; }

	/**
	 * Setter for total
	 * @param value The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.
	 */
	public void setTotal(Integer value) { total = value; }


	@Expose
	private Integer offset;

	/**
	 * Getter for offset
	 * @return If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present.
	 */
	public Integer getOffset() { return offset; }

	/**
	 * Setter for offset
	 * @param value If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present.
	 */
	public void setOffset(Integer value) { offset = value; }


	@Expose
	private ArrayList<ValueSetParameter> parameter;

	/**
	 * Getter for parameter
	 * @return A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
	 */
	public ArrayList<ValueSetParameter> getParameter() { return parameter; }

	/**
	 * Setter for parameter
	 * @param value A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
	 */
	public void setParameter(ArrayList<ValueSetParameter> value) { parameter = value; }


	@Expose
	private ArrayList<ValueSetContains> contains;

	/**
	 * Getter for contains
	 * @return The codes that are contained in the value set expansion.
	 */
	public ArrayList<ValueSetContains> getContains() { return contains; }

	/**
	 * Setter for contains
	 * @param value The codes that are contained in the value set expansion.
	 */
	public void setContains(ArrayList<ValueSetContains> value) { contains = value; }


}
