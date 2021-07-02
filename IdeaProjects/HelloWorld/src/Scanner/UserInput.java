package Scanner;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
    /*Scanner a= new Scanner(System.in);
    String b = a.next();
    System.out.println(b); */
    user();
    information();
    }
//Program to read user input
    public static void user(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("What is you name ?");
        String userName=scanner.next();
        System.out.println(userName + " is a nice name");

        System.out.println("What is you age?"+userName);
        int userAge =scanner.nextInt();
        System.out.println(userAge + " Very Good");
        System.out.println("Your name is " + userName +"and you are "+ userAge +" Years old");

    }
        public static void information(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("How is things in your home ?");
        String halchal=scanner.next();
        System.out.println(halchal + "Very Nice ! Good to hear that");

        System.out.println("What is your Height in Mtrs ? ");
        Double userHight=scanner.nextDouble();
        System.out.println("Your Height is "+ userHight + "Mtrs");



        System.out.format("I have %.3f cats, %d dogs, and 1 %s ",8.6,1,"Lion");
        System.out.format("When formatted: %.1f" , 9.9-2.0);
    }

}

/* Input methods scanner provides
scanner.next();
scanner.nextInt();
scanner.nextDouble();
To grab the return value of these methods we  set appropriate variable equal to method
boolean b=scanner.nextBoolean();
name=scanner.nextLine(); -- to grab more than one tocken
 */
