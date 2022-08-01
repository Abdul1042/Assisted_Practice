
public class Keywords1 {
    void Division() throws ArithmeticException
    {
        int a=45,b=0,results;
results = a / b;
        System.out.print("\n\tThe result is : " + results);
    }
     public static void main(String[] args)
    {
    	 Keywords1 K = new Keywords1();
         try
        {
            K.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }

}
