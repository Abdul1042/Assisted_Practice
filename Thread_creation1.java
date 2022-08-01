
public class Thread_creation1 {
	public void start()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		Thread_creation1 mt = new Thread_creation1();
  		mt.start();
 	}
}
