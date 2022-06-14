import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are You Sri Lanka Citizen (Yes/No)");
        String citz = input.nextLine();
        System.out.println("You Age");
        int age = input.nextInt();
        input.close();
        System.out.println(citz.toLowerCase());
        if (citz.toLowerCase().equals("yes" ) && age>=18 ) {
            System.out.println("You Can Vote");
        } else {
            System.out.println("You will Get Vote Next Election");

        }
    }
}
