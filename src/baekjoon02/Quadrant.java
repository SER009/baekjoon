package baekjoon02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("1. Scanner");
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if(0<X && 0<Y) {
			System.out.println("Quadrant 1");
		}else if(X<0 && 0<Y) {
			System.out.println("Quadrant 2");
		}else if(X<0 && 0<Y) {
			System.out.println("Quadrant 4");
		}else System.out.println("Quadrant 3");
		
		
		System.out.println("2. BufferedReader");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		X = Integer.parseInt(br.readLine());
		Y = Integer.parseInt(br.readLine());
		
		if(0<X && 0<Y) {
			System.out.println("Quadrant 1");
		}else if(X<0 && 0<Y) {
			System.out.println("Quadrant 2");
		}else if(X<0 && 0<Y) {
			System.out.println("Quadrant 4");
		}else System.out.println("Quadrant 3");
				
	}

}
