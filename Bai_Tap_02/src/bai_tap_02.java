import java.util.Scanner;

public class bai_tap_02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("nhap a = ");
	int a = sc.nextInt();
	// kiem tra so chan , le
	String kqua = (a%2==0)?"la so chan":"la so le";
	System.out.println(a +" "+ kqua );

}
}
