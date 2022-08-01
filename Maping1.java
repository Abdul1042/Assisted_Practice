import java.util.*;
public class Maping1 {

	public static void main(String[] args) {
		HashMap<Integer,String> Map=new HashMap<Integer,String>();      
	      Map.put(1,"Aaa");    
	      Map.put(2,"Lll");    
	      Map.put(3,"Jjj");   
	       
	      System.out.println(" The elements of Hashingmap is ");  
	      for(Map.Entry m:Map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	       
	      Hashtable<Integer,String> Table=new Hashtable<Integer,String>();  
	      
	      Table.put(4,"S");  
	      Table.put(5,"R");  
	      Table.put(6,"T");  
	      Table.put(7,"V");  

	      System.out.println("\n The elements of HashTable are ");  
	      for(Map.Entry n:Table.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"D");    
	      map.put(9,"C");    
	      map.put(10,"E");       
	      
	      System.out.println("\n The elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  

}
