package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Multiply {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*b);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		System.out.println(a*b);
	}

}
