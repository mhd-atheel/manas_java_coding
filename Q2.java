import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner inputmarks = new Scanner(System.in);
        System.out.print("Enter Your Maths Marks : ");
        int mathsmarks = inputmarks.nextInt();
        System.out.print("Enter Your Science Marks : ");
        int Sciencemarks = inputmarks.nextInt();
        System.out.print("Enter Your ICT Marks : ");
        int IctMarks = inputmarks.nextInt();
        inputmarks.close();
        int total = mathsmarks + Sciencemarks + IctMarks;
        System.out.println("Total Marks is  : "+total);
        System.out.println("Total Avarage is  : "+total/ 3);

    }
}