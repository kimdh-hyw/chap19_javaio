package sec03_consoleinputoutput.EX03_ConsoleInputObject_3;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject_3 {
	public static void main(String[] args) throws IOException {
		
		
		InputStream is = System.in;
		
		//#2. n-byte 단위 읽기 (byte[]의 처음 위치에서 붙터 읽은 데이터 저장)
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);
		
		String str1 = new String(byteArray1, 0, count1, Charset.forName("UTF-8"));
		System.out.println(str1);
				
		
		//#3. n-byte 단위 읽기 (length 만큼 앞에서부터 읽어와서 byte[] offset위치부터 넣어라)
		byte[] byteArray2 = new byte[9]; //offset+length
		int offset=3;
		int length=6;
		int count2 = is.read(byteArray2, offset, length);
		
		String str2 = new String(byteArray2, 0, offset+count2, Charset.defaultCharset());
		//String str2 = new String(byteArray2, offset, count2, Charset.defaultCharset());
		System.out.println(str2);
	}
}
