package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Raw data describing a biological sequence.
 */
public class SequenceRepository extends BackboneElement {
	public enum Type{
		@SerializedName("directlink") DIRECTLINK,
		@SerializedName("openapi") OPENAPI,
		@SerializedName("login") LOGIN,
		@SerializedName("oauth") OAUTH,
		@SerializedName("other") OTHER
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private String url;

	/**
	 * Getter for url
	 * @return URI of an external repository which contains further details about the genetics data.
	 */
	public String getUrl() { return url; }

	/**
	 * Setter for url
	 * @param value URI of an external repository which contains further details about the genetics data.
	 */
	public void setUrl(String value) { url = value; }


	@Expose
	private String name;

	/**
	 * Getter for name
	 * @return URI of an external repository which contains further details about the genetics data.
	 */
	public String getName() { return name; }

	/**
	 * Setter for name
	 * @param value URI of an external repository which contains further details about the genetics data.
	 */
	public void setName(String value) { name = value; }


	@Expose
	private String datasetId;

	/**
	 * Getter for datasetId
	 * @return Id of the variant in this external repository. The server will understand how to use this id to call for more info about datasets in external repository.
	 */
	public String getDatasetId() { return datasetId; }

	/**
	 * Setter for datasetId
	 * @param value Id of the variant in this external repository. The server will understand how to use this id to call for more info about datasets in external repository.
	 */
	public void setDatasetId(String value) { datasetId = value; }


	@Expose
	private String variantsetId;

	/**
	 * Getter for variantsetId
	 * @return Id of the variantset in this external repository. The server will understand how to use this id to call for more info about variantsets in external repository.
	 */
	public String getVariantsetId() { return variantsetId; }

	/**
	 * Setter for variantsetId
	 * @param value Id of the variantset in this external repository. The server will understand how to use this id to call for more info about variantsets in external repository.
	 */
	public void setVariantsetId(String value) { variantsetId = value; }


	@Expose
	private String readsetId;

	/**
	 * Getter for readsetId
	 * @return Id of the read in this external repository.
	 */
	public String getReadsetId() { return readsetId; }

	/**
	 * Setter for readsetId
	 * @param value Id of the read in this external repository.
	 */
	public void setReadsetId(String value) { readsetId = value; }


}
