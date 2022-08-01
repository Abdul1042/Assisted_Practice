
public class String_buffer {

	public static void main(String[] args) 
	{
		StringBuffer a=new StringBuffer("Java");
		a.append("Phase 1");
		System.out.println(a);
		a.replace(1,5,"Core Java");
		System.out.println(a);
		a.reverse();
		System.out.println(a);

	}

}
