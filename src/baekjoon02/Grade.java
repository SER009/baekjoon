package baekjoon02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) throws IOException{
		System.out.println("1. Scanner");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		if(90 <= A && A <= 100) {
			System.out.println("A");
		}else if(80 <= A) {
			System.out.println("B");
		}else if(70 <= A) {
			System.out.println("C");
		}else if(60 <= A) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		System.out.println();
		
		System.out.println("2. BufferedReader");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		A = Integer.parseInt(br.readLine());
		//삼항 연산자 -> (조건식)?A:B;
		System.out.println((A>=90)?"A": (A>=80)?"B": (A>=70)?"C": (A>=60)?"D":"F");		 
	}

}
