public class LoopPracticeQuestions {

    public static void main(String[] args) {
        // Practice problem 1
        // Star pattern printing using for loop

     /*   for(int j=4; j>=1;j--)
        {
            int lim = j;
            for (int r = 1; r <= lim; r++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        */

        // Practice problem 2
        // Print sum of all even numbers till n

       /* int sum =0;
        int i=0;
        int n=10;
        while(i<=n){
            int re=i%2;
            if (re==0){
             sum=sum+i;
            }
            i++;
        }
        System.out.println("sum is " +sum);*/

        // Practice Problem 2 using for loop
        /*int n=10;
        int sum=0;
        for (int i=0;i<=n;i++){
            int even=i%2;
            if (even==0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("The sum of all even number till " +n+ " is " +sum );*/

        // Practice problem 3
        // Sum of 1st n even numbers using for loop
       /*
        int sum= 0;
        int n = 3;
        int count = 0;
        for (int i=0;;i++){
            int even=i%2;
            if (even==0)
            {
                System.out.println(i);
                sum=sum+i;
                count++;
            }
           if (count==n){break;}
        }
        System.out.println("sum is " +sum);
        */


        // Practice problem 3
        // Sum of 1st n even numbers using while loop

      /*  int sum =0;
        int n=0;
        int i = 0;
        while (i>=0)
        {
            int even =i%2;
            if (even==0){
                System.out.println(i);
                sum=sum+i;
                n++;
            }
            i++;
            if(n==3){break;}
        }
        System.out.println("sum is " +sum);
*/

        // Practice problem 4
        //Create a table of number n

       /*
        int n=2;
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        */

        // Practice problem 5
        //Create a table of number n in reverse order
        /*
        int n=4;
        for(int i=10;i>=1;i--){
            System.out.println(n*i);
        }
        */


        // Practice problem 6
        //write a program to find the factorial of given number n

        int facto=1;
        int n= 5;
        for(int i=n;i>0;i--){
            System.out.println(i);
            facto=facto*i;
        }
        System.out.println(facto);

    }

}
