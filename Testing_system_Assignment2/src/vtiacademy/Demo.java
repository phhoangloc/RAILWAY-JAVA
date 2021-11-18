package vtiacademy;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
			System.out.println("Nhập vào số thứ nhất: ");
		 	a=sc.nextInt();
		if(a%2==0) {System.out.println("số " + a + " vừa nhập là số chẵn");}
		else {System.out.println("số " + a + " vừa nhập là số lẻ");}
	}
}
