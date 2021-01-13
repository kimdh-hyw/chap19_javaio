package sec02_fileinputoutputstream.EX02_FileInputStream_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_2 {
	public static void main(String[] args) throws IOException {
		
		//입력파일 생성
		File inFile = new File("src\\sec02_fileinputoutputstream\\files\\FileInputStream1.txt");
				
		//#1. 1-byte 단위 읽기
		InputStream is1 = new FileInputStream(inFile);
		
		int data;
		while((data=is1.read())!=-1) {
			System.out.print((char)data);
		}
		System.out.println();
		System.out.println();
		
		//#2. n-byte 단위 읽기 (byte[]의 처음 위치에서 붙터 읽은 데이터 저장)
		InputStream is2 = new FileInputStream(inFile);
		
		byte[] byteArray1 = new byte[9];
		int count1;
		while((count1 = is2.read(byteArray1))!=-1) { // count1 = 9, 9, 2, -1
			for(int i=0; i<count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
			System.out.println(" : count1 = " + count1);
		}
		System.out.println();
		System.out.println();
		
		//#3. n-byte 단위 읽기 (length 만큼 앞에서부터 읽어와서 byte[] offset위치부터 넣어라)
		InputStream is3 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[9]; //최소 offset + length
		int offset = 3;
		int length = 6;
		int count2 = is3.read(byteArray2, offset, length);
		for(int i=0; i<offset+count2; i++) {
			System.out.print((char)byteArray2[i]);
		}
		
		//InputStream 자원반납
		is1.close();
		is2.close();
		is3.close();
		
	}
}









