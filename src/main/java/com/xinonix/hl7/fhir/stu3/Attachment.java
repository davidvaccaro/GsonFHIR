package com.xinonix.hl7.fhir.stu3;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;

import com.xinonix.serialization.DateTimeAdapterDateTime;

/**
 * For referring to data content defined in other formats.
 */
public class Attachment extends Element {
	@Expose
	private String contentType;

	/**
	 * Getter for contentType
	 * @return Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate.
	 */
	public String getContentType() { return contentType; }

	/**
	 * Setter for contentType
	 * @param value Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate.
	 */
	public void setContentType(String value) { contentType = value; }


	@Expose
	private String language;

	/**
	 * Getter for language
	 * @return The human language of the content. The value can be any valid value according to BCP 47.
	 */
	public String getLanguage() { return language; }

	/**
	 * Setter for language
	 * @param value The human language of the content. The value can be any valid value according to BCP 47.
	 */
	public void setLanguage(String value) { language = value; }


	@Expose
	private String data;

	/**
	 * Getter for data
	 * @return The actual data of the attachment - a sequence of bytes. In XML, represented using base64.
	 */
	public String getData() { return data; }

	/**
	 * Setter for data
	 * @param value The actual data of the attachment - a sequence of bytes. In XML, represented using base64.
	 */
	public void setData(String value) { data = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return An alternative location where the data can be accessed.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value An alternative location where the data can be accessed.
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private Integer size;

	/**
	 * Getter for size
	 * @return The number of bytes of data that make up this attachment (before base64 encoding, if that is done).
	 */
	public Integer getSize() { return size; }

	/**
	 * Setter for size
	 * @param value The number of bytes of data that make up this attachment (before base64 encoding, if that is done).
	 */
	public void setSize(Integer value) { size = value; }


	@Expose
	private String hash;

	/**
	 * Getter for hash
	 * @return The calculated hash of the data using SHA-1. Represented using base64.
	 */
	public String getHash() { return hash; }

	/**
	 * Setter for hash
	 * @param value The calculated hash of the data using SHA-1. Represented using base64.
	 */
	public void setHash(String value) { hash = value; }


	@Expose
	private String title;

	/**
	 * Getter for title
	 * @return A label or set of text to display in place of the data.
	 */
	public String getTitle() { return title; }

	/**
	 * Setter for title
	 * @param value A label or set of text to display in place of the data.
	 */
	public void setTitle(String value) { title = value; }


	@Expose
	@JsonAdapter(DateTimeAdapterDateTime.class)
	private Date creation;

	/**
	 * Getter for creation
	 * @return The date that the attachment was first created.
	 */
	public Date getCreation() { return creation; }

	/**
	 * Setter for creation
	 * @param value The date that the attachment was first created.
	 */
	public void setCreation(Date value) { creation = value; }


}
