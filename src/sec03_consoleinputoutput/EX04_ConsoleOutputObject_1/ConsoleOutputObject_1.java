package sec03_consoleinputoutput.EX04_ConsoleOutputObject_1;

/*write() 메서드를 이용해 콘솔로 영문 데이터 출력하기*/

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		
		//#1. 1-byte 단위 쓰기		
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r'); //13 //생략가능
		os.write('\n'); //10 개행 /r/n		
		os.flush(); 

		
		//#2. n-byte 단위 쓰기 (byte[]의 처음부터 끝까지 데이터를 쓰기)
		byte[] byteArray1 = "Hello!".getBytes();
		os.write(byteArray1);
		os.write('\n');
		os.flush(); 

		
		//#3. n-byte 단위 쓰기 (byte[]의 offset부터 length 개의  byte 데이터를 쓰기)
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os.write(byteArray2, 7, 8);		
		os.flush(); 

	}
}

