package cryptanalysis

import cryptanalysis.CaesarCipher._
import org.scalatest._

class CaesarCipherSpec extends FunSuite with Matchers {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  test("encrypt message") {
    encrypt(alphabet, "Encrypted MESSAGE!", 3) shouldBe "HQFUBSWHG PHVVDJH!"
  }

  test("decrypt message") {
    decrypt(alphabet, "HQFUBSWHG PHVVDJH!", 3) shouldBe "Encrypted MESSAGE!"
  }
}

