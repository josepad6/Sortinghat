// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Hogwarts let the sorting hat choose your house ");
        System.out.println("Enter your name ");
        String userName = scan.nextLine();
        System.out.println("Answer the following questions with yes or no ");
        System.out.println("Do you value bravery or chivalry ?");
        String answer = scan.nextLine().toLowerCase();
        if (answer.equals("yes")) {
            System.out.println(userName + ", You belong in Gryffindor");
        } else {
            System.out.println("Do you value hard work dedication and loyalty ?");
            answer = scan.nextLine().toLowerCase();
            if (answer.equals("yes")) {
                System.out.println(userName + ", You belong in Hufflepuff");
            } else {
                System.out.println("Do you value intelligence , creativity and learning ?");
                answer = scan.nextLine().toLowerCase();
                if (answer.equals("yes")) {
                    System.out.println(userName + ",You belong in Ravenclaw ");
                } else {
                    System.out.println(userName + ",You belong in Slytherin ");
                }
            }
        }
        System.out.println("Welcome to Hogwarts ");
    }
}