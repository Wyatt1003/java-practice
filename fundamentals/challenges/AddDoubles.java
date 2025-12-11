import java.util.Scanner;
public class AddDoubles {    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("input one number");
        String n1 = input.nextLine();

        int n1C = Integer.parseInt(n1);

    System.out.println("input another number");
        String n2 = input.nextLine();

        int n2C = Integer.parseInt(n2);

    System.out.println((n1C / n2C));
        
}
}