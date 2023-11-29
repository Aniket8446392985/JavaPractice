public class OperatorPrecedanceAndAssociativity {

    public static void main(String args[]){

        // Precedance
        // () ha highest precendence,
        // *, / has same
        int a= 10;
        int b= 20;
        int c= 30;

        int d= b*b - 4*a*c / 2;
        int e= (b*b) - (4*a*c)/2;
        System.out.println(d);
        System.out.println(e);


        // associativity is from left to right.
    }




}
