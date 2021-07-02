package Scanner;

import java.util.Scanner;

public class Exercise{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("What is your Name");
        String userName=scanner.nextLine();
        int howchar=userName.length();
        System.out.println("Welcome" + userName);
        System.out.println("Your name consists "+ howchar +" Characters");


        System.out.println("What is your age ? ");
        int userAge=scanner.nextInt();
        System.out.println("Your age is " + userAge + "in another" + userAge + "you will be " + 2 * userAge + " Years old ");

    }
}
