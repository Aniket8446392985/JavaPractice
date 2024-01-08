import java.util.Locale;

class con {
    public con()
    {
        System.out.println("constructor is called automatically :");
    }
    public String UpName()
    {
        String Name="aniket";
        String UpperCase=Name.toUpperCase();
        return UpperCase ;
    }

}
public class Study_42_Constructors
{
    public static void main(String[] args)
    {
        con cn= new con();
        cn.UpName();
    }
}


