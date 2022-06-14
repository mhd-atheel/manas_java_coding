import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter Total Amount");
        int totalamount = input.nextInt();
       input.close();
        if(totalamount>=10000){
            System.out.println("Total Amount :"+totalamount);
            System.out.println("Discount :"+totalamount*10/100);
            System.out.println("Money to Pay :" + (totalamount-totalamount*10/100));
        }else if(totalamount>=5000){
            System.out.println("Total Amount :"+totalamount);
            System.out.println("Discount :"+totalamount*5/100);
            System.out.println("Money to Pay :" + (totalamount-totalamount*5/100));
        }else{
            System.out.println(" Your Total Amount is :"+totalamount);
            System.out.println("Sorry only have discounts above 5000 rupees");
            System.out.println("Above 5000 rupees  5% discount");
            System.out.println("Above 10000 rupees  10% discount");
            System.out.println("Please Purchase quickly... \n Discount End Soon ...");
        }
    }
}