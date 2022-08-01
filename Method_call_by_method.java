
public class Method_call_by_method 
{
	int val=80;

	int process(int v) 
	{
		v =val*10/100;
		return(v);
	}

	public static void main(String args[]) {
		Method_call_by_method d = new Method_call_by_method();
		System.out.println("Before operation: "+d.val);
		d.process(100);
		System.out.println("After operation: "+d.v);
		}


}
