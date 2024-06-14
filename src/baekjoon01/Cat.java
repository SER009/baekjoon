package baekjoon01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Cat {

	public static void main(String[] args) throws IOException  {
		/* 
		   \    /\
 			)  ( ')
		   (  /  )
 			\(__)|
		 */
		/* 자바에서는 몇몇 문자는 단독으로 써서 출력할 수 없다. ( 대표적으로 백슬래시와 큰 따옴표가 있다. )
		 * 그래서 문자를 출력하기 위해 조합을 만들어서 출력할 수 있도록 하는데 이를 Escape Sequance 라고 한다.
		 * 이스케이프 시퀀스는 백슬래시(\) + 문자 의 조합으로 쓰인다.*/
		
		System.out.println("1. System.out.println() 이용");
		
		System.out.println(" \\    /\\ ");
		System.out.println("  )  ( ') ");
		System.out.println("  (  /  ) ");
		System.out.println("   \\(__)| ");
		
		System.out.println("2. BufferedWriter 클래스 이용");
		/*버퍼를 사용하면 키보드 입력하면서 한문자씩 출력 가능 - 속도가 빠르다
		  한번에 버퍼에 저장하여 보낸다.
		*/
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\");
		bw.newLine(); // 한 줄 구분
		
		bw.write(")  ( ')");
		bw.newLine(); // 한 줄 구분
		
		bw.write("(  /  )");
		bw.newLine(); // 한 줄 구분
		
		bw.write("\\(__)|");
		bw.newLine(); // 한 줄 구분
		
		bw.flush();//버퍼에 남아있는 데이터를 모두 출력한다.

		System.out.println("3. StringBuilder 클래스 이용");
		/*기존 문자열에 추가하여 객체에 저장
		 * 멀티쓰레드 환경에서 안정적이지 않음*/
		StringBuilder sb = new StringBuilder();
		
		sb.append("\\    /\\\n"); //개행문자 \n 추가해야됨.
		sb.append(" )  ( ')\n");
		sb.append("(  /  )\n");
 		sb.append(" \\(__)|\n");
		
		System.out.println(sb);
		
		
		System.out.println("4. StringBuffer 클래스 이용");
		/*기존 문자열에 추가하여 객체에 저장*/
		StringBuffer sbf = new StringBuffer();
		sbf.append("\\    /\\\n");
		sbf.append(" )  ( ')\n");
		sbf.append("(  /  )\n");
 		sbf.append(" \\(__)|\n");
		
		System.out.println(sbf);
		
		System.out.println("끝");
		
		System.out.println("강아지");
		/*
		 |\_/|
		 |q p|   /}
		 ( 0 )"""\
		 |"^"`    |
		 ||_/=\\__|
		 */
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		bw.close();//버퍼를 닫는다.
	}

}
