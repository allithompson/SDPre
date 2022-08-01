import java.util.Scanner;
public class Objective4Lab1 {
public static void main(String[] args) {

  Scanner keyboard = new Scanner(System.in);

  System.out.println("What is your first name?");
  String fname = keyboard.next("John");

  System.out.println("What is your last name?");
  String lname = keyboard.next("Doe");

  System.out.println("What is your favorite animal?");
  String favoriteAnimal = keyboard.next("Lemur");

  System.out.println("What is your favorite food?");
  String favoriteFood = keyboard.next("Tacos");

  System.out.println("What is your favorite song?");
  String favoriteSong = keyboard.next("TwinkleTwinkleLittleStar");

keyboard.close();

  System.out.println("My name is " + fname + lname + ".");
  System.out.println("My favorite aninal is the " + favoriteAnimal + ".");
  System.out.println("My favorite food is " + favoriteFood + ".");
  System.out.println("My favorite song is " + favoriteSong + ".");

}
}
