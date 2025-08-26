package sec03_consoleinputoutput.EX01_ConsoleInputObject_1;

/*콘솔 입력을 위한 System.in 활용과 available(), close() 메서드의 활용*/

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_1 {
	public static void main(String[] args) throws IOException {
		
		//InputStream 객체 생성
		InputStream is = System.in;
		int data;
		while((data=is.read())!='\r') {
			System.out.println("읽은 데이터 : "+ (char)data + " 남은 바이트수 : " + is.available());
		}
		System.out.println(data); //\r (13)
		System.out.println(is.read()); //\n (10)
		
	}
}

