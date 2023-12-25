public class MethodStudy2 {
    // Method overloading

    // Using same name for method with different number of arguments / parameters is known as Method overloading

    public static void sum (int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }


    public static void sum(int a, int b, int c){
        int sum=(a+b+c);
        System.out.println(sum);
    }

    //above 2 functions are the examples of method overloading
    // 2nd method and 1st method have same name but different no of parameters

   /* public static void main (String [] args){
        sum(1,2);
        sum(1,2,3);
    }*/



    //Variable arguments passing


    // Now if i wanted tp create a method that makes addition but i did not know the number of inputs i have,
    // In this case variable arguments / parameters will help

    public static void varsum(int ...vars){
        int add=0;
        for (int a: vars){
            add +=a;
        }
        System.out.println("The addition is : " +add);

    }

    // In above method no argument is mandatpry user can give 0 or n number of variables
    // to make one arguemnt mandatory follow following method

    public static void onefixsum (int a, int ...arr){
        int added=0;
        for (int x: arr){
            added +=x;
        }
        added=added+a;
        System.out.println("the sum is : "+added);
    }

    public static void main (String [] args){
        varsum(1,2,3,4,45,6);
        onefixsum(1,2,2,3,4,5);
    }

}
