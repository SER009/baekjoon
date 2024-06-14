package baekjoon02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Comparison {

	public static void main(String[] args) throws IOException {
		System.out.println("1. Scanner 사용");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("=");
		}
		System.out.println("2. BufferedReader 사용");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("=");
		}
		
	}

}
