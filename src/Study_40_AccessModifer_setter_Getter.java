
class pv {
    private void pvtfn (int id, String name)
    {
        System.out.println(id);
        System.out.println(name);

    }
    public void Setfn (int i, String n)
    {
        pvtfn(i,n);
    }
}
public class Study_40_AccessModifer_setter_Getter extends pv
{

    // There are 4 access modifiers
    // public
    // private
    // default
    // protected

    // The most used modifiers are public and private.

    //lets create a private function in pv class and call it in this class.
    public static void main(String[] args) {
        pv ob= new pv();
        pv ob1= new pv();

        ob.Setfn(10, "Ankush");
        ob1.Setfn(20, "Aniket");

    }
}
