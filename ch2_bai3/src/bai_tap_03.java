import java.util.Scanner;

public class bai_tap_03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("ten : ");
		String ten = sc.nextLine();
		System.out.print("nam sinh : ");
		int ns = sc.nextInt();
		
		// nhom tuoi 
		int tuoi=2023-ns;	
		if(tuoi<16) {
			System.out.println("ban "+ten+ " o do tuoi vi thanh nien");
		}
		else if(tuoi>=18) {
		System.out.println("ban "+ten+ " o do tuoi truong thanh");	
		}
		else
			System.out.println("ban "+ten + "da gia");
}
}
