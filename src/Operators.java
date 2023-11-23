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

        // Comparison operator

        String Name = "Aniket";
        String Name2= "Ankush";
        System.out.println(Name == Name2);
        System.out.println(Name!=Name2);
        System.out.println(a<b);
        System.out.println(a>=b);

        //Logical operator

        System.out.println(Name== Name2 && b>a);
        System.out.println(Name== Name2 || b>a);
    }

}
