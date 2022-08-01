
	class Std{
		int Emp_Id;
		String Emp_Name;

		Std(int Id,String Name)
		{
		Emp_Id=Id;
		Emp_Name=Name;
		}

		void display() {
		System.out.println(Emp_Id+" "+Emp_Name);
		}
	}

	public class Constructors2
	{
	public static void main(String args[])
	{

		Std std1=new Std(1,"Abdul");
		Std std2=new Std(2,"Latiff");
		std1.display();
		std2.display();
			}
	}

