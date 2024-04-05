public class April_1st {

    public static void main(String[] args)
    {
        // find the largest string from the line
        String ss= "Aniket ankush dhawale";
        String [] sa= ss.split(" ");
        String biggest = null;
        int big=0;
        for (String in: sa){
            int le= in.length();
            if (le>big)
            {
                big=le;
                biggest=in;
            }
        }
        System.out.print(biggest);
        System.out.println(" " +big);
    }
}
