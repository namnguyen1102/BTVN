import java.util.Scanner;
import java.util.Spliterator;

public class bai_tap_09 {
public static void main(String[] args) {
	int i,dem=0,dem1=0,dem2=0;
	String chuoi;
	Scanner  input =new Scanner(System.in);
	System.out.println("nhap chuoi : ");
	chuoi = input.nextLine();
	char a;
	for(i=0;i<chuoi.length();i++) {
		a=chuoi.charAt(i);
		if(a>='1'&&a<='9') {
			dem++;
		}
		else if(a>='A'&&a<='Z') {
			dem1++;
		}
		else {
			dem2++;
	}}
	System.out.println("so ki tu so la : " + dem);
	System.out.println("so ki tu hoa la : " + dem1);
	System.out.println("so ki tu thuong la : " + dem2);
}
}
