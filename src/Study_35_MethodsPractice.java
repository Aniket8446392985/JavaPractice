public class Study_35_MethodsPractice {

    // pracctiuce 1
    // Write a method to display multiplication table of number n

    public static void table(int n)
    {
        for (int a=1; a<=10;a++){
            int mul = a*n;
            System.out.println(mul);
        }
    }

    // Write a programe to print following patters
    /*    *
     * *
     * * *
     * * * *
     */

    public static void star(int n)
    {
        for (int row=1;row<=n;row++)
        {
            for(int col=1;col<=row; col++ )
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }


    // write a recursive function to write sum of first n natural numbers
    public static int nat(int n)
    {
        if (n >= 1) {
            int sum = n + nat(n-1);
            return sum;}
        else return 0;
    }

    // write a pattern to print reverse start  triangle

    public static void revstar(int n){
        for (int a=n ; a>0; a--)
        {
            for (int b=a; b>0; b--) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }


    // write an function to return nth digit of febonacci sequence

    //

   public static void febon(int n)
   {
        int curnum=1;
        int lastnum=0;
        for (int count= 0; count <=n-3; count++)
        {
            int nxtnum = curnum + lastnum;
            if (count==n-3){
                System.out.println(nxtnum);
            }
            lastnum = curnum;
            curnum = nxtnum;
        }
    }

    // wrong method
    /*public static int febon(int n){

        int curnum=1;
        if (curnum>=1) {
            int nxtnum = curnum + febon(n - 1);
            return nxtnum;
        }
        else{
            return 1;
        }
    }*/



    public static void main (String[] args) {
        table(3);
        star(5);
        System.out.println(nat(5));
        revstar(4);
        febon(20);
    }

}

