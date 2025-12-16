import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String psswrd = "Ohio Understandation";

    System.out.println("Enter Your Password");
    String usrpsswrd = input.nextLine();

    if (psswrd.equals(usrpsswrd)){
        System.out.println("Correct Password");
    } else {
        System.out.println("Incorrect Password");
    }
}
}


