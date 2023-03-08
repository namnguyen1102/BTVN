import java.util.Scanner;

public class bai_tap_06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("so nguyen duong");
	int n = sc.nextInt();
	int i=1;
	long gt=1;
	do {

		gt=gt*i;
		i++;
	} while (i<=n);
	System.out.println("giai thua = "+ gt);
}
}
