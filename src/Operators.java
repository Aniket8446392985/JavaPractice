import java.sql.SQLOutput;

public class Operators {

    /* There are following type of operators in java

     Arithmatic ---- + , - , * , /, %
     Assignment ---- =, +=
     Comparison ---- == , <= , >=
     Logical  ---- && , || , !
     Bitwise ---- & , |

     Arithmatic operator can not work with Booleans
     % operator only work with Floats and double
     */

    public static void main(String[] args)
    {
        //Arithmatic operators

        float a = 7;
        float b= 22;
        System.out.println(a+b); // addition
        System.out.println(a-b); // substraction
       // System.out.println(a+=b);// This operator will add b in a and assign that value to a
       // System.out.println(a);
        double c = b/a;
        System.out.println(c);

        // Assignment operator

        String Name = "Aniket";
        String Name2= "Ankush";
        System.out.println(Name == Name2);
        System.out.println(Name!=Name2);

        // Comparison operator
        System.out.println(a<b);
        System.out.println(a>=b);

        //Logical operator

        System.out.println(Name== Name2 && b>a);
        System.out.println(Name== Name2 || b>a);

        //Bitwise opereator
        // this operator will convert the entered values in bit code and then does the operation mentioned
        // eg & and |
        int x =2;
        int y =3;
        System.out.println(x & y);
        System.out.println(x | y);

    }

}
