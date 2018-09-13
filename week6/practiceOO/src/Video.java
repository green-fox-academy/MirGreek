public class Video {
  String title;
  String director;
  int releaseYear;
  //int guestCounter;
  boolean isBorrowed;
  int borrowCounter;

  public Video(String title, String director, int releaseYear){
    this.title = title;
    this.director = director;
    this.releaseYear = releaseYear;
    this.borrowCounter = 0;
    this.isBorrowed = false;
  }
    @Override
  public String toString(){
    return  this.title +  " by " + this.director + " from " + this.releaseYear + " - borrowed " + this.borrowCounter + " times.";
    }
}
