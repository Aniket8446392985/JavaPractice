public class Practice {
    public static void main(String[] args)
    {

        /* Prime number using While loop
        int i=1;
        int limit=1000;
        while (i<=limit)
        {
            int j=1;
            int count=0;
            while(j<=i)
            {
                int k=i%j;
                if (k==0)
                {
                    count++;
                }
                j++;
            }
            if (count==2)
            {
                System.out.println("Prime number till " +limit+ " is " +i);
            }
            i++;
        }
*/

/* Prime number using for loop
        int j =10;
        for (int i=1;i<=j;i++){
            int count=0;
            for(int k=1;k<=j;k++)
            {
                int l=i%k;
                if (l==0)
                {
                    count++;
                }
            }
            if (count==2){
                System.out.println("The prime number is " +i);
            }
        }
 */
    }
}
