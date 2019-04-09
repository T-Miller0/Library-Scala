package com.company.library

import scala.collection.mutable.ListBuffer

class Library {
    val newSearch = new Search
    var loanedBooks = new ListBuffer[Any]()
    var referencedBooks = new ListBuffer[Any]()


  def searchBook(string: String): Any = (newSearch.bookByTitle(string),
      newSearch.bookByAuthor(string), newSearch.bookByISBN(string))

   def bookLoan(string: String): Any = (bookAvailable(string), loanedBooks += bookAvailable(string))

   def bookAvailable(string: String): String = if (!loanedBooks.contains(string) && !referencedBooks.contains(string)) {
    s"Book available, $string" }
    else { "Book unavailable"
   }

   def addReferencedBook(string: String): Any = referencedBooks += searchBook(string)
  }