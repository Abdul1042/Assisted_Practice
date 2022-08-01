
public class Inner_Class2 {
	private String msg="Let's learn inner class";

	 void display(){  
		 class Inner_class{  
			 void data(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner_class a=new Inner_class();  
	  a.data();  
	 }  

	 
	public static void main(String[] args) {
		Inner_Class2  object=new Inner_Class2 ();  
		object.display();  
		}

}
