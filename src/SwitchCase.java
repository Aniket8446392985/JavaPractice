import java.util.Scanner;

public class SwitchCase {

    public static void main(String args []){
        System.out.println("Please enter the value ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        String Name = "Aniket";

        // following statement is a switch and case
        // switch is used to check the condition mentioned in (condition) part if switch is true with multiple cases
        // even if the 1 case matches with switch all of the following cases with get executed
        // Other wise default part will be executed
        // to restrict the execution of cases use has to use Break statement to  stop the execution and come out
        switch (a)
        {
            case 10: { System.out.println("Value is 10");
                System.out.println("value " +a+ " is correct");
            }
            //break;
            case 20: {System.out.println("Value is 20");
                System.out.println("value " +a+ " is correct");}
            //break;
            case 30: {System.out.println("Value is 30");
                System.out.println("value " +a+ " is correct");}
            //break;

            default: System.out.println("Value entered does not match");
        }
    }
}
