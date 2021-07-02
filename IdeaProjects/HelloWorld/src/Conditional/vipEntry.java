package Conditional;
import java.util.Scanner;

public class vipEntry {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to Vip Lounge");
        System.out.print("Enter your age ?");
        int age=scanner.nextInt();

        System.out.print("Do you have a pass ? ");
        String passReply=scanner.next();

        if (age >= 18 && passReply.equals("yes")) {
            System.out.println("You are allowed to enter ");
                    }
        else{
            System.out.println("Not allowed to enter");
        }
    }
}
