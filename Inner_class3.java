abstract class Anonymous 
{
	   public abstract void display();
	}

public class Inner_class3 {
	public static void main(String args[]) 
	{
		Anonymous a = new Anonymous() {

		         public void display() {
		            System.out.println("Let's learn about Anonymous Inner Class");
		         }
		      };
		      a.display();
		   }

}
