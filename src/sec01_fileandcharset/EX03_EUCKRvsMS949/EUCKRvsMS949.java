package sec01_fileandcharset.EX03_EUCKRvsMS949;

/*EUC-KR 문자셋과 MS949 문자셋의 비교*/

import java.io.UnsupportedEncodingException;

public class EUCKRvsMS949 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		System.out.println("기본 문자셋 :" + Charset.defaultCharset()); //
		
		//#EUC-KR vs. MS949
		byte[] b1 = "a".getBytes("EUC-KR"); //문자열--> byte[]
		byte[] b2 = "a".getBytes("MS949");  //문자열--> byte[]
		
		System.out.println(b1.length); //1
		System.out.println(b2.length); //1
		
		System.out.println(new String(b1, "EUC-KR"));  //byte[] --> 문자열
		System.out.println(new String(b2, "MS949"));  //byte[] --> 문자열
		System.out.println();
		
		
		byte[] b3 = "가".getBytes("EUC-KR"); //문자열--> byte[]
		byte[] b4 = "가".getBytes("MS949");  //문자열--> byte[]
		//byte[] b5 = "가".getBytes("UTF8");  //문자열--> byte[]
		
		
		System.out.println(b3.length); //2
		System.out.println(b4.length); //2
		
		System.out.println(new String(b3, "EUC-KR"));  //byte[] --> 문자열
		System.out.println(new String(b4, "MS949"));  //byte[] --> 문자열
		System.out.println();
		
		
		
		byte[] b5 = "봵".getBytes("EUC-KR"); //문자열--> byte[]
		byte[] b6 = "봵".getBytes("MS949");  //문자열--> byte[]
		
		System.out.println(b5.length); //1 ?
		System.out.println(b6.length); //2
		
		System.out.println(new String(b5, "EUC-KR"));  //byte[] --> 문자열
		System.out.println(new String(b6, "MS949"));  //byte[] --> 문자열
		System.out.println();
		
	}
}

