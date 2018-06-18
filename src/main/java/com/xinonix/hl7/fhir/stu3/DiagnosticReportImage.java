package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 */
public class DiagnosticReportImage extends BackboneElement {
	@Expose
	private String comment;

	/**
	 * Getter for comment
	 * @return A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.
	 */
	public String getComment() { return comment; }

	/**
	 * Setter for comment
	 * @param value A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.
	 */
	public void setComment(String value) { comment = value; }


	@Expose
	private Reference link;

	/**
	 * Getter for link
	 * @return Reference to the image source.
	 */
	public Reference getLink() { return link; }

	/**
	 * Setter for link
	 * @param value Reference to the image source.
	 */
	public void setLink(Reference value) { link = value; }


}
