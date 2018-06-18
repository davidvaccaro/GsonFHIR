package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 */
public class CoverageGrouping extends BackboneElement {
	@Expose
	private String group;

	/**
	 * Getter for group
	 * @return Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify an employer group. May also be referred to as a Policy or Group ID.
	 */
	public String getGroup() { return group; }

	/**
	 * Setter for group
	 * @param value Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify an employer group. May also be referred to as a Policy or Group ID.
	 */
	public void setGroup(String value) { group = value; }


	@Expose
	private String groupDisplay;

	/**
	 * Getter for groupDisplay
	 * @return A short description for the group.
	 */
	public String getGroupDisplay() { return groupDisplay; }

	/**
	 * Setter for groupDisplay
	 * @param value A short description for the group.
	 */
	public void setGroupDisplay(String value) { groupDisplay = value; }


	@Expose
	private String subGroup;

	/**
	 * Getter for subGroup
	 * @return Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a subset of an employer group.
	 */
	public String getSubGroup() { return subGroup; }

	/**
	 * Setter for subGroup
	 * @param value Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a subset of an employer group.
	 */
	public void setSubGroup(String value) { subGroup = value; }


	@Expose
	private String subGroupDisplay;

	/**
	 * Getter for subGroupDisplay
	 * @return A short description for the subgroup.
	 */
	public String getSubGroupDisplay() { return subGroupDisplay; }

	/**
	 * Setter for subGroupDisplay
	 * @param value A short description for the subgroup.
	 */
	public void setSubGroupDisplay(String value) { subGroupDisplay = value; }


	@Expose
	private String plan;

	/**
	 * Getter for plan
	 * @return Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a collection of benefits provided to employees. May be referred to as a Section or Division ID.
	 */
	public String getPlan() { return plan; }

	/**
	 * Setter for plan
	 * @param value Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a collection of benefits provided to employees. May be referred to as a Section or Division ID.
	 */
	public void setPlan(String value) { plan = value; }


	@Expose
	private String planDisplay;

	/**
	 * Getter for planDisplay
	 * @return A short description for the plan.
	 */
	public String getPlanDisplay() { return planDisplay; }

	/**
	 * Setter for planDisplay
	 * @param value A short description for the plan.
	 */
	public void setPlanDisplay(String value) { planDisplay = value; }


	@Expose
	private String subPlan;

	/**
	 * Getter for subPlan
	 * @return Identifies a sub-style or sub-collective of coverage issued by the underwriter, for example may be used to identify a subset of a collection of benefits provided to employees.
	 */
	public String getSubPlan() { return subPlan; }

	/**
	 * Setter for subPlan
	 * @param value Identifies a sub-style or sub-collective of coverage issued by the underwriter, for example may be used to identify a subset of a collection of benefits provided to employees.
	 */
	public void setSubPlan(String value) { subPlan = value; }


	@Expose
	private String subPlanDisplay;

	/**
	 * Getter for subPlanDisplay
	 * @return A short description for the subplan.
	 */
	public String getSubPlanDisplay() { return subPlanDisplay; }

	/**
	 * Setter for subPlanDisplay
	 * @param value A short description for the subplan.
	 */
	public void setSubPlanDisplay(String value) { subPlanDisplay = value; }


	@Expose
	@SerializedName("class")
	private String classCode;

	/**
	 * Getter for classCode
	 * @return Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage such as a level of deductables or co-payment.
	 */
	public String getClassCode() { return classCode; }

	/**
	 * Setter for classCode
	 * @param value Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage such as a level of deductables or co-payment.
	 */
	public void setClassCode(String value) { classCode = value; }


	@Expose
	private String classDisplay;

	/**
	 * Getter for classDisplay
	 * @return A short description for the class.
	 */
	public String getClassDisplay() { return classDisplay; }

	/**
	 * Setter for classDisplay
	 * @param value A short description for the class.
	 */
	public void setClassDisplay(String value) { classDisplay = value; }


	@Expose
	private String subClass;

	/**
	 * Getter for subClass
	 * @return Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a subclass of coverage such as a sub-level of deductables or co-payment.
	 */
	public String getSubClass() { return subClass; }

	/**
	 * Setter for subClass
	 * @param value Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a subclass of coverage such as a sub-level of deductables or co-payment.
	 */
	public void setSubClass(String value) { subClass = value; }


	@Expose
	private String subClassDisplay;

	/**
	 * Getter for subClassDisplay
	 * @return A short description for the subclass.
	 */
	public String getSubClassDisplay() { return subClassDisplay; }

	/**
	 * Setter for subClassDisplay
	 * @param value A short description for the subclass.
	 */
	public void setSubClassDisplay(String value) { subClassDisplay = value; }


}
