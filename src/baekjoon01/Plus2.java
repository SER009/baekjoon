package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Plus2 {

	public static void main(String[] args) throws IOException {
		// 77 7777 7777 7931
		
		//1.Scanner
		System.out.println("Scanner");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println(A + B + C);
		
		//2.BufferedReader : 한 행에 다 입력
		System.out.println("BufferedReader 한 행에 입력");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		System.out.println(A + B + C);

		//3.BufferedReader : 각 행에 다 입력
		//입력값을 문자열에 입력하여 " "로 나누어서 문자열을 나누지 않고 각 한행씩 입력한 것을 바로 형변환.
		System.out.println("BufferedReader 각 행에 입력");

		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		C = Integer.parseInt(br.readLine());
		
		System.out.println(A + B + C);
	}

}
