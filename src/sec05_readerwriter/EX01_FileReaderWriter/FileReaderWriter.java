package sec05_readerwriter.EX01_FileReaderWriter;

/*FileReader와 FileWriter를 이용한 char 단위의 파일 입출력 구현*/

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriter {
	public static void main(String[] args) {
		
		//#파일객체 생성
		File readerWriterFile = new File("src/sec05_readerwriter/files/ReaderWriterFile.txt");
		
		//#1.FileWiter를 이용한 파일 쓰기 (UTF-8 모드)
		try(Writer writer = new FileWriter(readerWriterFile)){
			
			writer.write("안녕하세요\n".toCharArray());
			writer.write("Hello");
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다.", 2, 3);
			writer.flush();
			
		}catch(IOException e) {}
		
		//#2.FileReader를 이용한 파일 읽기 (UTF-8 모드)
		try(Reader reader = new FileReader(readerWriterFile)){
			
			int data;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
			
		} catch(IOException e) {}
	}
}

