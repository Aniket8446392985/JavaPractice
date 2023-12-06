import java.util.Scanner;

public class IfElseIf {


    public static void main (String args []){

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your Age");
        int age =sc.nextInt();


        // This is an "IF ELSE IF" ladder
        // This will stop executing the code if any of the condition mentioned is true and execute that block
        if (age >=18 && age < 30){
            System.out.println("You are an adult");
        } else if (age >=30 && age < 50){
            System.out.println("You are mid aged");
        } else if  (age>=50 && age < 60){
            System.out.println("You are aged");
        } else if (age >=60){
            System.out.println("you are Senior citizen");
        }

    }
}
