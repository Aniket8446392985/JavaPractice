import java.util.Locale;

public class MethodsInStringClass {

    public static void main (String args[]){

        String Name= "Aniket";
        String MiddleName = "Ankush";
        String SirName= "Dhawale";

        System.out.println(Name.toLowerCase()); // This will print Name in lower case

        System.out.println(MiddleName.toUpperCase()); // This will print Middle name in Upper case

        System.out.println(SirName.charAt(2)); // This will print the 2 number index character from Sirname strin

        System.out.println(Name.startsWith("Ani"));// this will check if the Name starts with ANI if its true
                                                      // it will print true or it will print false
        System.out.println(Name.indexOf('k')); // this w
        // ill print index of letter k in the Name string Aniket

        String sub =Name.substring(0,2);
        System.out.println(sub); // This will print new string derived from Name String which starts with 0th index and ends on 2 index in Name string
                                 // this will print Ani


        CharSequence chars = Name.subSequence(0,3); // This is a char sequence method of string class which will return the characters from the string in the form of sequence of characters
        System.out.println(chars); // This will print the sequence of characters from name string starting from 0 till 3rd index
        System.out.println(chars.length()); // This will print the length of character sequence

    }
}
