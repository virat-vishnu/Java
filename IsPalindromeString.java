package Milestone1_OOPSInheritance_StringAndStringBuffer;
import java.util.Scanner;

public class IsPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String n=sc.next();
		int flag=0;
		String str=String.valueOf(n);
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]=' ';
					flag=1;
				}
			}
			if(flag==1) {
				ch[i]=' ';
				flag=0;
			}	
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				flag++;
			}
		}
		if(flag>1) {
			System.out.println("NO");
			}
		else {
			System.out.println("YES");
		}
	}

}

