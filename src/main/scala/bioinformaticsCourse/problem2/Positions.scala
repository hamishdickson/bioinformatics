package bioinformaticsCourse.problem2

/**
 * Created by hamishdickson on 16/04/15.
 *
 * todo refactor this so that you don't pass s anymore
 */
class Positions {
  def patInStr(pat: String, str: String): String = {
    def pis(s: String, m: String, index: Int): String = {
      if (pat.length > s.length) m
      else if (s.substring(0, pat.length) == pat) pis(s.substring(1), m + " " + index, index + 1)
      else pis(s.substring(1), m, index + 1)
    }

    pis(str, "", 0)
  }

  def usingPatternMatching(pat: String, str: List[Char]): Boolean = str match {
    case Nil => false
    case pat :: xs => true
    case _ => false
  }
}

object PositionTest extends App {
  val str = "GTCGCCATAAACATGTCGCCAAGCGCGTCGCCACTCCGTCGCCAGTCGCCAGTCGCCAATGTCGCCAGTCGCCAGGCAGTCGCCACTAAGTCGCCAGGTCGCCAGTCGCCACACTGTCGCCATATGTCGCCAGTCGCCAGTCGCCACTCGTCGCCAGCCTGTCGCCACGGACTGTCGCCACCGTCGCCAGTCGCCACTGTCGCCAGTCGCCAAGTCGCCAGTTTGCCGTCGCCAGTCGCCAAGTCGCCAGTCGCCAAGCTGTGCGAGTCGCCAAGTCGCCAGTCGCCATTCGTCGCCATAGGTCGCCAGTCGCCACCTTTCGTTTGTCGCCATGTCGCCAATACGTCGCCAGTCGCCACAGAGTCGCCAGTAGTCGCCAGTGTGGTCGCCATAGTCGCCAAAATGGTCGCCATATGTCGCCATGTCGCCACAAGTGCGTCGCCATTCCCAAGATTAGCTGTCGCCACGTGTCGCCAGTCGCCAGTCGCCATACGGTCGCCACCTGGTCGCCAGTCGCCACGTCGCCAGTCTGCGTCGCCAAGTCGCCATGGTCGCCAGTAGTCGCCATCCCGGTCGCCAGTCGCCAAGTCGCCAGTCGCCAGAACGGTCGCCATGGGTCGCCAATTAATACGTCGCCATAGCGTCGCCAAACGTCGCCAGCCCGTCGCCAGTCGCCAGTCGCCATTTCTCGTCGCCACGTCGCCAATAATGTCGCCACGTTGTCGCCATGTCGCCAGTCGCCATTGCCGTCGCCATCCGTCGCCAACTCATATGTCGCCAGGCTCAGAGTCGCCAAGTCGCCATCTAACATTGTCGCCAAGTCGCCACTCAGTCGCCAGTCGCCAGTCGCCAGGTCGCCATAGGTCGCCATGTCGCCATGTCGCCAGTCGCCATCATGTCGCCAAGTCGCCATGTCGCCACATAAGTCGCCACGTCGCCAGTGGAATGGTCGCCAGGTCGCCATGTCGCCAGATTGTCGCCATCGGTCGCCATCCCAGTCGCCAGTCGCCACGTCGCCAGGTCGCCATTACGACGTCGCCAAGGGTCGCCATGTCGGTCGCCAAGGGTCGCCATGTCGCCAGTCGCCAGTCGCCAGTCGCCACCAACAGTCGCCAGTCGCCAGAGTCGCCAGAAAGGTCGCCAATCAGGGACTGTCGCCAGTCGCCAGTCGCCAGTCGCCAGTCGTCGCCAGGTCGCCAGTCGCCACGTCGCCATAGTCGCCATAGTGTCGCCATTGTCGCCAAACGAAGTGTCGCCAAGATCGTCGCCAGTCGCCAGAGCCAGCCGTCGCCACGCGTCGCCAGAGGTCGCCAACAACCAACAGGCTAACGTCGCCAGTCGCCATAGTCGCCAGTCGCCAGTCGCCACGGCTGATGTCGCCATGTCGCCACGTCGCCAAGTCGCCATGTGTCGTCGCCAGTCGCCACTCTGCCTGTCGCCAGATACTCTCGAGACGACGTGTCGCCAGCGTCGCCACTGTGTCGCCATTGGTCGCCAGTCGCCATCTCGAGTCGCCATAGTCGCCACGTCGCCACAGGGTTAGTGTCGCCACAAAGTCGCCAGTCGCCAAGCTGTCGCCACAGTCGCCAGTCGCCAATCGCTCCTAATACTGTCGCCATAGTCGCCATACAAGGTCGCCACGTCGCCAGTCGCCAGTCGCCAGCGTCGCCAAGTCGCCATATTACTTGTCGTCGCCAACCCGTCGCCAACGTCGCCAGTCGCCAGTCGCCAGTCGCCATCGTCGCCAGTTAGAAGAAGGTCGCCAATCGTCGCCAGTCGCCATGCAAAGTCGCCACTAGTCGCCAGTCGCCAGGTCGCCAGTCGCCAAGTAAACTCCTCAGTCGCCACAATTTGGCTCGGTCGCCAGTCGCCAGCGTCGCCAAGTCGCCAGCGAGTCGCCAAAGTCGCCAGTCGCCAGACTCGTCGCCAGTCGCCAAGTCGCCAATGTCGCCAGTCGCCACCGTCGCCAGTCGCCAGTCGCCAAGATTGTAATTCAGTCGCCATCGGTCGCCACGTTGTCGCCAACAGTCGCCAAAATCGTCGCCATTCGTCGCCAAGGTCGCCATGTGATCGTCGCCAGTAATCGTCGCCAGTCGCCACATAGACGGGTATGTCGCCAGTCGCCAGAGTCGCCACGTCGCCAGTCGCCACGTGGTCGCCAAGTCGCCAAGTCGCCAACGTCGCCACGTCGCCATCAGGTCGCCATAAGTCGCCAAGTCGCCAGTCGCCACGTCGCCAGTCGCCATAAGTCGCCAGTCGCCAAGAGTCGCCAAGTCGCCACCGTAGTCGCCAGTCGCCAGTCGCCAGTCGCCATGTCGCCAGTCGCCATATCGTTTTACGTCGCCATTAAGGGTCGCCAGCGTCGCCAGTCGCCAGTCGCCAGATTCGGTCGCCAACGTCGCCAATGTGTCGCCACCTGGGTCGCCAGTCGCCAGGTCGCCAGGTCGCCAACGTCGCCAGTCGCCAGTAGGGTCGCCACGCCCCCGTCGCCACACGTCGCCACCGGTGTCGCCAGTCGCCAAGTCGCCAGGTCGCCAACAGTCGCCAGTCGCCAAGTCGCCAGTCGCCATGTCGCCAGTGTCGCCATGTCGCCACTCCGGTCGCCACTCACGTCGCCAGGTCGCCACTGGAGTCGCCAGTCGCCAGTCGCCAACGTCGCCATGTCGCCAGGTCGCCACGCAGTCGCCACTGTCGCCAGTCGCCACGTCGCCAGTGTCGCCAGCTATGGTCGCCATTAGCGTCGCCATGAGGGTCGCCAGTCGCCAGTCGCCAGTCGCCACACGGTCGCCAAGGTCGCCACAAGTCGCCATCCGTCGCCACGTACATCAGTCGCCATGTCGCCAGTCGCCAGTCGCCATGTCCAGTCGCCACATGTCGCCACCTTGTGTGTCGCCACCGTCGCCAGTCGCCAATCCGACCTGGTCGCCACATGTCGCCAATGGTCCAGTCGCCATGGTCGCCAGGTCGCCATGCGGTCGCCAGTCGCCAGTCGCCAAAGTCGCCAATGTCGCCATGGTCGCCATTTAGCCCGTCGCCACGTCGCCACGGTCGCCAGGACTGAGAGGTCGCCAATGGTCGCCAAGATGGGGTCGCCATGGTCGCCACATCGTCGCCATCGTCGCCAGTCGCCAGTCGCCAGTCGCCAAGTCGCCAGCACCGGTCGCCACCCGGGTCGCCAATCGTCGCCAACTGCGGGTCGCCAGATACGGGTCGCCATCCGTCGCCAGTGTCGCCAAGTCACCATCACGTTCGTCGCCACTCCGTCGCCATCGACCGCGCATGTCGCCAGTCGCCACGTCGCCACGTCGCCAAGGTCGCCAAGGACGAGGTCGCCAGTCGCCAGTCGCCAACTAGTCGCCACTGTCGCCAGTCGCCATGACCAAGGTCGCCATGTCGCCAAGTAAGTCGCCAGTCGCCAGTCGCCACTAAATAGTCGCCAAGTCGCCAATCGTCGCCATAGCGCCTTCAGTCGCCAGGCGTCGCCACCGTCGCCAGTCGCCAACAAACAATGACTTGACCACACCAAGTCGCCAGTCGCCAGTGTCGCCAGTCGCCACCGTCGCCATAGTCGCCACGTCGCCAGTCGCCATTGTCGCCAGGTCGCCAGTCGCCAGGTGGTGAGTCGCCAATCGTCGCCAGTGTCGCCATTGTCGCCAAGACTATGTCGCCAGTCGCCAAAAAAGAATATGTTTGCGCGTCGCCACCGGTCGCCACTCAGTGTCGCCAACGTCGCCAGCATTGCTTGCGGTCGCCAGAGTCGCCATGTCGCCATGTCGCCAAGAGTCGCCATACGCCTACAGTCGCCAGTCGCCAGTCGCCATAGCGTCGCCACTTCCGTCGCCATGTCGCCACCGTCGCCAGTCGCCATGTCGCCACGTCGCCAGGGAGCGTCGCCATGTCGCCATGTCGCCAGTCGCCAGTCGCCAGTCGCCAGTCGCCAGTCGCCAGACGTCGCCACAGTCGCCATGTCGCCAGTCGCCACTCATGAGTCGCCAAAGTCGCCACCGTCGCCAGTCGCCAACGGTCGCCACCGGTCGCCACGGTCGCCATGTCGCCATGTCGCCATCTTAAGTCGCCAGTCGCCAACCATGTCGCCAGTCGCCATAGTCGCCAGTCGCCACCGATGTCGCCATGTCGCCACCCTGGTCGCCACGAGAGTCGCCAAGTCGCCAAATAGTCGCCAAGACCGCTAGTCGCCAAGTCGCCAACGCATGTCGCCAGTCGCCAGTCGCCATTTGGTCGCCACGCTCTTAGTCGCCAAGGCGTCGCCAAAGTCGCCAAGGTCGCCACGAAGGTCGCCAGTCGCCAGCGAGGTCGCCAGTCGCCAGCCCAGTCGCCATGTCGCCATGTCGCCACTTGTCGCCATCCGTCGCCATAGAAAGTCGCCACCGGTCGCCATCTGTCGCCAGTCCTGTCGCCAACGCAGAATTAGTCGCCAGTCGCCAGAACCGTCGCCATGTCGCCATACGCGTCGCCATTTTCGTGGGGTCGCCATAGTCGCCAAGGGGGTCGCCAAAGTCGCCAGGATATGTCGCCATCTGGCAGGTCGCCACGGTCGCCAACGTCGCCAGTCGCCAGGCATCGTCGCCAAGTAGTTACAAGTCCGTCGCCAAGTCGCCAGTCGCCATGTCGCCAGTCGCCACGTCGCCACGAGAGTCGCCATGTCGCCATTAGTCGCCAGAGTCGCCATGAAGTGTCGCCATTAGTCGCCATATAGTCGCCAATTGTCGCCAGTCGCCACTCAGTCGCCATGTCGCCAGTCGCCAAATGGTCGCCAGTCGCCACTGCGCGGTCGCCAGGTCGCCAGTCGCCAGTCGCCATTGTCGCCACATTCTAGGTCGCCAAGGTCGCCAGTCGCCACGTCGCCAGGTCGCCAGTCGCCATGGTCGCCATAGTCGCCATAAAAGATCGTCGCCAGCAAGTCGCCATTACAAATCGGGTCGCCATAATTTGTCGCCAATACATGAGCAGTCGCCAGTCGCCAGTCGCCATTGGTCTTGCTTGTATAGGTCGCCATGTCTGTCGCCATGTCGCCACATTGTCGCCATGTCGCCACGCGGTCGCCAGTCGCCAGTCGCCAGGTCGCCATGTCGCCACGTCGCCAAAGTCGCCACAAGCGCCAGTCGCCACAGGTCGCCACGTCGCCAGTCGCCAGTCGCCATGTCGCCACGTCGCCAGTGCAGTCGCCACCTGTCGCCACGTCGCCACGTCGCCATATTGTCGCCAGCCGGTCGTCGCCAGTCGCCAAGTCGCCAAGGTTCAGTCGCCAAGTCGCCACGACCACGTCGCCATCTGTCGCCAGCTGTCGCCAGTCGCCAGTGAGGTCGCCAGGTCGCCAAGCGTCGCCATGTCGCCAGTAGTCGCCATACCGTCGCCAGTCGCCACAGTCGCCAAGATAGCCGGGTCGCCATAAGTCGCCACGGATCTTGTCGCCAACGTCGCCAGTCGCCATTGTCGCCAGCCCTCGCTCGGCCTCTTATGTAAAAGTCGCCACAGCAAAAAGTCGCCACGTCGCCAGTGAGTCGCCACAGCTCGTCGCCATGCGTCGCCAAGAGTCGCCATTAACGCGTCGCCAGGTCGCCAGTCGCCAGTCGCCAAGTCGCCATCACATGGTGAGTCGCCATTGTCGCCACTGTCGCCAGTCGCCATCACGTCGCCAGCGTCGCCAGTCGCCAGTCGCCAGGTCGCCATAAACGTCGCCATGTCGCCAAATACTCGTCGCCAATGTCGCCACGTCGCCAAATTGTCGCCATAGTCGCCAAGTCGCCAGAGATACGTCGCCACGTCGCCACATGTCGCCAGTCGCCAGAATGTCGCCATGTTCTTTGTCGCCACGTCGCCAGTCGCCATCAGACGTCGCCAGTCGCCAGGTCGCCAGTCGCCAAACGGTCGCCAAGGGTCGCCATTCTCAACAGTCGCCAGCGATTAGGAATTTAGTCGCCAAGGGTGATGTCGCCAGTCGCCAGGTCGCCAAGTCGCCACGCGGGTCGCCACCTTTAGTCGCCATCATATGTCGCCAGTCGCCAGTCGCCAGTCGCCACTGTCGCCAGGTCGCCACCGGTCGCCAGTCGCCAGCCGTCGCCAGCCGTCGCCAGTCGCCAGTCGCCAGGTCTGTCGCCAGCCGTCGCCAATGTCGCCAACGTCGCCAGTCGCCAGTCGCCATGTCGCCAGTCGCCAGGGTCGCCAGACTTGTCGCCAGTCGCCAGAGTCGCCAGGCTTACTGTCGCCAGTCGCCAGTCGCCAGTCGCCATATATATGTCGCCACAACGTCGCCAGGTCGCCAGTCGCCATGTCGCCACGGTCGCCAAAAGTCGCCATGTCGCCACCGTCGCCAGTCGCCAGATTTCAGTGGTCGCCATGTCGCCAGTCGCCACGTCGCCACAGACCCAAGTCGCCAGTCGCCAAGTCGCCATGTCGCCAGTAGGTCGCCAGATAAGGGTCGCCAAGACGTCGCCAACGTCGCCAGGTCGCCATGTCGCCAGTCGCCAGTCGCCATGTCGCCATGGTCGTCGCCAGGTAGTCGCCAGGTCGCCAGGTCGCCAGTCGCCAGAGTCGCCAGTCGCCACGTCGCCAATCACAAGGACAACAGAGTCGCCAGCGTTCACAGGAAGTCGCCAGGGTCGCCACAGGTGTCGCCAGTACTCTCCGTCGCCACTGGTGACGGTCGCCACTTTGTCGCCAAGGTCGCCACGTCGCCAGGGTCGCCATCAATGTTGTATTGTCGCCAGTCGCCATTCGTCGCCAAAAGTCGCCACAATGTCGCCAACGTCGCCAGTCGCCAAGGTCGCCAAACGTCGCCAGTCGCCATCGTCGCCATTCGGTCGCCACAGTCGCCATCCAGCCTAAGTGTCGCCAAGTAGTCGCCAGCTCGTCGCCAACGCTCTGGTCGCCAAGTCGCCATGACTAGGTCGCCAGTCGCCAGTCGCCACTAGTCGCCAGCATGAGTCGCCAGGGTCGCCAGCGAGTCGCCAGTGTCGCCAGGTCGCCACACCGTCGCCATTGGTCGCCACAGCTGACGCTGGGTCGCCAGTCGCCAAGTCGCCAGTCGCCAAAATCAGCTTGGTCGCCATGTCGCCATCGTCGCCAAGTCGCCAGTCGCCAGATGCTAGTCGCCACCCATGGCGGTCGCCACGTCGCCAGACGTCGCCAGTCGCCACTGTCGCCACGGTCGCCAAGGTCGCCAGTAAGGTCGCCAGGTTTTGTGACCCTGTCGCCACGTGTTGGTCGCCACCCTGCAAGAGTCGCCAATGGTCGCCAGTCGCCAGTCGCCATGTCGCCAGTCGCCATTCATGACGTCGCCAGTCTTCGTCGCCATCCGGGTCGCCAGCGTCGCCACTCGTTTATGGGCGTGGTCGCCAGTCGCCACGGACATGTCGCCACAGTCGCCAATCCGTCGCCACTCAAGGTCGCCATCAATTAACGTCGCCAGGTCGCCAGGATCAGTCGAGTCGCCACGATCCGTCGCCAGGAGTCGCCATTTTGATTCCCGGGCACACGGCTTCGTCGCCAAAGTCGCCAGTCGCCAAGTTGTCGCCATAATCAAGTCGCCAGTCGCCAGTATTGTCGCCAGTCGCCAGTCGCCATGTCGCCACGTCGCCATGTCGCCAAAACATCGTCGCCACCGTCGCCAGGTCGCCAGTCGCCAGAGTCGCCAGTCGCCACGTCGCCATATGTCGCCATAGTCGCCAGTCGCCACCCGCGTCGCCAGACTACCCGTCGCCATAAACATAGGCGGTCGTCGCCAGGGTCGCCAGTCGCCACGTCGCCAGTTGGTCGCCAGTCGCCAAGTGTCGCCAGGTTGTCGCCAGTCGCCAGTCGCCATGTCGCCAGTCGCCAGGTATCACGTCGCCATCTGTCGCCACGTCGCCAGCGTCGCCAAAGTCGCCAGTGTCGCCACGTCGCCATGTCGCCATGTCGCCAATGGTCGCCAAGTCGCCAGTCGCCAGTCGCCACAGCAGCGTCGCCAGGCCACTTGGTCGCCAGTCGCCAGGTCGCCAGGTCGCCAATAGGCACTGTCGCCATCGTGTCGCCAGTCGCCAGGTGTCGCCAGTCGCCATAGGGTCGCCACTGTCGCCAGGCCTGTGTCGCCAGTCGCCACGTGTCGCCACGTCGCCAGTCGCCATGGTCGCCAAGTCGCCACTGTCGCCATGTCGCCAGCAGGAAGGGGTCGCCAGTCGCCATGGGTCGCCAAGTCGCCAAGTCGCCACCGAGTCGCCAGTCGCCAGGTCGCCAGCGTCCAGACTGTCGCCAGCAATGTCGCCATCTCATGGTCGCCAATAGTCGCCAGAGTCGCCACGGGGGGTCGCCACACGTCGCCAGAGTCGCCATGGTCGCCAGAGTCGCCAGCTCACCGTCGCCAGTCGCCAAAGTCGCCATGCGAATGTGGTCGCCAGTCGCCAGGACCACCGGGTCGCCAGTCGCCATCTGTCGCCATGGTCGCCACTGTCGCCAGTCGCCAAGTCGCCACTTGTAGTCGCCACCCAGTCGCCAGCGTCGCCAACGCATATCGGTCGCCAGAGGGAGTCGCCAAGTCGCCATCTTAAGTCGCCAGTCGCCATGTCGCCAGTCGCCAGTCGCCAGGGTCGCCAGTCGCCACTCATGTCGCCAGCACCGTCGCCAGTCTGTCGCCAGGTCGCCAGAAAGTCGCCATGTCGCCAGTCGCCAGTCGCCAGTGTCGCCAATCGGGTTGACAGTCGCCAAAGTCGCCACGTCGCCAAAACTGTCGCCAAGACGTCGCCATGTCGCCAGGGTCGCCAGTCGCCATGATGTCGCCAGAATGTCGCCACTTAGTCGCCATACAGTCGCCATAGGGCAAGTGTCGCCATCGAGCGCCGTCGCCACGGGGTCGCCACTGTCGCCAGG"
  val pat = "GTCGCCAGT"

  val pis = new Positions

  println(pis.patInStr(pat, str))
}