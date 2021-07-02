package Conditional;
import java.util.Scanner;

public class Condit1 {
public static void main (String[] args){
 Scanner scanner=new Scanner(System.in);

 System.out.print("Please Enter your Height : ");
 int height=scanner.nextInt();

 /*if(height<130 ) {
     System.out.println("Sorry you are too short");

 }
 else if (height>210) {
  System.out.println("You are too tall");

 }
 */
 if(height < 130 || height > 210 ) {
  System.out.println("Not meet the height requirements.");
 }
 else {
  System.out.println("Please go ahead");
   }
}
}
