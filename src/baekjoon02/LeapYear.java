package baekjoon02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) throws IOException {
		//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
		//첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
		System.out.println("1. Scanner");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
				
		if((A%4 == 0) && (A%100 != 0)) {
			System.out.println("if 1");
		}else if((A%4 == 0) && (A%400 == 0)) {
			System.out.println("else if 1");
		}else System.out.println("else 0");
		
		System.out.println("2. BufferedReader");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		A = Integer.parseInt(br.readLine());
		
//		if((A%4 == 0) && (A%100 != 0)) {
//			System.out.println("if 1");
//		}else if((A%4 == 0) && (A%400 == 0)) {
//			System.out.println("else if 1");
//		}else System.out.println("else 0");
		
		
		if(A%4 == 0) {
			if(A%100 != 0) {
				System.out.println("1");
			}else if(A%400 == 0) {
				System.out.println("1");
			}else System.out.println("0");			
		}else System.out.println("0");
	}
}
