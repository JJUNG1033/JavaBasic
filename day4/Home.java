package day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�");
		String na=sc.next();
		System.out.println("����");
		int ag=sc.nextInt();
		System.out.println("e-mail");
		String em=sc.next();
		Member m=new Member();
		m.setNa(na);
		m.setAg(ag);
		m.setEm(em);
		System.out.println("�̸�\n["+m.getNa()+"]����\n["+m.getAg()+"]�̸���\n["+m.getE()+"]");
		
		
		
		
			
		
		
		
	}
}
