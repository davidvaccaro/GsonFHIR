package com.xinonix.hl7.fhir.stu3;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Raw data describing a biological sequence.
 */
public class Sequence extends DomainResource {
	@Expose
	private ResourceType resourceType;

	/**
	 * Getter for resourceType
	 * @return This is a Sequence resource
	 */
	public ResourceType getResourceType() { return resourceType; }

	/**
	 * Setter for resourceType
	 * @param value This is a Sequence resource
	 */
	public void setResourceType(ResourceType value) { resourceType = value; }


	@Expose
	private ArrayList<Identifier> identifier;

	/**
	 * Getter for identifier
	 * @return A unique identifier for this particular sequence instance. This is a FHIR-defined id.
	 */
	public ArrayList<Identifier> getIdentifier() { return identifier; }

	/**
	 * Setter for identifier
	 * @param value A unique identifier for this particular sequence instance. This is a FHIR-defined id.
	 */
	public void setIdentifier(ArrayList<Identifier> value) { identifier = value; }


	public enum Type{
		@SerializedName("aa") AA,
		@SerializedName("dna") DNA,
		@SerializedName("rna") RNA
	}

	@Expose
	private Type type;

	/**
	 * Getter for type
	 * @return Amino Acid Sequence/ DNA Sequence / RNA Sequence.
	 */
	public Type getType() { return type; }

	/**
	 * Setter for type
	 * @param value Amino Acid Sequence/ DNA Sequence / RNA Sequence.
	 */
	public void setType(Type value) { type = value; }


	@Expose
	private Integer coordinateSystem;

	/**
	 * Getter for coordinateSystem
	 * @return Whether the sequence is numbered starting at 0 (0-based numbering or coordinates, inclusive start, exclusive end) or starting at 1 (1-based numbering, inclusive start and inclusive end).
	 */
	public Integer getCoordinateSystem() { return coordinateSystem; }

	/**
	 * Setter for coordinateSystem
	 * @param value Whether the sequence is numbered starting at 0 (0-based numbering or coordinates, inclusive start, exclusive end) or starting at 1 (1-based numbering, inclusive start and inclusive end).
	 */
	public void setCoordinateSystem(Integer value) { coordinateSystem = value; }


	@Expose
	private Reference patient;

	/**
	 * Getter for patient
	 * @return The patient whose sequencing results are described by this resource.
	 */
	public Reference getPatient() { return patient; }

	/**
	 * Setter for patient
	 * @param value The patient whose sequencing results are described by this resource.
	 */
	public void setPatient(Reference value) { patient = value; }


	@Expose
	private Reference specimen;

	/**
	 * Getter for specimen
	 * @return Specimen used for sequencing.
	 */
	public Reference getSpecimen() { return specimen; }

	/**
	 * Setter for specimen
	 * @param value Specimen used for sequencing.
	 */
	public void setSpecimen(Reference value) { specimen = value; }


	@Expose
	private Reference device;

	/**
	 * Getter for device
	 * @return The method for sequencing, for example, chip information.
	 */
	public Reference getDevice() { return device; }

	/**
	 * Setter for device
	 * @param value The method for sequencing, for example, chip information.
	 */
	public void setDevice(Reference value) { device = value; }


	@Expose
	private Reference performer;

	/**
	 * Getter for performer
	 * @return The organization or lab that should be responsible for this result.
	 */
	public Reference getPerformer() { return performer; }

	/**
	 * Setter for performer
	 * @param value The organization or lab that should be responsible for this result.
	 */
	public void setPerformer(Reference value) { performer = value; }


	@Expose
	private Quantity quantity;

	/**
	 * Getter for quantity
	 * @return The number of copies of the seqeunce of interest. (RNASeq).
	 */
	public Quantity getQuantity() { return quantity; }

	/**
	 * Setter for quantity
	 * @param value The number of copies of the seqeunce of interest. (RNASeq).
	 */
	public void setQuantity(Quantity value) { quantity = value; }


	@Expose
	private SequenceReferenceSeq referenceSeq;

	/**
	 * Getter for referenceSeq
	 * @return A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
	 */
	public SequenceReferenceSeq getReferenceSeq() { return referenceSeq; }

	/**
	 * Setter for referenceSeq
	 * @param value A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
	 */
	public void setReferenceSeq(SequenceReferenceSeq value) { referenceSeq = value; }


	@Expose
	private ArrayList<SequenceVariant> variant;

	/**
	 * Getter for variant
	 * @return The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.
	 */
	public ArrayList<SequenceVariant> getVariant() { return variant; }

	/**
	 * Setter for variant
	 * @param value The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.
	 */
	public void setVariant(ArrayList<SequenceVariant> value) { variant = value; }


	@Expose
	private String observedSeq;

	/**
	 * Getter for observedSeq
	 * @return Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall starts from referenceSeq.windowStart and end by referenceSeq.windowEnd.
	 */
	public String getObservedSeq() { return observedSeq; }

	/**
	 * Setter for observedSeq
	 * @param value Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall starts from referenceSeq.windowStart and end by referenceSeq.windowEnd.
	 */
	public void setObservedSeq(String value) { observedSeq = value; }


	@Expose
	private ArrayList<SequenceQuality> quality;

	/**
	 * Getter for quality
	 * @return An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
	 */
	public ArrayList<SequenceQuality> getQuality() { return quality; }

	/**
	 * Setter for quality
	 * @param value An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
	 */
	public void setQuality(ArrayList<SequenceQuality> value) { quality = value; }


	@Expose
	private Integer readCoverage;

	/**
	 * Getter for readCoverage
	 * @return Coverage (read depth or depth) is the average number of reads representing a given nucleotide in the reconstructed sequence.
	 */
	public Integer getReadCoverage() { return readCoverage; }

	/**
	 * Setter for readCoverage
	 * @param value Coverage (read depth or depth) is the average number of reads representing a given nucleotide in the reconstructed sequence.
	 */
	public void setReadCoverage(Integer value) { readCoverage = value; }


	@Expose
	private ArrayList<SequenceRepository> repository;

	/**
	 * Getter for repository
	 * @return Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.
	 */
	public ArrayList<SequenceRepository> getRepository() { return repository; }

	/**
	 * Setter for repository
	 * @param value Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.
	 */
	public void setRepository(ArrayList<SequenceRepository> value) { repository = value; }


	@Expose
	private ArrayList<Reference> pointer;

	/**
	 * Getter for pointer
	 * @return Pointer to next atomic sequence which at most contains one variant.
	 */
	public ArrayList<Reference> getPointer() { return pointer; }

	/**
	 * Setter for pointer
	 * @param value Pointer to next atomic sequence which at most contains one variant.
	 */
	public void setPointer(ArrayList<Reference> value) { pointer = value; }


}
