import java.util.ArrayList;

public class Study_91_Arraylist {

    // today we will see array list
    // array list is a advance from of array like concept ehich is more flexible and has many methods
    // array list is a part of collections framework
    // collection framework has mainly following Interfaces
    // List , Set , Queue
    // ans similar abstract classes


    // lets see Array list


    public static void main (String args[]){

        // Add method

        ArrayList<Integer> Al= new ArrayList<>();

        Al.add(1); // this method adds the value in arraylist
        Al.add(3);
        Al.add(5);

        ArrayList<String> AS = new ArrayList<>();

        AS.add("Aniket");
        AS.add("Ankush");
        AS.add("Dhawale");

        // Add at specific index

        AS.add(0,"Shri");
        AS.add(1,"Ankush");

        // Add All methhod can add one arraylist in another

        // we already have a integer type arraylist lets create another one

        ArrayList<Integer> Ai= new ArrayList<>();
        Ai.add(12);
        Ai.add(13);
        Ai.add(55);

        Al.addAll(Ai);  // This methoid is adding the Ai arraylist in Al arraylist

        for (int a:Al // here we have applied for each loop to inetrate the array list Al and print its value
        ) {
            System.out.println(a);
        }


    }

}
