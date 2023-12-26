public class Study_34_Recursion
{
    // Recursion is a technique where a method can cll itself

    // lets find out  the factorial
    // factorial of any number is multiplication of all the num and allots prevuous number
    // Factoraial of 4 is-- 4*3*2*1=24
    // OR Factorial of 4 id--4* 3factorial

    public int  factorial(int n){

        //factorial of 5= 5* factoroal od (5-1);
        if (n==0 || n==1){
            return  1;
        }
        else {

            int fact = n * factorial(n - 1);
            return fact;
        }
    }


    // lets practice with febonacci sequence
    // 0,1,1,2,3,5,8,13,.......
    // In Febo sequence nextnum = curnum+lastnum;

    public void febo(int n)
    {
        int lastnum =0;
        int curnum=1;
        n=10;

        for (int count=0; count<=n-2;count++)
        {
            if (lastnum==0){
                System.out.println(lastnum);
                System.out.println(curnum);
            }
            int nxtnum = curnum+lastnum;
            System.out.println(nxtnum);
            lastnum=curnum;
            curnum = nxtnum;
        }
    }

    public static void main(String[] args) {
        Study_34_Recursion  ob = new Study_34_Recursion();

        System.out.println(ob.factorial(4));
        ob.febo(5);
    }













}
