public class MethodStudy
{

// here we will see how to write the method or function
    // create a parameterised method
// how to create its object
// What is Static keyword

    //**********************************************************************************************************

    // here we will see how to write the method or function

    // method is a set of logic (snippet) that user has run every time with different or same inputs,
    //lets create a method

    public void addition () {
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println("the addition is " + c);
    }

    // lets break down the syntax of the function
    // public is access modifier-- itmeans this function / method is accessible anywhere inn the project.
    // void -- Void is the return type -- it means the data type that tha function is going to return after its execution
    // here void means its not going to return any thing
    // addition -- this is the name of the function
    // the logic written inside the {} is the executable code in method, above method is non parameterised

    //**********************************************************************************************************
    // create a parameterised method

    // Lets define the method with variable input (Parameterised Method)

    public void addition3 ( int a, int b, int c, int d)
    {
        d = a + b + c + d;
        System.out.println("The addition  a, b, c is " + d);
    }

    // Here all the integers defined in the method are parameters , that user need to provide as input while calling the method

    //**********************************************************************************************************
    // how to create its object

    // Call the method

    // to call any method user need to create an object
    // lets create an object

    public static void main(String[] args) {

    MethodStudy obj1 = new MethodStudy();
    // ClassName  objectName= new ClassName()



    // lets break down the syntax of object
    // Methodstudy -- This is the name of the class from which i want to call 1 method
    // obj1 -- thi is the name of the object tht user decide
    // new -- thi is he java keyword used to create obect.

    //To call any method inside the class Methodstudy, now we just have to  write object name and a dot
    //eg.

    obj1.addition();
    obj1.addition3(1, 2, 3, 0);

    // Note -- To create any object or call any method you have to write the same in side a main method
      }

    //*********************************************************************************************************

    // What is Static keyword
    // static is the keyword which allows the user to call the method directly with the class name without creating object of that class
    // eg.
    public static void subs ( int a, int b)
    {
        int c = a - b;
        System.out.println("the substration of a-b is " + c);
    }
    //public static void main (String []args)
    //{
    //   MethodStudy.subs(6,2);
    //}






}
