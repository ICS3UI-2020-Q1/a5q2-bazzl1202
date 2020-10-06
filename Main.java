import java.util.Scanner;
/**
 * asks user for integer and prints all numbers up to that one on same line with commas
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user to enter in a positive integer
    System.out.println("Please enter a positive integer");
    // create variable for user input
    int posInt = input.nextInt();

    for(int count = 1; count <= posInt; count++){
      // print to user numbers with commas
      if(count == posInt){
        System.out.print(count);
      }else{
        System.out.print(count + ",");
      }
      
    }
    
  }
}
