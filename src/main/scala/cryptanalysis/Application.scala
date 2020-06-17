package cryptanalysis

object Application extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val caesarKey = 1
  val text = "LIGIAISTHEBEST!"
  val vigenereKey = "CATCATCATCATCA"

  val caesarEncryption = CaesarCipher.encrypt(alphabet, text, caesarKey)
  val caesarDecryption = CaesarCipher.decrypt(alphabet, caesarEncryption, caesarKey)

  val vigenereEncryption = VigenereCipher.encrypt(alphabet, text, vigenereKey)
  val vigenereDecryption = VigenereCipher.decrypt(alphabet, vigenereEncryption, vigenereKey)

  println(s"Plain text: $text")
  println("-----------------------------------------")
  println(s"Caesar Cipher: $caesarEncryption")
  println(s"Caesar Decipher: $caesarDecryption")
  println("-----------------------------------------")
  println(s"Vegenere Cipher: $vigenereEncryption")
  println(s"Vegenere Decipher: $vigenereDecryption")

}
