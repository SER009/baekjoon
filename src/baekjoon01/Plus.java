package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Plus {

	public static void main(String[] args) throws IOException {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		//1.Scanner
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("a입력");
		a = sc.nextInt();
		System.out.println("b입력");
		b = sc.nextInt();
		
		System.out.println(a+b);
		
		
		//2.BufferReader
		//readLine() : 한 행,		read() : 한 문자
		/*readLine() : 한 행이기 때문에 입력할 때 한행으로 '5 3' 으로 구분지어서 두개의 값을 출력시켜야됨.
		 *readLine() 은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리해주어야 문제를 풀 수 있을 것이다.
		 *
		 *Exception in thread "main" java.util.NoSuchElementException
		 *StringTokenizer 에서 분리된 문자열을 담고있는 요소가 더이상 없는데 요소를 반환하려고 할 경우 발생하는 에러.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		//문자열 분리방법
		StringTokenizer st = new StringTokenizer(str," ");
		//구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환해준다.
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		System.out.println(c+d);		
		
	}	

}
