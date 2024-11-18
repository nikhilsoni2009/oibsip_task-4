import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username");
        String username = scanner.nextLine();
        System.out.print("Enter password");
        String password = scanner.nextLine();

        if (username.equals("user") && password.equals("pass")) {
            System.out.println("login successful!");

            System.out.println("Question 1");
            System.out.println("What is the capital of India");
            System.out.println("a)Delhi");
            System.out.println("b)Mumbai");
            System.out.println("c)Kolkata");
            System.out.println("d)Chennai");

            System.out.print("enter your answer(a,b,c,d):");
            String answer1 = scanner.nextLine();
            long startTime = System.currentTimeMillis();
            long endTime = startTime + 60000;

            while (System.currentTimeMillis() < endTime) {

            }
            System.out.println("Time's up!Quiz submitted automatically.");
        }else{
            System.out.println("Invalid credentials.Please try again.");

        }
    }
}
