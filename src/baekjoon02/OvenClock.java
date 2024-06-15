package baekjoon02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class OvenClock {

	public static void main(String[] args) throws IOException{
		//훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
		//첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
		//두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다
		
		int hour; //현재 시
		int minute; //현재 분
		int time; //요리하는데 필요한 시간
		System.out.println("1. Scanner");
		
		Scanner sc = new Scanner(System.in);
		
		hour = sc.nextInt();
		minute = sc.nextInt();
		time = sc.nextInt();
		
		/*기본 결괏값-> hour : (minute + time)
		 *1. (0 <= hour <= 22), (minute + time > 59) 일 경우
		 *	  -> (hour += (minute + time) / 60), (minute = (minute + time) % 60)
		 *2. (현재 minute + 요리 time > 59)이면서	hour > 23일 경우
		 *	  -> hour = (hour + ((minute + time)/60)) - 24 , (minute = (minute + time) % 60) 
		 *3. (현재 minute + 요리 time < 59) 일 때는 현재 hour 는 유지
		 *	  -> minute = minute + time
		*/
		if((minute + time) > 59) { //(minute + time) > 59
			hour += (minute + time) / 60; //hour
			minute = (minute + time) % 60; //minute
			if(hour > 23) {
				hour =  hour%24;  // 51%24 = 3
			}
		}else minute += time;
		
		System.out.println(hour + "시 " + minute + "분");
		
		System.out.println();
		
		System.out.println("2. BufferedReader");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		hour = Integer.parseInt(st.nextToken());
		minute = Integer.parseInt(st.nextToken());

		time = Integer.parseInt(br.readLine());
		
		if((minute + time) > 59) { //(minute + time) > 59
			hour += (minute + time) / 60; //hour
			minute = (minute + time) % 60; //minute
			if(hour > 23) {
				hour =  hour%24;  // 51%24 = 3
			}
		}else minute += time;
		
		System.out.println(hour + "시 " + minute + "분");
	}

}
