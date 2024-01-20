import java.util.Arrays;

public class Practice20jan {

    public static void main (String args[]){
/*

//Code to print  biggest string from a string

            String name= "prashant suresh babar";
            String[] iname= name.split(" ");
            int siz=0;
            String n = null;
            for(String s: iname)
            {
                // System.out.println(s);
                //System.out.println(s.length());
                if (s.length() > siz)
                {
                    siz = s.length();
                    n=s;
                }
            }
            System.out.println(n);
            System.out.println(siz);
 */

        // Code to reverse the every substring from string

       // StringBuffer str = new StringBuffer("aniket ankush dhawale");
        //System.out.println(str.reverse());

        String an= "Aniket Ankush Dhawale";
        String[] aa= an.split(" ");

        for (String st : aa){
           char[] chara = st.toCharArray();

            for (int i=chara.length-1;i>=0;i--)
           {
               System.out.print(chara[i]);
           }
            System.out.print(" ");
        }

        // code to reverse sequence of substring from input string

        String[] re= an.split(" ");
        System.out.println("");
        for (int j = re.length-1;j >=0; j--)
        {
           // System.out.print(re [j]);
            //System.out.print(" ");

            char[] arrayrev= re[j].toCharArray();
            for(int k =arrayrev.length-1;k>=0;k--)
            {
                System.out.print(arrayrev[k]);
            }
            System.out.print(" ");
        }



    }

}
