package cryptanalysis

object VigenereCipher extends Cipher[String]{

  def encrypt(alphabet: String, text: String, key: String) : String = {
    val textWithNoPunctuation = text.replaceAll("""[\p{Punct}]""", "").toUpperCase()
    val textLength = textWithNoPunctuation.length - 1
    var cipheredText: String = ""

    for (i <- 0 to textLength) {
      val charPositionInAlphabet: Int = (text.charAt(i) + key.charAt(i)) % alphabet.length
      val charInASCII: Int = charPositionInAlphabet + 'A'
      cipheredText += charInASCII.toChar
    }
    cipheredText
  }

  def decrypt(alphabet: String, text: String, key: String) : String = {
    val textLength = text.length - 1
    var decipheredText: String = ""

    for (i <- 0 to textLength) {
      val charPositionInAlphabet: Int = (text.charAt(i) - key.charAt(i) + alphabet.length) % alphabet.length
      val charInASCII: Int = charPositionInAlphabet + 'A'
      decipheredText += charInASCII.toChar
    }
    decipheredText
  }
}
