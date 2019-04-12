package com.company.library

import java.time.format.DateTimeFormatter

import scala.collection.mutable.ListBuffer

class Library {
  val newSearch = new Search
  val books: List[Book] = com.company.library.Books.all
  var loanedBooks = new ListBuffer[List[Book]]()
  var referencedBooks = new ListBuffer[List[Book]]()
  var loanedDetails = new ListBuffer[Any]()


  def searchBook(string: String): List[Book] = newSearch.bookByTitle(string, books) ++
      newSearch.bookByAuthor(string, books) ++ newSearch.bookByISBN(string, books)

  def bookLoan(book: String, name: String): Any = if (bookAvailable(book)) {
    loanedDetails += visitorNameToBook(book, name)
//    + ListBuffer(returnTime).toList
    (loanedBooks += searchBook(book)).toList }
    else {"Book is Unavailable" }

  def bookAvailable(string: String): Boolean = {
    val unavailableBooks = referencedBooks.flatten.toList ++ loanedBooks.flatten.toList
     (newSearch.bookByTitle(string, unavailableBooks) ++ newSearch.bookByAuthor(string, unavailableBooks) ++
       newSearch.bookByISBN(string, unavailableBooks)).isEmpty}

  def addReferencedBook(string: String): Any = (referencedBooks += searchBook(string)).flatten.toList

  def returnedBook(string: String, name: String): Any = { loanedBooks -= searchBook(string)
  removeFromDetailsList(string, name) }

  def removeFromDetailsList(string: String, name: String): Any = (loanedDetails -= visitorNameToBook(string, name)).toList

  def visitorNameToBook(desiredBook: String, name: String): Any = searchBook(desiredBook).head + name

  def returnTime: String = {
    val formatter = DateTimeFormatter.ofPattern("dd-mm-yy HH:mm")
    val newTime = java.time.LocalDateTime.now.plusDays(3)
    newTime.format(formatter)
  }
}