import java.util.*;

public class Bookshelf {
  // Create a Bookshelf class that has a list of books in it
  // We should be able to add and remove books
  // We should be able to query the favourite author (who has written the most books in the shelf)
  // We should be able to query the earliest published books.
  // We should be able to query the latest published books.
  // Bookshelf should have a toString() method which give us information about the number of books,
  // the earliest and the latest released books, and the favourite author
  List<Book> bookShelf;
  HashMap<Integer,String> booksPublished = new HashMap<>();
  public Bookshelf() {
    bookShelf = new ArrayList<>();
  }

  public void add(Book book) {
    bookShelf.add(book);
  }

  public void remove(String titleToRemove) {
    for (int i = 0; i < bookShelf.size(); i++) {
      if (bookShelf.get(i).title == titleToRemove) {
        bookShelf.remove(i);
      }
    }
  }

  public String favoriteAuthor(){
    booksPublished = new HashMap<>();
    int counter=1;
    for (int i = 0; i <bookShelf.size() ; i++) {
      if (!booksPublished.get(i).contains(bookShelf.get(i).author)){
        booksPublished.put(1,bookShelf.get(i).author);
      }  else
        booksPublished.put(counter,bookShelf.get(i).author);
      counter++;
    }
    return booksPublished.get(counter);
  }




  public String earliestPublichedBook(){

   booksPublished = new HashMap<>();
    for (int i = 0; i <bookShelf.size() ; i++) {
        booksPublished.put(bookShelf.get(i).releaseYear,bookShelf.get(i).title);
    }

    List<Integer> sortedKeys=new ArrayList(booksPublished.keySet());
    Collections.sort(sortedKeys);
    System.out.println(sortedKeys);
    Integer earliest = sortedKeys.get(0);
    Integer latest = sortedKeys.get(sortedKeys.size()-1);
    String earliestTitle="";
    String latestTitle="";
    for (int i = 0; i <bookShelf.size() ; i++) {
      if (earliest == bookShelf.get(i).releaseYear){
        earliestTitle=bookShelf.get(i).title;
      }
      if (latest == bookShelf.get(i).releaseYear){
        latestTitle=bookShelf.get(i).title;
      }
    }
    return earliestTitle + "( " + earliest + " ) "+", " + latestTitle + "( " + latest+ " ) ";
  }
  // We should be able to query the favourite author (who has written the most books in the shelf)




  @Override
  public String toString() {
    if(bookShelf.size()==0){
      return "you have no books here";
    } else return "You have " + bookShelf.size() + " books." + " The earliest, ande latest released books are : " + earliestPublichedBook() + "The most recent author is " + favoriteAuthor();
  }
}