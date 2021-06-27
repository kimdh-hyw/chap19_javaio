package sec02_fileinputoutputstream.EX04_FileOutputStream_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		
		//입력파일 생성
		File outFile = new File("src/sec02_fileinputoutputstream/files/FileOutputStream1.txt");
		
		//#1. 1-byte 단위 쓰기
		OutputStream os1 = new FileOutputStream(outFile);
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); //13 //생략가능
		os1.write('\n'); //10 개행 /r/n
		
		os1.flush(); 
		os1.close();
		
		//#2. n-byte 단위 쓰기 (byte[]의 처음부터 끝까지 데이터를 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, true); //내용 연결
		byte[] byteArray1 = "Hello!".getBytes();
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush(); 
		os2.close();
		
		//#3. n-byte 단위 쓰기 (byte[]의 offset부터 length 개의  byte 데이터를 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true); //내용 연결
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os3.write(byteArray2, 7, 8);
		
		os3.flush(); 
		os3.close();			
		
	}
}









