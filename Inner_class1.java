
public class Inner_class1 {

	 private String msg="Welcome to Java Batch 2022"; 
	 
	 class Inner{  
	  void out(){System.out.println(msg+", Let us start learning");}  
	 }  


	public static void main(String[] args) {

		Inner_class1 obj=new Inner_class1();
		Inner_class1.Inner in=obj.new Inner();  
		in.out();  
	}
}

