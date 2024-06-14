package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) throws IOException{
		// 2541-1998 = 543
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println(a - 543);
		
		
		System.out.println();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		a = Integer.parseInt(str);
		
		System.out.println(a - 543);

	}

}
