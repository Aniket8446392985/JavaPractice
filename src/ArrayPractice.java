public class ArrayPractice {

    public static void main (String args[])
    {
   // arrays can be defined in 3 different ways
        // 1st way
        int [] numbers = new int[5];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;

        System.out.println(numbers[4]);

        // 2nd way

        int [] arr;
        arr =new int[6];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;
      //  numbers[5]=60;


        // 3rd way

        int [] third={1,2,3,4,5};
        // System.out.println(third.length);


        for ( int i :third) {
           System.out.println(i);
        }


    }






}
