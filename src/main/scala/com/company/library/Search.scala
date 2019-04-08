package com.company.library

class Search {
  val books: List[Book] = com.company.library.Books.all

  def bookByTitle(string: String): Any = books.filter(_.title == string)

  def bookByAuthor(author: String): Any = books.filter(_.author == author)

  def bookByISBN(ISBN: String): Any = books.filter(_.ISBN == ISBN)

}
