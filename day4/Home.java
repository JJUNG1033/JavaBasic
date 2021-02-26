package day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름");
		String na=sc.next();
		System.out.println("나이");
		int ag=sc.nextInt();
		System.out.println("e-mail");
		String em=sc.next();
		Member m=new Member();
		m.setNa(na);
		m.setAg(ag);
		m.setEm(em);
		System.out.println("이름\n["+m.getNa()+"]나이\n["+m.getAg()+"]이메일\n["+m.getE()+"]");
		
		
		
		
			
		
		
		
	}
}
