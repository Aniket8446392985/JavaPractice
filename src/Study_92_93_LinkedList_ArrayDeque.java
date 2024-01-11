import java.util.ArrayList;
import java.util.LinkedList;

public class Study_92_93_LinkedList_ArrayDeque {

    // Linked list is very similar to Arraylist just as some different data saving mechanism
    // linked list members has the referene to member before na d member after that

    public static void main (String args[]){


       // create a new linked list ll
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(12);
        ll.add(10);
        ll.add(2);
        ll.addLast(222);
        ll.addFirst(111);



        // creating a new array list ar
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(22);
        ar.add(33);


        // get first method
        //System.out.println(ll.getFirst());


        // add all method
        ll.addAll(ar);


        // logic to iterate the array
        for(int a: ll){
            System.out.println(a);
        }
    }







}
