import java.io.*;
 
class Constructors
{
    Constructors(String name)
    {
        System.out.println("Constructor with one " +"argument - String : " + name);
    }
 
	Constructors(String name, int age)
    {
 
        System.out.println("Constructor with two arguments : " + " String and Integer : " + name + " "+ age);
 
    }
 	Constructors(long id)
    {
        System.out.println("Constructor with one argument : " + "Long : " + id);
    }
}
 
class GFG
{
    public static void main(String[] args)
    {
       Constructors geek2 = new Constructors("Shikhar");
 
       Constructors geek3 = new Constructors("Dharmesh", 26);
 
       Constructors geek4 = new Constructors(325614567);
    }
}
