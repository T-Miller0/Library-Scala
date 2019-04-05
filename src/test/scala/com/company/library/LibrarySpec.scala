package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers
import com.company.library._

class LibrarySpec extends FunSuite with Matchers {
  val myLibrary = new Library()

  test("some words to describe my test") {
    "aString" shouldBe "aString"
  }

  test(testName = "search bookByTitle") {
    myLibrary.bookByTitle("New Moon") shouldBe true
  }
}
