package cryptanalysis

import cryptanalysis.VigenereCipher._
import org.scalatest._

class VigenereCipherSpec extends FunSuite with Matchers {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  test("encrypt message") {
    encrypt(alphabet, "ENCRYPTEDMESSAGE!", "SUNFLOWERSUNFLOW") shouldBe "WHPWJDPIUEYFXLUA"
  }

  test("decrypt message") {
    decrypt(alphabet, "WHPWJDPIUEYFXLUA", "SUNFLOWERSUNFLOW") shouldBe "ENCRYPTEDMESSAGE"
  }

}
