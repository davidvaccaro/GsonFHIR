package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Raw data describing a biological sequence.
 */
public class SequenceReferenceSeq extends BackboneElement {
	@Expose
	private CodeableConcept chromosome;

	/**
	 * Getter for chromosome
	 * @return Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).
	 */
	public CodeableConcept getChromosome() { return chromosome; }

	/**
	 * Setter for chromosome
	 * @param value Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).
	 */
	public void setChromosome(CodeableConcept value) { chromosome = value; }


	@Expose
	private String genomeBuild;

	/**
	 * Getter for genomeBuild
	 * @return The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.
	 */
	public String getGenomeBuild() { return genomeBuild; }

	/**
	 * Setter for genomeBuild
	 * @param value The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used.
	 */
	public void setGenomeBuild(String value) { genomeBuild = value; }


	@Expose
	private CodeableConcept referenceSeqId;

	/**
	 * Getter for referenceSeqId
	 * @return Reference identifier of reference sequence submitted to NCBI. It must match the type in the Sequence.type field. For example, the prefix, “NG_” identifies reference sequence for genes, “NM_” for messenger RNA transcripts, and “NP_” for amino acid sequences.
	 */
	public CodeableConcept getReferenceSeqId() { return referenceSeqId; }

	/**
	 * Setter for referenceSeqId
	 * @param value Reference identifier of reference sequence submitted to NCBI. It must match the type in the Sequence.type field. For example, the prefix, “NG_” identifies reference sequence for genes, “NM_” for messenger RNA transcripts, and “NP_” for amino acid sequences.
	 */
	public void setReferenceSeqId(CodeableConcept value) { referenceSeqId = value; }


	@Expose
	private Reference referenceSeqPointer;

	/**
	 * Getter for referenceSeqPointer
	 * @return A Pointer to another Sequence entity as reference sequence.
	 */
	public Reference getReferenceSeqPointer() { return referenceSeqPointer; }

	/**
	 * Setter for referenceSeqPointer
	 * @param value A Pointer to another Sequence entity as reference sequence.
	 */
	public void setReferenceSeqPointer(Reference value) { referenceSeqPointer = value; }


	@Expose
	private String referenceSeqString;

	/**
	 * Getter for referenceSeqString
	 * @return A string like "ACGT".
	 */
	public String getReferenceSeqString() { return referenceSeqString; }

	/**
	 * Setter for referenceSeqString
	 * @param value A string like "ACGT".
	 */
	public void setReferenceSeqString(String value) { referenceSeqString = value; }


	@Expose
	private Integer strand;

	/**
	 * Getter for strand
	 * @return Directionality of DNA sequence. Available values are "1" for the plus strand (5' to 3')/Watson/Sense/positive  and "-1" for the minus strand(3' to 5')/Crick/Antisense/negative.
	 */
	public Integer getStrand() { return strand; }

	/**
	 * Setter for strand
	 * @param value Directionality of DNA sequence. Available values are "1" for the plus strand (5' to 3')/Watson/Sense/positive  and "-1" for the minus strand(3' to 5')/Crick/Antisense/negative.
	 */
	public void setStrand(Integer value) { strand = value; }


	@Expose
	private Integer windowStart;

	/**
	 * Getter for windowStart
	 * @return Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
	 */
	public Integer getWindowStart() { return windowStart; }

	/**
	 * Setter for windowStart
	 * @param value Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
	 */
	public void setWindowStart(Integer value) { windowStart = value; }


	@Expose
	private Integer windowEnd;

	/**
	 * Getter for windowEnd
	 * @return End position of the window on the reference sequence. If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
	 */
	public Integer getWindowEnd() { return windowEnd; }

	/**
	 * Setter for windowEnd
	 * @param value End position of the window on the reference sequence. If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
	 */
	public void setWindowEnd(Integer value) { windowEnd = value; }


}
