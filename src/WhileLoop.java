public class WhileLoop {

    public static void main(String args []){

        // loops are used to execute a set of code to exexute again and again
        // while loop will keep on executing until the condition inside the loop is true

        int a=2;
        while (a<=100)
        {
             System.out.println("Values of a is " + a);
             a++;
        }
/*
        int a=2;
        int b=a%2;
        while (a<=100)
        {
            int b=a%2;
            if (b==0) {
                System.out.println("Values of a is " + a);
            }
            a++;
        }
*/


        // Do while loop this is a loop which will execute once even if the condition is not true in side while

        do {
            System.out.println(a);
            a++;
        }
        while
        (a<=150);

/*
        int d= a%2;
        do {
            if (d==0)
            {System.out.println(a);}
            a++;
        }
        while
        (a<=150);
        */
    }
}
