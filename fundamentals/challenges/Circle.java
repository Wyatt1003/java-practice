import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the diameter of the circle");
        double diameter = Double.parseDouble(input.nextLine());

    System.out.println("The area of the circle is: " + ((diameter/2) * (diameter/2) * (Math.PI)));
}
}