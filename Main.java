public class Main {
  public static void main(String[] args) {
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting);

    int x = 7;
    float f = 42.3f;
    double d = 42.3;

    // execute the function called "loopTo" and pass 10 as a parameter
    // loopTo(10);

    // int four = 4;
    // int result = multiplyByTwo(four);
    // System.out.println(four + " doubled is " + result);
    pluralize(cat,0);
  }

  // Functions that return nothing have a return type of "void"
  public static void pluralize(String word,int count) {
    String res = "";
    if(count==0||count>1){
      res = word+"s";
    }
    else {
      System.out.println("I have" + count + res)
    }
  }

  // This function has a return type of "int"
  public static int multiplyByTwo(int n) {
    return n * 2;
  }
}
