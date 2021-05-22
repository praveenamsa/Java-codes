
package newpackage;
import java.util.ArrayList;

/**
 *
 * @author PRAVEENAGRUD
 */

interface StringFunction {
  String run(String str);
  }
public class ThreadProgram extends Thread implements Runnable{
    public static int amount = 1;
    public static void main(String[] args) {
    ThreadProgram thread = new ThreadProgram();
    thread.start();
    // Wait for the thread to finish
    while(thread.isAlive()) {
    System.out.println("Waiting...");
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);list.add(4);
    list.forEach((n) -> {System.out.println(n);});
    
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }
    
  // Update amount and print its value
  System.out.println("Main: " + amount);
  amount++;
  System.out.println("Main: " + amount);
  }
  public void run() {
    amount++;
  } 
    public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }
}
