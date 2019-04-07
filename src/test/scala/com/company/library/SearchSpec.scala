package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers

class SearchSpec extends FunSuite with Matchers {
  val newSearch = new Search()

  test(testName = "search bookByTitle") {
    newSearch.bookByTitle("New Moon") shouldBe true
  }

  test(testName = "search bookByAuthor") {
    newSearch.bookByAuthor("Oliver, Jamie") shouldBe true
  }

  test(testName = "search bookByISBN") {
    newSearch.bookByISBN("dbfflaxab") shouldBe true
  }
}