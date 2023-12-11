public class ForLoop {

    public static void main(String[] args) {
        int b=10 ;
        int c=10;
        int count=0;
        for (int i = 1; i<=b;i++)
        {
            for (int j=i;j>0;j--)
            {
             int k=i%j;

             if (k==0)
             {
                 count++;
             }
            }
            if (count==2)
            {
                System.out.println(i);
            }
        }
    }




}

