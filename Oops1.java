
public class Oops1 {
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
    	Oops1 Add = new Oops1(); 
        System.out.println(Add.sum(10, 21)); 
        System.out.println(Add.sum(10, 42, 20)); 
        System.out.println(Add.sum(10.42, 20.07)); 
    } 

}
