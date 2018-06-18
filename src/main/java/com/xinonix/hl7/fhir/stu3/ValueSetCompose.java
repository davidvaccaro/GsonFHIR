package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTypeAdapterDate;

/**
 * A value set specifies a set of codes drawn from one or more code systems.
 */
public class ValueSetCompose extends BackboneElement {
	@Expose
	@JsonAdapter(DateTypeAdapterDate.class)
	private Date lockedDate;

	/**
	 * Getter for lockedDate
	 * @return If a locked date is defined, then the Content Logical Definition must be evaluated using the current version as of the locked date for referenced code system(s) and value set instances where ValueSet.compose.include.version is not defined.
	 */
	public Date getLockedDate() { return lockedDate; }

	/**
	 * Setter for lockedDate
	 * @param value If a locked date is defined, then the Content Logical Definition must be evaluated using the current version as of the locked date for referenced code system(s) and value set instances where ValueSet.compose.include.version is not defined.
	 */
	public void setLockedDate(Date value) { lockedDate = value; }


	@Expose
	private boolean inactive;

	/**
	 * Getter for inactive
	 * @return Whether inactive codes - codes that are not approved for current use - are in the value set. If inactive = true, inactive codes are to be included in the expansion, if inactive = false, the inactive codes will not be included in the expansion. If absent, the behavior is determined by the implementation, or by the applicable ExpansionProfile (but generally, inactive codes would be expected to be included).
	 */
	public boolean getInactive() { return inactive; }

	/**
	 * Setter for inactive
	 * @param value Whether inactive codes - codes that are not approved for current use - are in the value set. If inactive = true, inactive codes are to be included in the expansion, if inactive = false, the inactive codes will not be included in the expansion. If absent, the behavior is determined by the implementation, or by the applicable ExpansionProfile (but generally, inactive codes would be expected to be included).
	 */
	public void setInactive(boolean value) { inactive = value; }


	@Expose
	private ArrayList<ValueSetInclude> include;

	/**
	 * Getter for include
	 * @return Include one or more codes from a code system or other value set(s).
	 */
	public ArrayList<ValueSetInclude> getInclude() { return include; }

	/**
	 * Setter for include
	 * @param value Include one or more codes from a code system or other value set(s).
	 */
	public void setInclude(ArrayList<ValueSetInclude> value) { include = value; }


	@Expose
	private ArrayList<ValueSetInclude> exclude;

	/**
	 * Getter for exclude
	 * @return Exclude one or more codes from the value set based on code system filters and/or other value sets.
	 */
	public ArrayList<ValueSetInclude> getExclude() { return exclude; }

	/**
	 * Setter for exclude
	 * @param value Exclude one or more codes from the value set based on code system filters and/or other value sets.
	 */
	public void setExclude(ArrayList<ValueSetInclude> value) { exclude = value; }


}
