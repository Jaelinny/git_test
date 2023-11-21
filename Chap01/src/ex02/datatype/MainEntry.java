//*
package ex02.datatype;

public class MainEntry {
    public static void main(String[] args) { // 시작점(진입점)
    	int su = 9;
    	char ch = 'A';  //'문자'
    	String str = "korea"; //"문자열" 
    	double d = 12.34;
    	float f = 12.34f; //f, F 대소문자 구분하지 않음
    	long num = 9;
    	
    	System.out.println(su + ", "+ch+", "+str);
    	System.out.println("su = "+su);
    	
    	System.out.println(100); // int - 4byte
    	System.out.println(100L); // long - 8byte
    	
    	System.out.println(3.5);
    	System.out.println(3.5F);
    	
		System.out.println(su);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(d);
		
		System.out.println();
		int su2; //지연변수는 반드시 초기화하고 사용한다.
		System.out.println(su2);
		
		//*--------
		
		int x = 2; //기본자료형
		Integer y = 2; //참조형
		x = y.intValue();  //
		y = x; // autoboxing / unboxing
		
		String str3 = "A"; 
		char ch3 = 'A';
		
		
		
		
    } // end main
    
} //  end class
//*

// 한줄 주석

/*
여러 줄 주석
*/

// 