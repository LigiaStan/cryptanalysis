package cryptanalysis

object CaesarCipher extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val key = 1
  val text = "LIGIA IS THE BEST"

  def encrypt(alphabet: String, text: String, key: Int): String = text.map{char => shift(alphabet, char, key)}
  def decrypt(alphabet: String, text: String, key: Int): String = encrypt(alphabet, text, -key)

  val encryption = encrypt(alphabet, text, key)
  val decryption = decrypt(alphabet, encryption, key)

  println(s"Plain text: $text")
  println(s"Cipher: $encryption")
  println(s"Decipher: $decryption")

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
