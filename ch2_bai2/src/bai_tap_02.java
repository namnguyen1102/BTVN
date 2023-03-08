import java.util.Scanner;

public class bai_tap_02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("nhap a = ");
	int a = sc.nextInt();
	// kiem tra so chan , le
	if(a%2==0) {
	System.out.println(a +" la so chan" );
	}else
		System.out.println(a+" la so le");
}
}
