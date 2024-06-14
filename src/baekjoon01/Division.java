package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Division {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		System.out.println(a/b);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		a = Double.parseDouble(st.nextToken());
		a = Double.parseDouble(st.nextToken());
		
		System.out.println(a/b);	
	}

}
