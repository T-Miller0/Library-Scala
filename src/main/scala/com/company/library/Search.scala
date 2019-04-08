package com.company.library

import scala.collection.mutable.ListBuffer

class Search {
  val books: List[Book] = com.company.library.Books.all
  val searchedBook = new ListBuffer[Book]

  def bookByTitle(string: String): Any = books.filter(_.title == string)

  def bookByAuthor(author: String): Any = books.filter(_.author == author)

  def bookByISBN(ISBN: String): Any = books.filter(_.ISBN == ISBN)

}
