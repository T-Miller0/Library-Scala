package com.company.library

import scala.collection.mutable.ListBuffer

class Library {
    val newSearch = new Search
    var LoanedBooks = new ListBuffer[Any]()


  def searchBook(string: String): Any = List(newSearch.bookByTitle(string),
      newSearch.bookByAuthor(string), newSearch.bookByISBN(string))

   def bookLoan(string: String): Any = (bookAvailable(string), LoanedBooks += bookAvailable(string))

   def bookAvailable(string: String): Any = !LoanedBooks.contains(string)
  }