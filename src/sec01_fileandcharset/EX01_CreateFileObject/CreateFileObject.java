package sec01_fileandcharset.EX01_CreateFileObject;

/*파일 객체 생성과 파일 구분자 및 절대 경로와 상대 경로*/

import java.io.File;
import java.io.IOException;

public class CreateFileObject {
	public static void main(String[] args) throws IOException {
		
		//#1-1. C 드라이브내에 temp2 폴더 생성 (없는 경우에)
		File tempDir = new File("C:/temp2");
		System.out.println(tempDir.exists());
		
		if(!tempDir.exists())
			tempDir.mkdir();
		
		System.out.println(tempDir.exists());
		
		//#1-2. 파일 객체 생성 (실제파일 생성)
		File newFile = new File("C:/temp2/newFile.txt");
		System.out.println(newFile.exists()); 
		if(!newFile.exists())
			newFile.createNewFile(); //temp2 폴더가 없는 경우 예외 발생
		System.out.println(newFile.exists()); 
		System.out.println();
		
		//#2. 파일구분자
		File newFile2 = new File("C:\\temp2\\newFile.txt");
		File newFile3 = new File("C:/temp2/newFile.txt");
		File newFile4 = new File("C:"+File.separator+"temp2"+File.separator+"newFile.txt");
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		System.out.println(newFile4.exists());
		System.out.println();
		
		//#3-1. 절대경로
		File newFile5 = new File("C:/abc/newFile.txt");
		File newFile6 = new File("C:/abc/bcd/newFile.txt");
		System.out.println(newFile5.getAbsolutePath()); //C:/abc/newFile.txt
		System.out.println(newFile6.getAbsolutePath()); //C:/abc/bcd/newFile.txt
		
		//#3-2. 상대경로
		//현재위치
		System.out.println(System.getProperty("user.dir")); //현재작업폴더 위치
		File newFile7 = new File("newFile1.txt");
		File newFile8 = new File("bcd/newFile2.txt");
		System.out.println(newFile7.getAbsolutePath()); //D:\JavaExamples\javaio\newFile1.txt
		System.out.println(newFile8.getAbsolutePath()); //D:\JavaExamples\javaio\bcd/newFile2.txt
		
	}
}

