import java.util.Scanner;

public class Conditionals {

    public void CheckDriveAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int Age = sc.nextInt();
        if (Age >= 18) {
            System.out.println("you can drive");
        } else {
            System.out.println("NOT drive");
        }
    }
    public static void main(String args[])
    {
        Conditionals cd= new Conditionals();
        cd.CheckDriveAge();
    }
}



