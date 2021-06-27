package sec02_fileinputoutputstream.EX01_FileInputStream_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException {
		//입력파일 생성
		File inFile = new File("src/sec02_fileinputoutputstream/files/FileInputStream1.txt");
		
		//InputStream 객체 생성
		InputStream is = new FileInputStream(inFile);
		
		int data;
		while((data=is.read())!=-1) {
			System.out.println("읽은 데이터 : "+ (char)data + "남은 바이트수 : " + is.available());
		}
		
		//InputStream 자원 반납
		is.close();
		
		
	}
}
