import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter one word");
        String w1 = input.nextLine();

    System.out.println("Enter another word");
        String w2 = input.nextLine();

    System.out.println("Enter one number");
        int n1 = Integer.parseInt(input.nextLine());

    System.out.println("Enter one number");
        int n2 = Integer.parseInt(input.nextLine());

        System.out.println("Your email is: " + w1 + w2 + (n1 + n2) + "@gmail.com");
}
}