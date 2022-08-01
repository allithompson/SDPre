import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number");

    int userNum = input.nextInt();

    if(userNum % 2 == 0) {
      System.out.println("The number is even");
    }
    if(userNum % 2 == 1) {
      System.out.println("The number is odd");
    }
  input.close();
  }
}
