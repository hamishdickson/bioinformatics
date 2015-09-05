package rosalind.Dna

import org.scalatest.{Matchers, FlatSpec}

class DnaNucleotidesTest extends FlatSpec with Matchers {
  "A dna counter" should "return the correct number of nucleotides" in {
    val g: DnaNucleotides = Dna("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC")

    g count Genome('A') should be (20)
    g count Genome('C') should be (12)
    g count Genome('G') should be (17)
    g count Genome('T') should be (21)
  }

  "An rna converter" should "be able to convert dna to rna" in {
    val g: DnaNucleotides = Dna("GATGGAACTTGACTACGTAAATT")
    val result: Rna = Rna("GAUGGAACUUGACUACGUAAAUU")

    g.convert should be (result)
  }

  "A reverse complementer" should "return the reverse complement of a nucleotide" in {
    val g: DnaNucleotides = Dna("AAAACCCGGT")
    val result: DnaNucleotides = Dna("ACCGGGTTTT")

    g.reverseComplementer should be (result)
  }
}
