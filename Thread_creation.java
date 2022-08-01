
public class Thread_creation {
    public static int myCount = 0;
    public Thread_creation(){
         
    }
    public void run() {
        while(Thread_creation.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++Thread_creation.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        Thread_creation mrt = new Thread_creation();
        Thread t = new Thread();
        t.start();
        while(Thread_creation.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++Thread_creation.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }


}
