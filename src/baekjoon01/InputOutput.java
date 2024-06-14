package baekjoon01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputOutput {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		System.out.println(str1+"??!");
		
		
		System.out.println();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str2 = br.readLine();
		
		//StringTokenizer st = new StringTokenizer(str2," ");
		
		//String str3 = st.nextToken();
		
		System.out.println(str2+"??!");
	}

}
