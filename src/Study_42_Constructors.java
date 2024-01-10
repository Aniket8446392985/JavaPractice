import java.util.Locale;
/*
public class Study_42_Constructors
{
    public static void main(String[] args)
    {
        con cn= new con();
        cn.UpName();
    }
}
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
} */



/////////////////////////////////////


public class Study_42_Constructors {
    public static void main(String[] args) {
        con cn = new con();
        String upperCaseName = cn.UpName();
        System.out.println("Uppercase Name: " + upperCaseName);
    }
}

class con {
    public con() {
        System.out.println("Constructor is called automatically.");
    }

    public String UpName() {
        String name = "aniket";
        String upperCase = name.toUpperCase();
        return upperCase;
    }
}


