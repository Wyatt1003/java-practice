import java.util.Scanner;

public class MadLibs {

    public static String formatWord(String word) {
        word = word.toLowerCase();
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adj1 = input.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = input.nextLine();

        System.out.print("Enter a past-tense verb: ");
        String verb1 = input.nextLine();

        System.out.print("Enter another adjective: ");
        String adj2 = input.nextLine();

        System.out.print("Enter another noun: ");
        String noun2 = input.nextLine();

        System.out.print("Enter a past-tense verb: ");
        String verb2 = input.nextLine();

        System.out.print("Enter a noun: ");
        String noun3 = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adj3 = input.nextLine();

        System.out.print("Enter a past-tense verb: ");
        String verb3 = input.nextLine();

        System.out.print("Enter a noun: ");
        String noun4 = input.nextLine();

        System.out.println(
            "\n\t" + formatWord(adj1) + " " + noun1.toLowerCase() + " " + verb1.toLowerCase() +
            " through the town as the " + adj2.toLowerCase() + " " + noun2.toLowerCase() +
            " watched silently.\n" +
            "Later that night, the group " + verb2.toLowerCase() +
            " near a lonely " + noun3.toLowerCase() + " under the stars.\n" +
            "The air felt " + adj3.toLowerCase() + ", and everyone " +
            verb3.toLowerCase() + " without saying a word.\n" +
            "Suddenly, a mysterious " + noun4.toLowerCase() +
            " appeared, changing everything forever.\n" +
            "In the end, the moment was remembered as one of the strangest nights in history.\n" +
            "No one ever forgot what happened after that."
        );

        input.close();
    }
}
