
public class Method_by_overloading {
	public void area(int w,int l)
    {
         System.out.println("Area of Rectangle : "+(w*l));
    }
    public void area(int a) 
    {
         System.out.println("Area of Square : "+(a*a));
    }

    public static void main(String args[])
   {

Method_by_overloading ob=new Method_by_overloading();
       ob.area(6,6);
       ob.area(10);  
   }

}
