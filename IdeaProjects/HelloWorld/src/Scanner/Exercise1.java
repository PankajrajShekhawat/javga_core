package Scanner;

import java.util.Scanner;

public class Exercise1 {
public static void main(String[] args){

    Scanner scanner= new Scanner(System.in);

    System.out.println("What is the Total Bill ? ");
    double totalBill=scanner.nextDouble();
    System.out.println("How many total persons ?");
    int totalPerson=scanner.nextInt();
   // System.out.println("Sharing per person is " + totalBill/totalPerson);
    double eachPay = totalBill/totalPerson;
    System.out.format("Sharing per person is %.2f",eachPay);
 }

}
