/** lecture.chapter2.HelloWorld class as first programming example
* @author Matthias Berg-Neels
* @version 1.0
* @since 1.0
*/
public class HelloWorld {

  /** main method as starting point for program start
  * @param args String array for parameters from the console
  */
  public static void main (String[] args){


	
    System.out.println("Hello " + (args.length > 0 ? args[0] : "Unbekannter") + ", to the Java World");

    for(String argument : args){
	System.out.println(argument);
    }
  }
}
