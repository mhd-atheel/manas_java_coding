import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner inputvalue = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks = inputvalue.nextInt();
        inputvalue.close();
        if (marks > 100) {
            System.out.print("Invalid Number you Must Put marks Under 100");
        } else if (marks >= 75) {
            System.out.print("Your Marks is :" + marks +" \n" +" Your Grade is  'A' ");
        }else if (marks >= 65) {
            System.out.print("Your Marks is :" + marks +" \n" +" Your Grade is  'B' ");
        }else if (marks >= 50) {
            System.out.print("Your Marks is :" + marks +" \n" +" Your Grade is  'C' ");
        }else if (marks >= 35) {
            System.out.print("Your Marks is :" + marks +" \n" +" Your Grade is  'S' ");
        }else{
            System.out.print("Your Marks is :" + marks +" \n" +" Your Grade is  'W' ");
        }
    }

}