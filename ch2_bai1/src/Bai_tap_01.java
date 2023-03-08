import java.util.Scanner;

public class Bai_tap_01 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
				System.out.print("a = ");
					a = sc.nextInt();
				System.out.print("b = ");
					b = sc.nextInt();
			// cac toan tu tinh toan
				System.out.println("a + b = " + (a+b));
				System.out.println("a - b = " + (a-b));
				System.out.println("a * b = " + (a*b));
				float thuong = (float)a/ b; 
				System.out.println("a / b = " + thuong);
				System.out.println("a % b = " + (a%b));
				
			//so sanh
				System.out.println(a + "==" + b + " : " + (a==b));
				System.out.println(a + "!=" + b + " : " + (a!=b));
				System.out.println(a + "<" + b + " : " + (a<b));
				System.out.println(a + ">" + b + " : " + (a>b));
				System.out.println(a + "<=" + b + " : " + (a<=b));
				System.out.println(a + ">=" + b + " : " + (a>=b));		
	}
}
