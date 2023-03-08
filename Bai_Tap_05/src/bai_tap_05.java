import java.util.Scanner;

public class bai_tap_05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tong=0;
	while(tong<=100) {
		System.out.print("nhap a = ");
	int a = sc.nextInt();
	tong=tong+a;
	}
	System.out.println("tong cac so nguyen vua nhap la : " + tong);
}
}
