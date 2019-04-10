package com.company.library

class Search {

  def bookByTitle(string: String, theList: List[Book]): List[Book] = theList.filter(_.title == string)

  def bookByAuthor(author: String, theList: List[Book]): List[Book] = theList.filter(_.author == author)

  def bookByISBN(ISBN: String, theList: List[Book]): List[Book] = theList.filter(_.ISBN == ISBN)

}
