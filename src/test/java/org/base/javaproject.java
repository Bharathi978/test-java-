package org.base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class javaproject {

	
private static void tc1() {
		/// to find given  number even or add //
		System.out.println("======================Tc1 ==============================================");

		int num = 10;
		if (num % 2 ==0) {
			System.out.println("it in even number :"+num);
		}
		
		
		else {
			System.out.println( "it is ad number:"+num);
		}

	}

private static void tc2() {
		/// to find even number between 0 to 10///
		System.out.println("======================Tc2=====================================================");

		int num = 10;
		for (int i = 0; i<=num; i++) {
			if (i%2==0) {
				System.out.println(i);
			}}
	}
	
	
	
private static void tc3() {

			System.out.println("======================Tc3===================================================");

			// to find add number between 0 to 10
			int num = 10;
			for (int i = 0; i<=num; i++) {
				if (i%2==1) {
					System.out.println(i);
				}}

	}
	
private static void tc4() {
		// to find count of even number between 0 to 100//
			System.out.println("======================Tc4================================================");

			int num = 10;
			int count=0;
			for (int i = 0; i<=num; i++) {
				if (i%2==0) {
					count=count+1;
				}
			}
			System.out.println("count of even number :"+count);
	

	}
	
 private static void tc5() {
		System.out.println("======================Tc5================================================");

		// TO find count of add number between 0 to 100//
				int num = 100;
				int count=0;
				for (int i = 0; i<=num; i++) {
					if (i%2==1) {
						count=count+1;
					}
				}
				System.out.println("count of add number :"+count);}

		  
 private static void tc6() {
		// the sum of number between 10 to 20
			System.out.println("======================Tc6================================================");

			int num = 20;
			int sum = 0;
			for (int i = 0; i<=num; i++) {
		 			sum=sum+i;
				
				}
			System.out.println(sum);
			}

private  static void tc7() {
		 // to count of even and add number 0 to 20///
		System.out.println("========================Tc7================================================");

		int num = 20;
		int addcount=0, evencount=0;
		
		for (int i = 0; i<=num; i++) {
	 			if (i%2==0) {
					evencount = evencount+1;
				}
	 			else {
	 				 addcount = addcount+1;
				}
			}
		System.out.println("even number count:"+evencount);
		System.out.println("addd number count:"+addcount);}
		
private static void tc8() {
    	// to factorial of the given number//
		System.out.println("========================Tc8================================================");

		 
		int num =5;
		int fact =1;
		for (int i = 1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("factorail give the number:"+fact);
		
			}
		
		
private static void tc9() {
	 //  To reverse the condision//
	System.out.println("========================Tc9================================================");

	int number = 12345;
	int remainder = 0;
	int result = 0;
	while (number>0) {
		
		
		// To fetc the last digit
		remainder=number%10;  // remainder%10=5
		
		
		// add the last digit to variable 
		result=result*10+remainder;  // result= (0*10)+5
		
		
		
		// Remove the last digit
		number = number/10;          // number= 12345/10
	}
	
	System.out.println("Reversed is result:"+result);
	System.out.println("number is :"+number);
}
	
private static void tc10() {
	// 10. To get count of the given number //
	System.out.println("============================Tc10================================================");

  int number = 123;
  int remainder = 0;
  int count = 0;
 while (number>0) {
	
	
	// To fetc the last digit
	remainder=number%10; 
	
	count = count+1;
	
	
	// Remove the last digit
	number = number/10;        
 }
 
 
System.out.println("count is result:"+count);
		
		
}	
		
private static void tc11() {
	// Product the digit//
	System.out.println("============================Tc11================================================");

  int number = 1238;
  int remainder = 0;
  int result = 2;
 while (number>0) {


// To fetc the last digit
 remainder=number%10; 

 result = result*remainder;


// Remove the last digit
 number = number/10;        
}
System.out.println("product the digit :"+result);
		
 	
		
}
private static void tc12() {
	
	// find Armstrong number//
	System.out.println("============================Tc12================================================");

	int number= 371;
	int emp = number;
	int remainder = 0;
	int reverse = 0;
	
	while (number>0) {
		remainder=number%10;
		reverse=reverse+(remainder* remainder* remainder);
		number=number/10;
	}
	
	if (emp==reverse) {
		System.out.println("armstrong number is valid:"+reverse);
	}
	else {
		
	
	System.out.println("armstrong number is not valid;");
	}
			
}
	
private static void tc13() {
	// Fibonacci series
	System.out.println("============================Tc13================================================");

	int a=0;
	int b= 5;

		for (int i = 0; i <6; i++) {
		int c= a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	
	}

private static void tc14() {

	// sorting the Array //
	System.out.println("============================Tc14================================================");

	int a []= {80,74,79,98,67,73,26,63,74,18,27,36};
	Arrays.sort(a);

	for (int i : a) {
		System.out.println(i);
	}
	
	
	System.out.println("maxvalue:"+a[a.length-1]);
	System.out.println("minvalue:"+a[0]);
	System.out.println("2nd largest value:"+a[a.length-2]);}
	


private  static void tc15() {

	// Reverse the String
	System.out.println("============================Tc15================================================");

	String s = "welcome";
	String rev ="";
	for (int i = s.length()-1; i>= 0; i--) {
		char c = s.charAt(i);
		rev=rev+c;
		
	}
	
	System.out.println("before reverse:"+s);
	
	System.out.println("after reverse :"+rev);
	
}
	
private  static void tc16() {
	// palindrome
	System.out.println("============================Tc16================================================");

	String s = "noogn";
	String rev ="";
	for (int i = s.length()-1; i>= 0; i--) {
		char c = s.charAt(i);
		rev=rev+c;
		
	}
	
	//System.out.println("before reverse:"+s);
	
	//System.out.println("after reverse :"+rev);
	
	if (s.equals(rev)) {
		System.out.println("given string  is palindrome");
	}
	else {
		System.out.println("given string  is  not palindrome");
	}
}
private static void tc17() {
	// Each word first letter covert capital//
	System.out.println("============================Tc17================================================");

	String s = "welcome to java class";
 String[] sp = s.split(" ");
	
	String res = "";
	
	for (String itr : sp) {
		char c = itr.charAt(0);
		char upperCase = Character.toUpperCase(c);
		res=res+upperCase+itr.substring(1)+" ";
		
	}
	
	
	System.out.println(res.trim());
}
	
private static void tc18() {
	// Each word is reverse //
	System.out.println("============================Tc18================================================");

	String s = "welcome to pythan course";
	String[] sp = s.split("");
	String res = " ";
	
	for (String itr : sp) {
		String rev= "";
		for (int i = itr.length()-1; i>=0; i--) {
			char ch = itr.charAt(i);
			rev=rev+ch;
		}
		res=res+rev+"";
	}
	
	System.out.println(res);
}	
	
private static void tc19() {

	//  To remove the duplicate Array //
	System.out.println("============================Tc19================================================");

	int a []= {30,40,50,50,50,40,60,70};
	Set<Integer> s= new LinkedHashSet<Integer>();
	
	for (Integer itr : a) {
		s.add(itr);
	}
	
	System.out.println(s);
}
	
private static void tc20() {
	
	// To remove dublicates charaters in string//
	System.out.println("============================Tc20================================================");

	String s = "Java java ...";
	String  emp = "";
	Set<Character> d = new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		d.add(ch);
	}
	
	for (Character itr : d) {
		emp=emp+itr;
	}
	
	System.out.println(s);
	System.out.println(emp);

}
private static void tc21() {
	System.out.println("============================Tc21================================================");

	String s = "have haad the have has";
	String[] d = s.split("");
	Set<String> k = new LinkedHashSet<String>();
	String res = "";
	for (String itr : d) {
		k.add(itr);
	}
	
	for (String i : k) {
		res=res+i+"";
	}
	System.out.println(res);

	

}
private static void tc22() {
	// sum of the digit
	System.out.println("============================Tc22================================================");

int n =23455;
int res=0;
int rem=0;
while(n>0) {
rem =n%10;
	
res=res+rem;
n=n/10;
}
System.out.println(res);


}
private static void tc23() {
	//sort the array without using predefined class and mehtods
	System.out.println("============================Tc23================================================");

	int a[] = { 100, 20, 30, 40, 60, 50, 70, 90 };
	System.out.println("before swap:");
	for (int i : a) {
		System.out.println(i);
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length; j++) {
			if (a[i] > a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	System.out.println("after swap:");
	for (int ii : a) {
		System.out.println(ii);
	}


}



private static void tc24() {
	// RightTrianglePattern 
	System.out.println("============================Tc24================================================");

	int i, j, row=6;   
	//outer loop for rows  
	for(i=0; i<row; i++)   
	{   
	//inner loop for columns  
	for(j=0; j<=i; j++)   
	{   
	//prints stars   
	System.out.print(" * ");   
	}   
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}   
	}   
	


private  static void tc25() {
	System.out.println("============================Tc25================================================");
// LeftTrianglePattern
	
	int i, j, row = 6;       
	//Outer loop work for rows  
	for (i=0; i<row; i++)   
	{  
	//inner loop work for space      
	for (j=2*(row-i); j>=0; j--)         
	{  
	//prints space between two stars      
	System.out.print(" ");   
	}   
	//inner loop for columns  
	for (j=0; j<=i; j++ )   
	{   
	//prints star      
	System.out.print("* ");  
}
	System.out.println();
	}}

public static void main(String[] args) {
	javaproject j = new javaproject();
	Class<? extends javaproject> class1 = j.getClass();
	System.out.println(class1);
	Package package1 = class1.getPackage();
	System.out.println(package1);
	
		tc1();
		tc2();
		tc3();
		tc4();
		tc5();
		tc6();
		tc7();
		tc8();
	    tc9();
	    tc10();
	    tc11();
	    tc12();
	    tc13();
	    tc14();
	    tc15();
		tc16();
        tc17();
        tc18();
        tc19();
        tc20();
        tc21();
        tc22();
		tc23();
		tc24();
		tc25();
		
	
	
	
		
		
		
		
		
		
		
		
		

       
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	

		
	   
		
		
		
		
		
		
		

		
//	



//		String s ="MADAM";
//		String res ="";
//		String pal =s;
//	    for(int i=s.length()-1; i>=0; i--) {
//			char c = s.charAt(i);
//			res =res+c;
//		}
//		if(pal==s) {
//			System.out.println("palindrome:"+res);
//		}
//		else {
//			System.out.println("Not a palindrome:"+res);
//		}
//	}}
		
//int num=371;
//int rem=0;
//int res=0;
//int emp =num;
//while(num>0) {
//	rem=num%10;
//	res=res+(rem*rem*rem);
//	num=num/10;
//}
//if(emp==res) {
//	System.out.println("amstrong number:" +res);
//}
//else {
//	System.out.println("Not a amstrong number:" +res);
//}
//}}
//		
//			String s = "Green Tech";
//			char[] c = s.toCharArray();
//			Map<Character , Integer> m = new LinkedHashMap<Character, Integer>();
//			for (char i : c) {
//				
//			
//				if (m.containsKey(i)) {
//					Integer in = m.get(i);
//					m.put(i, in + 1);
//				}
//				else {
//					m.put(i, 1);
//				}
//			}
//			System.out.println(m);
//	}}
		
		
//		int i,j;
//		
//		for (i = 0; i <=5; i++) {
//			for ( j = i+1; j <=5 ; j++) {
//				System.out.println("*" +"");
//			}
//			System.out.println("\n");
//		
//		
//		}
//		
//		
	}
		}
	
	  
  

  
  
  
  
  
  
  
  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
