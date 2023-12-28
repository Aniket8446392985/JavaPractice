import java.sql.SQLOutput;

class myclass
// created new class in same java file
// there can not be 2 public classes in one javca file
 {
     static int a;
     static String Name;

}
public class Study_38_CreateJavaClass
{
    public static void main(String[] args) {
        myclass obj= new myclass();
        obj.a=1;
        obj.Name="Aniket";
        System.out.println(obj.Name);
        System.out.println(obj.a);
    }
}
