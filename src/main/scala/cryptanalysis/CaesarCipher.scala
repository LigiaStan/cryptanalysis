package cryptanalysis

object CaesarCipher extends Cipher[Int] {

  override def encrypt(alphabet: String, text: String, key: Int): String = {
    val textWithNoPunctuation = text.replaceAll("""[\p{Punct}]""", "")
    textWithNoPunctuation.map{char => shift(alphabet, char, key)}
  }

  override def decrypt(alphabet: String, text: String, key: Int): String = encrypt(alphabet, text, -key)

  def shift(alphabet: String, character: Char, key: Int): Char = {
    val charIndex = alphabet.indexOf(character.toUpper)

    if (charIndex == -1)
      character
    else {
      val shift = (key + alphabet.length) % alphabet.length
      alphabet((charIndex + shift) % alphabet.length)
    }
  }

}
