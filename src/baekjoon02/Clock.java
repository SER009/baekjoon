package baekjoon02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Clock {

	public static void main(String[] args) throws IOException {
		//-45분 , 0시에서 45분을 빼면 23시로 변경
		System.out.println("1. Scanner");
		
		Scanner sc = new Scanner(System.in);
		
		//시 H 0 <= H <= 24
		int H = sc.nextInt();
		//분 M 0 <= M <=59
		int M = sc.nextInt();

		if(0<=M && M<=44) { //0~44분 일 때
			if(H==0) { // 시간이 0시 일 때
				H = 23; // 23시로 변경
			}else H = H-1; // 0시가 아니면 -1
			M += 15; // 0~44분 사이이면 분+15
		}else{//45분 이상 일 때 
			M -= 45;
		}
		
		System.out.println(H + " " + M);
		
		System.out.println();
		
		System.out.println("2. BufferedReader");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		H = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		
		if(0<=M && M<=45) {
			if(H == 0) {
				H = 23;
			}else H -=1; 
			M +=15; 
		}else M -= 45;
		
		System.out.println(H + " " + M);
	}

}
