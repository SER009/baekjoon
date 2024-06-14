package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Multiply2 {

	public static void main(String[] args) throws IOException{
		//472*385
		//2360 3776 1416 181720
		Scanner sc = new Scanner(System.in);
		
		//1.산술
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A * (B%10));
		System.out.println(A * ((B%100)/10));
		System.out.println(A * (B/100));
		System.out.println(A * B);
		
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		System.out.println(A * (B%10));
		System.out.println(A * ((B%100)/10));
		System.out.println(A * (B/100));
		System.out.println(A * B);
		
		//2.charAt():문자열
		String D = sc.next();
		
		//문자열로 나눠지기에 -'0'(아스키코드 십진수 48)을 추가하여 문자제거을 해야됨.
		System.out.println((D.charAt(2)-'0'));
		System.out.println(A * (D.charAt(2)-'0'));
		System.out.println(A * (D.charAt(1)-'0'));
		System.out.println(A * (D.charAt(0)-'0'));
		System.out.println(A * Integer.parseInt(D));
		
		System.out.println();
		
		//3.문자열로 입력을 받고 char배열에 각 단어를 담아주는법->toCharArray()메서드 이용
		/*입력어를 한행에 다 안쓸때에는 StringTokenizer 클래스를 안쓰고
		  바로 BufferedReader 클래스의 readLine()이용가능*/
		A = Integer.parseInt(br.readLine());
		D = br.readLine();
		
		//char 배열에 각 단어를 담아준다.
		char[] d = D.toCharArray();
		
		//문자열이 담아져있기 때문에 '0'아스키코드 48을 제거
		System.out.println(A * (d[2]-'0'));
		System.out.println(A * (d[1]-'0'));
		System.out.println(A * (d[0]-'0'));
		System.out.println(A * Integer.parseInt(D));
		

	}

}
