package com.company.library

//object Library {

  class Library {
    var books: List[Book] = com.company.library.Books.all

    def bookByTitle(title: String): Boolean = books.exists(_.title == title)
  }

//}
