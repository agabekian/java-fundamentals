import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.*;
import javaRand.test;

public class Main {
  public static void main(String[] args) {

    // System.out.println(pluralize("cat",16));
    // System.out.println(pluralize("dog",1));
    System.out.println(flipNHeads(3));
    test();
    // clock();
    
  }

  public static String pluralize(String word,int count) {
    String res = "";
    if(count==0||count>1){
      res = word+"s";
    }
    else {
      res=word;
    }
    return "I have " + count +" "+ res;
  }

  public static String flipNHeads(int n){
    int counter = 0;
    int start = 0;
    String res = "";
    
    Random rand = new Random();

    while(start < n ){
    int side = rand.nextInt(2);
      if(side == 0) {
      res = "heads";
    } else {
      res = "tails";
    }
      counter+=1;
      if(res=="heads") start+=1;
      else start=0;

      System.out.println(res);
    }
    return "It took "+counter+" flips to flip "+ n +" heads in a row.";
}

    public static void clock(){ //needed Ben's help with this
      LocalDateTime now = LocalDateTime.now();
      int hour = now.getHour();
      int minute = now.getMinute();
      int second = now.getSecond();
// or, if you're feeling fancy
      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

      while (true){
        now = LocalDateTime.now();
        String sNow = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        if(!sNow.equals(time)){
        time = sNow;
        System.out.println(time);
        }

      }
    }
}