package com.company.library

import scala.collection.mutable.ListBuffer

class Library {
  val newSearch = new Search
  val books: List[Book] = com.company.library.Books.all
  var loanedBooks = new ListBuffer[List[Book]]()
  var referencedBooks = new ListBuffer[List[Book]]()

  def searchBook(string: String): List[Book] = newSearch.bookByTitle(string, books) ++
      newSearch.bookByAuthor(string, books) ++ newSearch.bookByISBN(string, books)

   def bookLoan(string: String): Any = if (bookAvailable(string)) {
     loanedBooks += searchBook(string) }
    else {"Book is Unavailable" }

   def bookAvailable(string: String): Boolean = {
     val unavailableBooks = referencedBooks.flatten.toList ++ loanedBooks.flatten.toList
     (newSearch.bookByTitle(string, unavailableBooks) ++ newSearch.bookByAuthor(string, unavailableBooks) ++
       newSearch.bookByISBN(string, unavailableBooks)).isEmpty}

   def addReferencedBook(string: String): Any = (referencedBooks += searchBook(string)).flatten
  }