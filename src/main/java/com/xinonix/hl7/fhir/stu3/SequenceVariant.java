package com.xinonix.hl7.fhir.stu3;


import com.google.gson.annotations.Expose;


/**
 * Raw data describing a biological sequence.
 */
public class SequenceVariant extends BackboneElement {
	@Expose
	private Integer start;

	/**
	 * Getter for start
	 * @return Start position of the variant on the  reference sequence.If the coordinate system is either 0-based or 1-based, then start position is inclusive.
	 */
	public Integer getStart() { return start; }

	/**
	 * Setter for start
	 * @param value Start position of the variant on the  reference sequence.If the coordinate system is either 0-based or 1-based, then start position is inclusive.
	 */
	public void setStart(Integer value) { start = value; }


	@Expose
	private Integer end;

	/**
	 * Getter for end
	 * @return End position of the variant on the reference sequence.If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
	 */
	public Integer getEnd() { return end; }

	/**
	 * Setter for end
	 * @param value End position of the variant on the reference sequence.If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
	 */
	public void setEnd(Integer value) { end = value; }


	@Expose
	private String observedAllele;

	/**
	 * Getter for observedAllele
	 * @return An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)).  Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
	 */
	public String getObservedAllele() { return observedAllele; }

	/**
	 * Setter for observedAllele
	 * @param value An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)).  Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
	 */
	public void setObservedAllele(String value) { observedAllele = value; }


	@Expose
	private String referenceAllele;

	/**
	 * Getter for referenceAllele
	 * @return An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)). Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
	 */
	public String getReferenceAllele() { return referenceAllele; }

	/**
	 * Setter for referenceAllele
	 * @param value An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)). Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
	 */
	public void setReferenceAllele(String value) { referenceAllele = value; }


	@Expose
	private String cigar;

	/**
	 * Getter for cigar
	 * @return Extended CIGAR string for aligning the sequence with reference bases. See detailed documentation [here](http://support.illumina.com/help/SequencingAnalysisWorkflow/Content/Vault/Informatics/Sequencing_Analysis/CASAVA/swSEQ_mCA_ExtendedCIGARFormat.htm).
	 */
	public String getCigar() { return cigar; }

	/**
	 * Setter for cigar
	 * @param value Extended CIGAR string for aligning the sequence with reference bases. See detailed documentation [here](http://support.illumina.com/help/SequencingAnalysisWorkflow/Content/Vault/Informatics/Sequencing_Analysis/CASAVA/swSEQ_mCA_ExtendedCIGARFormat.htm).
	 */
	public void setCigar(String value) { cigar = value; }


	@Expose
	private Reference variantPointer;

	/**
	 * Getter for variantPointer
	 * @return A pointer to an Observation containing variant information.
	 */
	public Reference getVariantPointer() { return variantPointer; }

	/**
	 * Setter for variantPointer
	 * @param value A pointer to an Observation containing variant information.
	 */
	public void setVariantPointer(Reference value) { variantPointer = value; }


}
