import java.util.Scanner;

public class bai_tap_08 {
public static void main(String[] args) {
	int A[],i,n,b,tong=0;
	
	Scanner m = new Scanner(System.in);
	System.out.print("nhap n ");
	 n = m.nextInt();
	
	for (i=0;i<n;i++) {
		System.out.print("A["+(i+1)+"]= ");
		b = m.nextInt();
		tong=tong+b;
	}
	float tbc= (float) tong/n;
	System.out.println("trung binh cong "+ n +"= " +tbc);
}
}
