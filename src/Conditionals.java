import java.util.Scanner;

public class Conditionals {
    public static void main (String args[])
    {
        // If Else stataments
        // if the condition written inside the if statement (condition) is true then if block will execute or else block will execute

        Scanner sc = new Scanner(System.in);
/*        System.out.println("Please enter your age");
        int Age = sc.nextInt();

       // relational operator
        if (Age >= 18) {
            System.out.println("you can drive");
        } else {
            System.out.println("NOT drive");
        }
*/
        // Logical operators
        System.out.println("Please enter the name ");
        String Name= sc.nextLine();
        System.out.println("Please enter the text to match with name");
        String OtherName= sc.nextLine();

        if (Name.equalsIgnoreCase(OtherName) && Name.equals(OtherName))
        {
            System.out.println("Both Names Are same");
        }
        else {
            System.out.println("Both name are different");
        }


    }
}



