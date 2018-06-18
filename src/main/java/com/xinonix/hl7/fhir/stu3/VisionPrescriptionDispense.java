package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 */
public class VisionPrescriptionDispense extends BackboneElement {
	@Expose
	private CodeableConcept product;

	/**
	 * Getter for product
	 * @return Identifies the type of vision correction product which is required for the patient.
	 */
	public CodeableConcept getProduct() { return product; }

	/**
	 * Setter for product
	 * @param value Identifies the type of vision correction product which is required for the patient.
	 */
	public void setProduct(CodeableConcept value) { product = value; }


	public enum Eye{
		@SerializedName("right") RIGHT,
		@SerializedName("left") LEFT
	}

	@Expose
	private Eye eye;

	/**
	 * Getter for eye
	 * @return The eye for which the lens applies.
	 */
	public Eye getEye() { return eye; }

	/**
	 * Setter for eye
	 * @param value The eye for which the lens applies.
	 */
	public void setEye(Eye value) { eye = value; }


	@Expose
	private Double sphere;

	/**
	 * Getter for sphere
	 * @return Lens power measured in diopters (0.25 units).
	 */
	public Double getSphere() { return sphere; }

	/**
	 * Setter for sphere
	 * @param value Lens power measured in diopters (0.25 units).
	 */
	public void setSphere(Double value) { sphere = value; }


	@Expose
	private Double cylinder;

	/**
	 * Getter for cylinder
	 * @return Power adjustment for astigmatism measured in diopters (0.25 units).
	 */
	public Double getCylinder() { return cylinder; }

	/**
	 * Setter for cylinder
	 * @param value Power adjustment for astigmatism measured in diopters (0.25 units).
	 */
	public void setCylinder(Double value) { cylinder = value; }


	@Expose
	private Integer axis;

	/**
	 * Getter for axis
	 * @return Adjustment for astigmatism measured in integer degrees.
	 */
	public Integer getAxis() { return axis; }

	/**
	 * Setter for axis
	 * @param value Adjustment for astigmatism measured in integer degrees.
	 */
	public void setAxis(Integer value) { axis = value; }


	@Expose
	private Double prism;

	/**
	 * Getter for prism
	 * @return Amount of prism to compensate for eye alignment in fractional units.
	 */
	public Double getPrism() { return prism; }

	/**
	 * Setter for prism
	 * @param value Amount of prism to compensate for eye alignment in fractional units.
	 */
	public void setPrism(Double value) { prism = value; }


	public enum Base{
		@SerializedName("up") UP,
		@SerializedName("down") DOWN,
		@SerializedName("in") IN,
		@SerializedName("out") OUT
	}

	@Expose
	private Base base;

	/**
	 * Getter for base
	 * @return The relative base, or reference lens edge, for the prism.
	 */
	public Base getBase() { return base; }

	/**
	 * Setter for base
	 * @param value The relative base, or reference lens edge, for the prism.
	 */
	public void setBase(Base value) { base = value; }


	@Expose
	private Double add;

	/**
	 * Getter for add
	 * @return Power adjustment for multifocal lenses measured in diopters (0.25 units).
	 */
	public Double getAdd() { return add; }

	/**
	 * Setter for add
	 * @param value Power adjustment for multifocal lenses measured in diopters (0.25 units).
	 */
	public void setAdd(Double value) { add = value; }


	@Expose
	private Double power;

	/**
	 * Getter for power
	 * @return Contact lens power measured in diopters (0.25 units).
	 */
	public Double getPower() { return power; }

	/**
	 * Setter for power
	 * @param value Contact lens power measured in diopters (0.25 units).
	 */
	public void setPower(Double value) { power = value; }


	@Expose
	private Double backCurve;

	/**
	 * Getter for backCurve
	 * @return Back curvature measured in millimeters.
	 */
	public Double getBackCurve() { return backCurve; }

	/**
	 * Setter for backCurve
	 * @param value Back curvature measured in millimeters.
	 */
	public void setBackCurve(Double value) { backCurve = value; }


	@Expose
	private Double diameter;

	/**
	 * Getter for diameter
	 * @return Contact lens diameter measured in millimeters.
	 */
	public Double getDiameter() { return diameter; }

	/**
	 * Setter for diameter
	 * @param value Contact lens diameter measured in millimeters.
	 */
	public void setDiameter(Double value) { diameter = value; }


	@Expose
	private Quantity duration;

	/**
	 * Getter for duration
	 * @return The recommended maximum wear period for the lens.
	 */
	public Quantity getDuration() { return duration; }

	/**
	 * Setter for duration
	 * @param value The recommended maximum wear period for the lens.
	 */
	public void setDuration(Quantity value) { duration = value; }


	@Expose
	private String color;

	/**
	 * Getter for color
	 * @return Special color or pattern.
	 */
	public String getColor() { return color; }

	/**
	 * Setter for color
	 * @param value Special color or pattern.
	 */
	public void setColor(String value) { color = value; }


	@Expose
	private String brand;

	/**
	 * Getter for brand
	 * @return Brand recommendations or restrictions.
	 */
	public String getBrand() { return brand; }

	/**
	 * Setter for brand
	 * @param value Brand recommendations or restrictions.
	 */
	public void setBrand(String value) { brand = value; }


	@Expose
	private ArrayList<Annotation> note;

	/**
	 * Getter for note
	 * @return Notes for special requirements such as coatings and lens materials.
	 */
	public ArrayList<Annotation> getNote() { return note; }

	/**
	 * Setter for note
	 * @param value Notes for special requirements such as coatings and lens materials.
	 */
	public void setNote(ArrayList<Annotation> value) { note = value; }


}
