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
		String kqua = (tuoi<16)?"o do tuoi vi thanh nien":(tuoi>18)?"da gia":"o do tuoi truong thanh";
		System.out.println("ban "+ ten + " "+ kqua);
	}
}
