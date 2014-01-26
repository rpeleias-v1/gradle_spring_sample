package hello;

import org.joda.time.LocalTime;

public class HelloGoku {
  
  public static void main(String args[]) {
    LocalTime currentTime = new LocalTime();
    System.out.println("Current local time: " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
