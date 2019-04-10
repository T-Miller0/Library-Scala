package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers

class LibrarySpec extends FunSuite with Matchers {
  val myLibrary = new Library()

   test(testName = "check if bookAvailable") {
    myLibrary.searchBook("About a Boy") should contain; "Hornby, Nick"
   }

  test(testName = "BookLoan adds book to list") {
    myLibrary.bookLoan(string = "About a Boy") should contain; "About a Boy,Hornby Nick,fmagkdj"
  }

  test(testName = "See if book is available") {
     myLibrary.bookAvailable(string = "Eclipse") shouldBe true
  }
  test(testName = "add book to referencedBooks list") {
    myLibrary.addReferencedBook(string = "Twilight") should be; "ListBuffer((List(Book(Twilight,Meyer, Stephenie,yqykgn)),List(),List()))"
  }
 }
