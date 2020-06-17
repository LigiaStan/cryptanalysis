package cryptanalysis

trait Cipher[K] {

  def encrypt(alphabet: String, plaintext: String, key: K): String

  def decrypt(alphabet: String, cipherText: String, key: K): String

}