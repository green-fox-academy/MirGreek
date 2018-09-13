public class VideoLibrary {
  public static void main(String[] args) {
    // Create a VideoLibrary Application, where the guests can borrow
    // the videos available in the database.
    // Every guest should have a name and an address.
    // The guest is able to borrow exactly one Video at one time.
    // The video has title, director, release year,
    // the number of guests who ever borrowed the video
    // and also if the video is borrowed currently.

    Guest guest = new Guest("Jon Doe", "Somewhere in Minnesota");
    Video video = new Video("Titanic", "James Cameron", 1997);
    Video video2 = new Video("Életre valók", "Én", 2010);
    Video video3 = new Video("Hagyma élete", "Te", 2022);
    VideoStore store = new VideoStore();
    store.addGuest(guest);
    store.addVideo(video);
    store.addVideo(video2);
    store.addVideo(video3);

    store.borrow(guest, video);

    store.returnVideo(guest, video);
    store.borrow(guest,video2);

    // This borrow method should be handled with the below exceptions:
    // if the guest already has a video borrowed (throw exception)
    // if the video is not currently available (throw exception)

    System.out.println(guest);
    // should print out
    // Jon Doe is currently borrowing the Titanic.
    System.out.println(store);
    // The store has 0 videos available right now and 1 guests registered.
    store.returnVideo(guest, video2);

    System.out.println(guest);
    // Jon Doe is not borrowing anything currently.
    store.borrow(guest,video);
    System.out.println(video2);
    // Titanic by James Cameron from 1997 - borrowed 1 times.
    System.out.println(store);
    // The store has 1 videos available right now and 1 guests registered.
    System.out.println(store.getMostTimeBorrowed());
    // The most borrowed video is Titanic - borrowed 1 times.
  }
}