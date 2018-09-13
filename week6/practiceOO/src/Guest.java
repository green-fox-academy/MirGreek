import java.util.ArrayList;

public class Guest {
  String name;
  String address;
  int videoCounter;
  ArrayList<Video> guestsVideo = new ArrayList<>();


 public Guest(String name, String address){
   this.name = name;
   this.address = address;
   this.videoCounter = 0;
 }

 @Override
  public String toString(){
   if(guestsVideo.size()==0){
     return  this.name + " is not borrowing anything currently.";
   }
   return this.name + " is currently borrowing the " + guestsVideo.get(0).title;
 }
}
