import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VideoStore {

  ArrayList<Guest> guestList;
  ArrayList<Video> videoList;
  int videosAvailable;

  public VideoStore(){
    videosAvailable = 0;
    guestList  = new ArrayList<>();
    videoList  = new ArrayList<>();
  }

  public void addGuest(Guest guest){
      guestList.add(guest);
  }

  public void addVideo(Video video){
    videoList.add(video);
    videosAvailable++;
  }
  public void borrow(Guest guest, Video video){
    if (video.isBorrowed == false && guest.videoCounter == 0){
      video.isBorrowed = true;
      guest.guestsVideo.add(video);
      videosAvailable--;
      video.borrowCounter++;
    } else if (video.isBorrowed == true) {
      throw new IllegalArgumentException("Video not available");
    } else throw new IllegalArgumentException("You have to bring back the video first");
  }

  @Override
  public String toString(){
   return "The store has " + this.videosAvailable   + " videos available right now and " + guestList.size() + " guests registered.";
  }

  public void returnVideo(Guest guest, Video video){
    video.isBorrowed = false;
    guest.guestsVideo.remove(video);
    videosAvailable++;
  }

  public String getMostTimeBorrowed(){
    int max=0;

    return getBorrowCount(max) + "  so that is borrowed most of the times" ;
  }
  HashMap<Video,Integer> borrowTimes =new HashMap<>();
  public String getBorrowCount(int max){
    for (int i = 0; i <videoList.size() ; i++) {
      if(borrowTimes.containsKey(videoList.get(i))){
        borrowTimes.put(videoList.get(i),1);
        System.out.println(borrowTimes);
      } else borrowTimes.put(videoList.get(i),videoList.get(i).borrowCounter+1);
      System.out.println(borrowTimes);

    }
    max = Collections.max(borrowTimes.values());
    for (Map.Entry<Video,Integer> entry:borrowTimes.entrySet()) {
              if (entry.getValue()== max){
                return entry.getKey().title + " is the title of film " + max + " times borrowed, ";
              }
    }
   return null;
  }

}
