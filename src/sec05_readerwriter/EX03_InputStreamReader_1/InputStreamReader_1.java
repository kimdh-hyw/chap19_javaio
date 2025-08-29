package sec05_readerwriter.EX03_InputStreamReader_1;

/*MS949 인코딩 파일을 FileReader와 FileInputStreamReader로 각각 읽기*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReader_1 {
	public static void main(String[] args) {
		//#파일객체 생성
		File inputStreamReader = new File("src/sec05_readerwriter/files/InputStreamReader.txt");
				
		//#1.FileReader를 이용한 파일 읽기
		try(Reader reader = new FileReader(inputStreamReader)){
			
			int data;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
			
		} catch(IOException e) {}
		System.out.println();System.out.println();
		
		//#2.FileInputStream + InputStreamReader를 이용한 파일 읽기
		try(InputStream is = new FileInputStream(inputStreamReader);
			InputStreamReader isr = new InputStreamReader(is, "MS949");){
						
			int data;
			while((data=isr.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println("\n"+isr.getEncoding());//MS949
			
			
		} catch(IOException e) {}
	}
}

