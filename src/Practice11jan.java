import java.sql.Array;
import java.util.ArrayList;

public class Practice11jan {



    public static void main(String[] args)
    {
        String name= " Prashant Suresh Babar ";

        //System.out.println(name.substring(0,4));
        //System.out.println(name.indexOf(" "));
        // System.out.println(name.length());


        while (name.contains(" "))
        {
            int a = name.indexOf(" ");
            String f= name.substring(0,a);
            int b= name.indexOf(" ",a);
            String s=name.substring(a,b);
            String t= name.substring(b,name.length());

            ArrayList<String> ars = new ArrayList<>();
            ars.add(f);
            ars.add(s);
            ars.add(t);

            System.out.println(f+" "+s+" "+t);


            String[] iname =name.split(" ");
            int aa=0;
             for (String st : iname)
             {

                 System.out.println(st);
                 st.length();


             }

           /* String S1= name.substring(a,F.length()-1);
            int b = S1.indexOf(" ");
            String S2 = S1.substring(0,b);

            String T1= S1.substring(b,S1.length()-1);

            System.out.println(F);
            System.out.println(S2);
            System.out.println(T1);
*/
            break;
        }



        /*
        //name.trim();
        name.indexOf(" ");
        name.lastIndexOf(" ");

        String f= name.substring(0,name.indexOf(" "));
        String s= name.substring(name.indexOf(" ")+1,name.lastIndexOf(" "));
        String t= name.substring(name.lastIndexOf(" ")+1,name.length());

        System.out.println(f);
        System.out.println(s);
        System.out.println(t);
    }*/

}
}




