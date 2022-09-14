import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		int r=sc.nextInt();
		double pi=3.14,area;
		area=pi*r*r;
		System.out.println("Area of circle is: "+area);
		
	}
}
