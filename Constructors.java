import java.io.*;
 
class Constructors
{
    // constructor with one argument
	Constructors(String name)
    {
        System.out.println("Constructor with one " +
                      "argument - String : " + name);
    }
 
    // constructor with two arguments
	Constructors(String name, int age)
    {
 
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
 
    }
 
    // Constructor with one argument but with different
    // type than previous..
	Constructors(long id)
    {
        System.out.println("Constructor with one argument : " +
                                            "Long : " + id);
    }
}
 
class GFG
{
    public static void main(String[] args)
    {
        // Creating the objects of the class named 'Geek'
        // by passing different arguments
 
        // Invoke the constructor with one argument of
        // type 'String'.
    	Constructors geek2 = new Constructors("Shikhar");
 
        // Invoke the constructor with two arguments
        Constructors geek3 = new Constructors("Dharmesh", 26);
 
        // Invoke the constructor with one argument of
        // type 'Long'.
        Constructors geek4 = new Constructors(325614567);
    }
}
