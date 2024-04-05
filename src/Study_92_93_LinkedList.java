import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Study_92_93_LinkedList {

    // Linked list is very similar to Arraylist just as some different data saving mechanism
    // linked list members has the reference to member before and member after that

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



        LinkedList<String> S= new LinkedList<>();
        S.add("aniket");
        S.add("ankush");
        S.add("dhawale");


      /*  ArrayList<String> s1 = new ArrayList<>();
        s1.add("tested");*/

        //S.addAll(s1);

        //System.out.println(S);

        Iterator<String> it = S.iterator();

       /* //System.out.println(it.next());
        try {
            for (int i = 0; i <= S.size() - 1; i++) {
                System.out.println(it.next());

                String A = it.next();

                System.out.println(A.indexOf("a"));

            }
        } catch (Exception e) {
            e.printStackTrace();
           // throw new RuntimeException(e);
        }*/

        for (String st : S){
            System.out.println(st);
            System.out.println(st.indexOf("a"));
        }

    }

}
