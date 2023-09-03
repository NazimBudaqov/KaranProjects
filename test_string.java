package KaranProjects;

import java.util.ArrayList;
import java.util.Scanner;

public class test_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		sc.close();
		hello(num);
	}
	
	static void hello(int n) {
//		String s = Integer.toString(n);
		ArrayList<String> arr = new ArrayList<String>(n);
		for (int i=1; i<=n; i++) {
			String s = String.format("%d.Hello", i);
//			System.out.println(s);
			arr.add(s);
		}
		System.out.println(arr);
	}
	
}
