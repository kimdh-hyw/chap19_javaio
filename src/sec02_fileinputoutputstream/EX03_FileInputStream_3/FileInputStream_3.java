package sec02_fileinputoutputstream.EX03_FileInputStream_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_3 {
	public static void main(String[] args) throws IOException {
		
		//입력파일 생성
        File inFile = new File("src/sec02_fileinputoutputstream/files/FileInputStream2.txt");
        
        //#2. n-byte 단위 읽기 (byte[]의 처음 위치에서 붙터 읽은 데이터 저장)
        InputStream is2 = new FileInputStream(inFile);
        byte[] byteArray1 = new byte[9];
        int count1;
        while((count1 = is2.read(byteArray1))!=-1) {            
            String str = new String(byteArray1, 0, count1, Charset.forName("UTF-8"));
            System.out.print(str);
            System.out.println(" : count = " + count1);            
        }
        is2.close();
        System.out.println();
        System.out.println();
        
        //#3. n-byte 단위 읽기  (length 만큼 앞에서부터 읽어와서 byte[] offset위치부터 넣어라)
        InputStream is3 = new FileInputStream(inFile);
        byte[] byteArray2 = new byte[9]; //최소 offset + length
        int offset = 3;
        int length = 6;
        int count2 = is3.read(byteArray2, offset, length);
        String str = new String(byteArray2, 0, offset+count2, Charset.defaultCharset());
        //String str = new String(byteArray2, offset, count2, Charset.defaultCharset());
        System.out.println(str);        
        is3.close();        
    }
}

