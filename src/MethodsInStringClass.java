import java.util.Locale;

public class MethodsInStringClass {

    public static void main (String args[]){

        String Name= "Aniket";
        String MiddleName = "Ankush";
        String Sirname= "Dhawale";

        // lower case
        System.out.println(Name.toLowerCase()); // This will print Name in lower case

        //upper case
        System.out.println(MiddleName.toUpperCase()); // This will print Middle name in Upper case

        //Char at
        System.out.println(Sirname.charAt(2)); // This will print the 2 number index character from Sirname strin

        //Index of
        System.out.println(Name.indexOf('k')); // this w
        // it will print index of letter k in the Name string Aniket

        //Substring
        String sub =Name.substring(0,2);
        System.out.println(sub); // This will print new string derived from Name String which starts with 0th index and ends on 2 index in Name string
                                 // this will print Ani

        //Subsequence
        CharSequence chars = Name.subSequence(0,1); // This is a char sequence method of string class which will return the characters from the string in the form of sequence of characters
        System.out.println(chars); // This will print the sequence of characters from name string starting from 0 till 3rd index
        System.out.println(chars.length()); // This will print the length of character sequence

        // Replace
        System.out.println(Sirname.replace('a','o')); // This will replace all a from DHAWALE with o
        System.out.println(Sirname.replace("aw","al"));// This will replace All AW from DHAWALE with al

        //Starts with
        System.out.println(Name.startsWith("Ani"));// this will check if the Name starts with ANI if its true
        // it will print true or it will print false

        //Trim
        String Body = " Harry  ";
        System.out.println(Body.trim());

        // last index of
        System.out.println(Sirname.lastIndexOf('a')); // this will print 4 as a character occurs at 4th index at very last time in string DHAWALE
        System.out.println(Sirname.lastIndexOf('a',3));// this will return 2 as A character occurs at 2 position if start counting from 3 index character in backward direction in string DHAWALE

        // Last index of and Trim combine
        int ind=Body.trim().lastIndexOf('r');// this will print the last occurance of r in the Harry, and start finding the same from backward direction
        System.out.println(ind);

        //Equals
        System.out.println(Body.equals(Name));// this will return false as both strings are not equal

        //Equals ignore case
        System.out.println(Body.trim().equalsIgnoreCase("harry")); // this will return true as both strings matches ignoring the case



    }
}
