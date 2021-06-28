package sec05_readerwriter.EX05_OutputStreamWriter_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_1 {
	public static void main(String[] args){
		
			
		//#1. FileWriter를 이용하여 데이터 쓰기 (디폴트 (UTF-8))
		File outputStreamWriter1 = new File("src/sec05_readerwriter/files/OutputStreamWiter1.txt");
		try(Writer writer = new FileWriter(outputStreamWriter1);){
			writer.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			writer.write("한글과 영문이 모두 포함되어 있습니다.");
			writer.write('\n');
			writer.write("Good Bye!!!\n\n");
			writer.flush();
		} catch(IOException e) {}
		
		//#2. FileWriter를 이용하여 데이터 쓰기 (디폴트 (UTF-8) --> MS949 파일 생성)
		
		File outputStreamWriter2 = new File("src/sec05_readerwriter/files/OutputStreamWiter2.txt");
		try(OutputStream os = new FileOutputStream(outputStreamWriter2, false);
			OutputStreamWriter osw = new OutputStreamWriter(os, "MS949");){
			
			osw.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			osw.write("한글과 영문이 모두 포함되어 있습니다.");
			osw.write('\n');
			osw.write("Good Bye!!!\n\n");
			osw.flush();
		
			System.out.println(osw.getEncoding()); //MS949

		} catch(IOException e) {}
						
	}
}
