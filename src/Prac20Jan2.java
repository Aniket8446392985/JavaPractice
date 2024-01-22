
import java.util.*;
import java.util.Arrays;


public class Prac20Jan2 {
    public static void main(String[] args) {

       /* String Name = "Aniket ankush Dhawale";

        //  char [] chr=Name.toCharArray();
        //   String rev=null;

        char[] ch = new char[Name.length()];

        for (int i=Name.length()-1;i>=0;i--)

        {
            char c= Name.charAt(i);
            ch[i]=c;
        }

        String n= String.valueOf(ch);
        System.out.println(n);
        */

        // Programe to count occurance of every unique word words in string

        String line= "i am am learning learning java java java language language";
        String [] lineArray = line.split(" ");

        Set<String> unique=new HashSet<>();
        for(int i=0; i<=lineArray.length-1;i++)
        {
            unique.add(lineArray[i]);
        }

        /*
        Set <String > unique= new HashSet<>(Arrays.asList(lineArray));
        */

        for (String sst: unique){
            int count= 0;
            for (int j=0; j <=lineArray.length-1;j++)
            {
                String one= lineArray[j];
                if (sst.equals(one)){
                    count++;
                }
            }
            System.out.println(sst+"="+count);
        }


        // code to convert List to Set
        List<String> li= new ArrayList<>();
        li.add("an");
        li.add("dha");
        li.add("an");

        Set<String> st= new HashSet<>();
        st.addAll(li);
        for(String ss: st){
            System.out.println(ss);
        }



    }



}
