public class MultiDimArray {
    public static void main(String[] args) {


        // Multi dimentional arrarys are the array of arrays
        // just like in our array practice class we have seen the aray of integers
        // here we will see the array of arrays

        //normal array
        int [] numbers={1,2,3};

        // Two dimentional array is a array which has another integer arrays as its members

        int [][] twodim = new int[3][3];
        twodim[0][0]=10;
        twodim[1][0]=20;
        twodim[2][0]=30;

        twodim[0][1]=11;
        twodim[1][1]=21;
        twodim[2][1]=31;

        twodim[0][2]=12;
        twodim[1][2]=22;
        twodim[2][2]=32;

        //for each loop tried to iterate the twodim array till end


        for (int[] num: twodim) {
            for (int j=0;j<twodim.length;j++){
                for(int k = 0;k<num.length;k++){
                    System.out.println(twodim[j][k]);
                }
            }
        }


       /* twodim[0][3]=13;
        twodim[1][3]=23;
        twodim[3][3]=33;*/





    }
}
