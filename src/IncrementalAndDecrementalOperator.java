import java.sql.SQLOutput;

public class IncrementalAndDecrementalOperator {

    public static void main(String args []){

        // Incremental Operator
        // a++, ++a


        //Exmaple 1

        int a= 10;
        int b= a++;
        //Value of A during assignment to b is 10 and then it got incremented
        System.out.println(b); // 10 will be printed
        System.out.println(a); // 11 will be printed


        // Example 2

        int p = 20;
        int q = ++p;
        // P will be 1st incremented and then assigned to Q
        System.out.println(q); // 21 will be printed

        // Exmaple 3

        char c= 'A';
        char d= ++c;
        //Value of c will be incremented 1st and the gets assigned to d
        System.out.println(d);// B will be printed


        // Decremental Operator
        // A--, --A

        //Example 4

        int x= 30;
        int y= x--;
        //value of x will be assigned to y 1st and then will drcrease
        System.out.println(y); // 30 will be printed
        System.out.println(x); // 29 will be printed

        //Exmpale 5

        int m=40;
        int n=--m;
        //value of m will be 39 and then it will get asisgned to n
        System.out.println(n); // 39 will be printed
        System.out.println(m); // 39 will be printed

    }




}
