
public class Oops {
    String name; 
    String breed; 
    int age; 
    String color; 
    public Oops(String name, String breed, String color,int age ) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    public String toString() 
    { 
        return("Hello I'm cat and my name is "+ this.getName()+ ".\nMy breed,color and age are " + this.getBreed()+", " + this.getColor()+ ", and "+ this.getAge() + "."); 
    } 
    public static void main(String[] args) 
    { 
        Oops Rosy = new Oops("Rosy","Percian", "Black",6 ); 
        System.out.println(Rosy.toString()); 
    } 

}
