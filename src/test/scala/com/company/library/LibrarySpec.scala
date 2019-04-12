package com.company.library

import org.scalatest.{FunSuite, Matchers}

class LibrarySpec extends FunSuite with Matchers {
  val myLibrary = new Library

   test(testName = "check if bookAvailable") {
     myLibrary.searchBook("About a Boy") shouldBe List(Book("About a Boy","Hornby, Nick","fmagkdj"))
   }

  test(testName = "add visitorNameToBook") {
    myLibrary.visitorNameToBook(desiredBook = "About a Boy", name = "Visitor Name ") shouldBe "Book(About a Boy,Hornby, Nick,fmagkdj)Visitor Name "
  }

  test(testName = "BookLoan adds book to list") {
    myLibrary.bookLoan(book = "About a Boy", name = "Visitor Name") shouldBe List(List(Book("About a Boy","Hornby, Nick","fmagkdj")))
  }

  test(testName = "A BookLoan is unavailable") {
      myLibrary.bookLoan(book = "ewvxsoql", name = "Visitor Name")
      myLibrary.bookLoan(book = "Lost Symbol,The", name = "Visitor Name") shouldBe "Book is Unavailable"
    }

  test(testName = "See if book is available") {
     myLibrary.bookAvailable(string = "Eclipse") shouldBe true
  }

  test(testName = "add book to referencedBooks list") {
    myLibrary.addReferencedBook(string = "Twilight") shouldBe List(Book("Twilight","Meyer, Stephenie","yqykgn"))
  }

    test(testName = "removeFromDetailsList") {
      myLibrary.bookLoan(book = "foacwdyi", name = "Visitor One")
      myLibrary.removeFromDetailsList(string = "foacwdyi", name = "Visitor One" )
    }

  test(testName = "returnedBook removes from loanedBooks list") {
    myLibrary.bookLoan(book = "ipszbehyh", name = "My Book")
    myLibrary.returnedBook(string = "ipszbehyh", "My Book") shouldBe List("Book(About a Boy,Hornby, Nick,fmagkdj)Visitor Name", "Book(Lost Symbol,The,Brown, Dan,ewvxsoql)Visitor Name")
    }
 }
