package com.company.library

class Search {
  var books: List[Book] = com.company.library.Books.all

  def bookByTitle(title: String): Boolean = books.exists(_.title == title)

  def bookByAuthor(author: String): Boolean = books.exists(_.author == author)

  def bookByISBN(ISBN: String): Boolean = books.exists(_.ISBN == ISBN)

}
