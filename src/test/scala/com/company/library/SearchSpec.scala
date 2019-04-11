package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers

class SearchSpec extends FunSuite with Matchers {
  val newSearch = new Search
  val books: List[Book] = com.company.library.Books.all

  test(testName = "search bookByTitle") {
    newSearch.bookByTitle("New Moon", books) shouldBe List(Book("New Moon", "Meyer, Stephenie", "bpmdidg"))
  }

  test(testName = "search bookByAuthor") {
    newSearch.bookByAuthor("Oliver, Jamie", books) shouldBe List(Book("Jamie's 30-Minute Meals", "Oliver, Jamie", "fkxkahyqki"), Book("Return of the Naked Chef,The", "Oliver, Jamie", "xhpwspbhi"), Book("Jamie's Italy", "Oliver, Jamie", "ypvgy"), Book("Happy Days with the Naked Chef", "Oliver, Jamie","dyoqtx"), Book("Jamie's Ministry of Food:Anyone Can Learn to Cook in 24 Hours", "Oliver, Jamie", "foacwdyi"))
  }

  test(testName = "search bookByISBN") {
    newSearch.bookByISBN("dbfflaxab", books) shouldBe List(Book("Hunger Games,The:Hunger Games Trilogy", "Collins, Suzanne", "dbfflaxab"))
  }
}