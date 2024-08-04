//Program for Upcasting concept
package collection;
class Delhi
{
	 void Vehicle()
	 {
		 System.out.println("Rohit Kadam");
	 }
	 void Busses()
	 {
		 System.out.println("Rohan Kadam");
	 }
}
public class Bangalore extends Delhi
{

	public static void main(String[] args) 
	{
		Delhi d1 = new Bangalore();
		d1.Vehicle();
		d1.Busses();

	}

}
